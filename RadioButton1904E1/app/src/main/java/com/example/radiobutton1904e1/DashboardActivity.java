package com.example.radiobutton1904e1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class DashboardActivity extends AppCompatActivity {
TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashboard);
        tv=findViewById(R.id.textView2);

        Intent a=getIntent();
        String ab=a.getStringExtra("sendName");
        tv.setText(ab.toString());
    }
}