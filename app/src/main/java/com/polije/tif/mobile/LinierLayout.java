package com.polije.tif.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.os.Bundle;

public class LinierLayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linier_layout);

        ActionBar ab = getActionBar();
        if (ab != null) {
            ab.setTitle("Linear Layout");
        }
    }

}