package com.example.healthylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class healthytips extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthytips);
    }

    public void btn_back(View view) {
            startActivity(new Intent(getApplicationContext(),Menu.class));
            finish();
    }
}
