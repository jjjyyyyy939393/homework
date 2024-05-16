package com.example.menudemo;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        TextView output = (TextView) findViewById(R.id.lblOutput);
        int tmp;
        double result;

        EditText txtTemp = (EditText) findViewById(R.id.txtTemp);
        tmp = Integer.parseInt(txtTemp.getText().toString());

        int itemId = item.getItemId();
        if (itemId == R.id.toF) {
            result = (9.0 * tmp) / 5.0 + 32.0;
            output.setText("華氏溫度：　" + String.format("%.2f",result));
        } else if (itemId == R.id.toC) {
            result = (5.0 / 9.0) * (tmp - 32);
            output.setText("攝氏溫度： " + String.format("%.2f",result));
        }
        return super.onOptionsItemSelected(item);
    }
}