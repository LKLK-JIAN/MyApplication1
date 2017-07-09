package com.example.myapplication1.mydialog;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication1.R;

public class MyAlertDialog extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.alert_dialog);
    }
    public void check(View view){
        AlertDialog.Builder dialog=new AlertDialog.Builder(this);
        dialog.setTitle("123");
        dialog.setIcon(R.mipmap.ic_launcher);
        dialog.setMessage("不能为空");
        dialog.setCancelable(true);
        dialog.show();

    }
}
