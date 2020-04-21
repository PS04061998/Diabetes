package com.example.healthylife;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Calorielevel extends AppCompatActivity {

    Float Calorie;
    EditText temp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calorielevel);
    }

    public void btn_menu(View view) {
        startActivity(new Intent(getApplicationContext(), Menu.class));
        finish();
    }

    public void btn_calories(View view) {

        final Spinner Spinner = (Spinner) findViewById(R.id.spinner1);
        final int index = Spinner.getSelectedItemPosition() + 1;

        final EditText age1 = (EditText) findViewById(R.id.et1);
        final EditText e1 = (EditText) findViewById(R.id.et2);
        final EditText e2 = (EditText) findViewById(R.id.et3);
        final TextView tv4 = (TextView) findViewById(R.id.tv4);

        final RadioButton male, female, q1, q2, q3;

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);
        q1 = findViewById(R.id.q1);
        q2 = findViewById(R.id.q2);
        q3 = findViewById(R.id.q3);

        findViewById(R.id.ib1).setOnClickListener(new View.OnClickListener() {

            // Logic for validation, input can't be empty
            @Override
            public void onClick(View v) {

                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();
                String age2 = age1.getText().toString();

                if (TextUtils.isEmpty(str2)) {
                    e2.setError("Please enter your weight");
                    e2.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(str1)) {
                    e1.setError("Please enter your height");
                    e1.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(age2)) {
                    age1.setError("Please enter your Age");
                    age1.requestFocus();
                    return;
                }

                final int age = Integer.parseInt(age2);
                final float height = Float.parseFloat(str1);
                final float weight = Float.parseFloat(str2);


//Get the user values from the widget reference
                if (q1.isChecked()) {
                    if (male.isChecked()) {
                        Float v4 = (10 * weight);
                        Float v2 = (float) (6.25 * height);
                        Float v3 = (float) (5 * age);
                        Float v1 = v4 + v2 - v3 + 5;

                        if (index == 1) {
                            tv4.setText("Choose one Workout Intensity option");
                        } else if (index == 2) {

                            Calorie = (float) (v1 * 1.2);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 3) {

                            Calorie = (float) (v1 * 1.4);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 4) {

                            Calorie = (float) (v1 * 1.6);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 5) {

                            Calorie = (float) (v1 * 1.75);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 6) {

                            Calorie = (float) (v1 * 2);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 7) {

                            Calorie = (float) (v1 * 2.3);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else {
                            tv4.setText("Choose valid Workout Intensity option");
                        }
                    } else if (female.isChecked()) {
                        float v4 = (10 * weight);
                        float v2 = (float) (6.25 * height);
                        int v3 = (5 * age);
                        float v1 = v4 + v2 - v3 - 161;

                        if (index == 1) {
                            tv4.setText("Choose one Workout Intensity option");
                        } else if (index == 2) {

                            Calorie = (float) (v1 * 1.2);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 3) {

                            Calorie = (float) (v1 * 1.4);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 4) {

                            Calorie = (float) (v1 * 1.6);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 5) {

                            Calorie = (float) (v1 * 1.75);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 6) {

                            Calorie = (float) (v1 * 2);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 7) {

                            Calorie = (float) (v1 * 2.3);

                            Float a1 = (float) ((Calorie / 100) * 32.5);
                            Float a2 = (Calorie / 100) * 30;
                            Float a3 = (Calorie / 100) * 35;
                            Float a4 = (float) ((Calorie / 100) * 37.5);
                            Float a5 = (Calorie / 100) * 35;
                            Float a6 = (Calorie / 100) * 40;
                            Float a7 = (Calorie / 100) * 30;
                            Float a8 = (Calorie / 100) * 25;
                            Float a9 = (Calorie / 100) * 35;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + a1 + "-cal/day min : " + a2 + "-cal/day max : " + a3 + "-cal/day\n"+
                                    "Lunch :" + a4 + "-cal/day min : " + a5 + "-cal/day max : " + a6 + "-cal/day\n"+
                                    "Dinner :" + a7 + "-cal/day min : " + a8 + "-cal/day max : " + a9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else {
                            tv4.setText("Choose valid Workout Intensity option");
                        }
                    } else {
                        tv4.setText("Choose Gender valid option");
                    }
                } else if (q2.isChecked()) {
                    if (male.isChecked()) {
                        Float v4 = (10 * weight);
                        Float v2 = (float) (6.25 * height);
                        Float v3 = (float) (5 * age);
                        Float v1 = v4 + v2 - v3 + 5;

                        if (index == 1) {
                            tv4.setText("Choose one Workout Intensity option");
                        } else if (index == 2) {

                            Calorie = (float) (v1 * 1.2);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 3) {

                            Calorie = (float) (v1 * 1.4);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 4) {

                            Calorie = (float) (v1 * 1.6);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 5) {

                            Calorie = (float) (v1 * 1.75);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 6) {

                            Calorie = (float) (v1 * 2);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 7) {

                            Calorie = (float) (v1 * 2.3);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else {
                            tv4.setText("Choose valid Workout Intensity option");
                        }
                    } else if (female.isChecked()) {
                        float v4 = (10 * weight);
                        float v2 = (float) (6.25 * height);
                        int v3 = (5 * age);
                        float v1 = v4 + v2 - v3 - 161;

                        if (index == 1) {
                            tv4.setText("Choose one Workout Intensity option");
                        } else if (index == 2) {

                            Calorie = (float) (v1 * 1.2);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 3) {

                            Calorie = (float) (v1 * 1.4);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 4) {

                            Calorie = (float) (v1 * 1.6);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 5) {

                            Calorie = (float) (v1 * 1.75);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 6) {

                            Calorie = (float) (v1 * 2);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 7) {

                            Calorie = (float) (v1 * 2.3);

                            Float b1 = (float) ((Calorie / 100) * 27.5);
                            Float b2 = (Calorie / 100) * 25;
                            Float b3 = (Calorie / 100) * 30;
                            Float b4 = (float) ((Calorie / 100) * 37.5);
                            Float b5 = (Calorie / 100) * 35;
                            Float b6 = (Calorie / 100) * 40;
                            Float b7 = (float) ((Calorie / 100) * 27.5);
                            Float b8 = (Calorie / 100) * 25;
                            Float b9 = (Calorie / 100) * 30;
                            Float b10 = (float) ((Calorie / 100) * 7.5);
                            Float b11 = (Calorie / 100) * 5;
                            Float b12 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + b1 + "-cal/day min : " + b2 + "-cal/day max : " + b3 + "-cal/day\n"+
                                    "Morning / Afternoon snack : " + b10 + "-cal/day min : " + b11 + "-cal/day max : " + b12 + "-cal/day\n" +
                                    "Lunch :" + b4 + "-cal/day min : " + b5 + "-cal/day max : " + b6 + "-cal/day\n"+
                                    "Dinner :" + b7 + "-cal/day min : " + b8 + "-cal/day max : " + b9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else {
                            tv4.setText("Choose valid Workout Intensity option");
                        }
                    } else {
                        tv4.setText("Choose Gender valid option");
                    }
                } else if (q3.isChecked()) {
                    if (male.isChecked()) {
                        Float v4 = (10 * weight);
                        Float v2 = (float) (6.25 * height);
                        Float v3 = (float) (5 * age);
                        Float v1 = v4 + v2 - v3 + 5;
                        if (index == 1) {
                            tv4.setText("Choose one Workout Intensity option");
                        } else if (index == 2) {

                            Calorie = (float) (v1 * 1.2);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 3) {

                            Calorie = (float) (v1 * 1.4);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 4) {

                            Calorie = (float) (v1 * 1.6);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 5) {

                            Calorie = (float) (v1 * 1.75);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 6) {

                            Calorie = (float) (v1 * 2);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 7) {

                            Calorie = (float) (v1 * 2.3);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else {
                            tv4.setText("Choose valid Workout Intensity option");
                        }
                    } else if (female.isChecked()) {
                        float v4 = (10 * weight);
                        float v2 = (float) (6.25 * height);
                        int v3 = (5 * age);
                        float v1 = v4 + v2 - v3 - 161;

                        if (index == 1) {
                            tv4.setText("Choose one Workout Intensity option");
                        } else if (index == 2) {

                            Calorie = (float) (v1 * 1.2);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 3) {

                            Calorie = (float) (v1 * 1.4);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 4) {

                            Calorie = (float) (v1 * 1.6);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 5) {

                            Calorie = (float) (v1 * 1.75);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 6) {

                            Calorie = (float) (v1 * 2);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else if (index == 7) {

                            Calorie = (float) (v1 * 2.3);

                            Float c1 = (float) ((Calorie / 100) * 27.5);
                            Float c2 = (Calorie / 100) * 25;
                            Float c3 = (Calorie / 100) * 30;
                            Float c4 = (float) ((Calorie / 100) * 37.5);
                            Float c5 = (Calorie / 100) * 35;
                            Float c6 = (Calorie / 100) * 40;
                            Float c7 = (float) ((Calorie / 100) * 17.5);
                            Float c8 = (Calorie / 100) * 15;
                            Float c9 = (Calorie / 100) * 20;
                            Float c10 = (float) ((Calorie / 100) * 7.5);
                            Float c11 = (Calorie / 100) * 5;
                            Float c12 = (Calorie / 100) * 10;
                            Float c13 = (float) ((Calorie / 100) * 7.5);
                            Float c14 = (Calorie / 100) * 5;
                            Float c15 = (Calorie / 100) * 10;

                            int v5 = (int) ((Calorie / 100) * 85.9);
                            int v6 = (int) ((Calorie / 100) * 71.8);
                            int v7 = (int) ((Calorie / 100) * 43.6);
                            int v8 = (int) ((Calorie / 100) * 114.07);
                            int v9 = (int) ((Calorie / 100) * 128.1);
                            int v10 = (int) ((Calorie / 100) * 156.3);

                            String abc ="To Maintain weight you reqired :" + Calorie + "-cal/day\n"+
                                    "MWL : " + v5 + "-cal/day WL : " + v6 + "-cal/day EWL : " + v7 + "-cal/day\n"+
                                    "MWG : " + v8 + "-cal/day WG : " + v9 + "-cal/day FWG : " + v10 + "-cal/day\n"+
                                    "Breakfast : " + c1 + "-cal/day min : " + c2 + "-cal/day max : " + c3 + "-cal/day\n"+
                                    "Morning snack : " + c10 + "-cal/day min : " + c11 + "-cal/day max : " + c12 + "-cal/day\n"+
                                    "Lunch :" + c4 + "-cal/day min : " + c5 + "-cal/day max : " + c6 + "-cal/day\n"+
                                    "Afternoon snack : " + c13 + "-cal/day min : " + c14 + "-cal/day max : " + c15 + "-cal/day\n"+
                                    "Dinner :" + c7 + "-cal/day min : " + c8 + "-cal/day max : " + c9+ "-cal/day";

                            Intent intent = new Intent(Calorielevel.this, Output.class);
                            intent.putExtra("key", abc);
                            startActivity(intent);

                            e1.getText().clear();
                            e2.getText().clear();
                            age1.getText().clear();
                            q1.setChecked(false);
                            q2.setChecked(false);
                            q3.setChecked(false);
                            male.setChecked(false);
                            female.setChecked(false);
                            Spinner.setSelection(0);

                        } else {
                            tv4.setText("Choose valid Workout Intensity option");
                        }
                    } else {
                        tv4.setText("Choose Gender valid option");
                    }
                } else {
                    tv4.setText("Choose Meal/day valid option");
                }
            }
        });
    }
}
