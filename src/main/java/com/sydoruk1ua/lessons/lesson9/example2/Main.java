package com.sydoruk1ua.lessons.lesson9.example2;

public class Main {
    public static void main(String[] args) {
        Notepad notepad = new Notepad();
        notepad.addNote("Hello!");
        notepad.addNote("Have a nice day!");

        System.out.println(notepad);
        notepad.deleteNote(0);
        notepad.addNote("new");

        System.out.println(notepad);

        DataTransfer dataTransferFile = new DataTransferFileImpl();
        DataTransfer dataTransferDB = new DataTransferOracleDbImpl();

        dataTransferFile.save(notepad, "path");
    }
}
