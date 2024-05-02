package com.example.raddiobutton1;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String outputStr = "";

                RadioButton boy = (RadioButton) findViewById(R.id.rdbBoy);
                RadioButton girl = (RadioButton) findViewById(R.id.rdbGirl);
                if (boy.isChecked())
                    outputStr += "男生\n";
                else if (girl.isChecked())
                    outputStr += "女生\n";

                RadioGroup type = (RadioGroup) findViewById(R.id.rgType);
//                switch (type.getCheckedRadioButtonId()) {
//                    case R.id.rdbAdult:
//                        outputStr += "全票\n";
//                        break;
//                    case R.id.rdbChild:
//                        outputStr += "兒童票\n";
//                        break;
//                    case R.id.rdbStudent:
//                        outputStr += "學生票\n";
//                        break;;
//                }
                if(type.getCheckedRadioButtonId() == R.id.rdbAdult)
                    outputStr += "全票\n";
                else if (type.getCheckedRadioButtonId() == R.id.rdbChild)
                    outputStr += "兒童票\n";
                else
                    outputStr += "學生票\n";


                TextView output = (TextView) findViewById(R.id.lblOutput);
                output.setText(outputStr);

            }
        });
    }
}