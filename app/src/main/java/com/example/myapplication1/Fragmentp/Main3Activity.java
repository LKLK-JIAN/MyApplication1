package com.example.myapplication1.Fragmentp;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import com.example.myapplication1.*;

public class Main3Activity extends Activity {
    FragmentA fragmentA;
    FragmentB fragmentB;
    int i=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        fragmentA=new FragmentA();
        fragmentB=new FragmentB();
       /* FragmentManager fragmentManager=getFragmentManager();
        FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        fragmentTransaction.add(R.id.frag,fragmentA);
        fragmentTransaction.commit();*/
        getFragmentManager().beginTransaction().add(R.id.frag,fragmentA).commit();
    }
    void change(View view){
       // FragmentManager fragmentManager=getFragmentManager();
        //FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
        if(i==0){
            //fragmentTransaction.replace(R.id.frag,fragmentB);
            getFragmentManager().beginTransaction().replace(R.id.frag,fragmentB).commit();
            i=1;
        }
        else if(i==1){
            getFragmentManager().beginTransaction().replace(R.id.frag,fragmentA).commit();
            i=0;
        }
            //fragmentTransaction.replace(R.id.frag,fragmentA);i=0;}
       // fragmentTransaction.commit();
    }
}
