package com.example.administrator.drawerlayoutwithactionbar;

/**
 * @author Jack
 * @time 2016/5/4 0004 22:29
 * @des TODO
 */
public class ItemDomain {
    public int getImageView() {
        return mImageView;
    }

    public String getTextView() {
        return mTextView;
    }

    private int mImageView;
    private String mTextView;
    ItemDomain(int imageView, String textView){
        mImageView=imageView;
        mTextView=textView;
    }

}
