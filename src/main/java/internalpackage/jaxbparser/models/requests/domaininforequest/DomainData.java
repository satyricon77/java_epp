package internalpackage.jaxbparser.models.requests.domaininforequest;

import javax.xml.bind.annotation.XmlElement;

public class DomainData {

    @XmlElement(name = "domainName")
    private String domainName;
    @XmlElement(name = "password")
    private String password;

    public DomainData(String domainName, String password) {
        this.domainName = domainName;
        this.password = password;
    }

    public DomainData() {}

    @Override
    public String toString() {
        return "Domain name = '" + domainName + '\'' +
                "; Password = '" + password + '\'';
    }
}
