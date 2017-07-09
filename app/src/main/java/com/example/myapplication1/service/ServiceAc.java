package com.example.myapplication1.service;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication1.R;

public class  ServiceAc extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }
    public void startService(View view){
        Intent intent=new Intent(this,MyService.class);
        intent.putExtra("key1","fachulai");
        intent.putExtra("key2",receiver);
        startService(intent);
    }
    ResultReceiver receiver=new ResultReceiver(new Handler()){
        @Override
        protected void onReceiveResult(int resultCode, Bundle resultData) {//其实就是一个空函数，自己重载
            Toast.makeText(ServiceAc.this, "receiver"+resultCode, Toast.LENGTH_SHORT).show();
        }
    };
}
