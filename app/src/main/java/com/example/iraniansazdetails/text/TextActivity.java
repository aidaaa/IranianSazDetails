package com.example.iraniansazdetails.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.iraniansazdetails.R;

import static android.content.Context.MODE_PRIVATE;

public class TextActivity extends Fragment {

    TextView txt;
    SharedPreferences preferences;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.activity_album_text,container,false);
        txt=view.findViewById(R.id.txt);
        txt.setText("نلینصیا همثب ثعهمبع ثصخع ثخعصع ");
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
                text="اگه عاشق نيم آهم چه چيه؟" +
                        "اگهِ هم، كُوشُ و كُلاهم چه چيه؟" +
                        "" +
                        "ميكشي خنجر و مِهْلي و مِشي" +
                        "نميداني كه گُناهم چه چيه؟" +
                        "" +
                        "از ترانههاي ملا سحري تهراني" +
                        "موسيقي\u200C تهران\u200C به دليل\u200C مسائل\u200C مختلف\u200C تاريخي\u200C ديني\u200C بيشتر از گونه\u200C آوازي\u200C سود مي\u200Cبرد و در اثر تحولات\u200C اين\u200C ناحيه\u200C پس\u200C از حكومت\u200C افشاريان\u200C دچار تغييرات\u200C فراوان\u200C شده\u200C است\u200C به گونه\u200Cاي\u200C كه\u200C موسيقي\u200C درباري\u200C توسط\u200C گروههاي\u200C خاص در آن شكل يافته و پيش رفته، تا جايي كه وضع اولين تئوريهاي هفت دستگاهي كردن\u200C موسيقي\u200C ايران را به يك يهودي به نام «بابا مردوخ» نسبت ميدهند و گفته ميشود كه دست نوشتههاي او كه در عهد قاجاريه نوشته بوده در عهد پهلوي دوم\u200C تعريف و تفسير علمي تري يافته و متحول ميشود، در عين حاليكه ابهاماتي نيز در اين مسئله وجود دارد.";
                break;
            case 1:
                text="";
                break;
            case 2:
                text="";
                break;
            case 3:
                text="";
                break;
            case 4:
                text="";
                break;
            case 5:
                text="";
                break;
            case 6:
                text="";
                break;
            case 7:
                text="";
                break;
            case 8:
                text="";
                break;
            case 9:
                text="";
                break;
            case 10:
                text="";
                break;
            case 11:
                text="";
                break;
        }
        return text;
    }
}
