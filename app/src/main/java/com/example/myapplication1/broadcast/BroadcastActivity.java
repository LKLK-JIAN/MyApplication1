package com.example.myapplication1.broadcast;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication1.R;

public class BroadcastActivity extends Activity {
    public static final String action="android.intent.action.MY_BROADCAST";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_broadcast);
    }
    public void startService(View view){
        Intent intent=new Intent(this,MyBroadcast.class);
        intent.putExtra("key","123");
        startService(intent);
    }

    @Override
    protected void onResume() {
        super.onResume();
        IntentFilter filter=new IntentFilter(action);
        registerReceiver(receiver,filter);
    }
    BroadcastReceiver receiver=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent!=null){
                String i=intent.getStringExtra("keyone");
            Toast.makeText(BroadcastActivity.this,i,Toast.LENGTH_LONG).show();
        }
        }
    };
}
