package com.sydoruk1ua.homework.home21.inout;

import java.io.IOException;

public class Main {
    private static final String INITIAL_FILE = "F:\\EPAM\\projects\\study-project\\src\\main\\resources\\home21\\" +
            "inout\\initialFile.txt";
    private static final String REVERSED_FILE = "F:\\EPAM\\projects\\study-project\\src\\main\\resources\\home21\\" +
            "inout\\reversedFile.txt";

    public static void main(String[] args) throws IOException {
        FileReverser fileReverser = new FileReverser();
        //fileReverser.reverseFileWriterByRAF(INITIAL_FILE, REVERSED_FILE);
        //fileReverser.reverseFileWriterByList(INITIAL_FILE, REVERSED_FILE);
        fileReverser.reverseFileWriterByArray(INITIAL_FILE, REVERSED_FILE);
    }
}
