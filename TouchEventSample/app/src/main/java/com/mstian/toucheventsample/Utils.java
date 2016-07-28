package com.mstian.toucheventsample;

import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by tianmaosheng on 2016/7/28.
 */
public final class Utils {

    public static boolean MainActivity_onTouchEvent_down = false;

    public static boolean MyFrameLayout_onInterceptTouchEvent_down = false;
    public static boolean MyFrameLayout_onTouchEvent_down = false;

    public static boolean MyRelativeLayout_onInterceptTouchEvent_down = false;
    public static boolean MyRelativeLayout_onTouchEvent_down = false;

    public static boolean MayTextView_onTouchEvent_down = false;


    public static void setParams(boolean mainActivity_onTouchEvent_down,
                                 boolean myFrameLayout_onInterceptTouchEvent_down,
                                 boolean myFrameLayout_onTouchEvent_down,
                                 boolean myRelativeLayout_onInterceptTouchEvent_down,
                                 boolean myRelativeLayout_onTouchEvent_down,
                                 boolean mayTextView_onTouchEvent_down) {

        MainActivity_onTouchEvent_down = mainActivity_onTouchEvent_down;
        MyFrameLayout_onInterceptTouchEvent_down = myFrameLayout_onInterceptTouchEvent_down;
        MyFrameLayout_onTouchEvent_down = myFrameLayout_onTouchEvent_down;
        MyRelativeLayout_onInterceptTouchEvent_down = myRelativeLayout_onInterceptTouchEvent_down;
        MyRelativeLayout_onTouchEvent_down = myRelativeLayout_onTouchEvent_down;
        MayTextView_onTouchEvent_down = mayTextView_onTouchEvent_down;
    }


    public static final void log(String tag, String funName, MotionEvent ev) {

        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN:
                Log.e(tag, funName + ", MotionEvent.ACTION_DOWN");
                break;
            case MotionEvent.ACTION_UP:
                Log.e(tag, funName + ", MotionEvent.ACTION_UP");
                break;
            case MotionEvent.ACTION_MOVE:
                Log.e(tag, funName + ", MotionEvent.ACTION_MOVE");
                break;
            case MotionEvent.ACTION_CANCEL:
                Log.e(tag, funName + ", MotionEvent.ACTION_CANCEL");
                break;
            case MotionEvent.ACTION_OUTSIDE:
                Log.e(tag, funName + ", MotionEvent.ACTION_OUTSIDE");
                break;
            default:
                Log.e(tag, funName + ", MotionEvent.else...");
                break;
        }
    }
}
