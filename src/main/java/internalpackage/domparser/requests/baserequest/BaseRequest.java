package internalpackage.domparser.requests.baserequest;

public class BaseRequest {

    private String tld;

    public BaseRequest(String tld) {
        this.tld = tld;
    }

    public BaseRequest() {}

    public String getTld() {
        return tld;
    }

    public void setTld(String tld) {
        this.tld = tld;
    }

    @Override
    public String toString() {
        return "BaseRequest{" +
                "tld='" + tld + '\'' +
                '}';
    }
}
