package com.sydoruk1ua.homework.home7_8.abstractfactory.movies;

import com.sydoruk1ua.homework.home7_8.abstractfactory.AudioTrack;
import com.sydoruk1ua.homework.home7_8.abstractfactory.MovieFactory;
import com.sydoruk1ua.homework.home7_8.abstractfactory.Subtitles;
import com.sydoruk1ua.homework.home7_8.abstractfactory.audiotracks.UaAudioTrack;
import com.sydoruk1ua.homework.home7_8.abstractfactory.subtitles.UaSubtitles;

public class UaMovieFactory implements MovieFactory {
    @Override
    public AudioTrack createAudioTrack() {
        return new UaAudioTrack();
    }

    @Override
    public Subtitles createSubtitles() {
        return new UaSubtitles();
    }
}
