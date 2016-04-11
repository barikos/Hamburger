package com.minutes111.hamburger.model;

/**
 * Created by barikos on 10.04.16.
 */
public class FragmentImage {
    private int mImage;
    private String mTitle;

    public int getImage() {
        return mImage;
    }

    public FragmentImage setImage(int image) {
        mImage = image;
        return this;
    }

    public String getTitle() {
        return mTitle;
    }

    public FragmentImage setTitle(String title) {
        mTitle = title;
        return this;
    }
}
