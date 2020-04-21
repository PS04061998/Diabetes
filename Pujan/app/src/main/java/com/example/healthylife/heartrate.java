package com.example.healthylife;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class heartrate extends AppCompatActivity {

    Float MaxHR, HRR , TR1, Low1, TR2, High1,Reserve;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_heartrate);
    }

    public void btn_menu(View view) {
        startActivity(new Intent(getApplicationContext(),Menu.class));
        finish();
    }

    public void workout(View view) {

        final Spinner Spinner = (Spinner) findViewById(R.id.spinner1);
        final int index = Spinner.getSelectedItemPosition() + 1 ;

        final EditText heart1 = (EditText) findViewById(R.id.et2);
        final EditText age1 = (EditText) findViewById(R.id.et1);
        final TextView textview = (TextView) findViewById(R.id.tv4);
        final TextView textview1 = (TextView) findViewById(R.id.tv7);
        final TextView textview2 = (TextView) findViewById(R.id.tv9);
        final TextView textview3 = (TextView) findViewById(R.id.tv10);



        findViewById(R.id.ib1).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String heart2 = heart1.getText().toString();
                String age2 = age1.getText().toString();

                if(TextUtils.isEmpty(heart2)){
                    heart1.setError("Please enter your Heart Rate");
                    heart1.requestFocus();
                    return;
                }

                if(TextUtils.isEmpty(age2)){
                    age1.setError("Please enter your Age");
                    age1.requestFocus();
                    return;
                }

                final int heart = Integer.parseInt(heart2);
                final int age = Integer.parseInt(age2);


                if (index == 1) {
                    textview.setText("Choose one Workout Intensity option");
                } else if (index == 2) {
                    MaxHR = (float) (206.9 - (0.67 * age));
                    HRR = MaxHR - heart;
                    TR1 = (float) (HRR * 0.5);
                    Low1 = TR1 + heart;
                    TR2 = (float) (HRR * 0.6);
                    High1 = TR2 + heart;
                    Reserve = MaxHR - heart;

                    String st = String.valueOf(Low1);
                    String st1 = String.valueOf(High1);
                    String st14 = String.valueOf(MaxHR);
                    String st15 = String.valueOf(Reserve);

                    textview2.setText("Your Max Heart Rate is :" + st14 + "-bpm");
                    textview3.setText("Your Reserve Heart Rate is :" + st15 + "-bpm");
                    textview.setText("Your Low Resting Heart Rate is :" + st + "-bpm");
                    textview1.setText("Your High Resting Heart Rate is :" + st1 + "-bpm");

                    heart1.getText().clear();
                    age1.getText().clear();
                    Spinner.setSelection(0);

                } else if (index == 3) {
                    MaxHR = (float) (206.9 - (0.67 * age));
                    HRR = MaxHR - heart;
                    TR1 = (float) (HRR * 0.6);
                    Low1 = TR1 + heart;
                    TR2 = (float) (HRR * 0.7);
                    High1 = TR2 + heart;
                    Reserve = MaxHR - heart;

                    String st2 = String.valueOf(Low1);
                    String st3 = String.valueOf(High1);
                    String st12 = String.valueOf(MaxHR);
                    String st16 = String.valueOf(Reserve);

                    textview2.setText("Your Max Heart Rate is :" + st12 + "-bpm");
                    textview3.setText("Your Reserve Heart Rate is :" + st16 + "-bpm");
                    textview.setText("Your Low Resting Heart Rate is :" + st2 + "-bpm");
                    textview1.setText("Your High Resting Heart Rate is :" + st3 + "-bpm");

                    heart1.getText().clear();
                    age1.getText().clear();
                    Spinner.setSelection(0);

                } else if (index == 4) {
                    MaxHR = (float) (206.9 - (0.67 * age));
                    HRR = MaxHR - heart;
                    TR1 = (float) (HRR * 0.75);
                    Low1 = TR1 + heart;
                    TR2 = (float) (HRR * 0.85);
                    High1 = TR2 + heart;
                    Reserve = MaxHR - heart;

                    String st4 = String.valueOf(Low1);
                    String st5 = String.valueOf(High1);
                    String st13 = String.valueOf(MaxHR);
                    String st17 = String.valueOf(Reserve);

                    textview2.setText("Your Max Heart Rate is :" + st13 + "-bpm");
                    textview3.setText("Your Reserve Heart Rate is :" + st17 + "-bpm");
                    textview.setText("Your Low Resting Heart Rate is :" + st4 + "-bpm");
                    textview1.setText("Your High Resting Heart Rate is :" + st5 + "-bpm");

                    heart1.getText().clear();
                    age1.getText().clear();
                    Spinner.setSelection(0);

                } else {
                    textview.setText("Choose valid Workout Intensity option");
                }

            }
        });
    }
}
