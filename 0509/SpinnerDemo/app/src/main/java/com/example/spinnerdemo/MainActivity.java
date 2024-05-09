package com.example.spinnerdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btnConFirm = (Button) findViewById(R.id.button);
        btnConFirm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                String[] steaks = getResources().getStringArray(R.array.steaks);
                Spinner sp = (Spinner) findViewById(R.id.spinner);
//                int index = sp.getSelectedItemPosition();
                TextView output = (TextView) findViewById(R.id.lblOutput);
//                output.setText("牛排要" + steaks[index]);
                output.setText("牛排要" + sp.getSelectedItem().toString());
            }
        });
    }
}