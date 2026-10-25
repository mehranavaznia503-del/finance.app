package com.example.androidstarter;

import android.app.Activity;
import android.os.Bundle;
import android.graphics.Color;
import android.view.Gravity;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        LinearLayout page = new LinearLayout(this);
        page.setOrientation(LinearLayout.VERTICAL);
        page.setGravity(Gravity.CENTER);
        page.setPadding(32, 32, 32, 32);
        page.setBackgroundColor(Color.rgb(246, 248, 252));

        TextView title = new TextView(this);
        title.setText("پروژه اندروید آماده است");
        title.setTextSize(24);
        title.setTextColor(Color.rgb(31, 52, 87));
        title.setGravity(Gravity.CENTER);
        page.addView(title);

        TextView hint = new TextView(this);
        hint.setText("این صفحه نمونه است؛ برای ساخت برنامه دلخواه، امکانات موردنظرتان را مشخص کنید.");
        hint.setTextSize(16);
        hint.setTextColor(Color.DKGRAY);
        hint.setGravity(Gravity.CENTER);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        params.topMargin = 20;
        page.addView(hint, params);
        setContentView(page);
    }
}
