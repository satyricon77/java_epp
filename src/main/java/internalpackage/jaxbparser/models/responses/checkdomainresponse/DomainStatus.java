package internalpackage.jaxbparser.models.responses.checkdomainresponse;

import javax.xml.bind.annotation.XmlElement;

public class DomainStatus {

    @XmlElement(name = "domainNamesOk")
    private String domainNamesOk;

    public DomainStatus(String domainNamesOk) {
        this.domainNamesOk = domainNamesOk;
    }

    public DomainStatus() {
    }

    @Override
    public String toString() {
        return domainNamesOk;
    }
}
