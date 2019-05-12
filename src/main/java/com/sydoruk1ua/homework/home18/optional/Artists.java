package com.sydoruk1ua.homework.home18.optional;

import java.util.List;
import java.util.Optional;

public class Artists {
    private List<Artist> artists;

    public Artists(List<Artist> artists) {
        this.artists = artists;
    }

    public Optional<Artist> getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            return Optional.empty();
        }
        return Optional.ofNullable(artists.get(index));
    }

   /* public Artist getArtist(int index) {
        if (index < 0 || index >= artists.size()) {
            indexException(index);
        }
        return artists.get(index);
    }*/

   /* private void indexException(int index) {
        throw new IllegalArgumentException(index +
                " doesn't correspond to an Artist");
    }*/

    public String getArtistName(int index) {
        Optional<Artist> artist = getArtist(index);
        return artist.isPresent() ? artist.get().getName() : "unknown";
    /*    try {
            Artist artist = getArtist(index);
            return artist.getName();
        } catch (IllegalArgumentException e) {
            return "unknown";
        }*/
    }
}
