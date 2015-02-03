package com.supermath.jacobgb24.supermath;

import android.content.Intent;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PreferenceManager.setDefaultValues(this, R.xml.preferences, true);
    }
    //handles button clicks
    public void onClickM(View v){
        switch (v.getId()) {
            case R.id.IButton:
                Intent launchIntegral = new Intent(this, Integral.class);
                startActivity(launchIntegral);
                break;
            case R.id.AFButton:
                Intent launchAF = new Intent(this, AreaFinder.class);
                startActivity(launchAF);
                break;
            case R.id.RButton:
                Intent launchR = new Intent(this, Roots.class);
                startActivity(launchR);
                break;
            case R.id.KButton:
                Intent launchK = new Intent(this, Kinematics.class);
                startActivity(launchK);
                break;
            case R.id.TCButton:
                Intent launchTC = new Intent(this, TempConv.class);
                startActivity(launchTC);
                break;
        }
    }
    //other stuff
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    //settings menu
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == R.id.action_settings) {
            Intent settingsIntent = new Intent(this, SettingsActivity.class);
            startActivity(settingsIntent);
        }
        return super.onOptionsItemSelected(item);
        }
    }

