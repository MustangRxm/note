package com.example.administrator.recyclerviewdemo01;

/**
 * @author Jack
 * @time 2016/5/4 0004 22:29
 * @des TODO
 */
public class Item {
    public int getImageView() {
        return mImageView;
    }

    public String getTextView() {
        return mTextView;
    }

    private int mImageView;
    private String mTextView;
    Item(int imageView,String textView){
        mImageView=imageView;
        mTextView=textView;
    }

}
