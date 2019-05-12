package com.sydoruk1ua.homework.home18.optional;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArtistsTest {
    List<Artist> artistsList;
    Artists artists;

    @Before
    public void setUp() {
        artistsList = new ArrayList<>();
        artists = new Artists(artistsList);
        artistsList.add(new Artist("Alex"));
    }

    @Test
    public void shouldGetArtistName() {
        assertEquals("Alex", artists.getArtistName(0));
    }

    @Test
    public void shouldNotGetArtistName() {
        assertEquals("unknown", artists.getArtistName(1));
    }
}