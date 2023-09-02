package internalpackage.domparser.controller;

import internalpackage.domparser.exception.XmlParserException;
import internalpackage.domparser.parser.XMLParser;
import internalpackage.domparser.parserview.view.XmlParserView;
import internalpackage.domparser.requests.baserequest.BaseRequest;
import internalpackage.domparser.responses.baseresponse.BaseResponse;

public class XmlParserController {

    private BaseRequest request;
    private BaseResponse response;
    private XmlParserView xmlParserView;
    private XMLParser xmlParser;

    public XmlParserController(BaseRequest request, XmlParserView xmlParserView) {
        this.request = request;
        this.xmlParserView = xmlParserView;
        this.xmlParser = new XMLParser();
    }

    public XmlParserController(BaseResponse response, XmlParserView xmlParserView) {
        this.response = response;
        this.xmlParserView = xmlParserView;
        this.xmlParser = new XMLParser();
    }

    public void viewCheckDomainRequest(String filePath) {
        try {
            xmlParserView.displayRequest(xmlParser.parseCheckDomainRequest(filePath));
        } catch (XmlParserException e) {
            System.err.println("Error parsing check domain request: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void viewDomainInfoRequest(String filePath) {
        try {
            xmlParserView.displayRequest(xmlParser.parseDomainInfoRequest(filePath));
        } catch (XmlParserException e) {
            System.err.println("Error parsing domain info request: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void viewCheckDomainResponse(String filePath) {
        try {
            xmlParserView.displayResponse(xmlParser.parseCheckDomainResponse(filePath));
        } catch (XmlParserException e) {
            System.err.println("Error parsing check domain response: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public void viewDomainInfoResponse(String filePath){
        try {
            xmlParserView.displayResponse(xmlParser.parseDomainInfoResponse(filePath));
        } catch (XmlParserException e) {
            System.err.println("Error parsing domain info response: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
