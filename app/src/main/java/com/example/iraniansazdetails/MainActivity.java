package com.example.iraniansazdetails;

import com.google.android.material.tabs.TabLayout;

import androidx.annotation.RequiresApi;
import androidx.core.content.res.ResourcesCompat;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.res.Configuration;
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

        if ((getResources().getConfiguration().screenLayout &
                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                Configuration.SCREENLAYOUT_SIZE_NORMAL)
        {
            tabLayout.getTabAt(0).setIcon(R.drawable.nheadphones);
            tabLayout.getTabAt(1).setIcon(R.drawable.ninformation2);
            tabLayout.getTabAt(2).setIcon(R.drawable.npicture2);
            tabLayout.getTabAt(3).setIcon(R.drawable.nvideo2);
        }
        if ((getResources().getConfiguration().screenLayout &
                    Configuration.SCREENLAYOUT_SIZE_MASK) ==
                    Configuration.SCREENLAYOUT_SIZE_LARGE)
            {
                tabLayout.getTabAt(0).setIcon(R.drawable.lheadphones);
                tabLayout.getTabAt(1).setIcon(R.drawable.linformation2);
                tabLayout.getTabAt(2).setIcon(R.drawable.lpicture2);
                tabLayout.getTabAt(3).setIcon(R.drawable.lvideo2);
            }
        if ((getResources().getConfiguration().screenLayout &
                        Configuration.SCREENLAYOUT_SIZE_MASK) ==
                        Configuration.SCREENLAYOUT_SIZE_XLARGE)
                {
                    tabLayout.getTabAt(0).setIcon(R.drawable.xheadphones);
                    tabLayout.getTabAt(1).setIcon(R.drawable.xinformation2);
                    tabLayout.getTabAt(2).setIcon(R.drawable.xpicture2);
                    tabLayout.getTabAt(3).setIcon(R.drawable.xvideo2);
                }
   /*     tabLayout.getTabAt(0).setIcon(R.drawable.headphones);
        tabLayout.getTabAt(1).setIcon(R.drawable.information2);
        tabLayout.getTabAt(2).setIcon(R.drawable.picture2);
        tabLayout.getTabAt(3).setIcon(R.drawable.video2);*/


        setCustomFont();

        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int i=tab.getPosition();
                switch (i)
                {
                    case 0:
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_NORMAL)
                        {
                            tabLayout.getTabAt(0).setIcon(R.drawable.nheadphones);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_LARGE)
                        {
                            tabLayout.getTabAt(0).setIcon(R.drawable.lheadphones);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_XLARGE)
                        {
                            tabLayout.getTabAt(0).setIcon(R.drawable.xheadphones);
                        }
                       // tabLayout.getTabAt(0).setIcon(R.drawable.headphones);
                        setCustomFont();
                        break;

                    case 1:
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_NORMAL)
                        {
                            tabLayout.getTabAt(1).setIcon(R.drawable.ninformation);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_LARGE)
                        {
                            tabLayout.getTabAt(1).setIcon(R.drawable.linformation);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_XLARGE)
                        {
                            tabLayout.getTabAt(1).setIcon(R.drawable.xinformation);
                        }
                        //tabLayout.getTabAt(1).setIcon(R.drawable.information);
                        setCustomFont();
                        break;

                    case 2:
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_NORMAL)
                        {
                            tabLayout.getTabAt(2).setIcon(R.drawable.npicture);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_LARGE)
                        {
                            tabLayout.getTabAt(2).setIcon(R.drawable.lpicture);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_XLARGE)
                        {
                            tabLayout.getTabAt(2).setIcon(R.drawable.xpicture);
                        }
                        //tabLayout.getTabAt(2).setIcon(R.drawable.picture);
                        setCustomFont();
                        break;

                    case 3:
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_NORMAL)
                        {
                            tabLayout.getTabAt(3).setIcon(R.drawable.nvideo);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_LARGE)
                        {
                            tabLayout.getTabAt(3).setIcon(R.drawable.lvideo);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_XLARGE)
                        {
                            tabLayout.getTabAt(3).setIcon(R.drawable.xvideo);
                        }
                        //tabLayout.getTabAt(3).setIcon(R.drawable.video);
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
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_NORMAL)
                        {
                            tabLayout.getTabAt(0).setIcon(R.drawable.nheadphones2);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_LARGE)
                        {
                            tabLayout.getTabAt(0).setIcon(R.drawable.lheadphones2);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_XLARGE)
                        {
                            tabLayout.getTabAt(0).setIcon(R.drawable.xheadphones2);
                        }
                        // tabLayout.getTabAt(0).setIcon(R.drawable.headphones);
                        setCustomFont();
                        break;

                    case 1:
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_NORMAL)
                        {
                            tabLayout.getTabAt(1).setIcon(R.drawable.ninformation2);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_LARGE)
                        {
                            tabLayout.getTabAt(1).setIcon(R.drawable.linformation2);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_XLARGE)
                        {
                            tabLayout.getTabAt(1).setIcon(R.drawable.xinformation2);
                        }
                        //tabLayout.getTabAt(1).setIcon(R.drawable.information);
                        setCustomFont();
                        break;

                    case 2:
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_NORMAL)
                        {
                            tabLayout.getTabAt(2).setIcon(R.drawable.npicture2);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_LARGE)
                        {
                            tabLayout.getTabAt(2).setIcon(R.drawable.lpicture2);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_XLARGE)
                        {
                            tabLayout.getTabAt(2).setIcon(R.drawable.xpicture2);
                        }
                        //tabLayout.getTabAt(2).setIcon(R.drawable.picture);
                        setCustomFont();
                        break;

                    case 3:
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_NORMAL)
                        {
                            tabLayout.getTabAt(3).setIcon(R.drawable.nvideo2);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_LARGE)
                        {
                            tabLayout.getTabAt(3).setIcon(R.drawable.lvideo2);
                        }
                        if ((getResources().getConfiguration().screenLayout &
                                Configuration.SCREENLAYOUT_SIZE_MASK) ==
                                Configuration.SCREENLAYOUT_SIZE_XLARGE)
                        {
                            tabLayout.getTabAt(3).setIcon(R.drawable.xvideo2);
                        }
                        //tabLayout.getTabAt(3).setIcon(R.drawable.video);
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

}
