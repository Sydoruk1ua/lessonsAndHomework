package com.sydoruk1ua.homework.home21.inout;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class FileReverser {

    public void reverseFileWriterByList(String initialFile, String reversedFile) throws IOException {
        List<Integer> fileData = new ArrayList<>();
        try (Reader reader = new InputStreamReader(new FileInputStream(initialFile))) {
            while (reader.read() != -1) {
                int read = reader.read();
                fileData.add(read);
                System.out.println((char) read);
            }
        }

        if (!fileData.isEmpty()) {
            try (Writer writer = new OutputStreamWriter(new FileOutputStream(reversedFile), StandardCharsets.UTF_8)) {
                for (int i = fileData.size() - 1; i >= 0; i--) {
                    writer.write(fileData.get(i));
                }
            }
        }
    }

    public void reverseFileWriterByRAF(String initialFile, String reversedFile) throws IOException {
        File file = new File(initialFile);
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r");
             BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(reversedFile))) {
            long fileLength = file.length() - 1;
            randomAccessFile.seek(fileLength);
            for (long pointer = fileLength; pointer >= 0; pointer--) {
                randomAccessFile.seek(pointer);
                writer.write(randomAccessFile.read());
            }
        }
    }

    public void reverseFileWriterByArray(String initialFile, String reversedFile) throws IOException {
        try (FileInputStream fileInputStream = new FileInputStream(initialFile);
             FileOutputStream fileOutputStream = new FileOutputStream(reversedFile)) {
            int[] allBytesFromFile1 = new int[fileInputStream.available()];
            for (int i = 0; i < allBytesFromFile1.length; i++) {
                allBytesFromFile1[i] = fileInputStream.read();
            }
            for (int i = allBytesFromFile1.length - 1; i >= 0; i--) {
                fileOutputStream.write(allBytesFromFile1[i]);
            }
        }
    }
}

