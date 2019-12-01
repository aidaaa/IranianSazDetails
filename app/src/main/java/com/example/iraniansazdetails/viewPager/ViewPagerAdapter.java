package com.example.iraniansazdetails.viewPager;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;
import android.view.ViewGroup;

import com.example.iraniansazdetails.album.AlbumActivity;
import com.example.iraniansazdetails.music.MusicPlayerActivity;
import com.example.iraniansazdetails.text.TextActivity;
import com.example.iraniansazdetails.video.VideoPlayerActivity;

public class ViewPagerAdapter extends FragmentPagerAdapter
{


    public ViewPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = null;
        switch (i) {
            case 0: {
                if (fragment!=null) {
                    fragment.onDestroy();
                }
                fragment= MusicPlayerActivity.newInstance();
                break;
            }
            case 1: {
                if (fragment!=null) {
                    fragment.onDestroy();
                }
                fragment= TextActivity.newInstance();
                break;
            }
            case 2: {
                if (fragment!=null) {
                    fragment.onDestroy();
                }
                fragment= AlbumActivity.newInstance();
                break;
            }
            case 3: {
                if (fragment!=null) {
                    fragment.onDestroy();
                }
                fragment= VideoPlayerActivity.newInstance();
                break;
            }
        }
        return fragment;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "موسیقی";
            case 1:
                return "متن";
            case 2:
                return "آلبوم";
            case 3:
                return "ویدیو";
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

   @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        FragmentManager manager = ((Fragment) object).getFragmentManager();
        FragmentTransaction trans = manager.beginTransaction();
        trans.remove((Fragment) object);
        trans.commit();
    }

}
