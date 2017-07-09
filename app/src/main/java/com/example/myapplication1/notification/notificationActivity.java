package com.example.myapplication1.notification;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.myapplication1.R;
import com.example.myapplication1.broadcast.BroadcastActivity;

public class notificationActivity extends AppCompatActivity {
    public static final String action="android.intent.action.MY_BROADCAST";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitynotification);
    }
    public void startService(View view){
        startService(new Intent(this,NotificationService.class));
    }
    protected void onResume() {
        super.onResume();
        IntentFilter filter=new IntentFilter(action);
        registerReceiver(receiver,filter);
    }
    BroadcastReceiver receiver=new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {
            if(intent!=null){
                String i=intent.getStringExtra("key");
                Toast.makeText(notificationActivity.this,i,Toast.LENGTH_LONG).show();
            }
        }
    };
}
