package com.sydoruk1ua.homework.home21.xml.jaxb;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement
public class Dependencies {
    @XmlElement(name = "dependency")
    private ArrayList<Dependency> list = new ArrayList<>();

    public Dependencies() {

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dependencies{");
        sb.append("list=").append(list);
        sb.append('}');
        return sb.toString();
    }

    public List<Dependency> getList() {
        return list;
    }

    public void setList(ArrayList<Dependency> list) {
        this.list = list;
    }
}
