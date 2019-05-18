package com.sydoruk1ua.homework.home21.serialization;

import com.sydoruk1ua.homework.home21.serialization.entity.Address;
import com.sydoruk1ua.homework.home21.serialization.entity.Sex;
import com.sydoruk1ua.homework.home21.serialization.entity.User;

import java.io.InvalidObjectException;
import java.time.LocalDate;
import java.time.Month;

public class RunnerSerialization {
    private static final String FILE_NAME = "./src/main/resources/home21/serialization/fileSD.txt";

    public static void main(String[] args) {
        User userSer = new User("Alex", "Surname", Sex.MALE, new Address("Kiev", 25),
                LocalDate.of(1992, Month.JANUARY, 10));
        Serializer serializer = new Serializer();
        boolean isUserSerialized = serializer.serialization(userSer, FILE_NAME);
        User userDes = null;
        if (isUserSerialized) {
            try {
                userDes = serializer.deserialization(FILE_NAME);
            } catch (InvalidObjectException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println("Serialization/Deserialization is: " + (userSer.equals(userDes) ? "successful" : "not successful"));
    }
}
