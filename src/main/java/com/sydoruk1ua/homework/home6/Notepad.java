package com.sydoruk1ua.homework.home6;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private LocalDate date;
    private List<Note> notes;

    public Notepad() {
        this(LocalDate.now());
    }

    public Notepad(LocalDate date) {
        this.date = date;
        this.notes = new ArrayList<>();
    }

    public LocalDate getDate() {
        return date;
    }

    public List<Note> getNotes() {
        return notes;
    }

    public class Note {
        private String note;

        public Note(String note) {
            this.note = note;
            notes.add(this);
        }


        @Override
        public String toString() {
            return "Note{" +
                    "date='" + date + '\'' +
                    "note='" + note + '\'' +
                    '}';
        }
    }
}
