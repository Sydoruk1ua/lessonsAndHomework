package com.sydoruk1ua.lessons.lesson2;

public enum StudentType {
    GOOD_STUDENT;

    public static StudentType getValueOfStudentType(String studentType) {
        for (int i = 0; i < values().length; i++) {
            if (values()[i].name().equals(studentType)) {
                return values()[i];
            }
        }
        return null;
    }
}
