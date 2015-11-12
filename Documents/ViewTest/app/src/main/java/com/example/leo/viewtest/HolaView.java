package com.example.leo.viewtest;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by leo on 15/10/23.
 */
public class HolaView extends View {

    public HolaView(Context context) {
        super(context);
    }

    public HolaView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }


    public HolaView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(Context context, AttributeSet attrs) {
        TypedArray array = context.obtainStyledAttributes(attrs, R.styleable.HolaView);
        array.getDimensionPixelSize(R.styleable.HolaView_HolaViewTextSize, 0);
        array.getColor(R.styleable.HolaView_pstsUnderlineColor, 0x00000000);
    }


}
