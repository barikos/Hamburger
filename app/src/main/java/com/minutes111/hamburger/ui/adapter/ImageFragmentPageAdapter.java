package com.minutes111.hamburger.ui.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.minutes111.hamburger.model.FragmentImage;
import com.minutes111.hamburger.ui.ImageFragment;

import java.util.List;

/**
 * Created by barikos on 11.04.16.
 */
public class ImageFragmentPageAdapter extends FragmentPagerAdapter {

    private List mListImage;

    public ImageFragmentPageAdapter(FragmentManager fm, List<FragmentImage> images) {
        super(fm);
        this.mListImage = images;
    }

    @Override
    public Fragment getItem(int position) {
        FragmentImage image = (FragmentImage) mListImage.get(position);
        return ImageFragment.newInstance(image.getTitle(), image.getImage());
    }

    @Override
    public int getCount() {
        return mListImage.size();
    }
}
