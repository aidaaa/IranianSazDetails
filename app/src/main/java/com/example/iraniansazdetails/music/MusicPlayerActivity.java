package com.example.iraniansazdetails.music;

import android.content.Context;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.fragment.app.Fragment;
import androidx.core.content.res.ResourcesCompat;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SeekBar;
import android.widget.TextView;

import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.TestActivity;
import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.source.BaseMediaSource;
import com.google.android.exoplayer2.source.ConcatenatingMediaSource;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.source.hls.HlsMediaSource;
import com.google.android.exoplayer2.trackselection.DefaultTrackSelector;
import com.google.android.exoplayer2.trackselection.TrackSelector;
import com.google.android.exoplayer2.ui.PlayerControlView;
import com.google.android.exoplayer2.ui.PlayerView;
import com.google.android.exoplayer2.upstream.DataSource;
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.mikhaellopez.circularimageview.CircularImageView;

import java.io.IOException;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;

import static android.content.Context.MODE_PRIVATE;

public class MusicPlayerActivity extends Fragment {

    private View view;
    //PlayerControlView music_player;
    PlayerControlView music_player;
    SimpleExoPlayer exoPlayer;
    Context context;
    boolean isPlay=true;
    SharedPreferences prefs;
    CircularImageView img;
    TextView txt;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view=inflater.inflate(R.layout.activity_music_player,container,false);
        txt=view.findViewById(R.id.txt);
        img=view.findViewById(R.id.img);

        if (isPlay)
        {
            setUpView();
        }
        return view;
    }

    private void setUpView() {

        isPlay=false;
        String fileName=getUrl();
        Uri uri=Uri.parse(fileName);

        String a="file:///android_asset/bet.mp3";
        Uri uri1=Uri.parse(a);

        TrackSelector trackSelector=new DefaultTrackSelector();
        exoPlayer= ExoPlayerFactory.newSimpleInstance(context,trackSelector);

        music_player=view.findViewById(R.id.music_player_view);
        music_player.setPlayer(exoPlayer);

        DataSource.Factory daFactory=new DefaultDataSourceFactory(context, Util.getUserAgent(context,"exoplayer"));

        MediaSource mediaSource=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri);
        MediaSource mediaSource1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri1);
        ConcatenatingMediaSource concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource,mediaSource1);
        exoPlayer.prepare(concatenatingMediaSource);

        //exoPlayer.prepare(mediaSource);
    }

    public String getUrl()
    {
        String fileName=null;
        prefs = this.getActivity().getSharedPreferences("shared", MODE_PRIVATE);
        int id=prefs.getInt("id",0);
        switch (id)
        {
            case 0:
                fileName="file:///android_asset/sorna.mp3";
                txt.setText("تهران و حومه");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.teh,null));
                break;
            case 1:
                fileName="file:///android_asset/bet.mp3";
                txt.setText("ترک های ایران");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.turk,null));
                break;
            case 2:
                fileName="file:///android_asset/hungarian_dance.mp3";
                txt.setText("کردهای ایران");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.kurd,null));
                break;
            case 3:
                fileName="file:///android_asset/hungarian_dance.mp3";
                txt.setText("لرهای ایران");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.lor,null));
                break;
            case 4:
                fileName="file:///android_asset/bet.mp3";
                txt.setText("موسیقی خراسان");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.khorasan,null));
                break;
            case 5:
                fileName="file:///android_asset/sorna.mp3";
                txt.setText("موسیقی بختیاری");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.bakh,null));
                break;
            case 6:
                fileName="file:///android_asset/sorna.mp3";
                txt.setText("موسیقی کولیان ایران");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.koli,null));
                break;
            case 7:
                fileName="file:///android_asset/sorna.mp3";
                txt.setText("موسیقی مازندران");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.mazandaran,null));
                break;
            case 8:
                fileName="file:///android_asset/sorna.mp3";
                txt.setText("موسیقی گیلان و تالش");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.gilan,null));
                break;
            case 9:
                fileName="file:///android_asset/sorna.mp3";
                txt.setText("موسیقی سیستان و بلوچستان");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.sis,null));
                break;
            case 10:
                fileName="file:///android_asset/sorna.mp3";
                txt.setText("موسیقی ترکمن های ایران");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.turkaman,null));
                break;
            case 11:
                fileName="file:///android_asset/sorna.mp3";
                txt.setText("موسسیقی گلستان");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.golestan,null));
                break;
        }
        return fileName;
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

    public static MusicPlayerActivity newInstance() {

        Bundle args = new Bundle();

        MusicPlayerActivity fragment = new MusicPlayerActivity();
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
