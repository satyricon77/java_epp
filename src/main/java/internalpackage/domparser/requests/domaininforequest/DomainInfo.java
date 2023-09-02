package internalpackage.domparser.requests.domaininforequest;

public class DomainInfo {

    private String domainName;
    private String password;

    public DomainInfo(String domainName, String password) {
        this.domainName = domainName;
        this.password = password;
    }

    public DomainInfo() {
    }

    public String getDomainName() {
        return domainName;
    }

    public String getPassword() {
        return password;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Domain name = '" + domainName + '\'' +
                "; Password = '" + password + '\'';
    }
}
