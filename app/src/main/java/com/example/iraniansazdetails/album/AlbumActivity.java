package com.example.iraniansazdetails.album;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.album.adapter.AlbumAdapter;
import com.example.iraniansazdetails.generator.DataGenerator;

public class AlbumActivity extends Fragment {

    RecyclerView recyclerView;
    Context context;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        android.view.View view=inflater.inflate(R.layout.activity_album,container,false);
        recyclerView=view.findViewById(R.id.album_recycler);
        AlbumAdapter adapter=new AlbumAdapter(getContext(), DataGenerator.getAlbumDataModel(getContext()));
        adapter.notifyDataSetChanged();
        recyclerView.setLayoutManager(new GridLayoutManager(context,2));
        recyclerView.setAdapter(adapter);
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

}
