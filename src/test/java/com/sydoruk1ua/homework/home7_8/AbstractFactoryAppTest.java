package com.sydoruk1ua.homework.home7_8;

import com.sydoruk1ua.homework.home7_8.abstractfactory.movies.EnMovieFactory;
import com.sydoruk1ua.homework.home7_8.abstractfactory.movies.RuMovieFactory;
import com.sydoruk1ua.homework.home7_8.abstractfactory.movies.UaMovieFactory;
import org.junit.Assert;
import org.junit.Test;

import static com.sydoruk1ua.homework.home7_8.abstractfactory.AbstractFactoryApp.getMovieByAudioTrack;
import static com.sydoruk1ua.homework.home7_8.abstractfactory.AbstractFactoryApp.getMovieBySubtitles;

public class AbstractFactoryAppTest {

    @Test
    public void shouldReturnMovieByAudioTrack() {
        Assert.assertTrue(getMovieByAudioTrack("RU") instanceof RuMovieFactory);
        Assert.assertTrue(getMovieByAudioTrack("EN") instanceof EnMovieFactory);
        Assert.assertTrue(getMovieByAudioTrack("UA") instanceof UaMovieFactory);
    }

    @Test(expected = RuntimeException.class)
    public void getMovieByAudioTrackShouldReturnException() {
        getMovieByAudioTrack("someWrongLanguage");
    }

    @Test
    public void shouldReturnMovieBySubtitles() {
        Assert.assertTrue(getMovieBySubtitles("RU") instanceof RuMovieFactory);
        Assert.assertTrue(getMovieBySubtitles("EN") instanceof EnMovieFactory);
        Assert.assertTrue(getMovieBySubtitles("UA") instanceof UaMovieFactory);
    }

    @Test(expected = RuntimeException.class)
    public void getMovieBySubtitlesShouldReturnException() {
        getMovieBySubtitles("someWrongSubtitles");
    }
}