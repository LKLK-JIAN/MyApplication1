package com.example.myapplication1.yingyong;

import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.myapplication1.Main2Activity;
import com.example.myapplication1.R;
import com.example.myapplication1.shujuku.MyDBOpenHelper;

public class LoginActivity extends Activity {
    private EditText yhm, mm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login_activity);
        yhm = (EditText) findViewById(R.id.yhm);
        mm = (EditText) findViewById(R.id.mm);
    }

    public void denglu(View view) {
        //MyDBOpenHelper db = new MyDBOpenHelper(this);
       // String mz = yhm.getText().toString().trim();
       // String m = mm.getText().toString().trim();
            Intent intent=new Intent();
            intent.setClass(this,Activity.class);
            startActivity(intent);
        }
    }

