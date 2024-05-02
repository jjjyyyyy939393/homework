package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    private TextView txvshow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txvshow = (TextView) findViewById(R.id.txvshow);
        txvshow.setTextSize(36);
        Button btnCalc = (Button) findViewById(R.id.btnCalc);
        Button btnClear = (Button) findViewById(R.id.btnClear);
        btnCalc.setOnClickListener(this);
        btnClear.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        EditText edtHeight = (EditText) findViewById(R.id.edtHeight);
        EditText edtWeight = (EditText) findViewById(R.id.edtWeight);

        if (v.getId() == R.id.btnCalc) {
            double height = Double.parseDouble(edtHeight.getText().toString());
            double weight = Double.parseDouble(edtWeight.getText().toString());
            double bmi = weight / Math.pow(height/100.0 , 2);
            if(bmi >= 24)
                txvshow.setTextColor(Color.RED);
            else if (bmi < 18.5)
                txvshow.setTextColor(Color.BLUE);
            else
                txvshow.setTextColor(Color.GREEN);

            txvshow.setText(String.format("%.2f" , bmi));
        }
        else {
            edtHeight.setText("0");
            edtWeight.setText("0");
            txvshow.setText("");
        }
    }
}