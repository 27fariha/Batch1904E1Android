package com.example.listviewdemo1904e1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
ListView simpleList;
String country[]={"Pakistan","India","Iran","Iraq","Algeria","Andorra","Angola","Australia","the Argentine Republic"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        simpleList=findViewById(R.id.list);
        ArrayAdapter<String> adp=new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_list_item_1,country);
        simpleList.setAdapter(adp);
        simpleList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value=(String) simpleList.getItemAtPosition(i);
                Toast.makeText(MainActivity.this,"You Selected "+value,Toast.LENGTH_LONG).show();
            }
        });
    }
}