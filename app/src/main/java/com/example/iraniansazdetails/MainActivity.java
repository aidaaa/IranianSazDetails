package com.example.iraniansazdetails;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.iraniansazdetails.viewPager.ViewPagerAdapter;
import com.squareup.picasso.Picasso;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    SharedPreferences prefs;

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN_MR1)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tab);


        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.notifyDataSetChanged();
        viewPager.setOffscreenPageLimit(0);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.headphones);
        tabLayout.getTabAt(1).setIcon(R.drawable.information2);
        tabLayout.getTabAt(2).setIcon(R.drawable.picture2);
        tabLayout.getTabAt(3).setIcon(R.drawable.video2);


    /*    AlertDialog.Builder builder = new AlertDialog.Builder(this,R.style.AlertDialogStyle);

        builder.setTitle("اطلاعات");
        builder.setIcon(R.drawable.teh);
        builder.setMessage(getCityInfo());

         *//*   builder.setPositiveButton("بله", new DialogInterface.OnClickListener() {
                @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
                public void onClick(DialogInterface dialog, int which) {
                    finishAffinity();
                }
            });*//*

        builder.setNegativeButton("باشه", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        });
        AlertDialog alert = builder.create();
        alert.show();
        alert.getWindow().getDecorView().setLayoutDirection(View.LAYOUT_DIRECTION_RTL);*/



       /*AlertDialog.Builder builder = new AlertDialog.Builder(this);

       final AlertDialog dialog = builder.create();
       LayoutInflater inflater = getLayoutInflater();
       View dialogLayout = inflater.inflate(R.layout.text_dialog, null);
       dialog.setView(dialogLayout);
       dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);



       dialog.setOnShowListener(new DialogInterface.OnShowListener() {
           @Override
           public void onShow(DialogInterface d) {
               TextView txt =dialog.findViewById(R.id.dialogText);
               txt.setText(getCityInfo());

               Typeface typface=Typeface.createFromAsset(getAssets(),"fonts/iransans.ttf");
               txt.setTypeface(typface);
               txt.setTypeface(typface);

               //  LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(Math.round(imageWidthInPX),
               //          Math.round(imageWidthInPX * (float)image.getHeight() / (float)image.getWidth()));
               //  image.setLayoutParams(layoutParams);
           }
       });
       dialog.show();*/

        setCustomFont();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int i=tab.getPosition();
                switch (i)
                {
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.headphones);
                        setCustomFont();
                        break;
                    case 1:
                        tabLayout.getTabAt(1).setIcon(R.drawable.information);
                        setCustomFont();
                        break;
                    case 2:
                        tabLayout.getTabAt(2).setIcon(R.drawable.picture);
                        setCustomFont();
                        break;
                    case 3:
                        tabLayout.getTabAt(3).setIcon(R.drawable.video);
                        setCustomFont();
                        break;
                }
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab)
            {
                int i=tab.getPosition();
                switch (i)
                {
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.headphones2);
                        setCustomFont();
                        break;
                    case 1:
                        tabLayout.getTabAt(1).setIcon(R.drawable.information2);
                        setCustomFont();
                        break;
                    case 2:
                        tabLayout.getTabAt(2).setIcon(R.drawable.picture2);
                        setCustomFont();
                        break;
                    case 3:
                        tabLayout.getTabAt(3).setIcon(R.drawable.video2);
                        setCustomFont();
                        break;
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

    public void setCustomFont() {

        ViewGroup vg = (ViewGroup) tabLayout.getChildAt(0);
        int tabsCount = vg.getChildCount();

        for (int j = 0; j < tabsCount; j++) {
            ViewGroup vgTab = (ViewGroup) vg.getChildAt(j);

            int tabChildsCount = vgTab.getChildCount();

            for (int i = 0; i < tabChildsCount; i++) {
                View tabViewChild = vgTab.getChildAt(i);
                if (tabViewChild instanceof TextView) {
                    //Put your font in assests folder
                    //assign name of the font here (Must be case sensitive)
                    ((TextView) tabViewChild).setTypeface(Typeface.createFromAsset(getAssets(), "fonts/Chamran.ttf"));
                }
            }
        }
    }

    public String getCityInfo()
    {
        String cityInfo="";
        prefs = this.getSharedPreferences("shared", MODE_PRIVATE);
        int id=prefs.getInt("id",0);
        switch (id)
        {
            case 0:
                cityInfo="موسیقی تهران و حومه"+
                        " \n"+
                        "بخش اول:موسیقی "+
                        " \n"+
                        "شامل 2 موسیقی"+
                        " \n"+
                        "بخش دوم:متن مربوط به قوم تهران"+
                        " \n"+
                        "بخش سوم:تصاویر"+
                        " \n"+
                        "شامل 3 عکس"+
                        " \n"+
                        "بخش چهارم:موزیک ویدیو:"+
                        " \n"+
                        "شامل 2 موزیک ویدیو";
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
        }
        return cityInfo;
    }
}
