package com.example.healthylife;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class bloodvolume extends AppCompatActivity {

    Float bd,w,h;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bloodvolume);
    }

    public void btn_menu(View view) {
        startActivity(new Intent(getApplicationContext(),Menu.class));
        finish();
    }

    public void btn_bloodresult(View view) {

        final EditText e1 = (EditText) findViewById(R.id.et1);
        final EditText e2 = (EditText) findViewById(R.id.et2);
        final TextView tv4 = (TextView) findViewById(R.id.tv4);

        final RadioButton male,female;

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);

        findViewById(R.id.ib1).setOnClickListener(new View.OnClickListener() {

            // Logic for validation, input can't be empty
            @Override
            public void onClick(View v) {

                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();

                if (TextUtils.isEmpty(str1)) {
                    e1.setError("Please enter your weight");
                    e1.requestFocus();
                    return;
                }

                if (TextUtils.isEmpty(str2)) {
                    e2.setError("Please enter your height");
                    e2.requestFocus();
                    return;
                }

                final int weight = Integer.parseInt(str1);
                final int height = Integer.parseInt(str2);

                final float h = (float) (height * 0.393701);
                final float w = (float) (weight * 2.20462);



//Get the user values from the widget reference
                if (male.isChecked()) {

                    bd =(float)  ((0.006012 * Math.pow(h , 3))  + (w * 14.6) + 604);
                    tv4.setText(String.valueOf("According to research and study Your blood Volume is \n" + bd + "-milliliters"));
                    e1.getText().clear();
                    e2.getText().clear();
                    male.setChecked(false);
                    female.setChecked(false);
                }
                else if (female.isChecked()) {

                    bd = (float) ((0.005835 * Math.pow(h , 3)) + (15 * w) + 183);
                    tv4.setText(String.valueOf("According to research and study Your blood Volume is \n" + bd + "-milliliters" ));
                    e1.getText().clear();
                    e2.getText().clear();
                    male.setChecked(false);
                    female.setChecked(false);
                }
                else {
                    tv4.setText("Choose Gender valid option");
                }

            }
        });
    }
}