package com.supermath.jacobgb24.supermath;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.wearable.view.WatchViewStub;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by jacob_000 on 1/4/2015.
 */
public class Counter extends Activity {
    private long time1, time2;
    private int count=0;
    private Button mplus, mminus;
    private SharedPreferences sharedPref;
    private SharedPreferences.Editor editor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        sharedPref = getSharedPreferences("wear_counter", MODE_PRIVATE);
        editor = sharedPref.edit();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_count);
        final WatchViewStub stub = (WatchViewStub) findViewById(R.id.watch_view_stub_count);
        stub.setOnLayoutInflatedListener(new WatchViewStub.OnLayoutInflatedListener() {
            @Override
            public void onLayoutInflated(WatchViewStub stub) {
                mplus = (Button) stub.findViewById(R.id.inc);
                mminus = (Button) stub.findViewById(R.id.dec);
                count = sharedPref.getInt("saved_count", 0);
                mplus.setText(String.valueOf(count));
                Count();
            }
        });
    }
    private void Count() {
        mplus.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) { //adds 10 on long click        **Running on Android Wear**
                time1=System.currentTimeMillis();
                if(Math.abs(time2-time1)<=75) //resets count to 0 if + and - long clicked at same time
                    count = 0;
                else
                    count += 10;
                mplus.setText(String.valueOf(count));
                editor.putInt("saved_count", count);
                editor.commit();
                return true;
            }
        });
        mplus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //adds 1
                count++;
                mplus.setText(String.valueOf(count));
                editor.putInt("saved_count", count);
                editor.commit();
            }
        });
        mminus.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) { //subtracts 10 on long click
                time2=System.currentTimeMillis();
                if(Math.abs(time2-time1)<=75)
                    count = 0;
                else if(count>9)
                    count -= 10;
                else
                    count=0;
                mplus.setText(String.valueOf(count));
                editor.putInt("saved_count", count);
                editor.commit();
                return true;
            }
        });
        mminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) { //suibtracts 1
                if(count>0)
                    count--;
                mplus.setText(String.valueOf(count));
                editor.putInt("saved_count", count);
                editor.commit();
            }
        });
    }
}
