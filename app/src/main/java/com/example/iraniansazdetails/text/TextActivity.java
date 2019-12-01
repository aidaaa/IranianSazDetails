package com.example.iraniansazdetails.text;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.iraniansazdetails.R;

public class TextActivity extends Fragment {

    TextView txt;

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
}
