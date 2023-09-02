package internalpackage.domparser.responses.baseresponse;

public class BaseResponse {

    private String commandResponseTime;
    private String responsePath;
    private String tld;

    public BaseResponse(String commandResponseTime, String responsePath, String tld) {
        this.commandResponseTime = commandResponseTime;
        this.responsePath = responsePath;
        this.tld = tld;
    }

    public BaseResponse() {}

    public String getCommandResponseTime() {
        return commandResponseTime;
    }

    public String getResponsePath() {
        return responsePath;
    }

    public String getTld() {
        return tld;
    }

    public void setCommandResponseTime(String commandResponseTime) {
        this.commandResponseTime = commandResponseTime;
    }

    public void setResponsePath(String responsePath) {
        this.responsePath = responsePath;
    }

    public void setTld(String tld) {
        this.tld = tld;
    }

    @Override
    public String toString() {
        return "BaseResponse{" +
                "commandResponseTime='" + commandResponseTime + '\'' +
                ", responsePath='" + responsePath + '\'' +
                ", tld='" + tld + '\'' +
                '}';
    }
}
