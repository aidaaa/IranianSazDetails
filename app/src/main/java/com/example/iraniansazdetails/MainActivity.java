package com.example.iraniansazdetails;

import com.google.android.material.tabs.TabLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager.widget.ViewPager;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import com.example.iraniansazdetails.viewPager.ViewPagerAdapter;

public class MainActivity extends FragmentActivity {

    ViewPager viewPager;
    TabLayout tabLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        viewPager=findViewById(R.id.viewpager);
        tabLayout=findViewById(R.id.tab);


        ViewPagerAdapter adapter=new ViewPagerAdapter(getSupportFragmentManager());
        adapter.notifyDataSetChanged();
        viewPager.setOffscreenPageLimit(0);
        viewPager.setAdapter(adapter);

        tabLayout.setupWithViewPager(viewPager);
        tabLayout.getTabAt(0).setIcon(R.drawable.headphones);
        tabLayout.getTabAt(1).setIcon(R.drawable.information2);
        tabLayout.getTabAt(2).setIcon(R.drawable.picture);
        tabLayout.getTabAt(3).setIcon(R.drawable.video2);


        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                int i=tab.getPosition();
                switch (i)
                {
                    case 0:
                        tabLayout.getTabAt(0).setIcon(R.drawable.headphones);
                        break;
                    case 1:
                        tabLayout.getTabAt(1).setIcon(R.drawable.information);
                        break;
                    case 2:
                        tabLayout.getTabAt(2).setIcon(R.drawable.picture2);
                        break;
                    case 3:
                        tabLayout.getTabAt(3).setIcon(R.drawable.video);
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
                        break;
                    case 1:
                        tabLayout.getTabAt(1).setIcon(R.drawable.information2);
                        break;
                    case 2:
                        tabLayout.getTabAt(2).setIcon(R.drawable.picture);
                        break;
                    case 3:
                        tabLayout.getTabAt(3).setIcon(R.drawable.video2);
                        break;
                }
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });

    }

}
