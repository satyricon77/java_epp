package internalpackage.domparser.requests.domaininforequest;

import internalpackage.domparser.requests.baserequest.BaseRequest;

public class DomainInfoRequest extends BaseRequest {

    private DomainInfo domainInfo;

    public DomainInfoRequest(String tld, DomainInfo domainInfo) {
        super(tld);
        this.domainInfo = domainInfo;
    }

    public DomainInfoRequest(String tld) {
        super(tld);
    }

    public DomainInfoRequest() {}

    public DomainInfo getDomainInfo() {
        return domainInfo;
    }

    public void setDomainInfo(DomainInfo domainInfo) {
        this.domainInfo = domainInfo;
    }

    @Override
    public String toString() {
        return "TLD name = '" + getTld() + '\'' +
                "; " + domainInfo;
    }
}
