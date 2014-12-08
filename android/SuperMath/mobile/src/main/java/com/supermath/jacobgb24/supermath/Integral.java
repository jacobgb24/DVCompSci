package com.supermath.jacobgb24.supermath;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by jacob_000 on 12/5/2014.
 */
public class Integral extends Activity {
    static double Ain, Bin, Cin, ADin, BDin;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ilayout);
        final EditText Aquad = (EditText) findViewById(R.id.Ain);
        final EditText Bquad = (EditText) findViewById(R.id.Bin);
        final EditText Cquad = (EditText) findViewById(R.id.Cin);
        final EditText Adom = (EditText) findViewById(R.id.ADin);
        final EditText Bdom = (EditText) findViewById(R.id.BDin);

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

    private void Math() {
            final int MAX = 100000;
            double sectionB = MAX / BDin, sectionA = MAX / ADin, yb, ya, area = 0;
            for (int i = 0; i < MAX; i++) {
                yb = (Ain * Math.pow(i / sectionB, 2)) + (Bin * i / sectionB) + Cin;
                ya = (Ain * Math.pow(i / sectionA, 2)) + (Bin * i / sectionA) + Cin;
                area += yb / sectionB;
                area -= ya / sectionA;
            }
            DecimalFormat fmt = new DecimalFormat("###,###,###,###,###.###");
            String finArea = fmt.format(area);
            TextView answer = (TextView) findViewById(R.id.Answer);
            answer.setText(String.valueOf(finArea));
            area = 0;
    }
}