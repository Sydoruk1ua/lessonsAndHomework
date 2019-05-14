package com.sydoruk1ua.homework.home21.xml;

public class Dependency {
    private String groupId;
    private String artifactId;
    private String version;
    private Scope scope;

    public Dependency(String groupId, String artifactId, String version) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.scope = Scope.COMPILE;
    }

    public Dependency(String groupId, String artifactId, String version, Scope scope) {
        this(groupId, artifactId, version);
        this.scope = scope;
    }

    public String getGroupId() {
        return groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public String getVersion() {
        return version;
    }

    public Scope getScope() {
        return scope;
    }

    @Override
    public String toString() {
        return "Dependency{" +
                "groupId='" + groupId + '\'' +
                ", artifactId='" + artifactId + '\'' +
                ", version='" + version + '\'' +
                ", scope=" + scope.name().toLowerCase() +
                '}';
    }
}
