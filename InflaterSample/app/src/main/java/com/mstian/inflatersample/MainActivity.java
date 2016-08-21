package com.mstian.inflatersample;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends Activity {

    private LinearLayout main_layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        main_layout = (LinearLayout) findViewById(R.id.main_layout);
        LayoutInflater infalter = LayoutInflater.from(this);

        // 1, 等同于inflate(R.layout.button_layout, main_layout, true)
//        infalter.inflate(R.layout.button_layout, main_layout);

        // 2：因为在加载时，没有存在在一个布局中（加载完成之后才addView的），
        // button_layout中Button设置layout_width和layout_height无效。
        View buttonLayout = infalter.inflate(R.layout.button_layout, null);
        main_layout.addView(buttonLayout);

        // 3：将Button的layout_width和layout_height修改下试试，有效果。
//        View buttonLayout = infalter.inflate(R.layout.button_layout, main_layout, false);
//        main_layout.addView(buttonLayout);
    }
}
