package com.polije.tif.mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.app.DatePickerDialog;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Calendar;

public class RelativeLayout extends AppCompatActivity {

    DatePickerDialog picker;
    EditText et_date;
    Button btn_get;
    TextView tv_date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relativelayout);

        tv_date = findViewById(R.id.tv_date);
        et_date = findViewById(R.id.et_date);
        et_date.setInputType(InputType.TYPE_NULL);
        et_date.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final Calendar cldr = Calendar.getInstance();
                int day = cldr.get(Calendar.DAY_OF_MONTH);
                int month = cldr.get(Calendar.MONTH);
                int year = cldr.get(Calendar.YEAR);

                picker = new DatePickerDialog(RelativeLayout.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
                                et_date.setText(dayOfMonth + "/" + (monthOfYear +1)+ "/" +year);
                            }
                        }, year, month, day);
                picker.show();
            }
        });
        btn_get = (Button)findViewById(R.id.btn_get);
        btn_get.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tv_date.setText("Selected Date: " + et_date.getText());
            }
        });




        ActionBar ab = getActionBar();
        if (ab != null) {
            ab.setTitle("Relative Layout");
        }
    }

    public void getDate(View view) {

    }
}