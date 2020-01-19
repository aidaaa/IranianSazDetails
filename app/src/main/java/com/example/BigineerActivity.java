package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;

import com.example.iraniansazdetails.FirstPageActivity;
import com.example.iraniansazdetails.R;
import com.example.iraniansazdetails.Splash;

public class BigineerActivity extends AppCompatActivity {

    Button btn_bigineer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bigineer);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        btn_bigineer=findViewById(R.id.btn_bigineer);
        btn_bigineer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent=new Intent(BigineerActivity.this, FirstPageActivity.class);
                startActivity(homeintent);
                finish();
            }
        });
    }
}
