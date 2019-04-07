package com.sydoruk1ua.homework.home7_8.abstractfactory.movies;

import com.sydoruk1ua.homework.home7_8.abstractfactory.AudioTrack;
import com.sydoruk1ua.homework.home7_8.abstractfactory.MovieFactory;
import com.sydoruk1ua.homework.home7_8.abstractfactory.Subtitles;
import com.sydoruk1ua.homework.home7_8.abstractfactory.audiotracks.RuAudioTrack;
import com.sydoruk1ua.homework.home7_8.abstractfactory.subtitles.RuSubtitles;

public class RuMovieFactory implements MovieFactory {
    @Override
    public AudioTrack createAudioTrack() {
        return new RuAudioTrack();
    }

    @Override
    public Subtitles createSubtitles() {
        return new RuSubtitles();
    }
}
