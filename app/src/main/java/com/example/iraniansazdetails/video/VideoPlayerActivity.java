package com.example.iraniansazdetails.video;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.iraniansazdetails.R;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;

public class VideoPlayerActivity extends Fragment {
    private SimpleExoPlayer player;
    private View view;
    Context context;
    private boolean isPlay=true;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_video_player,container,false);
        if (isPlay)
        {
            setUpView();
        }
        return view;
    }

    private void setUpView() {
        isPlay=false;
        TrackSelector trackSelector=new DefaultTrackSelector();
        player= ExoPlayerFactory.newSimpleInstance(context,trackSelector);

        PlayerView playerView=view.findViewById(R.id.video_player_view);
        playerView.setPlayer(player);

        DataSource.Factory dataSourceFactory=new DefaultDataSourceFactory(context, Util.getUserAgent(context,"EXOPlayer"));

        Uri audioSourceUri= Uri.parse("file:///android_asset/video.mp4");

        MediaSource videoSource=new ExtractorMediaSource.Factory(dataSourceFactory)
                .createMediaSource(audioSourceUri);

        player.prepare(videoSource);
    }

    private void stop()
    {
        if (player != null) {
            player.stop();
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

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }


    @Override
    public void onDestroy() {
        super.onDestroy();
        player.release();
    }

    public static VideoPlayerActivity newInstance() {

        Bundle args = new Bundle();

        VideoPlayerActivity fragment = new VideoPlayerActivity();
        fragment.setArguments(args);
        return fragment;
    }
}
