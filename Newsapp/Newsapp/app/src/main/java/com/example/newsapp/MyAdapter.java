package com.example.newsapp;

import android.content.Context;
import android.util.Log;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class MyAdapter extends FragmentPagerAdapter {
    private Context myContext;
    int totalTabs;

    public MyAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        myContext = context;
        this.totalTabs = totalTabs;
    }

    // this is for fragment tabs
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                HomeFragment homeFragment = new HomeFragment();
                return homeFragment;
           case 1:
               CanadaFragment canadaFragment = new CanadaFragment();
                return canadaFragment;
            case 2:
                HomeFragment movieFragment = new HomeFragment();
                return movieFragment;
            case 3:
            CanadaFragment canadaFragment8 = new CanadaFragment();
            return canadaFragment8;
            case 4:
                HomeFragment movieFragment9 = new HomeFragment();
                return movieFragment9;
            case 5:
            CanadaFragment canadaFragment10 = new CanadaFragment();
            return canadaFragment10;
            case 6:
                HomeFragment movieFragment10 = new HomeFragment();
                return movieFragment10;
            case 7:
            CanadaFragment canadaFragment11 = new CanadaFragment();
            return canadaFragment11;
            case 8:
                HomeFragment movieFragment11 = new HomeFragment();
                return movieFragment11;
            case 9:
            CanadaFragment canadaFragment12 = new CanadaFragment();
            return canadaFragment12;
            case 10:
                HomeFragment movieFragment12 = new HomeFragment();
                return movieFragment12;
            default:
                return null;
        }
    }

    // this counts total number of tabs
    @Override
    public int getCount() {
        return totalTabs;
    }
}
