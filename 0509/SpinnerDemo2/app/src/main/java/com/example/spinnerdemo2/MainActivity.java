package com.example.spinnerdemo2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import javax.xml.parsers.SAXParser;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {

    private EditText opd1, opd2;

    private TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        opd1 = (EditText) findViewById(R.id.txtOpd1);
        opd1.setText("100");
        opd2 = (EditText) findViewById(R.id.txtOpd2);
        opd2.setText("50");
        output = (TextView) findViewById(R.id.lblOutput);
        Spinner sp = (Spinner) findViewById(R.id.spinner);
        sp.setOnItemClickListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        int v1, v2;
        double r = 0.0;
        try {
            v1 = Integer.parseInt(opd1.getText().toString());
            v2 = Integer.parseInt(opd2.getText().toString());
            switch (position) {
                case 0:
                    r = v1 + v2;
                    break;
                case 1:
                    r = v1 - v2;
                    break;
                case 2:
                    r = v1 * v2;
                    break;
                case 3:
                    if (v2 == 0) {
                        throw new ArithmeticException();
                    }
                    r = (double) v1 / v2;
                    break;
            }
            output.setText("運算結果" + String.format("%.2f", r));
        } catch (NumberFormatException e) {
            output.setText("輸入數字");
            return;
        } catch (ArithmeticException e) {
            output.setText("除數不可為0");
            return;
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent){

    }
}