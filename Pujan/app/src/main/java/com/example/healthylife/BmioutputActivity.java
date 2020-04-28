package com.example.healthylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class BmioutputActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmioutput);

        final TextView tv4 = (TextView) findViewById(R.id.tv4);

        String value = getIntent().getStringExtra("key");

        tv4.setText(value);



    }

    public void btn_menu(View view) {
        startActivity(new Intent(getApplicationContext(), Menu.class));
        finish();
    }

    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(), Diabetes.class));
        finish();
    }

    public void btn_back1(View view) {
        startActivity(new Intent(getApplicationContext(), bmi.class));
        finish();
    }
}
