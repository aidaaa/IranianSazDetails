package com.example.iraniansazdetails.generator;

import android.content.Context;
import androidx.core.content.res.ResourcesCompat;

import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.datamodel.AlbumDataModel;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
    public static List<AlbumDataModel> getAlbumDataModel(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.teh, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turk, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.kurd, null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.lor, null));
                    break;
                case 4:
                    main.setId(4);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan, null));
                    break;
                case 5:
                    main.setId(5);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.bakh, null));
                    break;
                case 6:
                    main.setId(6);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.koli, null));
                    break;
                case 7:
                    main.setId(7);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.mazandaran, null));
                    break;
                case 8:
                    main.setId(8);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan, null));
                    break;
                case 9:
                    main.setId(9);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.sis, null));
                    break;
                case 10:
                    main.setId(10);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman, null));
                    break;
                case 11:
                    main.setId(11);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.golestan, null));
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<AlbumDataModel> getAlbumDataModelBakh(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.bakh_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.bakh_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.bakh_3, null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.bakh_4, null));
                    break;

            }
            models.add(main);
        }
        return models;
    }

    public static List<AlbumDataModel> getAlbumDataModelTurkaman(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_3, null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_4, null));
                    break;
                case 4:
                    main.setId(4);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_5, null));
                    break;
                case 5:
                    main.setId(5);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_6, null));
                    break;
                case 6:
                    main.setId(6);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_7, null));
                    break;
                case 7:
                    main.setId(7);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_8, null));
                    break;
                case 8:
                    main.setId(8);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_9, null));
                    break;
                case 9:
                    main.setId(9);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_10, null));
                    break;
                case 10:
                    main.setId(10);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.turkaman_11, null));
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<AlbumDataModel> getAlbumDataModelTurk(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.tork_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.tork_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.tork_3, null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.tork_4, null));
                    break;
                case 4:
                    main.setId(4);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.tork_5, null));
                    break;
                case 5:
                    main.setId(5);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.tork_6, null));
                    break;
                case 6:
                    main.setId(6);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.tork_7, null));
                    break;
                case 7:
                    main.setId(7);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.tork_8, null));
                    break;
                case 8:
                    main.setId(8);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.tork_9, null));
                    break;
            }
            models.add(main);
        }
        return models;
    }


    public static List<AlbumDataModel> getAlbumDataModelTeh(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.teh_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.teh_2, null));

            }
            models.add(main);
        }
        return models;
    }


    public static List<AlbumDataModel> getAlbumDataModelKhorasan(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_3, null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_4, null));
                    break;
                case 4:
                    main.setId(4);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_5, null));
                    break;
                case 5:
                    main.setId(5);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_6, null));
                    break;
                case 6:
                    main.setId(6);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_7, null));
                    break;
                case 7:
                    main.setId(7);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_8, null));
                    break;
                case 8:
                    main.setId(8);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_9, null));
                    break;
                case 9:
                    main.setId(9);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_10, null));
                    break;
                case 10:
                    main.setId(10);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_11, null));
                    break;
                case 11:
                    main.setId(11);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_12, null));
                    break;
                case 12:
                    main.setId(12);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_13, null));
                    break;
                case 13:
                    main.setId(13);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_14, null));
                    break;
                case 14:
                    main.setId(14);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_15, null));
                    break;
                case 15:
                    main.setId(15);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.khorasan_16, null));
                    break;
            }
            models.add(main);
        }
        return models;
    }


    public static List<AlbumDataModel> getAlbumDataModelSis(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.sis_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.sis_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.sis_3, null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.sis_4, null));
                    break;
                case 4:
                    main.setId(4);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.sis_5, null));
                    break;
                case 5:
                    main.setId(5);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.sis_6, null));
                    break;
                case 6:
                    main.setId(6);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.sis_7, null));
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<AlbumDataModel> getAlbumDataModelKurd(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.kord_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.kord_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.kord_3, null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.kord_4, null));
                    break;
                case 4:
                    main.setId(4);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.kord_5, null));
                    break;
                case 5:
                    main.setId(5);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.kord_6, null));
                    break;
                case 6:
                    main.setId(6);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.kord_7, null));
                    break;
                case 7:
                    main.setId(7);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.kord_8, null));
                    break;
                case 8:
                    main.setId(8);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.kord_9, null));
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<AlbumDataModel> getAlbumDataModelKoli(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.koli_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.koli_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.koli_3, null));
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<AlbumDataModel> getAlbumDataModelGolestan(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gol_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gol_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gol_3, null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gol_4, null));
                    break;
                case 4:
                    main.setId(4);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gol_5, null));
                    break;
                case 5:
                    main.setId(5);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gol_6, null));
                    break;
                case 6:
                    main.setId(6);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gol_7, null));
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<AlbumDataModel> getAlbumDataModelGilan(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_3, null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_4, null));
                    break;
                case 4:
                    main.setId(4);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_5, null));
                    break;
                case 5:
                    main.setId(5);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_6, null));
                    break;
                case 6:
                    main.setId(6);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_7, null));
                    break;
                case 7:
                    main.setId(7);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_8, null));
                    break;
                case 8:
                    main.setId(8);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_9, null));
                    break;
                case 9:
                    main.setId(9);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_10, null));
                    break;
                case 10:
                    main.setId(10);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_11, null));
                    break;
                case 11:
                    main.setId(11);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.gilan_12, null));
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<AlbumDataModel> getAlbumDataModelLor(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.lor_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.lor_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.lor_3, null));
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<AlbumDataModel> getAlbumDataModelMazandaran(Context context) {
        List<AlbumDataModel> models = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            AlbumDataModel main = new AlbumDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.maz_1, null));
                    break;
                case 1:
                    main.setId(1);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.maz_2, null));
                    break;
                case 2:
                    main.setId(2);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.maz_3, null));
                    break;
                case 3:
                    main.setId(3);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.maz_4, null));
                    break;
                case 4:
                    main.setId(4);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.maz_5, null));
                    break;
                case 5:
                    main.setId(5);
                    main.setImage(ResourcesCompat.getDrawable(context.getResources(), R.drawable.maz_6, null));
                    break;
            }
            models.add(main);
        }
            return models;
        }
    }
