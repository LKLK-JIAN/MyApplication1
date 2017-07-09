package com.example.myapplication1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class Activity extends AppCompatActivity {
    private Button te;
    private  TextView ts;
    private ProgressBar pbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_);
        te=(Button) findViewById(R.id.te);
        ts=(TextView)findViewById(R.id.ts);
        pbar=(ProgressBar)findViewById(R.id.pbar);

        te.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(Activity.this, "", Toast.LENGTH_SHORT).show();

            }
        });

           }
}
