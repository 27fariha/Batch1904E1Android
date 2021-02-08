package com.example.radiobutton1904e1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
EditText edname;
Button login;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        edname=findViewById(R.id.editTextTextPersonName);
        login=findViewById(R.id.button);
    }

    public void login(View v){
        String name=edname.getText().toString();
        if(name.equals("")){
            Toast.makeText(getApplicationContext(),"Enter Your NAme First",Toast.LENGTH_LONG).show();
        }
        else{
            Intent i=new Intent(LoginActivity.this,DashboardActivity.class);
            i.putExtra("sendName",name);
            startActivity(i);
        }

    }
}