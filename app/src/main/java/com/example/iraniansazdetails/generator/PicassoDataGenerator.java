package com.example.iraniansazdetails.generator;

import android.content.Context;

import androidx.core.content.res.ResourcesCompat;

import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.datamodel.AlbumDataModel;
import com.example.iraniansazdetails.datamodel.PicasooDataModel;

import java.util.ArrayList;
import java.util.List;

public class PicassoDataGenerator
{


    public static List<PicasooDataModel> getAlbumDataModelBakh() {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/bakh_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/bakh_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/bakh_3.jpg");
                    break;
                case 3:
                    main.setId(3);
                    main.setImage("http://192.168.10.85:8099/pic/bakh_4.jpg");
                    break;

            }
            models.add(main);
        }
        return models;
    }

    public static List<PicasooDataModel> getAlbumDataModelTurkaman( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_3.jpg");
                    break;
                case 3:
                    main.setId(3);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_4.jpg");
                    break;
                case 4:
                    main.setId(4);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_5.jpg");
                    break;
                case 5:
                    main.setId(5);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_6.jpg");
                    break;
                case 6:
                    main.setId(6);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_7.jpg");
                    break;
                case 7:
                    main.setId(7);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_8.jpg");
                    break;
                case 8:
                    main.setId(8);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_9.jpg");
                    break;
                case 9:
                    main.setId(9);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_10.jpg");
                    break;
                case 10:
                    main.setId(10);
                    main.setImage("http://192.168.10.85:8099/pic/turkaman_11.jpg");
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<PicasooDataModel> getAlbumDataModelTurk( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/tork_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/tork_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/tork_3.jpg");
                    break;
                case 3:
                    main.setId(3);
                    main.setImage("http://192.168.10.85:8099/pic/tork_4.jpg");
                    break;
                case 4:
                    main.setId(4);
                    main.setImage("http://192.168.10.85:8099/pic/tork_5.jpg");
                    break;
                case 5:
                    main.setId(5);
                    main.setImage("http://192.168.10.85:8099/pic/tork_6.jpg");
                    break;
                case 6:
                    main.setId(6);
                    main.setImage("http://192.168.10.85:8099/pic/tork_7.jpg");
                    break;
                case 7:
                    main.setId(7);
                    main.setImage("http://192.168.10.85:8099/pic/tork_8.jpg");
                    break;
                case 8:
                    main.setId(8);
                    main.setImage("http://192.168.10.85:8099/pic/tork_9.jpg");
                    break;
            }
            models.add(main);
        }
        return models;
    }


    public static List<PicasooDataModel> getAlbumDataModelTeh( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/teh_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/teh_2.jpg");

            }
            models.add(main);
        }
        return models;
    }


    public static List<PicasooDataModel> getAlbumDataModelKhorasan( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 16; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_3.jpg");
                    break;
                case 3:
                    main.setId(3);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_4.jpg");
                    break;
                case 4:
                    main.setId(4);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_5.jpg");
                    break;
                case 5:
                    main.setId(5);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_6.jpg");
                    break;
                case 6:
                    main.setId(6);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_7.jpg");
                    break;
                case 7:
                    main.setId(7);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_8.jpg");
                    break;
                case 8:
                    main.setId(8);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_9.jpg");
                    break;
                case 9:
                    main.setId(9);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_10.jpg");
                    break;
                case 10:
                    main.setId(10);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_11.jpg");
                    break;
                case 11:
                    main.setId(11);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_12.jpg");
                    break;
                case 12:
                    main.setId(12);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_13.jpg");
                    break;
                case 13:
                    main.setId(13);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_14.jpg");
                    break;
                case 14:
                    main.setId(14);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_15.jpg");
                    break;
                case 15:
                    main.setId(15);
                    main.setImage("http://192.168.10.85:8099/pic/khorasan_16.jpg");
                    break;
            }
            models.add(main);
        }
        return models;
    }


    public static List<PicasooDataModel> getAlbumDataModelSis( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/sis_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/sis_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/sis_3.jpg");
                    break;
                case 3:
                    main.setId(3);
                    main.setImage("http://192.168.10.85:8099/pic/sis_4.jpg");
                    break;
                case 4:
                    main.setId(4);
                    main.setImage("http://192.168.10.85:8099/pic/sis_5.jpg");
                    break;
                case 5:
                    main.setId(5);
                    main.setImage("http://192.168.10.85:8099/pic/sis_6.jpg");
                    break;
                case 6:
                    main.setId(6);
                    main.setImage("http://192.168.10.85:8099/pic/sis_7.jpg");
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<PicasooDataModel> getAlbumDataModelKurd( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 9; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/kord_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/kord_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/kord_3.jpg");
                    break;
                case 3:
                    main.setId(3);
                    main.setImage("http://192.168.10.85:8099/pic/kord_4.jpg");
                    break;
                case 4:
                    main.setId(4);
                    main.setImage("http://192.168.10.85:8099/pic/kord_5.jpg");
                    break;
                  case 5:
                      main.setId(5);
                      main.setImage("http://192.168.10.85:8099/pic/kord_6.jpg");
                 break;
                case 6:
                    main.setId(6);
                    main.setImage("http://192.168.10.85:8099/pic/kord_7.jpg");
                    break;
                case 7:
                    main.setId(7);
                    main.setImage("http://192.168.10.85:8099/pic/kord_8.jpg");
                    break;
                case 8:
                    main.setId(8);
                    main.setImage("http://192.168.10.85:8099/pic/kord_9.jpg");
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<PicasooDataModel> getAlbumDataModelKoli( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/koli_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/koli_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/koli_3.jpg");
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<PicasooDataModel> getAlbumDataModelGolestan( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 7; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/gol_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/gol_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/gol_3.jpg");
                    break;
                case 3:
                    main.setId(3);
                    main.setImage("http://192.168.10.85:8099/pic/gol_4.jpg");
                    break;
                case 4:
                    main.setId(4);
                    main.setImage("http://192.168.10.85:8099/pic/gol_5.jpg");
                    break;
                case 5:
                    main.setId(5);
                    main.setImage("http://192.168.10.85:8099/pic/gol_6.jpg");
                    break;
                case 6:
                    main.setId(6);
                    main.setImage("http://192.168.10.85:8099/pic/gol_7.jpg");
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<PicasooDataModel> getAlbumDataModelGilan( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_3.jpg");
                    break;
                case 3:
                    main.setId(3);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_4.jpg");
                    break;
                case 4:
                    main.setId(4);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_5.jpg");
                    break;
                case 5:
                    main.setId(5);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_6.jpg");
                    break;
                case 6:
                    main.setId(6);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_7.jpg");
                    break;
                case 7:
                    main.setId(7);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_8.jpg");
                    break;
                case 8:
                    main.setId(8);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_9.jpg");
                    break;
                case 9:
                    main.setId(9);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_10.jpg");
                    break;
                case 10:
                    main.setId(10);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_11.jpg");
                    break;
                case 11:
                    main.setId(11);
                    main.setImage("http://192.168.10.85:8099/pic/gilan_12.jpg");
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<PicasooDataModel> getAlbumDataModelLor( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/lor_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/lor_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/lor_3.jpg");
                    break;
            }
            models.add(main);
        }
        return models;
    }

    public static List<PicasooDataModel> getAlbumDataModelMazandaran( ) {
        List<PicasooDataModel> models = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            PicasooDataModel main = new PicasooDataModel();
            switch (i) {
                case 0:
                    main.setId(0);
                    main.setImage("http://192.168.10.85:8099/pic/maz_1.jpg");
                    break;
                case 1:
                    main.setId(1);
                    main.setImage("http://192.168.10.85:8099/pic/maz_2.jpg");
                    break;
                case 2:
                    main.setId(2);
                    main.setImage("http://192.168.10.85:8099/pic/maz_3.jpg");
                    break;
                case 3:
                    main.setId(3);
                    main.setImage("http://192.168.10.85:8099/pic/maz_4.jpg");
                    break;
                case 4:
                    main.setId(4);
                    main.setImage("http://192.168.10.85:8099/pic/maz_5.jpg");
                    break;
                case 5:
                    main.setId(5);
                    main.setImage("http://192.168.10.85:8099/pic/maz_6.jpg");
                    break;
            }
            models.add(main);
        }
        return models;
    }
}

