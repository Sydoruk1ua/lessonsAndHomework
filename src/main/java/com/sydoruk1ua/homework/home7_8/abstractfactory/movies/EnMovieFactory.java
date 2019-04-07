package com.sydoruk1ua.homework.home7_8.abstractfactory.movies;

import com.sydoruk1ua.homework.home7_8.abstractfactory.AudioTrack;
import com.sydoruk1ua.homework.home7_8.abstractfactory.MovieFactory;
import com.sydoruk1ua.homework.home7_8.abstractfactory.Subtitles;
import com.sydoruk1ua.homework.home7_8.abstractfactory.audiotracks.EnAudioTrack;
import com.sydoruk1ua.homework.home7_8.abstractfactory.subtitles.EnSubtitles;

public class EnMovieFactory implements MovieFactory {
    @Override
    public AudioTrack createAudioTrack() {
        return new EnAudioTrack();
    }

    @Override
    public Subtitles createSubtitles() {
        return new EnSubtitles();
    }
}
