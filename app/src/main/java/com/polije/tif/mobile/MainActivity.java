package com.polije.tif.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar ab = getActionBar();
        if (ab != null) {
            ab.setTitle("Main Menu");
        }
    }

    public void linearLayout(View view) {
        Intent pindahLinear = new Intent(MainActivity.this, LinierLayout.class);
        startActivity(pindahLinear);
    }

    public void Acara10(View view) {
        Intent pindahRelative = new Intent(MainActivity.this, RelativeLayout.class);
        startActivity(pindahRelative);
    }
}