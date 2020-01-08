package com.example.iraniansazdetails.album;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.os.Bundle;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.album.adapter.AlbumAdapter;
import com.example.iraniansazdetails.datamodel.PicasooDataModel;
import com.example.iraniansazdetails.generator.PicassoDataGenerator;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import static android.content.Context.MODE_PRIVATE;

public class AlbumActivity extends Fragment implements AlbumAdapter.onClickitem {

    RecyclerView recyclerView;
    Context context;
    SharedPreferences prefs;
    AlbumAdapter adapter;
    TextView txt_album;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        android.view.View view=inflater.inflate(R.layout.activity_album,container,false);
        //full screen
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        recyclerView=view.findViewById(R.id.album_recycler);
        txt_album=view.findViewById(R.id.txt_album);
        Typeface typface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/iranblack.ttf");
        txt_album.setTypeface(typface);

        prefs = this.getActivity().getSharedPreferences("shared", MODE_PRIVATE);
        int id=prefs.getInt("id",0);

        switch (id)
        {
            case 0:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelTeh(),this);
                txt_album.setText("گالری تصاویر تهران");
                break;
            case 1:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelTurk(),this);
                txt_album.setText("گالری تصاویر ترک های ایران");
                break;
            case 2:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelKurd(),this);
                txt_album.setText("گالری تصاویر کردهای ایران");
                break;
            case 3:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelLor(),this);
                txt_album.setText("گالری تصاویر لرهای ایران");
                break;
            case 4:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelKhorasan(),this);
                txt_album.setText("گالری تصاویر خراسان");
                break;
            case 5:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelBakh(),this);
                txt_album.setText("گالری تصاویر بختیاری");
                break;
            case 6:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelKoli(),this);
                txt_album.setText("گالری تصاویر کولیان ایران");
                break;
            case 7:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelMazandaran(),this);
                txt_album.setText("گالری تصاویر مازندران");
                break;
            case 8:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelGilan(),this);
                txt_album.setText("گالری تصاویر گیلان");
                break;
            case 9:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelSis(),this);
                txt_album.setText("گالری تصاویر سیستان و بلوچستان");
                break;
            case 10:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelTurkaman(),this);
                txt_album.setText("گالری تصاویر ترکمن های ایران");
                break;
            case 11:
                adapter=new AlbumAdapter(getContext(), PicassoDataGenerator.getAlbumDataModelGolestan(),this);
                txt_album.setText("گالری تصاویر گلستان");
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

    @Override
    public void onClick(PicasooDataModel model) {
        String path=model.getImage();
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        final AlertDialog dialog = builder.create();
        LayoutInflater inflater = getLayoutInflater();
        View dialogLayout = inflater.inflate(R.layout.dialog, null);
        dialog.setView(dialogLayout);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);



        dialog.setOnShowListener(new DialogInterface.OnShowListener() {
            @Override
            public void onShow(DialogInterface d) {
                ImageView image =dialog.findViewById(R.id.goProDialogImage);
                Picasso.with(context).load(path).into(image);
                float imageWidthInPX = (float)image.getWidth();

              //  LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(imageWidthInPX),
              //          Math.round(imageWidthInPX * (float)image.getHeight() / (float)image.getWidth()));
              //  image.setLayoutParams(layoutParams);


            }
        });
        dialog.show();
    }
}
