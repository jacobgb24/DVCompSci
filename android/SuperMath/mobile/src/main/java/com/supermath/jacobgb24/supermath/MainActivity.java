package com.supermath.jacobgb24.supermath;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button IButton = (Button) findViewById(R.id.IButton);
        IButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startIntegral();
            }
        });
        Button AFButton = (Button) findViewById(R.id.AFButton);
        AFButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startAreaFinder();
            }
        });
        Button GButton = (Button) findViewById(R.id.GButton);
        GButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startGuessNum();
            }
        });
    }
    private void startIntegral() {
        Intent launchIntegral = new Intent(this, Integral.class);
        startActivity(launchIntegral);
    }

    private void startAreaFinder() {
        Intent launchAF = new Intent(this, AreaFinder.class);
        startActivity(launchAF);
    }

    private void startGuessNum() {
        Intent launchGN = new Intent(this, GuessNum.class);
        startActivity(launchGN);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
