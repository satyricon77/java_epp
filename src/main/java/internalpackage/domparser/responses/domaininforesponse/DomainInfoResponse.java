package internalpackage.domparser.responses.domaininforesponse;

import internalpackage.domparser.responses.baseresponse.BaseResponse;

public class DomainInfoResponse extends BaseResponse {

    private DomainData domainData;
    private String trId;

    public DomainInfoResponse(String tdId, DomainData domainData) {
        this.domainData = domainData;
        this.trId = tdId;
    }

    public DomainInfoResponse() {
    }

    public DomainData getDomainData() {
        return domainData;
    }

    public String getTrId() {
        return trId;
    }

    public void setDomainData(DomainData domainData) {
        this.domainData = domainData;
    }

    public void setTrId(String trId) {
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
