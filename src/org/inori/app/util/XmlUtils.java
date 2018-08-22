package org.inori.app.util;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class XmlUtils {

    public static <T> T getBean(File xmlFile, Class<T> clazz) throws JAXBException {
        JAXBContext jaxb = JAXBContext.newInstance(clazz);
        Unmarshaller unmarshaller = jaxb.createUnmarshaller();
        return (T) unmarshaller.unmarshal(xmlFile);
    }

    public static <T> void toFile(File xmlFile, T t) throws JAXBException {
        JAXBContext jaxb = JAXBContext.newInstance(t.getClass());
        Marshaller marshaller = jaxb.createMarshaller();
        marshaller.marshal(t, xmlFile);
    }
}
