package com.example.newsapp;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;


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
                FragmentIndiaNews fragmentIndiaNews = new FragmentIndiaNews();
                return fragmentIndiaNews;
           case 1:
               FragmentCanadaNews fragmentCanadaNews = new FragmentCanadaNews();
                return fragmentCanadaNews;
            case 2:
                FragmentAusNews fragmentAusNews = new FragmentAusNews();
                return fragmentAusNews;
            case 3:
                FragmentUSNews fragmentChinaNews = new FragmentUSNews();
            return fragmentChinaNews;
            case 4:
                FragmentFranceNews fragmentFranceNews = new FragmentFranceNews();
                return fragmentFranceNews;
            case 5:
                FragmentItalyNews fragmentItalyNews = new FragmentItalyNews();
            return fragmentItalyNews;
            case 6:
                FragmentJapanNews fragmentJapanNews = new FragmentJapanNews();
                return fragmentJapanNews;
            case 7:
                FragmentMexicoNews fragmentMexicoNews = new FragmentMexicoNews();
            return fragmentMexicoNews;
            case 8:
                FragmentPolandNews fragmentPolandNews = new FragmentPolandNews();
                return fragmentPolandNews;
            case 9:
                FragmentSwitzNews fragmentSwitzNews = new FragmentSwitzNews();
            return fragmentSwitzNews;
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
