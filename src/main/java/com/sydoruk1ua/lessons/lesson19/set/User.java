package com.sydoruk1ua.lessons.lesson19.set;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

import static java.util.Collections.emptyList;

public class User implements Comparable<User> {
    public static final Comparator<User> USER_COMPARATOR = (o1, o2) -> o1.getName().length() - o2.getName().length();
    public static final Comparator<User> USER_COMPARATOR_NAME_SURNAME = (o1, o2) -> {
        int compareNames = o1.getName().length() - o2.getName().length();
        return compareNames != 0 ? compareNames : o1.getSurname().length() - o2.getSurname().length();
    };

    public static final Comparator<User> USER_COMPARATOR_L = Comparator.comparing(User::getName)
            .thenComparing(User::getSurname);
    private String name;
    private String surname;
    private Address address;

    private List<Address> addressList;

    public User(String name, String surname, Address address, List<Address> addressList) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.addressList = addressList;
    }

    public User(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public User(String name, String surname, Address address) {
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getSurname() {
        return surname;
    }

    public Address getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(name, user.name) &&
                Objects.equals(surname, user.surname) &&
                Objects.equals(address, user.address) &&
                Objects.equals(addressList, user.addressList);
    }

    public List<Address> getAddressList() {
        return addressList == null ? emptyList() : addressList;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, address, addressList);
    }

    @Override
    public int compareTo(User o) {
        int compareNames = this.name.compareTo(o.name);
        if (compareNames == 0) {
            return this.surname.compareTo(o.surname);
        }
        return compareNames;
    }

  /*  @Override
    public int compareTo(User o) {
        return this.name.length() - o.name.length();
    }*/
}
