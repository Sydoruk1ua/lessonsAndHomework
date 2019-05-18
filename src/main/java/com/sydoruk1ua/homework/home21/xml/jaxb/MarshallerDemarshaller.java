package com.sydoruk1ua.homework.home21.xml.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class MarshallerDemarshaller {
    public List<Dependency> getDependencies(String fileName) {
        try {
            JAXBContext jc = JAXBContext.newInstance(Dependencies.class);
            Unmarshaller u = jc.createUnmarshaller();
            FileReader reader = new FileReader(new File(fileName));
            Dependencies dependencies = (Dependencies) u.unmarshal(reader);
            return dependencies.getList();
        } catch (JAXBException | FileNotFoundException e) {
            e.printStackTrace();
        }
        throw new CantDoMarshalisationProcessException();
    }
}
