package com.sydoruk1ua.homework.home21.json;

import com.sydoruk1ua.homework.home21.json.entity.Address;
import com.sydoruk1ua.homework.home21.json.entity.User;

import java.util.Arrays;
import java.util.List;

public class JsonMain {
    private static final String FILE_NAME = "./src/main/resources/home21/json/jsonFile.txt"; //fixme DONE

    //private static final String FILE_NAME =  JsonMain.class.getClassLoader().getResource("home21/json/jsonFile.txt")
    //                                                 .getPath();
    public static void main(String[] args) {
        System.out.println(new JsonParser().getUserFromFile(FILE_NAME));

        //todo : object parse to string
        User user = new User();
        user.setName("Alex");
        user.setSurname("SurnameTest");

        Address address = new Address();
        address.setCountry("CountryTest");
        address.setCity("CityTest");
        address.setStreet("StreetTest");
        user.setAddress(address);

        List<String> sites = Arrays.asList("http://site1.com", "http://site2.com");
        user.setSites(sites);
        String[] phones = {"044-256-78-90", "066-123-45-67"};
        user.setPhones(phones);

        System.out.println(new JsonParser().putUserToString(user));
    }
}
