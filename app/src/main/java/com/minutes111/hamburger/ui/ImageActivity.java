package com.minutes111.hamburger.ui;

import android.os.Bundle;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.minutes111.hamburger.R;
import com.minutes111.hamburger.model.FragmentImage;
import com.minutes111.hamburger.ui.adapter.ImageFragmentPageAdapter;

import java.util.ArrayList;

public class ImageActivity extends AppCompatActivity {

    private ViewPager mPager;
    private PagerAdapter mAdapter;
    private ArrayList<FragmentImage> mImages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        mImages = fillData();

        mPager = (ViewPager) findViewById(R.id.vp_image);
        mAdapter = new ImageFragmentPageAdapter(getSupportFragmentManager(), mImages);
        mPager.setAdapter(mAdapter);
    }

    private ArrayList<FragmentImage> fillData() {
        mImages = new ArrayList<>();
        mImages.add(new FragmentImage().setImage(R.drawable.img_fest_1).setTitle("One"));
        mImages.add(new FragmentImage().setImage(R.drawable.img_fest_2).setTitle("Two"));
        mImages.add(new FragmentImage().setImage(R.drawable.img_fest_3).setTitle("Three"));
        return mImages;
    }
}
