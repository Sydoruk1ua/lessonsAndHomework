package com.sydoruk1ua.homework.home21.xml.jaxb;

public class Main {
    private static final String FILE_NAME = "./src/main/resources/home21/xml/xmlFile.txt";

    public static void main(String[] args) {
        MarshallerDemarshaller parser = new MarshallerDemarshaller();
        parser.getDependencies(FILE_NAME).forEach(System.out::println);
    }
}
