package com.sydoruk1ua.lessons.lesson13.example4;

import java.util.List;

public class XmlElement {
    private String value;
    private String tag;
    // private List<XmlElement> elements;

    public XmlElement(String value, String tag, List<XmlElement> elements) {
        this.value = value;
        this.tag = tag;
        //   this.elements = elements;
    }

    //value = a, tag = u, <u> a </u>
    /*
    * <li>
       <u> a </u>
       <u> b </u>
      </li>*/
}
