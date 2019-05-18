package com.sydoruk1ua.homework.home21.json;

import com.sydoruk1ua.homework.home21.json.entity.Address;
import com.sydoruk1ua.homework.home21.json.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class JsonParserTest {
    private static final String FILE_NAME = "./src/main/resources/home21/json/jsonFile.txt";
    private User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
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
    }

    @Test
    public void shouldReturnUserFromFile() {
        assertEquals(user, new JsonParser().getUserFromFile(FILE_NAME));
    }

    @Test
    public void shouldWriteUserToString() {
        String expectedString = "{\"name\":\"Alex\",\"surname\":\"SurnameTest\",\"phones\":[\"044-256-78-90\"," +
                "\"066-123-45-67\"],\"sites\":[\"http://site1.com\",\"http://site2.com\"],\"address\":" +
                "{\"country\":\"CountryTest\",\"city\":\"CityTest\",\"street\":\"StreetTest\"}}";

        assertEquals(expectedString, new JsonParser().putUserToString(user));
    }
}