package com.sydoruk1ua.homework.home21.serialization.entity;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

public class User implements Serializable {
    private String name;
    private String surname;
    private Sex sex;
    private Address address;
    private LocalDate birthday;

    public User(String name, String surname, Sex sex, Address address, LocalDate birthday) {
        this.name = name;
        this.surname = surname;
        this.sex = sex;
        this.address = address;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", sex=" + sex +
                ", address=" + address +
                ", birthday=" + birthday +
                '}';
    }

    public String getSurname() {
        return surname;
    }

    public Sex getSex() {
        return sex;
    }

    public Address getAddress() {
        return address;
    }

    public LocalDate getBirthday() {
        return birthday;
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
                sex == user.sex &&
                Objects.equals(address, user.address) &&
                Objects.equals(birthday, user.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, sex, address, birthday);
    }
}
