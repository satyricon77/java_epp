package internalpackage.jaxbparser.builder;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class Builder {

    public static <T> Unmarshaller initParser(Class<T> object) throws JAXBException {
        JAXBContext jc = JAXBContext.newInstance(object);
        Unmarshaller unmarshaller = jc.createUnmarshaller();
        return unmarshaller;
    }
}
