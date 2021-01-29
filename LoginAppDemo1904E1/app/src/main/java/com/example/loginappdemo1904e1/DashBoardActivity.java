package com.example.loginappdemo1904e1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DashBoardActivity extends AppCompatActivity {
Button signout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);
        signout=findViewById(R.id.button2);
    }
    public  void logout(View v){
        Intent i =new Intent(DashBoardActivity.this,MainActivity.class);
        startActivity(i);
    }
}