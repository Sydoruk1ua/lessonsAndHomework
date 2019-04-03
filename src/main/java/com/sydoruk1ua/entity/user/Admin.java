package com.sydoruk1ua.entity.user;

import java.util.Objects;

public class Admin extends User {
    private String key;

    public Admin(Long id, String email, String password, String key) {
        super(id, email, password, UserType.ADMIN);
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        if (!super.equals(o)) {
            return false;
        }
        Admin admin = (Admin) o;
        return Objects.equals(key, admin.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), key);
    }

    @Override
    public String toString() {
        return "Admin{" +
                "key='" + key + '\'' +
                "} " + super.toString();
    }
    /* @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Admin admin = (Admin) o;
        return Objects.equals(key, admin.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }*/
}
