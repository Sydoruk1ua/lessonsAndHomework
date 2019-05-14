package com.sydoruk1ua.homework.home21.serialization;

import com.sydoruk1ua.homework.home21.serialization.entity.Address;
import com.sydoruk1ua.homework.home21.serialization.entity.Sex;
import com.sydoruk1ua.homework.home21.serialization.entity.User;
import org.junit.Before;
import org.junit.Test;

import java.io.InvalidObjectException;
import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SerializerTest {
    private static final String FILE_NAME = "F:\\EPAM\\projects\\study-project\\src\\main\\" +
            "resources\\home21\\serialization\\fileSDForTest.txt";
    Serializer serializer;
    private User user;

    @Before
    public void setUp() throws Exception {
        serializer = new Serializer();
        user = new User("Alex", "Surname", Sex.MALE, new Address("Kiev", 25),
                LocalDate.of(1992, Month.JANUARY, 10));
    }

    @Test
    public void shouldSerializeUser() {
        assertTrue(serializer.serialization(user, FILE_NAME));
    }

    @Test
    public void shouldDeserializeUser() throws InvalidObjectException {
        User userDes = null;
        if (serializer.serialization(user, FILE_NAME)) {
            userDes = serializer.deserialization(FILE_NAME);
        }

        assertEquals(user, userDes);
    }
}