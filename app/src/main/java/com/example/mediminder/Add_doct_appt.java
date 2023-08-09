package com.example.mediminder;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Add_doct_appt extends AppCompatActivity {
    EditText Name_doct, reason, Date, Time;
    Button Add;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.add_doct_appt);

        Name_doct = (EditText)findViewById(R.id.name_of_doct);
        reason = (EditText)findViewById(R.id.appt_reason);
        Date = (EditText)findViewById(R.id.appt_date);
        Time = (EditText)findViewById(R.id.appt_time);
        Add = (Button)findViewById(R.id.add_appt_button);
    }
}
