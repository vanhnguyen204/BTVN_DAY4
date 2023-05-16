package com.fpoly.lab3_ph32739;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.linear_layout);
        setContentView(R.layout.relative_layout);
        setContentView(R.layout.constraint_layout);
    }
}