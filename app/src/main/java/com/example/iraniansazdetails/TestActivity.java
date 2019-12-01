package com.example.iraniansazdetails;

import android.content.Context;
import android.net.Uri;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.core.content.res.ResourcesCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class TestActivity extends Fragment {

    View view;
    PlayerView music_player;
    SimpleExoPlayer exoPlayer;
    Context context;
    boolean isPlay=true;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_test,container,false);
        if (isPlay)
        {
            setUpView();
        }
        return view;
    }

    private void setUpView() {
        isPlay=false;
        String fileName="file:///android_asset/sorna.mp3";
        Uri uri=Uri.parse(fileName);

        TrackSelector trackSelector=new DefaultTrackSelector();
        exoPlayer= ExoPlayerFactory.newSimpleInstance(context,trackSelector);

        music_player=view.findViewById(R.id.music_player);
        music_player.setPlayer(exoPlayer);

        DataSource.Factory daFactory=new DefaultDataSourceFactory(context,Util.getUserAgent(context,"exoplayer"));

        MediaSource mediaSource=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri);

        exoPlayer.prepare(mediaSource);

    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        exoPlayer.release();
    }

    public static TestActivity newInstance() {

        Bundle args = new Bundle();

        TestActivity fragment = new TestActivity();
        fragment.setArguments(args);
        return fragment;
    }


    public void stop() {
        if (exoPlayer != null) {
            exoPlayer.stop();
            isPlay = true;
        }
    }

    @Override
    public void setUserVisibleHint(boolean isVisibleToUser) {
        if (isVisibleToUser) {
            if (context != null) {
                if (isPlay) {
                    setUpView();
                }
            }
        } else {
            stop();
        }
    }


}
