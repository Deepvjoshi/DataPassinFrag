package com.deepjoshi.fragdata;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentManager fm= getFragmentManager();
        FragmentTransaction ft=fm.beginTransaction();
        Fragone fma=new Fragone();
        ft.add(R.id.fragloc,fma);
        ft.commit();

    }
}
