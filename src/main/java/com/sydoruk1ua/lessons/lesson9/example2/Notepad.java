package com.sydoruk1ua.lessons.lesson9.example2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Notepad {
    private static int counter = 0;
    private List<String> notes = new ArrayList<>();

    //Getters or/and setters
    public void addNote(String note) {
        counter++;
        notes.add(write(note));
    }

    private String write(String note) {
        return counter + " " + LocalDate.now().toString() + ": " + note;
    }

    public void deleteNote(int index) {
        counter--;
        notes.remove(index);
    }

    @Override
    public String toString() {
        return Arrays.toString(notes.toArray());
    }

    /*  public void saveToFile(String fileName) {
        //TODO:
    }

    public Notepad readFromFile(String fileName) {
        //TODO:
        return null;
    }*/
}
