package com.example.xyzreader.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageView;

/**
 * Created by sethugayu on 12/4/16.
 */

public class ThreeTwoImage extends ImageView {
    public ThreeTwoImage(Context context) {
        super(context);
    }

    public ThreeTwoImage(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public ThreeTwoImage(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int threeTwoHeight=MeasureSpec.getSize(widthMeasureSpec)*2/3;
        int threeTwoHeightSpec=MeasureSpec.makeMeasureSpec(threeTwoHeight,MeasureSpec.EXACTLY);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }
}
