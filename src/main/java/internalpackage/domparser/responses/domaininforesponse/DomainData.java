package internalpackage.domparser.responses.domaininforesponse;

public class DomainData {

    private String domainName;
    private String roId;
    private String sponsorClient;

    public DomainData(String domainName, String roId, String sponsorClient) {
        this.domainName = domainName;
        this.roId = roId;
        this.sponsorClient = sponsorClient;
    }

    public String getDomainName() {
        return domainName;
    }

    public String getRoId() {
        return roId;
    }

    public String getSponsorClient() {
        return sponsorClient;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setRoId(String roId) {
        this.roId = roId;
    }

    public void setSponsorClient(String sponsorClient) {
        this.sponsorClient = sponsorClient;
    }

    @Override
    public String toString() {
        return "Domain Name = '" + domainName + '\'' +
                "; Ro ID = '" + roId + '\'' +
                "; Sponsor Client = '" + sponsorClient + '\'';
    }
}
