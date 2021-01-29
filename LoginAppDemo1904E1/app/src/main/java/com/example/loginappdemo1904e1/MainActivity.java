package com.example.loginappdemo1904e1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
EditText et1, et2;
Button btn;
TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et1=findViewById(R.id.editTextTextPersonName);
        et2=findViewById(R.id.editTextTextPassword);
        btn=findViewById(R.id.button);
        res=findViewById(R.id.errormsg);

    }
    public void login(View v){

        String name=et1.getText().toString();
        String pass=et2.getText().toString();
        //correct ->login
            //  if(name == "aptech" && pass == "aptech123"){}
        if(name.equals("aptech") && pass.equals("aptech123")){
          //  Intent i=new Intent(MainActivity.this)
        Intent i=new Intent(MainActivity.this,DashBoardActivity.class);
        res.setText("Login Successful");
        startActivity(i);
        }
        //Empty
        else if(name.equals("") && pass.equals("")){
            res.setText("Empty");
        }
        //wrong ->error
        else{
            res.setText("Wrong Credentials");
        }
    }
}