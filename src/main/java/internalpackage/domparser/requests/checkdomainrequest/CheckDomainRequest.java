package internalpackage.domparser.requests.checkdomainrequest;

import internalpackage.domparser.requests.baserequest.BaseRequest;

public class CheckDomainRequest extends BaseRequest {

    private CheckDomain checkDomain;
    private String trId;

    public CheckDomainRequest(String tld, CheckDomain checkDomain, String trId) {
        super(tld);
        this.checkDomain = checkDomain;
        this.trId = trId;
    }

    public CheckDomainRequest(String tld) {
        super(tld);
    }

    public CheckDomainRequest() {}

    public CheckDomain getCheckDomain() {
        return checkDomain;
    }

    public String getTrId() {
        return trId;
    }

    public void setCheckDomain(CheckDomain checkDomain) {
        this.checkDomain = checkDomain;
    }

    public void setTrId(String trId) {
        this.trId = trId;
    }

    @Override
    public String toString() {
        return "TLD name = '" + getTld() + '\'' +
                "; Domain name = '" + checkDomain + '\'' +
                "; TRID = '" + trId + '\'';
    }
}
