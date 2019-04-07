package com.sydoruk1ua.homework.home7_8.abstractfactory;

import com.sydoruk1ua.homework.home7_8.abstractfactory.movies.EnMovieFactory;
import com.sydoruk1ua.homework.home7_8.abstractfactory.movies.RuMovieFactory;
import com.sydoruk1ua.homework.home7_8.abstractfactory.movies.UaMovieFactory;

public class AbstractFactoryApp {
    public static void main(String[] args) {

    }

    public static MovieFactory getMovieByAudioTrack(String audioTrackLang) {
        switch (audioTrackLang) {
            case "EN":
                return new EnMovieFactory();
            case "RU":
                return new RuMovieFactory();
            case "UA":
                return new UaMovieFactory();
            default:
                throw new RuntimeException("No movie with: " + audioTrackLang + " audio track");
        }
    }

    public static MovieFactory getMovieBySubtitles(String subtitlesLang) {
        switch (subtitlesLang) {
            case "EN":
                return new EnMovieFactory();
            case "RU":
                return new RuMovieFactory();
            case "UA":
                return new UaMovieFactory();
            default:
                throw new RuntimeException("No movie with: " + subtitlesLang + " subtitles");
        }
    }
}
