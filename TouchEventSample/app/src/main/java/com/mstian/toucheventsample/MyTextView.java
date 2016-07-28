package com.mstian.toucheventsample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.TextView;

/**
 * Created by tianmaosheng on 2016/7/28.
 */
public class MyTextView extends TextView {

    private final String TAG = "MyTextView";

    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent event) {
        Utils.log(TAG, "dispatchTouchEvent", event);

        return super.dispatchTouchEvent(event);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Utils.log(TAG, "onTouchEvent", event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                return Utils.MayTextView_onTouchEvent_down;
            }
            default:
                break;
        }

        return super.onTouchEvent(event);
    }
}
