package internalpackage.jaxbparser.models.requests.checkdomainrequest;

import javax.xml.bind.annotation.XmlElement;

public class DomainName {

    private String domainNames;

    @XmlElement(name = "domainNames")
    public String getDomainNames() {
        return domainNames;
    }

    public void setDomainNames(String domainNames) {
        this.domainNames = domainNames;
    }

    public DomainName() {}

    @Override
    public String toString() {
        return domainNames;
    }
}
