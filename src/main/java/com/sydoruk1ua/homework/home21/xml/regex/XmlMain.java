package com.sydoruk1ua.homework.home21.xml.regex;

public class XmlMain {
    private static final String FILE_NAME = "/.src/main/resources/home21/xml/xmlFile.txt";

    public static void main(String[] args) {
        XmlParser xmlParser = new XmlParser();
        xmlParser.getDependencies(FILE_NAME).forEach(System.out::println);
    }
}
