package com.example.myapplication1;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class listViewActivity extends Activity {
    private TextView textview;
    private ListView listview;
    private static final String[] items={"北京市","上海市","广州市","深圳市","茂名市","武汉市","阳江市","黑龙江市","吉林市","天津市","重庆市"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        textview=(TextView)findViewById(R.id.textview);
        listview=(ListView)findViewById(R.id.listview);
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        listview.setAdapter(arrayAdapter);
        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // textview.setText(" "+position+" ");
                // textview.setText(" "+items[position]+" ");
                //textview.setText(" "+position+" "+((TextView)view).getText());
                //textview.setText(((TextView)listview.getChildAt(position)).getText());
                textview.setText(((TextView)parent.getChildAt(position)).getText());

            }
        });
        listview.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(listViewActivity.this,items[position],Toast.LENGTH_LONG).show();
                return false;
            }
        });
        listview.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                if(event.getAction()==MotionEvent.ACTION_DOWN)
                {
                    Toast.makeText(listViewActivity.this,"dowm",Toast.LENGTH_LONG).show();
                }
                if(event.getAction()==MotionEvent.ACTION_UP)
                {
                    Toast.makeText(listViewActivity.this, "up", Toast.LENGTH_SHORT).show();
                }
                return false;
            }
        });
    }
}
