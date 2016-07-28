package com.mstian.toucheventsample;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private final String TAG = "MainActivity";

    private TextView tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        tips = (TextView) findViewById(R.id.tips);
        tips.setText("case1:点击事件不拦截，不处理");
        Utils.setParams(false, false, false, false, false, false);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Utils.log(TAG, "dispatchTouchEvent", ev);

        return super.dispatchTouchEvent(ev);
    }

    @Override
    public boolean onTouchEvent(MotionEvent ev) {
        Utils.log(TAG, "onTouchEvent", ev);
        switch (ev.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                return Utils.MainActivity_onTouchEvent_down;
            }
            default:
                break;
        }

        return super.onTouchEvent(ev);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        switch (id) {
            case R.id.case1:
                tips.setText("case1:点击事件不拦截，不处理");
                Utils.setParams(false, false, false, false, false, false);
                break;
            case R.id.case2:
                tips.setText("case2:点击事件不拦截，TextView处理");
                Utils.setParams(false, false, false, false, false, true);
                break;
            case R.id.case3:
                tips.setText("case3:点击事件蓝色Relative拦截，不处理");
                Utils.setParams(false, false, false, true, false, true);
                break;
            case R.id.case4:
                tips.setText("case4:点击事件蓝色Relative拦截，处理");
                Utils.setParams(false, false, false, true, true, true);
                break;
            case R.id.case5:
                tips.setText("case5:点击事件不拦截，activity处理");
                Utils.setParams(true, false, false, false, false, false);
                break;

        }

        return super.onOptionsItemSelected(item);
    }
}
