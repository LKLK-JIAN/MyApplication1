package com.example.myapplication1.mydialog;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication1.R;

public class MyAlertActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mydialoglayout);
    }
    public void check1(View view){
        Dialog dialog=new Dialog(this);
        dialog.setContentView(R.layout.mydialoglayout);
        dialog.setCancelable(true);
        dialog.show();
    }
}
