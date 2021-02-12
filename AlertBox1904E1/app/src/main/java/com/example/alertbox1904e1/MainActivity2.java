package com.example.alertbox1904e1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity2 extends AppCompatActivity {

    private int Current_img_index;
    ImageView img;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        int[] images={R.mipmap.ic_img1,R.mipmap.ic_img2,R.mipmap.ic_img3};
        img=findViewById(R.id.imageView2);
        btn=findViewById(R.id.button2);
        btn.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Current_img_index++;
             Current_img_index=Current_img_index % images.length;
             img.setImageResource(images[Current_img_index]);
         }
     });

    }
}