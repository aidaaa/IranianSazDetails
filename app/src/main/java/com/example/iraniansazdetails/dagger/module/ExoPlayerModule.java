package com.example.iraniansazdetails.dagger.module;

import android.content.Context;
import android.net.Uri;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ConcatenatingMediaSource;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

import dagger.Module;
import dagger.Provides;

@Module
public class ExoPlayerModule
{
    @Provides
    public TrackSelector getTrackSelector()
    {
        return new DefaultTrackSelector();
    }

    @Provides
    public SimpleExoPlayer getSimpleExoPlayer(Context context)
    {
        return ExoPlayerFactory.newSimpleInstance(context);
    }

    @Provides
    public ConcatenatingMediaSource getConcatenatingMediaSource()
    {
        return new ConcatenatingMediaSource();
    }

    @Provides
    public DefaultDataSourceFactory getDataSource(Context context)
    {
        return new DefaultDataSourceFactory(context, Util.getUserAgent(context,"exoplayer"));
    }

    @Provides
    public MediaSource getMediaSource(DefaultDataSourceFactory factory, Uri uri)
    {
        return new ExtractorMediaSource.Factory(factory).createMediaSource(uri);
    }
}
