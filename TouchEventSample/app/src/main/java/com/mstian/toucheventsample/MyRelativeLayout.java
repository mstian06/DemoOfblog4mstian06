package com.mstian.toucheventsample;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.widget.RelativeLayout;

/**
 * Created by tianmaosheng on 2016/7/28.
 */
public class MyRelativeLayout extends RelativeLayout {

    private final String TAG = "MyRelativeLayout";

    public MyRelativeLayout(Context context) {
        super(context);
    }

    public MyRelativeLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Utils.log(TAG, "dispatchTouchEvent", ev);
        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        Utils.log(TAG, "onInterceptTouchEvent", ev);
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                return Utils.MyRelativeLayout_onInterceptTouchEvent_down;
            }
            default:
                break;
        }

        return super.onInterceptTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        Utils.log(TAG, "onTouchEvent", event);
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                return Utils.MyRelativeLayout_onTouchEvent_down;
            }
            default:
                break;
        }

        return super.onTouchEvent(event);
    }
}
