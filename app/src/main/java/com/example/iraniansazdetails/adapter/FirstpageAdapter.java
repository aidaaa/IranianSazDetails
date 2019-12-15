package com.example.iraniansazdetails.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.datamodel.AlbumDataModel;
import com.squareup.picasso.Picasso;

import java.util.List;

public class FirstpageAdapter extends RecyclerView.Adapter<FirstpageAdapter.FirstpageViewHolder>
{
    private Context context;
    private List<AlbumDataModel> models;
    private OnItemClickListener listener;

    public FirstpageAdapter(Context context, List<AlbumDataModel> models,OnItemClickListener listener) {
        this.context = context;
        this.models = models;
        this.listener=listener;
    }

    @NonNull
    @Override
    public FirstpageViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.first_page_rv_item,parent,false);
        return new FirstpageViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull FirstpageViewHolder holder, int position) {
        //holder.onBind(models.get(holder.getAdapterPosition()));
        holder.onBind(models.get(holder.getAdapterPosition()));
    }

    @Override
    public int getItemCount() {
        return models.size();
    }


    public class FirstpageViewHolder extends RecyclerView.ViewHolder
    {

        ImageView img_first_page_rv;

        public FirstpageViewHolder(@NonNull View itemView) {
            super(itemView);
            img_first_page_rv=itemView.findViewById(R.id.img_first_page_rv);
        }

        public void onBind(AlbumDataModel model)
        {
            img_first_page_rv.setImageDrawable(model.getImage());
            itemView.setOnClickListener(view -> listener.onClick(model));
        }
    }

    public interface OnItemClickListener
    {
        void onClick(AlbumDataModel model);
    }
}
