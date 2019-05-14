package com.sydoruk1ua.homework.home21.serialization.entity;

import java.io.Serializable;
import java.util.Objects;

public class Address implements Serializable {
    private String city;
    private int code;

    public Address(String city, int code) {
        this.city = city;
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public int getCode() {
        return code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return code == address.code &&
                Objects.equals(city, address.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, code);
    }
}
