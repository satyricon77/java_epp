package internalpackage.domparser.parserview.view;

import internalpackage.domparser.requests.baserequest.BaseRequest;
import internalpackage.domparser.responses.baseresponse.BaseResponse;

public class XmlParserView {

    public void displayRequest(BaseRequest request) {
        System.out.println("Displaying request:");
        System.out.println(request);
    }

    public void displayResponse(BaseResponse response) {
        System.out.println("Displaying response:");
        System.out.println(response);
    }
}
