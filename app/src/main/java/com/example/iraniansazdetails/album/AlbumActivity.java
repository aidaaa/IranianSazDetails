package com.example.iraniansazdetails.album;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.RelativeLayout;

import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.album.adapter.AlbumAdapter;
import com.example.iraniansazdetails.generator.PicassoDataGenerator;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class AlbumActivity extends Fragment {

    RecyclerView recyclerView;
    Context context;
    SharedPreferences prefs;
    AlbumAdapter adapter;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        android.view.View view=inflater.inflate(R.layout.activity_album,container,false);
        //full screen
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        recyclerView=view.findViewById(R.id.album_recycler);

        prefs = this.getActivity().getSharedPreferences("shared", MODE_PRIVATE);
        int id=prefs.getInt("id",0);

        switch (id)
        {
            case 0:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelTeh());
                break;
            case 1:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelTurk());
                break;
            case 2:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelKurd());
                break;
            case 3:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelLor());
                break;
            case 4:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelKhorasan());
                break;
            case 5:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelBakh());
                break;
            case 6:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelKoli());
                break;
            case 7:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelMazandaran());
                break;
            case 8:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelGilan());
                break;
            case 9:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelSis());
                break;
            case 10:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelTurkaman());
                break;
            case 11:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelGolestan());
                break;
        }

        adapter.notifyDataSetChanged();
       // final LinearLayoutManager layoutManager = new  LinearLayoutManager(getActivity());
        //layoutManager.setOrientation(RecyclerView.VERTICAL);

        //recyclerView.setLayoutManager(layoutManager);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity().getApplicationContext(), 2, RecyclerView.VERTICAL,false));
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(adapter);
        System.gc();
      // Animation animation= AnimationUtils.loadAnimation(view.getContext(),R.anim.clockwise);
      // animation.setRepeatCount(Animation.INFINITE);
      // animation.setRepeatMode(Animation.REVERSE);
      // animation.setDuration(5000);
       // recyclerView.startAnimation(animation);
        return view;
    }

    public static AlbumActivity newInstance() {
        
        Bundle args = new Bundle();
        
        AlbumActivity fragment = new AlbumActivity();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        this.context=context;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.gc();
    }
}
