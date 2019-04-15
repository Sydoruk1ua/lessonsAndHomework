package com.sydoruk1ua.lessons.lesson2;

import java.time.LocalDate;

public class Student {
    private static String name;
    private Long id;
    private String surname;
    private LocalDate date;

    public Student(Long id, String name, String surname, LocalDate date) {
        this.id = id;
        Student.name = name;
        this.surname = surname;
        this.date = date;
    }

    public static void main(String[] args) {
        int d = 5;
        switch (d) {

        }
    }
}


