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
import com.example.iraniansazdetails.datamodel.PicasooDataModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AlbumAdapter extends RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder> {
    private Context context;
     //List<AlbumDataModel> models;
     List<PicasooDataModel> list;
    private onClickitem listener;

    public AlbumAdapter(Context context,List<PicasooDataModel> list,onClickitem listener) {
        this.context = context;
        //this.models = models;
        this.list=list;
        this.listener=listener;
    }


    @NonNull
    @Override
    public AlbumViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view= LayoutInflater.from(context).inflate(R.layout.activity_album_item,viewGroup,false);
        return new AlbumViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AlbumViewHolder albumViewHolder, int i) {
        //AlbumDataModel main=models.get(i);
        albumViewHolder.onBind(list.get(i));
       // Picasso.with(context).load(list.get(i).getImage()).into(albumViewHolder.img);
        //albumViewHolder.img.setImageDrawable(main.getImage());
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class AlbumViewHolder extends RecyclerView.ViewHolder
    {

        private ImageView img;

        public AlbumViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.img_album);
        }

        public void onBind(PicasooDataModel model)
        {
            Picasso.with(context).load(model.getImage())
                    .error(R.drawable.broken)
                    .placeholder(R.drawable.imgload)
                    .into(img);

           /* Picasso.with(context)
                    .load("http://i.imgur.com/DvpvklR.png")
                    .placeholder(R.drawable.placeholder)
                    .error(R.drawable.error)
                    .resizeDimen(R.dimen.list_detail_image_size,R.dimen.list_detail_image_size)
                    .centerInside()
                    .into(image);*/

            itemView.setOnClickListener(view -> listener.onClick(model));
        }
    }

    public interface onClickitem
    {
        void onClick(PicasooDataModel model);
    }
}
