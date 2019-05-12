package com.sydoruk1ua.homework.home18.equals;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.time.Month;

import static org.junit.Assert.*;

public class UserTest {
    private User userExpected;

    @Before
    public void setUp() throws Exception {
        userExpected = new User("Alex", "Surname", new Address("Kiev"),
                LocalDate.of(1992, Month.JANUARY, 10), 1, Sex.MALE);
    }

    @Test
    public void shouldBeTrueForEqualUsers() {
        User userActual = new User("Alex", "Surname", new Address("Kiev"),
                LocalDate.of(1992, Month.JANUARY, 10), 1, Sex.MALE);
        assertTrue(userExpected.equals(userActual));
    }

    @Test
    public void shouldBeFalseForNotEqualUsers() {
        User userActual = new User("NotAlex", "1Surname", new Address("1Kiev"),
                LocalDate.of(1982, Month.JANUARY, 10), 2, Sex.FEMALE);
        assertFalse(userExpected.equals(userActual));
    }

    @Test
    public void shouldBeTrueForEqualHashcode() {
        User userActual = new User("Alex", "Surname", new Address("Kiev"),
                LocalDate.of(1992, Month.JANUARY, 10), 1, Sex.MALE);
        assertEquals(userExpected.hashCode(), userActual.hashCode());
    }

    @Test
    public void shouldBeFalseForNotEqualHashcode() {
        User userActual = new User("NotAlex", "Surname", new Address("Kiev"),
                LocalDate.of(1992, Month.JANUARY, 10), 1, Sex.MALE);
        assertNotEquals(userExpected.hashCode(), userActual.hashCode());
    }
}