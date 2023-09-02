package internalpackage.jaxbparser.controller;

import internalpackage.jaxbparser.models.requests.baserequest.BaseRequest;
import internalpackage.jaxbparser.models.responses.baseresponse.BaseResponse;
import internalpackage.jaxbparser.parser.XMLParser;
import internalpackage.jaxbparser.parserview.view.XmlParserView;

import javax.xml.bind.JAXBException;

public class XmlParserController {

    private BaseRequest request;
    private BaseResponse response;
    private XmlParserView parserView;
    private XMLParser xmlParser = new XMLParser();

    public XmlParserController(BaseRequest request, XmlParserView parserView) {
        this.request = request;
        this.parserView = parserView;
    }

    public XmlParserController(BaseResponse response, XmlParserView parserView) {
        this.response = response;
        this.parserView = parserView;
    }

    public void viewRequest(String filePath) {
        try {
            parserView.displayRequest(xmlParser.parseRequest(filePath, request));
        } catch (JAXBException e) {
            throw new AssertionError("Can't parse XML");
        }
    }

    public void viewResponse(String filePath) {
        try {
            parserView.displayResponse(xmlParser.parseResponse(filePath, response));
        } catch (JAXBException e) {
            throw new AssertionError("Can't parse XML");
        }
    }
}
