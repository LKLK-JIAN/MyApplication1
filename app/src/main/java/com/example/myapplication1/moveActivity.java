package com.example.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;

public class moveActivity extends Activity {
    RelativeLayout re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move);
        re=(RelativeLayout)findViewById(R.id.re);
        re.setOnHoverListener(new View.OnHoverListener() {
            @Override
            public boolean onHover(View v, MotionEvent event) {
                int what=event.getAction();
                switch(what){
                    case MotionEvent.ACTION_HOVER_ENTER:
                        break;

                }
                return false;
            }
        });
    }
}
