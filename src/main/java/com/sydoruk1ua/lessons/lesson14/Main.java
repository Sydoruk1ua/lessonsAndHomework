package com.sydoruk1ua.lessons.lesson14;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Address kiev = new Address(null);
        User user = new User(kiev);
        Address address = user.getAddress();
        String city = null;
        if (address != null) {
            city = address.getCity();
        }
        System.out.println(city);

      /*  Optional<String> optionalCity = Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getCity);
        String city1 = null;
        if (optionalCity.isPresent()) {
            city1 = optionalCity
                    .get();
        }*/

        /*String city1 = Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getCity)
                .orElse(null);*/
        /*String city1 = Optional.ofNullable(user)
                .map(User::getAddress)
                .map(Address::getCity)
                .orElseThrow(() -> new RuntimeException("BlaBla"));*/

        String city1 = Optional.ofNullable((User) null)
                .map(User::getAddress)
                .map(Address::getCity)
                .orElseGet(() -> "Kiev2");
        System.out.println(city1);
    }
}

class User {
    private Address address;

    public User(Address address) {
        this.address = address;
    }

    public Address getAddress() {
        return address /*== null ? new Address("BlaBla") : address*/;
    }
}

class Address {
    private String city;

    public Address(String city) {
        this.city = city;
    }

    public String getCity() {
        return city;
    }
}
