package com.example.sqlitedemo1904e1;

import androidx.appcompat.app.AppCompatActivity;

import android.database.Cursor;
import android.os.Bundle;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
DatabaseHelper mydb;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        mydb=new DatabaseHelper(this);
      Cursor c= mydb.GetAllData();
      if(c.getCount() == 0){
          Toast.makeText(Main2Activity.this,"No Record",Toast.LENGTH_LONG);
      }
      StringBuffer b=new StringBuffer();
      while (c.moveToNext()){
          b.append("Name :"+c.getString(0)+"\n");
          b.append("Age :"+c.getString(1)+"\n");
      }

    }
}
