package com.example.recyclerview;

public class ExampleItem {

    private int mImageResource;
    private String mText1;
    private String mText2;

    public ExampleItem(int imageResource, String text1, String Text2){

        mImageResource = imageResource;
        mText1 = text1;
        mText2 = Text2;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public String getmText1() {
        return mText1;
    }

    public String getmText2() {
        return mText2;
    }
}
