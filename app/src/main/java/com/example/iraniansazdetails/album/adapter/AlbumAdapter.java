package com.example.iraniansazdetails.album.adapter;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.datamodel.AlbumDataModel;

import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {
    private Context context;
     List<AlbumDataModel> models;

    public AlbumAdapter(Context context, List<AlbumDataModel> models) {
        this.context = context;
        this.models = models;
    }

    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.activity_album_item,viewGroup,false);
        return new AlbumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder albumViewHolder, int i) {
        AlbumDataModel main=models.get(i);
        Drawable drawable=main.getImage();
        albumViewHolder.img.setImageDrawable(main.getImage());
    }

    @Override
    public int getItemCount() {
        return models.size();
    }

    public class AlbumViewHolder extends RecyclerView.ViewHolder
    {

        private ImageView img;

        public AlbumViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img_album);
        }
    }
}
