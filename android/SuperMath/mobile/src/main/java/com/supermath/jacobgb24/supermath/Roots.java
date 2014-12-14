package com.supermath.jacobgb24.supermath;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import java.text.DecimalFormat;

/**
 * Created by jacob_000 on 12/5/2014.
 */
public class Roots extends ActionBarActivity{
    static EditText Aco, Bco, Cco;
    static double A, B, C;
    static boolean i;
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rlayout);
        final EditText Aco = (EditText) findViewById(R.id.Aco);
        final EditText Bco = (EditText) findViewById(R.id.Bco);
        final EditText Cco = (EditText) findViewById(R.id.Cco);
        PreferenceManager.setDefaultValues(this, R.xml.preferences, true);
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        i = prefs.getBoolean("PREF_SHOW_I", true);
        Button calc = (Button) findViewById(R.id.rootgo);
        calc.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                try {
                    A = Double.parseDouble(Aco.getText().toString());
                    B = Double.parseDouble(Bco.getText().toString());
                    C = Double.parseDouble(Cco.getText().toString());
                    Math();
                }catch (Exception e) { }
            }
        });
    }
    private void Math(){
        DecimalFormat fmt = new DecimalFormat("###.###");
        double discrim = Math.pow(B, 2) - (4*A*C);
        double root1, root2;
        TextView R2 = (TextView) findViewById(R.id.R2ans);
        TextView R1 = (TextView) findViewById(R.id.R1ans);
        if(discrim>=0) {
            root1 = ((-1 * B) + Math.sqrt(discrim)) / (2 * A);
            root2 = ((-1 * B) - Math.sqrt(discrim)) / (2 * A);
            R1.setText(String.valueOf(fmt.format(root1)));
            R2.setText(String.valueOf(fmt.format(root2)));
        }
        else if(discrim<0 && i){
            discrim=discrim*-1;
            String r1str = "-"+B+"+"+fmt.format(Math.sqrt(discrim))+"i";
            R1.setText(r1str);
            String r2str = "-"+B+"-"+fmt.format(Math.sqrt(discrim))+"i";
            R2.setText(r2str);
        }
        else if(discrim<0 && !i){
            R1.setText("No real roots");
            R2.setText("No real roots");
        }
    }

}
