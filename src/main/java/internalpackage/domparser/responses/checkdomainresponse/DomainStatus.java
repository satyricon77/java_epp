package internalpackage.domparser.responses.checkdomainresponse;

public class DomainStatus {

    private String domainStatus;

    public DomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
    }

    public DomainStatus() {}

    @Override
    public String toString() {
        return "Domain Status = '" + domainStatus + '\'';
    }
}
