package internalpackage.jaxbparser.models.responses.baseresponse;

import javax.xml.bind.annotation.XmlAttribute;

public class BaseResponse {

    @XmlAttribute(name = "commandResponseTime")
    private String commandResponseTime;
    @XmlAttribute(name = "responsePath")
    private String responsePath;
    @XmlAttribute(name = "tld")
    private String tld;

    public BaseResponse() {}

    public BaseResponse(String commandResponseTime, String responsePath, String tld) {
        this.commandResponseTime = commandResponseTime;
        this.responsePath = responsePath;
        this.tld = tld;
    }

    public String getCommandResponseTime() {
        return commandResponseTime;
    }

    public String getResponsePath() {
        return responsePath;
    }

    public String getTld() {
        return tld;
    }

    @Override
    public String toString() {
        return "Command Response Time ='" + commandResponseTime + '\'' +
                "; Response Path = '" + responsePath + '\'' +
                "; TLD = '" + tld + '\'';
    }
}
