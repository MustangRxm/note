package com.example.mai.actionbardemo01;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        ActionBar ab =  getSupportActionBar();
        ArrayAdapter arrayAdapter;
//        ab.setListNavigationCallbacks();
    }
}
