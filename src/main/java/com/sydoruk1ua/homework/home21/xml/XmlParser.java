package com.sydoruk1ua.homework.home21.xml;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class XmlParser {
    private String groupId;
    private String artifactId;
    private String version;
    private Scope scope;

    public List<Dependency> getDependencies(String fileName) {
        List<Dependency> dependencies = new ArrayList<>();
        try (Scanner scanner = new Scanner(new File(fileName))) {
            int count = 0;
            while (scanner.hasNextLine()) {
                String string = scanner.nextLine();
                if (count > 0) {
                    if (string.contains("</dependency>")) {
                        if (scope != null) {
                            dependencies.add(new Dependency(groupId, artifactId, version, scope));
                        } else {
                            dependencies.add(new Dependency(groupId, artifactId, version));
                        }
                        count = 0;
                        scope = null;
                    } else {
                        initializeValue(string);
                    }
                }

                if (string.contains("<dependency>")) {
                    count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return dependencies;
    }

    public void initializeValue(String string) {
        if (string.contains("groupId")) {
            groupId = getValue(string);
        } else if (string.contains("artifactId")) {
            artifactId = getValue(string);
        } else if (string.contains("version")) {
            version = getValue(string);
        } else if (string.contains("scope")) {
            scope = getScope(getValue(string));
        }
        //todo: read 14 add anotations. Add framework
    }

    public String getValue(String str) {
        return str.split("[></]")[2].trim();
    }

    public Scope getScope(String scope) {
        return Scope.valueOf(scope.toUpperCase());
    }
}
