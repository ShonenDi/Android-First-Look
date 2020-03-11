package com.shonen.ukr.tryviewpager;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class MyPagesAdapter extends FragmentPagerAdapter {
    MyPagesAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        if (position==0){
            return new FirstTabFragment();
        } else if (position==1){
            return new SecondTabFragment();
        }else if (position==2){
            return new ThirdTabFragment();
        } else
        return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        if (position==0){
            return "First tab";
        } else if (position==1){
            return "Second tab";
        }else if (position==2){
            return "Third tab";
        } else
            return null;
    }
}
