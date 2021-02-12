package com.example.alertbox1904e1;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

  public void open(View v){


    AlertDialog.Builder d = new AlertDialog.Builder(this);
        d.setMessage("Are you sure,You want to Quit App?")
                .setPositiveButton("Y", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface arg0, int arg1) {
                                Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                                finish();
                            }
                        })

       .setNegativeButton("N",new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
               dialog.cancel();
            }
        }).setTitle("Wait")
        .setCancelable(false);

        AlertDialog alertDialog = d.create();
        alertDialog.show();
    }

    @Override
    public void onBackPressed() {
        AlertDialog.Builder d = new AlertDialog.Builder(this);
        d.setMessage("Are you sure,You want to Quit App?")
                .setPositiveButton("Y", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int arg1) {
                      //  Toast.makeText(MainActivity.this,"You clicked yes button",Toast.LENGTH_LONG).show();
                        finish();
                    }
                })

                .setNegativeButton("N",new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                }).setTitle("Wait")
                .setCancelable(false);

        AlertDialog alertDialog = d.create();
        alertDialog.show();
    }
}