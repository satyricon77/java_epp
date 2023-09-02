package internalpackage.jaxbparser.models.requests.checkdomainrequest;

import internalpackage.jaxbparser.models.requests.baserequest.BaseRequest;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "EPP")
@XmlAccessorType(XmlAccessType.FIELD)
public class CheckDomainRequest extends BaseRequest implements Serializable {

    @XmlElement(name = "CheckDomain")
    private DomainName domainName;
    @XmlElement(name = "trId")
    private String trId;

    public CheckDomainRequest() {}

    public CheckDomainRequest(String tld, DomainName domainName, String trId) {
        super(tld);
        this.domainName = domainName;
        this.trId = trId;
    }

    @Override
    public String toString() {
        return "TLD name = '" + getTld() + '\'' +
                "; Domain name = '" + domainName + '\'' +
                "; TRID = '" + trId + '\'';
    }
}
