package com.minutes111.hamburger.ui;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.minutes111.hamburger.R;

/**
 * Created by barikos on 11.04.16.
 */
public class ImageFragment extends android.support.v4.app.Fragment {

    static final String ATT_IMG = "arg_img_number";
    static final String ATTR_TEXT = "arg_img_text";

    private int mImageNumber;
    private String mText;

    public static ImageFragment newInstance(String text, int img) {
        ImageFragment imageFragment = new ImageFragment();
        Bundle arguments = new Bundle();
        arguments.putInt(ATT_IMG, img);
        arguments.putString(ATTR_TEXT, text);
        imageFragment.setArguments(arguments);
        return imageFragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mImageNumber = getArguments().getInt(ATT_IMG);
        mText = getArguments().getString(ATTR_TEXT);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_image, null);

        TextView textView = (TextView) view.findViewById(R.id.txt_fragment);
        ImageView imageView = (ImageView) view.findViewById(R.id.img_fragment);
        textView.setText(mText);
        imageView.setImageResource(mImageNumber);

        return view;
    }
}
