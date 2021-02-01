package com.example.checkboxesdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //create variable
    CheckBox b1,b2,b3;
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=findViewById(R.id.chbox);
        b2=findViewById(R.id.chbox1);
        b3=findViewById(R.id.chbox2);
        tv=findViewById(R.id.res);
    }
    public  void Check(View v){
        if(b1.isChecked()){
            Toast.makeText(MainActivity.this,"You selected Pizza",Toast.LENGTH_LONG).show();
            tv.setText("You selected Pizza");
        }
         if(b2.isChecked()){
             Toast.makeText(MainActivity.this,"You selected Burger",Toast.LENGTH_LONG).show();
             tv.setText("You selected Burger");
         }
         if (b3.isChecked()){
             Toast.makeText(MainActivity.this,"You selected Biryani",Toast.LENGTH_LONG).show();
             tv.setText("You selected Biryani");
         }
         if(b1.isChecked() && b2.isChecked()){
             Toast.makeText(MainActivity.this,"You selected Pizza & Burger",Toast.LENGTH_LONG).show();
             tv.setText("You selected Pizza & Burger");
         }
         if(b1.isChecked() && b3.isChecked()){
             Toast.makeText(MainActivity.this,"You selected Pizza & Biryani",Toast.LENGTH_LONG).show();
             tv.setText("You selected Pizza & Biryani");
         }
         if(b2.isChecked() && b3.isChecked()){
             Toast.makeText(MainActivity.this,"You selected Burger & Biryani",Toast.LENGTH_LONG).show();
             tv.setText("You selected Burger & Biryani");
         }
        if(b1.isChecked() && b2.isChecked() && b3.isChecked()){
            Toast.makeText(MainActivity.this,"You selected Pizza & Burger & Biryani",Toast.LENGTH_LONG).show();
            tv.setText("You selected Pizza & Burger & Biryani");
        }

    }
}