package internalpackage.domparser.responses.checkdomainresponse;

import internalpackage.domparser.responses.baseresponse.BaseResponse;

public class CheckDomainResponse extends BaseResponse {

   private DomainStatus domainStatus;

    public CheckDomainResponse(String commandResponseTime, String responsePath, String tld, DomainStatus domainStatus) {
        super(commandResponseTime, responsePath, tld);
        this.domainStatus = domainStatus;
    }

    public CheckDomainResponse() {
    }

    public void setDomainStatus(DomainStatus domainStatus) {
        this.domainStatus = domainStatus;
    }

    @Override
    public String toString() {
        return "Command Response Time = '" + getCommandResponseTime() + '\'' +
                "; Response Path = '" + getResponsePath() + '\'' +
                "; TLD = '" + getTld() + '\'' +
                "; " + domainStatus;
    }
}
