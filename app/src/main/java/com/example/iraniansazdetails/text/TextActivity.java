package com.example.iraniansazdetails.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.content.SharedPreferences;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.iraniansazdetails.R;

import java.lang.ref.WeakReference;

import static android.content.Context.MODE_PRIVATE;

public class TextActivity extends Fragment {

    TextView txt,txt_city;
    SharedPreferences preferences;
    LinearLayout layout_txt;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_album_text,container,false);
        getActivity().getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        txt=view.findViewById(R.id.txt);
        layout_txt=view.findViewById(R.id.layout_txt);
        txt_city=view.findViewById(R.id.txt_city);
        String text=getText();
        txt.setText(text);
        Typeface typface=Typeface.createFromAsset(getActivity().getAssets(),"fonts/iransans.ttf");
        txt.setTypeface(typface);
        txt_city.setTypeface(typface);
        return view;
    }

    public static TextActivity newInstance() {
        
        Bundle args = new Bundle();
        
        TextActivity fragment = new TextActivity();
        fragment.setArguments(args);
        return fragment;
    }

    public String getText()
    {
        preferences=this.getActivity().getSharedPreferences("shared", MODE_PRIVATE);
        int index=preferences.getInt("id",0);
        String text="";

        switch (index)
        {
            case 0:
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.teh_txt_back, null));
                txt_city.setText("موسیقی" +
                        " \n"+
                        " تهران");
                text="اگه عاشق نيم آهم چه چيه؟" +
                        "اگهِ هم، كُوشُ و كُلاهم چه چيه؟" +
                        "" +
                        "ميكشي خنجر و مِهْلي و مِشي" +
                        "نميداني كه گُناهم چه چيه؟" +
                        "" +
                        "از ترانههاي ملا سحري تهراني" +
                        "موسيقي\u200C تهران\u200C به دليل\u200C مسائل\u200C مختلف\u200C تاريخي\u200C ديني\u200C بيشتر از گونه\u200C آوازي\u200C سود مي\u200Cبرد و در اثر تحولات\u200C اين\u200C ناحيه\u200C پس\u200C از حكومت\u200C افشاريان\u200C دچار تغييرات\u200C فراوان\u200C شده\u200C است\u200C به گونه\u200Cاي\u200C كه\u200C موسيقي\u200C درباري\u200C توسط\u200C گروههاي\u200C خاص در آن شكل يافته و پيش رفته، تا جايي كه وضع اولين تئوريهاي هفت دستگاهي كردن\u200C موسيقي\u200C ايران را به يك يهودي به نام «بابا مردوخ» نسبت ميدهند و گفته ميشود كه دست نوشتههاي او كه در عهد قاجاريه نوشته بوده در عهد پهلوي دوم تعريف و تفسير علمي تري يافته و متحول ميشود، در عين حاليكه ابهاماتي نيز در اين مسئله وجود دارد.";
                break;
            case 1:
                txt_city.setText("موسیقی " +
                                " \n"+
                        "ترک های ایران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.turk_txt_back, null));
                text="";
                break;
            case 2:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "کردهای ایران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.kurd_txt_back, null));
                text="";
                break;
            case 3:
                txt_city.setText("موسیقی" +
                        " \n"+
                        " لرهای ایران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.lorestan_txt_back, null));
                text="";
                break;
            case 4:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "خراسان");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.khorasan_txt_back, null));
                text="";
                break;
            case 5:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "بختیاری");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.bakh_txt_back, null));
                text="";
                break;
            case 6:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "کولیان ایران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.koli_txt_back, null));
                text="";
                break;
            case 7:
                txt_city.setText("موسیقی" +
                        " \n"+
                        " مازندران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.maz_txt_back, null));
                text="";
                break;
            case 8:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "گیلان و تالش");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.gilan_txt_back, null));
                text="";
                break;
            case 9:
                txt_city.setText("موسیقی" +
                        " \n"+
                        " سیستان و بلوچستان");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.sis_txt_back, null));
                text="";
                break;
            case 10:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "ترکمن های ایران");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.turkaman_txt_back, null));
                text="";
                break;
            case 11:
                txt_city.setText("موسیقی " +
                        " \n"+
                        "گلستان");
                layout_txt.setBackground(ResourcesCompat.getDrawable(this.getResources(), R.drawable.gol_txt_back, null));
                text="";
                break;
        }
        return text;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        System.gc();
    }
}
