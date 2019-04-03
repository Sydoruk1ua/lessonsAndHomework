package com.sydoruk1ua.homework.home6;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class NotepadTest {
    private LocalDate date;
    private List<Notepad.Note> notesForTest;
    private Notepad obj;

    @Before
    public void initialize() {
        date = LocalDate.parse("2019-03-30");
        obj = new Notepad(date);
        Notepad.Note note1 = obj.new Note("NOTE1");
        Notepad.Note note2 = obj.new Note("NOTE2");
        Notepad.Note note3 = obj.new Note("NOTE3");

        notesForTest = new ArrayList<>(Arrays.asList(note1, note2, note3));
    }

    @Test
    public void shouldGetNotesForDate() {
        assertEquals("Note{date='2019-03-30'note='NOTE1'}", obj.getNotes().get(0).toString());
        assertEquals(notesForTest, obj.getNotes());

        Notepad objForTest = new Notepad(LocalDate.parse("2019-03-31"));
        Notepad.Note note1 = objForTest.new Note("NOTE1");
        Notepad.Note note2 = objForTest.new Note("NOTE2");
        Notepad.Note note3 = objForTest.new Note("NOTE3");

        assertNotEquals(obj.getNotes(), objForTest.getNotes());
    }

    @Test
    public void shouldGedDate() {
        assertEquals(date, obj.getDate());
    }
}