package com.example.healthylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class Diabetes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diabetes);
    }

    public void btn_fasting(View view) {
        startActivity(new Intent(getApplicationContext(),fasting.class));
        finish();
    }

    public void btn_random(View view) {
        startActivity(new Intent(getApplicationContext(),random.class));
        finish();
    }

    public void btn_machine(View view) {
        startActivity(new Intent(getApplicationContext(),machine.class));
        finish();
    }

    public void btn_withoutmachine(View view) {
        startActivity(new Intent(getApplicationContext(),bmi.class));
        finish();
    }

    public void btn_menu(View view) {
        startActivity(new Intent(getApplicationContext(),Menu.class));
        finish();
    }
}
