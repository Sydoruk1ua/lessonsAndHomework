package com.sydoruk1ua.homework.home21.json;

public class JsonMain {
    private static final String FILE_NAME = "F:\\EPAM\\projects\\study-project\\src\\main\\resources\\" +
            "home21\\json\\jsonFile.txt";

    public static void main(String[] args) {
        System.out.println(new JsonParser().getUserFromFile(FILE_NAME));
    }
}
