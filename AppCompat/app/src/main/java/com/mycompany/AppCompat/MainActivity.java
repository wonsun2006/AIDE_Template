package com.mycompany.AppCompat;

import android.app.*;
import android.os.*;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    }
}
