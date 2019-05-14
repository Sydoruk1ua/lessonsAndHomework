package com.sydoruk1ua.homework.home21.xml;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class XmlParserTest {
    private XmlParser xmlParser;

    @Before
    public void setUp() throws Exception {
        xmlParser = new XmlParser();
    }

    @Test
    public void shouldReturnScope() {
        assertEquals(Scope.IMPORT, xmlParser.getScope("import"));
    }

    @Test
    public void shouldReturnValueFromString() {
        assertEquals("junit", xmlParser.getValue("    <groupId>junit</groupId>    "));
        assertEquals("3.2", xmlParser.getValue("<version>3.2</version>"));
        assertEquals("powermock-reflect", xmlParser.getValue("    " +
                "<artifactId> powermock-reflect</artifactId>  "));
    }
}