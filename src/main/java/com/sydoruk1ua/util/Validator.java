package com.sydoruk1ua.util;

import com.sydoruk1ua.exception.EmaiNotValidException;

public final class Validator {
    public static final String EMAIL_REGEX = "(\\w{2,})@(\\w+\\.)([a-z]{4,6})";
    public static final String IP_REGEX = "^(?:[0-9]{1,3}\\.){3}[0-9]{1,3}";

    private Validator() {
    }

    public static boolean isEmailValid(String email) {
        return email.matches(EMAIL_REGEX);
    }

    public static void validateEmail(String email) {
        if (!email.matches(EMAIL_REGEX)) {
            throw new EmaiNotValidException();
        }
    }

    public static boolean isIpValid(String ip) {
        return ip.matches(IP_REGEX);
    }
}
