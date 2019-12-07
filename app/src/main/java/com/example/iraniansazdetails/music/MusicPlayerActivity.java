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
import java.util.ArrayList;
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
        ArrayList<String> list=getUrl();
        String index=list.get(0);

        TrackSelector trackSelector=new DefaultTrackSelector();
        exoPlayer= ExoPlayerFactory.newSimpleInstance(context,trackSelector);

        music_player=view.findViewById(R.id.music_player_view);
        music_player.setPlayer(exoPlayer);

        ConcatenatingMediaSource concatenatingMediaSource;

        DataSource.Factory daFactory=new DefaultDataSourceFactory(context, Util.getUserAgent(context,"exoplayer"));

        switch (index)
        {
            case "0":
                String path1=list.get(1);
                String path2=list.get(2);
                Uri uri1= Uri.parse(path1);
                Uri uri2= Uri.parse(path2);
                MediaSource mediaSource=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri1);
                MediaSource mediaSource1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri2);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource,mediaSource1);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
            case "1":
                String path_azari=list.get(1);
                String path_azari_1=list.get(2);
                Uri uri_azari= Uri.parse(path_azari);
                Uri uri_azari_1= Uri.parse(path_azari_1);
                MediaSource mediaSource_azari=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_azari);
                MediaSource mediaSource_azari_1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_azari_1);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_azari,mediaSource_azari_1);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
            case "2":
                String path_kord=list.get(1);
                String path_kord_1=list.get(2);
                Uri uri_kord= Uri.parse(path_kord);
                Uri uri_kord_1= Uri.parse(path_kord_1);
                MediaSource mediaSource_kord=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_kord);
                MediaSource mediaSource_kord_1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_kord_1);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_kord,mediaSource_kord_1);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
            case "3":
                String path_lor=list.get(1);
                String path_lor_1=list.get(2);
                String path_lor_2=list.get(3);
                String path_lor_3=list.get(4);
                Uri uri_lor= Uri.parse(path_lor);
                Uri uri_lor_1= Uri.parse(path_lor_1);
                Uri uri_lor_2= Uri.parse(path_lor_2);
                Uri uri_lor_3= Uri.parse(path_lor_3);
                MediaSource mediaSource_lor=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_lor);
                MediaSource mediaSource_lor_1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_lor_1);
                MediaSource mediaSource_lor_2=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_lor_2);
                MediaSource mediaSource_lor_3=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_lor_3);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_lor,mediaSource_lor_1,mediaSource_lor_2,mediaSource_lor_3,mediaSource_lor_3);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
            case "4":
                String path_khorasan=list.get(1);
                String path_khorasan_1=list.get(2);
                String path_khorasan_2=list.get(3);
                String path_khorasan_3=list.get(4);
                Uri uri_khorasan= Uri.parse(path_khorasan);
                Uri uri_khorasan_1= Uri.parse(path_khorasan_1);
                Uri uri_khorasan_2= Uri.parse(path_khorasan_2);
                Uri uri_khorasan_3= Uri.parse(path_khorasan_3);
                MediaSource mediaSource_khorasan=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_khorasan);
                MediaSource mediaSource_khorasan_1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_khorasan_1);
                MediaSource mediaSource_khorasan_2=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_khorasan_2);
                MediaSource mediaSource_khorasan_3=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_khorasan_3);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_khorasan,mediaSource_khorasan_1,mediaSource_khorasan_2,mediaSource_khorasan_3);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
            case "5":
                String path_bakh=list.get(1);
                String path_bakh_1=list.get(2);
                Uri uri_bakh= Uri.parse(path_bakh);
                Uri uri_bakh_1= Uri.parse(path_bakh_1);
                MediaSource mediaSource_bakh=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_bakh);
                MediaSource mediaSource_bakh_1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_bakh_1);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_bakh,mediaSource_bakh_1);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
            case "6":
                String path_koli=list.get(1);
                Uri uri_koli= Uri.parse(path_koli);
                MediaSource mediaSource_koli=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_koli);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_koli);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
            case "7":
                String path_mazani=list.get(1);
                String path_mazani_1=list.get(2);
                String path_mazani_2=list.get(3);
                String path_mazani_3=list.get(4);
                String path_mazani_4=list.get(5);
                String path_mazani_5=list.get(6);
                Uri uri_mazani= Uri.parse(path_mazani);
                Uri uri_mazani_1= Uri.parse(path_mazani_1);
                Uri uri_mazani_2= Uri.parse(path_mazani_2);
                Uri uri_mazani_3= Uri.parse(path_mazani_3);
                Uri uri_mazani_4= Uri.parse(path_mazani_4);
                Uri uri_mazani_5= Uri.parse(path_mazani_5);
                MediaSource mediaSource_mazani=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_mazani);
                MediaSource mediaSource_mazani_1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_mazani_1);
                MediaSource mediaSource_mazani_2=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_mazani_2);
                MediaSource mediaSource_mazani_3=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_mazani_3);
                MediaSource mediaSource_mazani_4=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_mazani_4);
                MediaSource mediaSource_mazani_5=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_mazani_5);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_mazani,mediaSource_mazani_1,mediaSource_mazani_2,mediaSource_mazani_3,mediaSource_mazani_4,mediaSource_mazani_5);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
            case "8":
                String path_gilan=list.get(1);
                String path_gilan_1=list.get(2);
                String path_gilan_2=list.get(3);
                Uri uri_gilan  = Uri.parse(path_gilan);
                Uri uri_gilan_1= Uri.parse(path_gilan_1);
                Uri uri_gilan_2= Uri.parse(path_gilan_2);
                MediaSource mediaSource_gilan=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_gilan);
                MediaSource mediaSource_gilan_1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_gilan_1);
                MediaSource mediaSource_gilan_2=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_gilan_2);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_gilan,mediaSource_gilan_1,mediaSource_gilan_2);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
            case "9":
                String path_sis=list.get(1);
                String path_sis_1=list.get(2);
                String path_sis_2=list.get(3);
                String path_sis_3=list.get(4);
                Uri uri_sis  = Uri.parse(path_sis);
                Uri uri_sis_1= Uri.parse(path_sis_1);
                Uri uri_sis_2= Uri.parse(path_sis_2);
                Uri uri_sis_3= Uri.parse(path_sis_3);
                MediaSource mediaSource_sis=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_sis);
                MediaSource mediaSource_sis_1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_sis_1);
                MediaSource mediaSource_sis_2=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_sis_2);
                MediaSource mediaSource_sis_3=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_sis_3);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_sis,mediaSource_sis_1,mediaSource_sis_2,mediaSource_sis_3);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
            case "10":
                String path_torkaman  =list.get(1);
                String path_torkaman_1=list.get(2);
                Uri uri_torkaman  = Uri.parse(path_torkaman  );
                Uri uri_torkaman_1= Uri.parse(path_torkaman_1);
                MediaSource mediaSource_torkaman=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_torkaman);
                MediaSource mediaSource_torkaman_1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_torkaman_1);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_torkaman,mediaSource_torkaman_1);
                exoPlayer.prepare(concatenatingMediaSource);

                break;
            case "11":
                String path_golestan  =list.get(1);
                String path_golestan_1=list.get(2);
                Uri uri_golestan  = Uri.parse(path_golestan  );
                Uri uri_golestan_1= Uri.parse(path_golestan_1);
                MediaSource mediaSource_golestan=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_golestan  );
                MediaSource mediaSource_golestan_1=new ExtractorMediaSource.Factory(daFactory).createMediaSource(uri_golestan_1);
                concatenatingMediaSource=new ConcatenatingMediaSource(mediaSource_golestan,mediaSource_golestan_1);
                exoPlayer.prepare(concatenatingMediaSource);
                break;
        }

        //exoPlayer.prepare(mediaSource);
    }

    public ArrayList<String> getUrl()
    {
        ArrayList<String> filePath=new ArrayList<>();
        prefs = this.getActivity().getSharedPreferences("shared", MODE_PRIVATE);
        int id=prefs.getInt("id",0);
        switch (id)
        {
            case 0:
                filePath.add(0,"0");
                filePath.add(1,"http://192.168.10.184:8099/teh/teh.mp3");
                filePath.add(2,"http://192.168.10.184:8099/azari/teh1.mp3");
                txt.setText("تهران و حومه");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.teh,null));
                break;

            case 1:
                filePath.add(0,"1");
                filePath.add(1,"http://192.168.10.184:8099/azari/azari.mp3");
                filePath.add(2,"http://192.168.10.184:8099/azari/sari_galin.mp3");
                txt.setText("ترک های ایران");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.turk,null));
                break;
            case 2:
                filePath.add(0,"2");
                filePath.add(1,"http://192.168.10.184:8099/kurdi/kurdi.mp3");
                filePath.add(2,"http://192.168.10.184:8099/kurdi/kurdi1.mp3");
                txt.setText("کردهای ایران");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.kurd,null));
                break;
            case 3:
                filePath.add(0,"3");
                filePath.add(1,"http://192.168.10.184:8099/lori/lor.mp3");
                filePath.add(2,"http://192.168.10.184:8099/lori/lor1.mp3");
                filePath.add(3,"http://192.168.10.184:8099/lori/lor2.mp3");
                filePath.add(4,"http://192.168.10.184:8099/lori/lor3.mp3");
                txt.setText("لرهای ایران");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.lor,null));
                break;
            case 4:
                filePath.add(0,"4");
                txt.setText("موسیقی خراسان");
                filePath.add(1,"http://192.168.10.184:8099/khorasan/dotar.mp3");
                filePath.add(2,"http://192.168.10.184:8099/khorasan/jam.mp3");
                filePath.add(3,"http://192.168.10.184:8099/khorasan/kh_jonobi.mp3");
                filePath.add(4,"http://192.168.10.184:8099/khorasan/navaie.mp3");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.khorasan,null));
                break;
            case 5:
                filePath.add(0,"5");
                txt.setText("موسیقی بختیاری");
                filePath.add(1,"http://192.168.10.184:8099/bakh/bakh_farhang.mp3");
                filePath.add(2,"http://192.168.10.184:8099/bakh/shahroz_bakh.mp3");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.bakh,null));
                break;
            case 6:
                filePath.add(0,"6");
                txt.setText("موسیقی کولیان ایران");
                filePath.add(1,"http://192.168.10.184:8099/koli/koli.mp3");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.koli,null));
                break;
            case 7:
                filePath.add(0,"7");
                txt.setText("موسیقی مازندران");
                filePath.add(1,"http://192.168.10.184:8099/mazani/mazani.mp3");
                filePath.add(2,"http://192.168.10.184:8099/mazani/mazani1.mp3");
                filePath.add(3,"http://192.168.10.184:8099/mazani/mazani2.mp3");
                filePath.add(4,"http://192.168.10.184:8099/mazani/mazani3.mp3");
                filePath.add(5,"http://192.168.10.184:8099/mazani/mazani4.mp3");
                filePath.add(6,"http://192.168.10.184:8099/mazani/mazani5.mp3");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.mazandaran,null));
                break;
            case 8:
                filePath.add(0,"8");
                filePath.add(1,"http://192.168.10.184:8099/gilan/gilan.mp3");
                filePath.add(2,"http://192.168.10.184:8099/gilan/gilan1.mp3");
                filePath.add(3,"http://192.168.10.184:8099/gilan/gilan2.mp3");
                txt.setText("موسیقی گیلان و تالش");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.gilan,null));
                break;
            case 9:
                filePath.add(0,"9");
                filePath.add(1,"http://192.168.10.184:8099/sis/baloch_sisi.mp3");
                filePath.add(2,"http://192.168.10.184:8099/sis/balochi.mp3");
                filePath.add(3,"http://192.168.10.184:8099/sis/balochi1.mp3");
                filePath.add(4,"http://192.168.10.184:8099/sis/sis.mp3");
                txt.setText("موسیقی سیستان و بلوچستان");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.sis,null));
                break;
            case 10:
                filePath.add(0,"10");
                filePath.add(1,"http://192.168.10.184:8099/turkaman/turkaman.mp3");
                filePath.add(2,"http://192.168.10.184:8099/turkaman/turkaman1.mp3");
                txt.setText("موسیقی ترکمن های ایران");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.turkaman,null));
                break;
            case 11:
                filePath.add(0,"11");
                filePath.add(1,"http://192.168.10.184:8099/golestan/katol.mp3");
                filePath.add(2,"http://192.168.10.184:8099/golestan/katol1.mp3");
                txt.setText("موسسیقی گلستان");
                img.setImageDrawable(ResourcesCompat.getDrawable(context.getResources(),R.drawable.golestan,null));
                break;
        }
        return filePath;
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
