package com.sydoruk1ua.util;


import com.sydoruk1ua.exception.EmaiNotValidException;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class ValidatorTest {

    @Test
    public void ipShouldBeValid() {
        assertTrue(Validator.isIpValid("123.134.34.34"));
    }

    @Test
    public void ipShouldNotBeValid() {
        assertFalse(Validator.isIpValid("123.1344.34.34"));
    }

    @Test
    public void emailShouldBeValid() {
        Validator.validateEmail("fooalex@gmail.come");
    }

    @Test(expected = EmaiNotValidException.class)
    public void emailShouldNotBeValid() {
        Validator.validateEmail("fooalex@gmail.com");
    }
}