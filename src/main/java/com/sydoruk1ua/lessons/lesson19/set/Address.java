package com.sydoruk1ua.lessons.lesson19.set;

import java.util.Objects;

public class Address {
    private String city;
    private Integer code;

    public Address(String city, Integer code) {
        this.city = city;
        this.code = code;
    }

    public String getCity() {
        return city;
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "Address{" +
                "city='" + city + '\'' +
                ", code=" + code +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Address address = (Address) o;
        return Objects.equals(city, address.city) &&
                Objects.equals(code, address.code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, code);
    }
}
