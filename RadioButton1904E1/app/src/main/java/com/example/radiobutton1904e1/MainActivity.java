package com.example.radiobutton1904e1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
RadioGroup rg;
RadioButton rb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=findViewById(R.id.MenuList);
    }

    public void check(View v){
        int radioId=rg.getCheckedRadioButtonId();
        rb=findViewById(radioId);
        Toast.makeText(getApplicationContext(),"You Selected "+rb.getText(),Toast.LENGTH_LONG).show();
    }
}