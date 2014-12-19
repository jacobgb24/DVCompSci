package com.supermath.jacobgb24.supermath;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.EditText;

import java.text.DecimalFormat;

/**
 * Created by jacob_000 on 12/9/2014.
 */
public class Kinematics extends ActionBarActivity {
    static EditText tval, aval, vval, xval;
    static double a, t, x, v;
    static DecimalFormat fmt = new DecimalFormat("###,###.###");

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.klayout);
        tval = (EditText) findViewById(R.id.time);
        aval = (EditText) findViewById(R.id.accel);
        vval = (EditText) findViewById(R.id.velocity);
        xval = (EditText) findViewById(R.id.xpos);

        //checks settings to display hints
        PreferenceManager.setDefaultValues(this, R.xml.preferences, true);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        boolean disp = prefs.getBoolean("PREF_SHOW_UNITS", true);
        if(disp) {
            tval.setHint("t(s)");
            aval.setHint("a(m/s^2)");
            xval.setHint("x(m)");
            vval.setHint("vi(m/s)");
        }
        else if(!disp) {
            tval.setHint("t");
            aval.setHint("a");
            xval.setHint("x");
            vval.setHint("vi");
        }
    }
    //deals with clicking either button by case
    public void onClickK(View v) {
        try {
            switch (v.getId()) {
                case R.id.KCalc:
                    if (tval.getText().toString().isEmpty())
                        timeCalc();
                    if (aval.getText().toString().isEmpty())
                        accelCalc();
                    if (vval.getText().toString().isEmpty())
                        velCalc();
                    if (xval.getText().toString().isEmpty())
                        posCalc();
                    break;
                case R.id.Clear:
                    tval.setText("");
                    aval.setText("");
                    xval.setText("");
                    vval.setText("");
                    break;

            }
        } catch (Exception e) {}
    }
    //math for finding missing var

    private void timeCalc() {
        x = Double.parseDouble(xval.getText().toString());
        v = Double.parseDouble(vval.getText().toString());
        a = Double.parseDouble(aval.getText().toString());
        double discrim = Math.pow(v, 2) - (4 * (.5 * a) * (-1 * x));
        double root1 = ((-1 * v) + Math.sqrt(discrim)) / (2 * (.5 * a));
        double root2 = ((-1 * v) - Math.sqrt(discrim)) / (2 * (.5 * a));
        if (root1 > 0)
            tval.setText(String.valueOf(fmt.format(root1)));
        else if (root2 > 0)
            tval.setText(String.valueOf(fmt.format(root2)));
        else
            tval.setText("Error");
    }

    private void accelCalc() {
        x = Double.parseDouble(xval.getText().toString());
        v = Double.parseDouble(vval.getText().toString());
        t = Double.parseDouble(tval.getText().toString());

        a = (2 * (x - (v * t))) / Math.pow(t, 2);
        aval.setText(String.valueOf(fmt.format(a)));
    }

    private void velCalc() {
        x = Double.parseDouble(xval.getText().toString());
        a = Double.parseDouble(aval.getText().toString());
        t = Double.parseDouble(tval.getText().toString());

        v = (x - (.5 * a * Math.pow(t, 2))) / t;
        vval.setText(String.valueOf(fmt.format(v)));
    }

    private void posCalc() {
        xval.setText("TEST");
        a = Double.parseDouble(aval.getText().toString());
        v = Double.parseDouble(vval.getText().toString());
        t = Double.parseDouble(tval.getText().toString());

        x = (v * t) + (.5 * a * Math.pow(t, 2));
        xval.setText(String.valueOf(fmt.format(x)));
    }
}

