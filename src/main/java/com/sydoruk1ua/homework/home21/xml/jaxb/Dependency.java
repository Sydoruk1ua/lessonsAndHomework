package com.sydoruk1ua.homework.home21.xml.jaxb;

import javax.xml.bind.annotation.*;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Dependency", propOrder = {
        "groupId",
        "artifactId",
        "version",
        "scope"
})
public class Dependency {

    //  @XmlJavaTypeAdapter(CollapsedStringAdapter.class)

    @XmlElement(required = true)
    private String groupId;

    @XmlElement(required = true)
    private String artifactId;

    @XmlElement(required = true)
    private String version;

    @XmlElement(required = false)
    private String scope;

    public Dependency() {
    }

    public Dependency(String groupId, String artifactId, String version, String scope) {
        this.groupId = groupId;
        this.artifactId = artifactId;
        this.version = version;
        this.scope = scope;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getArtifactId() {
        return artifactId;
    }

    public void setArtifactId(String artifactId) {
        this.artifactId = artifactId;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Dependency{");
        sb.append("groupId='").append(groupId).append('\'');
        sb.append(", artifactId='").append(artifactId).append('\'');
        sb.append(", version='").append(version).append('\'');
        sb.append(", scope='").append(scope).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
