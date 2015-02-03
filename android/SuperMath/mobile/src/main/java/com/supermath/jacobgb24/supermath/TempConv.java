package com.supermath.jacobgb24.supermath;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by jacob_000 on 1/16/2015.
 */
public class TempConv  extends ActionBarActivity {
    private RadioGroup direction;
    private static String unit;
    private static double numin, numout;
    private static EditText num;
    private static Button go;
    private static TextView answer;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tclayout);
        direction = (RadioGroup) findViewById(R.id.tcChoice);
        go = (Button) findViewById(R.id.tcbutton);
        num = (EditText) findViewById(R.id.tceditText);
        Math();
    }

    public void Math() {
        direction.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                if (checkedId == R.id.tcradioButtonC) //checking which radio button
                    Fmath();
                else if (checkedId == R.id.tcradioButtonF)
                    Cmath();
            }

        });
    }
    public void Fmath(){ //converts c to f
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    numin = Double.parseDouble(num.getText().toString());
                    numout = (numin*9)/5+32;
                    unit="F";
                    print();
                }catch(Exception e) { }
            }
        });
    }
    public void Cmath(){ //converts f to c
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    numin = Double.parseDouble(num.getText().toString());
                    numout = (numin-32)*5/9;
                    unit="C";
                    print();
                }catch(Exception e) { }
            }
        });
    }
    public void print(){ //sets formatted answer
            DecimalFormat fmt = new DecimalFormat("########.###");
            String format = fmt.format(numout);
            answer = (TextView) findViewById(R.id.tcout);
            answer.setText(format+unit);
            numout = 0;
    }
}
