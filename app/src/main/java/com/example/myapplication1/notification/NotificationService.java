package com.example.myapplication1.notification;

import android.app.IntentService;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by 老盖 on 2017/5/22.
 */

public class NotificationService extends IntentService {
    int i = 0, x = 0;
    public static NotificationManager manager;
    public static Notification.Builder builder;
    public NotificationService() {

        super("myapplication");
    }

    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    protected void onHandleIntent(Intent intent) {
        Intent myintent = new Intent(notificationActivity.action);
        manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        builder = new Notification.Builder(this);

            Thread1 thread=new Thread1();
            thread.start();
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
           /* builder.setTicker("你有一条信息").setContentText("下载中")
                    .setContentTitle("王者荣耀")
                    .setSmallIcon(android.R.mipmap.sym_def_app_icon)
                    .setWhen((int) System.currentTimeMillis())
                    .setProgress(100, i, false);
            manager.notify(x, builder.build());*/
            if (i == 100) {
                myintent.putExtra("key", "下载完成");
                sendBroadcast(myintent);
            }
            // if(x>0)  manager.cancel(x--);
            /*if(i==100){

                        builder.setTicker("你有一条信息").setContentText("完成")
                        .setContentTitle("王者荣耀")
                        .setSmallIcon(android.R.mipmap.sym_def_app_icon)
                        .setWhen((int)System.currentTimeMillis())
                        .setProgress(100,i,false);
                manager.notify(x,builder.build());
                break;}
            i+=10;*/


    }

        @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
        public static void getData(Notification.Builder builder, NotificationManager manager) {
        int i;
        String total;
        URL url = null;
        HttpURLConnection con = null;
        InputStream reader = null;
        try {
            url = new URL("http://124.42.245.150/" +
                    "softdl.360tpcdn.com/weixinPC/weixinPC_2.4.1.79.exe");
            con = (HttpURLConnection) url.openConnection();
            reader = con.getInputStream();
            int length = con.getContentLength();
            int download = 0;
            byte[] buf = new byte[512];
            int in = 0;
            while ((in = reader.read(buf)) != -1) {
                for (int x = 0; x< 1000000; x++) {

                }
                download = download + in;
                i = (int) ((float) download / length * 100);
                builder.setTicker("你有一条信息").setContentText("下载中")
                        .setContentTitle("王者荣耀")
                        .setSmallIcon(android.R.mipmap.sym_def_app_icon)
                        .setWhen((int) System.currentTimeMillis())
                        .setProgress(100, i, false);
                manager.notify(1, builder.build());
                if (i == 100) {
                    builder.setTicker("你有一条信息").setContentText("完成")
                            .setContentTitle("王者荣耀")
                            .setSmallIcon(android.R.mipmap.sym_def_app_icon)
                            .setWhen((int) System.currentTimeMillis())
                            .setProgress(100, i, false);
                    manager.notify(1, builder.build());
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    }
class Thread1 extends Thread{
    @RequiresApi(api = Build.VERSION_CODES.JELLY_BEAN)
    @Override
    public void run() {
       NotificationService.getData( NotificationService.builder,NotificationService.manager);

    }
}

