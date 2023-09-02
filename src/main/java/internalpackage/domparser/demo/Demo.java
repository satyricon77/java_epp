package internalpackage.domparser.demo;

import internalpackage.domparser.parserview.view.XmlParserView;
import internalpackage.domparser.requests.checkdomainrequest.CheckDomainRequest;
import internalpackage.domparser.requests.domaininforequest.DomainInfoRequest;
import internalpackage.domparser.responses.checkdomainresponse.CheckDomainResponse;
import internalpackage.domparser.responses.domaininforesponse.DomainInfoResponse;
import internalpackage.domparser.controller.XmlParserController;

public class Demo {
    public static void main(String[] args) {
        XmlParserView view = new XmlParserView();
        CheckDomainRequest checkDomainRequest = new CheckDomainRequest();
        DomainInfoRequest domainInfoRequest = new DomainInfoRequest();
        CheckDomainResponse checkDomainResponse = new CheckDomainResponse();
        DomainInfoResponse domainInfoResponse = new DomainInfoResponse();

        XmlParserController checkDomainRequestXmlParserController = new XmlParserController(checkDomainRequest, view);
        checkDomainRequestXmlParserController.viewCheckDomainRequest("src/main/resources/requestsxmls/checkdomain/check_domain.xml");

        XmlParserController domainInfoRequestXmlParserController = new XmlParserController(domainInfoRequest, view);
        domainInfoRequestXmlParserController.viewDomainInfoRequest("src/main/resources/requestsxmls/domaininfo/domain_info.xml");

        XmlParserController checkDomainResponseXmlParserController = new XmlParserController(checkDomainResponse, view);
        checkDomainResponseXmlParserController.viewCheckDomainResponse("src/main/resources/responsexmls/checkdomain/check_domain_response.xml");

        XmlParserController domainInfoResponseXmlParserController = new XmlParserController(domainInfoResponse, view);
        domainInfoResponseXmlParserController.viewDomainInfoResponse("src/main/resources/responsexmls/domaininfo/domain_info_response.xml");
    }
}
