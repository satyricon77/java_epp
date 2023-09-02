package internalpackage.jaxbparser.parser;

import internalpackage.jaxbparser.models.requests.baserequest.BaseRequest;
import internalpackage.jaxbparser.models.responses.baseresponse.BaseResponse;

import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;

import static internalpackage.jaxbparser.builder.Builder.initParser;

public class XMLParser {

    private <T> T parseTarget(String filePath, Class<T> targetClass) throws JAXBException {
        try {
            File xmlFile = new File(filePath);
            Unmarshaller unmarshaller = initParser(targetClass);
            return targetClass.cast(unmarshaller.unmarshal(xmlFile));
        } catch (JAXBException e) {
            throw new JAXBException("Error parsing XML file: " + filePath, e);
        }
    }

    public BaseRequest parseRequest(String filePath, BaseRequest request) throws JAXBException {
        return parseTarget(filePath, request.getClass());
    }

    public BaseResponse parseResponse(String filePath, BaseResponse response) throws JAXBException {
        return parseTarget(filePath, response.getClass());
    }
}
