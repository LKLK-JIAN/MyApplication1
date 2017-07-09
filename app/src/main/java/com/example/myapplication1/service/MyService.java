package com.example.myapplication1.service;

import android.app.IntentService;
import android.content.Intent;
import android.os.ResultReceiver;

/**
 * Created by 老盖 on 2017/5/16.
 */

public class MyService extends IntentService {
    public MyService() {
        super("TEST");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        String values=intent.getStringExtra("key1");
        System.out.println("#"+values);
        ResultReceiver receiver = (ResultReceiver) intent.getExtras().get("key2");
        if(receiver!=null){receiver.send(19,null);}//public void send(int resultCode, Bundle resultData)


    }
}
