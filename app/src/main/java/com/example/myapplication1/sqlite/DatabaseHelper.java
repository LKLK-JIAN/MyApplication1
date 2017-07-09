package com.example.myapplication1.sqlite;

import android.content.ContentValues;
import android.content.Context;
import android.database.ContentObservable;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.text.InputType;

import com.example.myapplication1.sqlite.model.Contact;

/**
 * Created by 老盖 on 2017/5/7.
 */

public class DatabaseHelper extends SQLiteOpenHelper {
    public static final String DB_NAME="mydb.db";
    public static final int DB_VERSION=1;
    public static final String TB_NAME="contact";
    public static final String FIELD_CID="cid";
    public static final String FIELD_CNAME="cname";
    public static final String FIELD_CPHONE="cphone";
    public static final String SQL="CREATE TABLE "+TB_NAME+"("+FIELD_CID+
            " Integer primary key autoincrement "+FIELD_CNAME+" text "+FIELD_CPHONE+" TEXT "+")";
    private static  DatabaseHelper myInstance;

    public DatabaseHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }
    public void onCreate(SQLiteDatabase db){
        db.execSQL(SQL);//第一次创建时，创建表
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion){
        /* 数据库内部数据修改时语句 */
    }
  public long add(Contact contact){
      SQLiteDatabase db=myInstance.getWritableDatabase();  //返回SQLiteDatabase对象
      ContentValues values=new ContentValues();
      values.put(FIELD_CNAME,contact.getFIELD_CNAME());
      values.put(FIELD_CPHONE,contact.getFIELD_CPHONE());
      long f=db.insert(TB_NAME,null,values);
      return f;}}