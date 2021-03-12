package com.example.sqlitedemo1904e1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
DatabaseHelper mydb;
EditText editname,editage;
Button insert, btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mydb=new DatabaseHelper(this);
        editname=findViewById(R.id.editText);
        editage=findViewById(R.id.editText2);
        insert =findViewById(R.id.button);
btn=findViewById(R.id.button2);
        insert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                boolean a= mydb.InsertData(editname.getText().toString(),Integer.parseInt(editage.getText().toString()));
                if(a== true){
                    Toast.makeText(MainActivity.this,"Record Inserted",Toast.LENGTH_LONG).show();
                    editname.setText("");
                    editage.setText("");
                }
                else { Toast.makeText(MainActivity.this,"Record Not Inserted",Toast.LENGTH_LONG).show();}
            }
        });


        Show();

    }

    public  void Show(){
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Cursor c= mydb.GetAllData();
                if(c.getCount() == 0){
                    Toast.makeText(MainActivity.this,"No Record",Toast.LENGTH_LONG);
                }
                StringBuffer b=new StringBuffer();
                while (c.moveToNext()){
                    b.append("Name :"+c.getString(0)+"\n");
                    b.append("Age :"+c.getString(1)+"\n");
                }
                ShowData("Record",b.toString());
            }
        });
    }
    public void ShowData(String title,String msg){
        AlertDialog.Builder b=new AlertDialog.Builder(MainActivity.this);
        b.setMessage(msg)
                .setTitle(title)
                .setCancelable(true)
                .show();
    }

}
