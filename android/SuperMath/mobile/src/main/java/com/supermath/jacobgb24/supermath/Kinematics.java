package com.supermath.jacobgb24.supermath;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by jacob_000 on 12/9/2014.
 */
public class Kinematics extends ActionBarActivity {
    static EditText tval, aval, vval, xval;
    static double a, t, x, v;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.klayout);
        Button calculate = (Button) findViewById(R.id.KCalc);
        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    tval = (EditText) findViewById(R.id.time);
                    aval = (EditText) findViewById(R.id.accel);
                    vval = (EditText) findViewById(R.id.velocity);
                    xval = (EditText) findViewById(R.id.xpos);
                    if(tval.getText().toString().isEmpty())
                       timeCalc();
                    if(aval.getText().toString().isEmpty())
                        accelCalc();
                    if(vval.getText().toString().isEmpty())
                        velCalc();
                    if(xval.getText().toString().isEmpty())
                        posCalc();
                }catch (Exception e) { }
            }
        });
        Button clear = (Button) findViewById(R.id.Clear);
        clear.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                tval.setText("");
                xval.setText("");
                aval.setText("");
                vval.setText("");
                }
        });
    }
    private void timeCalc() {
        x = Double.parseDouble(xval.getText().toString());
        v = Double.parseDouble(vval.getText().toString());
        a = Double.parseDouble(aval.getText().toString());
    double discrim = Math.pow(v, 2) - (4*(.5*a)*(-1*x));
    double root1 = ((-1*v)+Math.sqrt(discrim)) /(2*(.5*a));
    double root2 = ((-1*v)-Math.sqrt(discrim)) /(2*(.5*a));
        if(root1>0)
            tval.setText(String.valueOf(root1));
        else if(root2>0)
            tval.setText(String.valueOf(root2));
        else
            tval.setText("Error");
    }
    private void accelCalc() {
        x = Double.parseDouble(xval.getText().toString());
        v = Double.parseDouble(vval.getText().toString());
        t = Double.parseDouble(tval.getText().toString());

        a=(2*(x-(v*t)))/Math.pow(t, 2);
        aval.setText(String.valueOf(a));
    }
    private void velCalc() {
        x = Double.parseDouble(xval.getText().toString());
        a = Double.parseDouble(aval.getText().toString());
        t = Double.parseDouble(tval.getText().toString());

        v=(x-(.5*a*Math.pow(t, 2)))/t;
        vval.setText(String.valueOf(v));
    }
    private void posCalc() {
        xval.setText("TEST");
        a = Double.parseDouble(aval.getText().toString());
        v = Double.parseDouble(vval.getText().toString());
        t = Double.parseDouble(tval.getText().toString());

        x=(v*t)+(.5*a*Math.pow(t, 2));
        xval.setText(String.valueOf(x));
    }
}
