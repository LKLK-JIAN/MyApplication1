package com.example.myapplication1.shujuku;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.view.View;

import com.example.myapplication1.shujuku.model.Contact;

/**
 * Created by 老盖 on 2017/6/18.
 */

public class MyDBOpenHelper extends SQLiteOpenHelper {
    public static final String DB_NAME="mydb.db";
    public static final int DB_VERSION=1;
    public static final String TB_NAEM="contact";
    public static final String FIELD_ID="cid";
    public static final String FIELD_CNAME="cname";
    public static final String FIELD_CPHONE="cphone";
    public static final String SQL="create table contact " +
            "(cid integer primary key autoincrement, cname text, cphone text)";
    public static MyDBOpenHelper instance;
    public MyDBOpenHelper(Context context) {
        super(context,DB_NAME, null,1);
    }

    public static synchronized MyDBOpenHelper getInstace(Context context) {
        if(instance==null){
            instance=new MyDBOpenHelper(context.getApplicationContext());
        }
        return instance;
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL);   //创建表，字段名
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
    //插入信息
    public long add(Contact contact){
        SQLiteDatabase db=instance.getWritableDatabase();
        ContentValues values=new ContentValues();
        values.put("cid",contact.getCid());
        values.put("cname",contact.getCname());
        values.put("cphone",contact.getCphone());
        long flag=db.insert(TB_NAEM,null,values);
        return  flag;
    }
    //查询，登录
    public static boolean chaxun(String cname, String cphone) {
        SQLiteDatabase db = instance.getReadableDatabase();
        Cursor cursor = null;
        Contact contact = null;
        cursor = db.rawQuery("select * from " + MyDBOpenHelper.TB_NAEM +" where cname=?",new String[]{cname});
        if (cursor != null && cursor.moveToFirst()) {
                do {
                contact = new Contact();
                contact.setCid(cursor.getInt(0));
                contact.setCname(cursor.getString(1));
                contact.setCphone(cursor.getString(2));
            }
            while (cursor.moveToNext());
        }
        if(cname==contact.getCname()&&cphone==contact.getCphone())
           return true;
        else {
            return false;
        }
    }
}

