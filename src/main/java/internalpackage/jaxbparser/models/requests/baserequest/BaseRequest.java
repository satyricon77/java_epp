package internalpackage.jaxbparser.models.requests.baserequest;

import javax.xml.bind.annotation.XmlAttribute;

public abstract class BaseRequest {

    @XmlAttribute(name = "tld")
    private String tldName;

    public BaseRequest() {}

    public BaseRequest(String tld) {
        this.tldName = tld;
    }

    public String getTld() {
        return tldName;
    }

    public void setTld(String tld) {
        this.tldName = tld;
    }

    @Override
    public String toString() {
        return "TLD name = '" + tldName + '\'';
    }
}
