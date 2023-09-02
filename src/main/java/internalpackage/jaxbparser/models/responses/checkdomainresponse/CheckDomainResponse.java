package internalpackage.jaxbparser.models.responses.checkdomainresponse;

import internalpackage.jaxbparser.models.responses.baseresponse.BaseResponse;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "EPP")
@XmlAccessorType(XmlAccessType.FIELD)
public class CheckDomainResponse extends BaseResponse {

    @XmlElement(name = "CheckDomainReply")
    private DomainStatus domainStatus;

    public CheckDomainResponse() {}

    public CheckDomainResponse(String commandResponseTime, String responsePath, String tld, DomainStatus domainStatus) {
        super(commandResponseTime, responsePath, tld);
        this.domainStatus = domainStatus;
    }

    @Override
    public String toString() {
        return "Command Response Time ='" + getCommandResponseTime() + '\'' +
                "; Response Path = '" + getResponsePath() + '\'' +
                "; TLD = '" + getTld() + '\'' +
                "; Domain Name Status = " + domainStatus;
    }
}
