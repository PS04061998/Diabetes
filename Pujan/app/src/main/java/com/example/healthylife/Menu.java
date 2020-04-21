package com.example.healthylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.auth.FirebaseAuth;

public class Menu extends AppCompatActivity {

    Button btnLogout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

    }

    public void heartbeat(View view) {
        startActivity(new Intent(getApplicationContext(),heartrate.class));
        finish();
    }

    public void btn_Calorielevel(View view) {
        startActivity(new Intent(getApplicationContext(),Calorielevel.class));
        finish();
    }

    public void btn_bloodvolume(View view) {
        startActivity(new Intent(getApplicationContext(),bloodvolume.class));
        finish();
    }

    public void btn_healthytips(View view) {
        startActivity(new Intent(getApplicationContext(),healthytips.class));
        finish();
    }

    public void btn_diabetes(View view) {
        startActivity(new Intent(getApplicationContext(),Diabetes.class));
        finish();
    }

    public void btn_logout(View view) {
            btnLogout = (Button) findViewById(R.id.buttonLogout);

            btnLogout.setOnClickListener(v -> {
                FirebaseAuth.getInstance().signOut();
                Intent intent = new Intent(getApplicationContext(),login.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP | Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                finish();
            });
        }
}


