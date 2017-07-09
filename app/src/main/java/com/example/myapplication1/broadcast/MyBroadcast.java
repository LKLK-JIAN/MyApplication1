package com.example.myapplication1.broadcast;

import android.app.IntentService;
import android.content.Intent;

/**
 * Created by 老盖 on 2017/5/18.
 */

public class MyBroadcast extends IntentService {
    public MyBroadcast() {
        super("testone");
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onHandleIntent(Intent intent) {
       String str=intent.getStringExtra("key");
        Intent myintent=new Intent(BroadcastActivity.action);
        myintent.putExtra("keyone","从Mybroadcast发回来的");
        sendBroadcast(myintent);
    }
}
