package internalpackage.jaxbparser.models.requests.domaininforequest;

import internalpackage.jaxbparser.models.requests.baserequest.BaseRequest;

import javax.xml.bind.annotation.*;
import java.io.Serializable;

@XmlRootElement(name = "EPP")
@XmlAccessorType(XmlAccessType.FIELD)
public class DomainInfoRequest extends BaseRequest implements Serializable {

    @XmlElement(name = "InfoDomain")
    private DomainData domainData;

    public DomainInfoRequest(){}

    public DomainInfoRequest(String tld, DomainData domainData) {
        super(tld);
        this.domainData = domainData;
    }

    @Override
    public String toString() {
        return "TLD name = '" + getTld() + '\'' +
                "; " + domainData;
    }
}
