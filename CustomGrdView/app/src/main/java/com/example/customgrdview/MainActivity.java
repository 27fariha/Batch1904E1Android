package com.example.customgrdview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class MainActivity extends AppCompatActivity {
 GridView gv;
 int img[]={R.drawable.img1,R.drawable.img2,R.drawable.img3,R.drawable.img4,R.drawable.img5,R.drawable.img6};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gv=findViewById(R.id.mygrid);
        customAdapter adp=new customAdapter(MainActivity.this,img);
        gv.setAdapter(adp);
        gv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent in=new Intent(MainActivity.this,Main2Activity.class);
                in.putExtra("images",img[i]);
                startActivity(in);
            }
        });
    }
}
