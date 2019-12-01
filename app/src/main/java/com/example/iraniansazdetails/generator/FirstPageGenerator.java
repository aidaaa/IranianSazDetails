package com.example.iraniansazdetails.generator;

import android.content.Context;

import androidx.core.content.res.ResourcesCompat;

import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.datamodel.AlbumDataModel;

import java.util.ArrayList;
import java.util.List;

public class FirstPageGenerator
{
    public static List<AlbumDataModel> getFirstPageGenerator(Context context)
    {
        List<AlbumDataModel> models=new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            AlbumDataModel main=new AlbumDataModel();
            switch (i){
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.teh,null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.turk,null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.kurd,null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.lor,null));
                    break;
                case 4:
                    main.setId(4);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.khorasan,null));
                    break;
                case 5:
                    main.setId(5);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.bakh,null));
                    break;
                case 6:
                    main.setId(6);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.koli,null));
                    break;
                case 7:
                    main.setId(7);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.mazandaran,null));
                    break;
                case 8:
                    main.setId(8);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.gilan,null));
                    break;
                case 9:
                    main.setId(9);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.sis,null));
                    break;
                case 10:
                    main.setId(10);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.turkaman,null));
                    break;
                case 11:
                    main.setId(11);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(),R.drawable.golestan,null));
                    break;
            }
            models.add(main);
        }
        return models;
    }
}
