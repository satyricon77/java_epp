package internalpackage.jaxbparser.demo;

import internalpackage.jaxbparser.controller.XmlParserController;
import internalpackage.jaxbparser.models.requests.checkdomainrequest.CheckDomainRequest;
import internalpackage.jaxbparser.models.requests.domaininforequest.DomainInfoRequest;
import internalpackage.jaxbparser.models.responses.checkdomainresponse.CheckDomainResponse;
import internalpackage.jaxbparser.models.responses.domaininforesponse.DomainInfoResponse;
import internalpackage.jaxbparser.parserview.view.XmlParserView;

public class Demo {
    public static void main(String[] args) {
        XmlParserView view = new XmlParserView();
        CheckDomainRequest checkDomainRequest = new CheckDomainRequest();
        DomainInfoRequest domainInfoRequest = new DomainInfoRequest();
        CheckDomainResponse checkDomainResponse = new CheckDomainResponse();
        DomainInfoResponse domainInfoResponse = new DomainInfoResponse();

        XmlParserController checkDomainRequestXmlParserController = new XmlParserController(checkDomainRequest, view);
        checkDomainRequestXmlParserController.viewRequest("src/main/resources/requestsxmls/checkdomain/check_domain.xml");

        XmlParserController domainInfoRequestXmlParserController = new XmlParserController(domainInfoRequest, view);
        domainInfoRequestXmlParserController.viewRequest("src/main/resources/requestsxmls/domaininfo/domain_info.xml");

        XmlParserController checkDomainResponseXmlParserController = new XmlParserController(checkDomainResponse, view);
        checkDomainResponseXmlParserController.viewResponse("src/main/resources/responsexmls/checkdomain/check_domain_response.xml");

        XmlParserController domainInfoResponseXmlParserController = new XmlParserController(domainInfoResponse, view);
        domainInfoResponseXmlParserController.viewResponse("src/main/resources/responsexmls/domaininfo/domain_info_response.xml");
    }
}
