package com.india.tab_layout_android;

import android.provider.CallLog;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerMessangerAdapter extends FragmentPagerAdapter {

    public ViewPagerMessangerAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }

    @Override
    // this method is use to return the object of every Fragment Classes
    public Fragment getItem(int position) {
        if(position == 0){
            return new ChatsFragment();
        }else if(position == 1){
            return new StatusFragment();
        }else{
            return new CallsFragment();
        }
    }

    @Override
    public int getCount() {
        return 3;
    }


    // this method is use to set the names of every tabs in the TabLayout
    public CharSequence getPageTitle(int position) {
        if(position == 0){
            return "Chats";
        }else if(position == 1){
            return "Status";
        }else{
            return "Calls";
        }
    }

}
