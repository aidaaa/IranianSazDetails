package com.example.iraniansazdetails.datamodel;


import android.graphics.drawable.Drawable;


public class AlbumDataModel {
    private Drawable image;
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Drawable getImage() {
        return image;
    }

    public void setImage(Drawable image) {
        this.image = image;
    }
}
