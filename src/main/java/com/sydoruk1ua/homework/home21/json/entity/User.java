package com.sydoruk1ua.homework.home21.json.entity;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private String surname;
    private String[] phones;
    private List<String> sites;
    private Address address;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", phones=").append(Arrays.toString(phones));
        sb.append(", sites=").append(sites);
        sb.append(", address=").append(address);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Arrays.equals(phones, user.phones) &&
                Objects.equals(sites, user.sites) &&
                Objects.equals(address, user.address);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, surname, sites, address);
        result = 31 * result + Arrays.hashCode(phones);
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String[] getPhones() {
        return phones;
    }

    public void setPhones(String[] phones) {
        this.phones = phones;
    }

    public List<String> getSites() {
        return sites;
    }

    public void setSites(List<String> sites) {
        this.sites = sites;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}