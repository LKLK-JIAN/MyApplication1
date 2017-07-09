package com.example.myapplication1;

import android.content.Context;
import android.provider.Settings;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;

import com.example.myapplication1.shujuku.MyDBOpenHelper;
import com.example.myapplication1.shujuku.model.Contact;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();
        MyDBOpenHelper helper=MyDBOpenHelper.getInstace(appContext);
        helper.getReadableDatabase();
        System.out.print("##"+helper.getDatabaseName());
        Contact contact=new Contact("zhang","1888888888");
        Contact contact1=new Contact("chang","1888888887");
        long flag=helper.add(contact);
        boolean a=helper.chaxun("zhang","1888888888");
        System.out.println(a);
        if(flag>0){
            System.out.print("1");}
        else{
            System.out.print("0");}
        assertEquals("com.example.myapplication1", appContext.getPackageName());
    }
}
