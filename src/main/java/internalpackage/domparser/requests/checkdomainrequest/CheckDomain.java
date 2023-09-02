package internalpackage.domparser.requests.checkdomainrequest;

public class CheckDomain {

    private String domainNames;

    public CheckDomain(String domainNames) {
        this.domainNames = domainNames;
    }

    public String getDomainNames() {
        return domainNames;
    }

    public void setDomainNames(String domainNames) {
        this.domainNames = domainNames;
    }

    @Override
    public String toString() {
        return domainNames;
    }
}
