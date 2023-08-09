package com.example.mediminder;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class New_details extends AppCompatActivity {

    EditText Name_med, No_of_pills, Time;
    Button Add;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.new_details);

        Name_med = (EditText)findViewById(R.id.name_of_med);
        No_of_pills = (EditText)findViewById(R.id.no_of_pills);
        Time = (EditText)findViewById(R.id.med_time);
        Add = (Button) findViewById(R.id.add_button);
    }
}
