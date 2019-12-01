package com.example.iraniansazdetails;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import com.example.iraniansazdetails.adapter.FirstpageAdapter;
import com.example.iraniansazdetails.datamodel.AlbumDataModel;
import com.example.iraniansazdetails.generator.FirstPageGenerator;

public class FirstPageActivity extends AppCompatActivity implements FirstpageAdapter.OnItemClickListener {

    RecyclerView first_page_rv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_page);
        first_page_rv=findViewById(R.id.first_page_rv);

        FirstpageAdapter adapter=new FirstpageAdapter(this, FirstPageGenerator.getFirstPageGenerator(this),this);
        adapter.notifyDataSetChanged();
        first_page_rv.setLayoutManager(new LinearLayoutManager(this));
        first_page_rv.setAdapter(adapter);
    }

    @Override
    public void onClick(AlbumDataModel model) {
        Intent intent=new Intent(FirstPageActivity.this,MainActivity.class);
        SharedPreferences.Editor editor = getSharedPreferences("shared", MODE_PRIVATE).edit();
        switch (model.getId())
        {
            case 0:
              editor.putInt("id",0);
              editor.apply();
              break;
            case 1:
                editor.putInt("id",1);
                editor.apply();
                break;
            case 2:
                editor.putInt("id",2);
                editor.apply();
                break;
            case 3:
                editor.putInt("id",3);
                editor.apply();
                break;
            case 4:
                editor.putInt("id",4);
                editor.apply();
                break;
            case 5:
                editor.putInt("id",5);
                editor.apply();
                break;
            case 6:
                editor.putInt("id",6);
                editor.apply();
                break;
            case 7:
                editor.putInt("id",7);
                editor.apply();
                break;
            case 8:
                editor.putInt("id",8);
                editor.apply();
                break;
            case 9:
                editor.putInt("id",9);
                editor.apply();
                break;
            case 10:
                editor.putInt("id",10);
                editor.apply();
                break;
            case 11:
                editor.putInt("id",11);
                editor.apply();
                break;
        }
        FirstPageActivity.this.startActivity(intent);
    }
}
