package internalpackage.domparser.parser;

import internalpackage.domparser.exception.XmlParserException;
import internalpackage.domparser.requests.baserequest.BaseRequest;
import internalpackage.domparser.requests.checkdomainrequest.CheckDomain;
import internalpackage.domparser.requests.checkdomainrequest.CheckDomainRequest;
import internalpackage.domparser.requests.domaininforequest.DomainInfo;
import internalpackage.domparser.requests.domaininforequest.DomainInfoRequest;
import internalpackage.domparser.responses.baseresponse.BaseResponse;
import internalpackage.domparser.responses.checkdomainresponse.CheckDomainResponse;
import internalpackage.domparser.responses.checkdomainresponse.DomainStatus;
import internalpackage.domparser.responses.domaininforesponse.DomainData;
import internalpackage.domparser.responses.domaininforesponse.DomainInfoResponse;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class XMLParser {

    private Element getRootElement(String filePath) throws XmlParserException {
        Document doc = initDoc(filePath);
        return doc.getDocumentElement();
    }

    public Document initDoc(String filePath) throws XmlParserException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder;
        Document doc;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            throw new XmlParserException("Error initializing XML document builder", e);
        }
        try {
            doc = builder.parse(new File(filePath));
        } catch (SAXException | IOException e) {
            throw new XmlParserException("Error parsing XML file: " + filePath, e);
        }
        return doc;
    }

    private String getTagNameValue(String tagName, String filePath) throws XmlParserException {
        Element root = getRootElement(filePath);
        NodeList nodeList = root.getElementsByTagName(tagName);
        if (nodeList.getLength() == 0) {
            throw new XmlParserException("No element with tag name: " + tagName);
        }
        return nodeList.item(0).getTextContent();
    }

    private String getAttributeByName(String attributeName, String filePath) throws XmlParserException {
        String attributeValue = getRootElement(filePath).getAttribute(attributeName);
        if (attributeValue.isEmpty()) {
            throw new XmlParserException("No attribute with name: " + attributeName);
        }
        return attributeValue;
    }

    public BaseRequest parseCheckDomainRequest(String filePath) throws XmlParserException {
        String tld = getAttributeByName("tld", filePath);
        String domainNames = getTagNameValue("domainNames", filePath);
        String trId = getTagNameValue("trId", filePath);

        return new CheckDomainRequest(tld, new CheckDomain(domainNames), trId);
    }

    public BaseRequest parseDomainInfoRequest(String filePath) throws XmlParserException {
        String tld = getAttributeByName("tld", filePath);
        String domainName = getTagNameValue("domainName", filePath);
        String password = getTagNameValue("password", filePath);

        return new DomainInfoRequest(tld, new DomainInfo(domainName, password));
    }

    public BaseResponse parseCheckDomainResponse(String filePath) throws XmlParserException {
        CheckDomainResponse checkDomainResponse = new CheckDomainResponse();
        checkDomainResponse.setCommandResponseTime(getAttributeByName("commandResponseTime", filePath));
        checkDomainResponse.setResponsePath(getAttributeByName("responsePath", filePath));
        checkDomainResponse.setTld(getAttributeByName("tld", filePath));
        checkDomainResponse.setDomainStatus(new DomainStatus(getTagNameValue("domainNamesOk", filePath)));

        return checkDomainResponse;
    }

    public BaseResponse parseDomainInfoResponse(String filePath) throws XmlParserException {
        DomainInfoResponse domainInfoResponse = new DomainInfoResponse();
        domainInfoResponse.setCommandResponseTime(getAttributeByName("commandResponseTime", filePath));
        domainInfoResponse.setResponsePath(getAttributeByName("responsePath", filePath));
        domainInfoResponse.setTld(getAttributeByName("tld", filePath));

        domainInfoResponse.setTrId(getTagNameValue("trId", filePath));
        domainInfoResponse.setDomainData(new DomainData(getTagNameValue("domainName", filePath),
                getTagNameValue("roId", filePath), getTagNameValue("sponsorClient", filePath)));

        return domainInfoResponse;
    }
}
