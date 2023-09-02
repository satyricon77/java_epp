package internalpackage.jaxbparser.models.responses.domaininforesponse;

import internalpackage.jaxbparser.models.responses.baseresponse.BaseResponse;

import javax.xml.bind.annotation.*;

@XmlRootElement(name = "EPP")
@XmlAccessorType(XmlAccessType.FIELD)
public class DomainInfoResponse extends BaseResponse {

    @XmlElement(name = "InfoDomainReply")
    private DomainData domainData;
    @XmlElement(name = "trId")
    private String trId;

    public DomainInfoResponse() {}

    public DomainInfoResponse(String commandResponseTime, String responsePath, String tld, DomainData domainData,
                              String trId) {
        super(commandResponseTime, responsePath, tld);
        this.domainData = domainData;
        this.trId = trId;
    }

    @Override
    public String toString() {
        return "Command Response Time = '" + getCommandResponseTime() + '\'' +
                "; Response Path = '" + getResponsePath() + '\'' +
                "; TLD = '" + getTld() + '\'' +
                "; " + domainData +
                "; trId = '" + trId + '\'';
    }
}
