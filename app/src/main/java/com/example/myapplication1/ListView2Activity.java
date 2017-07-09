package com.example.myapplication1;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ListView2Activity extends ListActivity {
    private ListView tv1;
    private TextView text1;
    private String [] items={"北京市","上海市","广州市","深圳市","茂名市","武汉市","阳江市"};

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);
        text1.setText(items[position]);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view2);
        text1=(TextView)findViewById(R.id.text1);
        tv1=(ListView)findViewById(R.id.tv1);
        tv1.setAdapter(new ArrayAdapter<String>(ListView2Activity.this,android.R.layout.simple_list_item_1,items));

    }
}
