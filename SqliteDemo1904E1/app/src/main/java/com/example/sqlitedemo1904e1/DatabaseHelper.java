package com.example.sqlitedemo1904e1;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DatabaseHelper extends SQLiteOpenHelper {

    public static final String Database="Student.db";
    public static final String Table="Student_table";

    public DatabaseHelper(@Nullable Context context) {
        super(context, Database, null, 1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        SQLiteDatabase db=this.getWritableDatabase();
    sqLiteDatabase.execSQL(" create table "+Table+"( name text , age Integer)");
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
    sqLiteDatabase.execSQL(" Drop table if Exists "+Table);

    }
    public boolean InsertData(String name, int age){
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contVal = new ContentValues();
        contVal.put("name",name);
        contVal.put("age",age);
        long res=db.insert(Table,null,contVal);
        if(res == -1){ return false;}
        else{ return true;}
    }
    public Cursor GetAllData(){
        SQLiteDatabase db=this.getWritableDatabase();
        Cursor c=db.rawQuery("select * from "+Table,null);
        return  c;
    }
}
