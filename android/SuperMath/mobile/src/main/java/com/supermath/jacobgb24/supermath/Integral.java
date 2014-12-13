package com.supermath.jacobgb24.supermath;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by jacob_000 on 12/5/2014.
 */
public class Integral extends ActionBarActivity {
    static double Ain, Bin, Cin, ADin, BDin;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ilayout);
        final EditText Aquad = (EditText) findViewById(R.id.Ain);
        final EditText Bquad = (EditText) findViewById(R.id.Bin);
        final EditText Cquad = (EditText) findViewById(R.id.Cin);
        final EditText Adom = (EditText) findViewById(R.id.ADin);
        final EditText Bdom = (EditText) findViewById(R.id.BDin);
        //handles button click, gets vars then calls math
        Button calculate = (Button) findViewById(R.id.Calculate);
        calculate.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    Ain = Double.parseDouble(Aquad.getText().toString());
                    Bin = Double.parseDouble(Bquad.getText().toString());
                    Cin = Double.parseDouble(Cquad.getText().toString());
                    ADin = Double.parseDouble(Adom.getText().toString());
                    BDin = Double.parseDouble(Bdom.getText().toString());
                    Math();
                }catch (Exception e) { }
            }
        });
    }
    //finds integral using fund thm
    private void Math() {
            double fb, fa, area = 0;
                fb = (Ain/3 * Math.pow(BDin, 3)) + (Bin/2 * Math.pow(BDin, 2)) + Cin*BDin;
                fa = (Ain/3 * Math.pow(ADin, 3)) + (Bin/2 * Math.pow(ADin, 2)) + Cin*ADin;
                area=fb-fa;
            DecimalFormat fmt = new DecimalFormat("###,###,###,###,###.###");
            String finArea = fmt.format(area);
            TextView answer = (TextView) findViewById(R.id.Answer);
            answer.setText(String.valueOf(finArea));
            area = 0;
    }
}