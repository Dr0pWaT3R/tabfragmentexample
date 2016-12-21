package com.example.dr0pwater.tablayoutexample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dr0pwater on 12/4/16.
 */

public class FragmentPageAdapter extends FragmentPagerAdapter {
    private  String[] tabTitle = new String[]{"Tab_1","Tab_2","Tab_3","Tab_4","Tab_5"};
    Context context;
    private int pagecount = 5;
    public FragmentPageAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context=context;
    }

    @Override
    public Fragment getItem(int position) {
        FragmentDemo fragmentDemo = new FragmentDemo();

        return fragmentDemo;
    }

    @Override
    public int getCount() {
        return pagecount;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitle[position];
    }
}
