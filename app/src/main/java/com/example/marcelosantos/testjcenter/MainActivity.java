package com.example.marcelosantos.testjcenter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.marcelosantos.testmaven.StringUtil;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("MainActivity", "Library Test: " + new StringUtil().returnAppendedString("tested"));
    }
}
