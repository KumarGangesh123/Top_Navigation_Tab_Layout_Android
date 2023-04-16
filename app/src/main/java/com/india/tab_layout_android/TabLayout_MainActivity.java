package com.india.tab_layout_android;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class TabLayout_MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TabLayout tabLayout = findViewById(R.id.tabLayout);
        ViewPager viewPager = findViewById(R.id.viewPager);

        ViewPagerMessangerAdapter viewPagerAdapter = new ViewPagerMessangerAdapter(getSupportFragmentManager());    // use to get the object of ViewPager Class

        viewPager.setAdapter(viewPagerAdapter); // use to set the Adapter class in the ViewPager

        tabLayout.setupWithViewPager(viewPager);    // use to sychronize the tabs with the ViewPager


    }
}