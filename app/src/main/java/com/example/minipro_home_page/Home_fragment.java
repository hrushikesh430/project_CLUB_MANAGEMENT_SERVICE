package com.example.minipro_home_page;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class Home_fragment extends Fragment {

   /* private Handler SliderHandler = new Handler();
    ViewPager mViewPager;

    int[] images = {R.drawable.card1,R.drawable.card2,
            R.drawable.card3,R.drawable.card4,R.drawable.card5};

    // Creating Object of ViewPagerAdapter
    viwerpageadapter mViewPagerAdapter;*/
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        // Initializing the ViewPager Object
      //  mViewPager = mViewPager.findViewById(R.id.sliderImage);

        // Initializing the ViewPagerAdapter
      //  mViewPagerAdapter = new viwerpageadapter(Home_fragment.this, images);

        // Adding the Adapter to the ViewPager
       // mViewPager.setAdapter(mViewPagerAdapter);

        return inflater.inflate(R.layout.fragment_home_fragment, container, false);
    }
}