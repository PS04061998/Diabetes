package com.example.healthylife;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
//import com.squareup.okhttp.Request;
//import com.squareup.okhttp.Response;
import com.android.volley.Response;
import com.android.volley.Request;

import java.util.HashMap;
import java.util.Map;

//Main activity class start here
public class bmi extends AppCompatActivity {

    //Define layout

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bmi);

    }
    public void btn_menu(View view) {
        startActivity(new Intent(getApplicationContext(),Menu.class));
        finish();
    }

    public void btn_diabetes(View view) {
        startActivity(new Intent(getApplicationContext(),Diabetes.class));
        finish();
    }

    public void btn_calculate(View view) {

        final EditText e1 = (EditText) findViewById(R.id.et1);
        final EditText e2 = (EditText) findViewById(R.id.et2);
        final EditText e3 = (EditText) findViewById(R.id.et3);
        final EditText e4 = (EditText) findViewById(R.id.et4);
        final EditText e5 = (EditText) findViewById(R.id.et5);
        final EditText e6 = (EditText) findViewById(R.id.et6);
        final RadioGroup radioGroup1 = (RadioGroup)findViewById(R.id.radioGroup1);

        final TextView tv4 = (TextView) findViewById(R.id.tv4);

        final RadioButton male,female;

        male = findViewById(R.id.male);
        female = findViewById(R.id.female);


        findViewById(R.id.ib1).setOnClickListener(new View.OnClickListener() {

            public void onClick(View v)
            {
                // Logic for validation, input can't be empty
                String str1 = e1.getText().toString();
                String str2 = e2.getText().toString();
                String str3 = e3.getText().toString();
                String str4 = e4.getText().toString();
                String str5 = e5.getText().toString();
                String str6 = e6.getText().toString();

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
                if (TextUtils.isEmpty(str3)) {
                    e3.setError("Please enter your Pregnancy");
                    e3.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(str4)) {
                    e4.setError("Please enter your Age");
                    e4.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(str5)) {
                    e5.setError("Please enter your Glucose");
                    e5.requestFocus();
                    return;
                }
                if (TextUtils.isEmpty(str6)) {
                    e6.setError("Please enter your Blood Pressure");
                    e6.requestFocus();
                    return;
                }

                float weight = Float.parseFloat(str1);
                float height = Float.parseFloat(str2) / 100;
                int pregnancy = (int) Float.parseFloat(str3);
                int age = (int) Float.parseFloat(str4);
                int glucose = (int) Float.parseFloat(str5);
                int pressure = (int) Float.parseFloat(str6);

                float bmiValue = (weight / (height * height));

                if  (male.isChecked()) {

                    if (bmiValue < 16) {

                        String abc = "bmiValue :" + bmiValue + "-" +  "Severely underweight\n"+
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure ;

                        Submit(abc,bmiValue,age,glucose,pressure);

                        e1.getText().clear();
                        e2.getText().clear();
                        e3.getText().clear();
                        e4.getText().clear();
                        e5.getText().clear();
                        e6.getText().clear();
                        male.setChecked(false);
                        female.setChecked(false);

                    } else if (bmiValue < 18.5) {

                        String abc = "bmiValue" + "-" + bmiValue + "-" + "Underweight\n" +
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure ;

                        Submit(abc,bmiValue,age,glucose,pressure);

                        e1.getText().clear();
                        e2.getText().clear();
                        e3.getText().clear();
                        e4.getText().clear();
                        e5.getText().clear();
                        e6.getText().clear();
                        male.setChecked(false);
                        female.setChecked(false);

                    } else if (bmiValue < 25) {

                        String abc = "bmiValue" + "-" + bmiValue + "-" + "Normal\n" +
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure ;

                        Submit(abc,bmiValue,age,glucose,pressure);

                        e1.getText().clear();
                        e2.getText().clear();
                        e3.getText().clear();
                        e4.getText().clear();
                        e5.getText().clear();
                        e6.getText().clear();
                        male.setChecked(false);
                        female.setChecked(false);

                    } else if (bmiValue < 30) {

                        String abc = "bmiValue" + "-" + bmiValue + "-" + "Overweight\n"+
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure ;

                        Submit(abc,bmiValue,age,glucose,pressure);

                        e1.getText().clear();
                        e2.getText().clear();
                        e3.getText().clear();
                        e4.getText().clear();
                        e5.getText().clear();
                        e6.getText().clear();
                        male.setChecked(false);
                        female.setChecked(false);

                    } else {

                        String abc = "bmiValue" + "-" + bmiValue + "-" + "Obese\n"+
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure ;

                        Submit(abc,bmiValue,age,glucose,pressure);

                        e1.getText().clear();
                        e2.getText().clear();
                        e3.getText().clear();
                        e4.getText().clear();
                        e5.getText().clear();
                        e6.getText().clear();
                        male.setChecked(false);
                        female.setChecked(false);

                    }
                }else if (female.isChecked()) {

                    if (bmiValue < 16) {

                        String abc = "bmiValue" + "-" + bmiValue + "-" +  "Severely underweight\n"+
                                "Pregnancy :" + pregnancy + "\n"+
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure ;

                        Submit1(abc,bmiValue,pregnancy,age,glucose,pressure);

                        e1.getText().clear();
                        e2.getText().clear();
                        e3.getText().clear();
                        e4.getText().clear();
                        e5.getText().clear();
                        e6.getText().clear();
                        female.setChecked(false);
                        male.setChecked(false);

                    } else if (bmiValue < 18.5) {

                        String abc = "bmiValue" + "-" + bmiValue + "-" + "Underweight\n" +
                                "Pregnancy :" + pregnancy + "\n"+
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure ;

                        Submit1(abc,bmiValue,pregnancy,age,glucose,pressure);

                        e1.getText().clear();
                        e2.getText().clear();
                        e3.getText().clear();
                        e4.getText().clear();
                        e5.getText().clear();
                        e6.getText().clear();
                        female.setChecked(false);
                        male.setChecked(false);

                    } else if (bmiValue < 25) {

                        String abc = "bmiValue" + "-" + bmiValue + "-" + "Normal\n" +
                                "Pregnancy :" + pregnancy + "\n"+
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure ;

                        Submit1(abc,bmiValue,pregnancy,age,glucose,pressure);

                        e1.getText().clear();
                        e2.getText().clear();
                        e3.getText().clear();
                        e4.getText().clear();
                        e5.getText().clear();
                        e6.getText().clear();
                        female.setChecked(false);
                        male.setChecked(false);


                    } else if (bmiValue < 30) {

                        String abc = "bmiValue" + "-" + bmiValue + "-" + "Overweight\n"+
                                "Pregnancy :" + pregnancy + "\n"+
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure ;

                        Submit1(abc,bmiValue,pregnancy,age,glucose,pressure);

                        e1.getText().clear();
                        e2.getText().clear();
                        e3.getText().clear();
                        e4.getText().clear();
                        e5.getText().clear();
                        e6.getText().clear();
                        female.setChecked(false);
                        male.setChecked(false);

                    } else {

                        String abc = "bmiValue" + "-" + bmiValue + "-" + "Obese\n"+
                                "Pregnancy :" + pregnancy + "\n"+
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure ;

                        Submit1(abc,bmiValue,pregnancy,age,glucose,pressure);

                        e1.getText().clear();
                        e2.getText().clear();
                        e3.getText().clear();
                        e4.getText().clear();
                        e5.getText().clear();
                        e6.getText().clear();
                        female.setChecked(false);
                        male.setChecked(false);

                    }
                } else {
                    tv4.setText("Choose Gender valid option");
                }
            }

        });

    }


    public void Submit(String abc, float bmiValue,int age,int glucose,int pressure)
    {

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://192.168.1.4:5000/predict";
        StringRequest postRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        // response
                        String abc = "bmiValue" + "-" + bmiValue + "\n"+
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure + "\n"+
                                response;

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // error
                        Log.e("VOLLEY", error.toString());
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("bmiValue", String.valueOf(bmiValue));
                params.put("pregnancy", "0");
                params.put("age", String.valueOf(age));
                params.put("glucose", String.valueOf(glucose));
                params.put("pressure", String.valueOf(pressure));
                return params;
            }
        };
        queue.add(postRequest);
    }

    public void Submit1(String abc, float bmiValue, int pregnancy , int age, int glucose, int pressure )
    {

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://192.168.1.4:5000/predict";
        StringRequest postRequest = new StringRequest(Request.Method.POST, url,
                new Response.Listener<String>()
                {
                    @Override
                    public void onResponse(String response) {
                        // response
                        String abc = "bmiValue" + "-" + bmiValue + "\n"+
                                "Pregnancy :" + pregnancy + "\n"+
                                "Age :" + age + "\n"+
                                "Glucose :" + glucose + "\n"+
                                "Pressure :" + pressure + "\n"+
                                response;

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);
                    }
                },
                new Response.ErrorListener()
                {
                    @Override
                    public void onErrorResponse(VolleyError error) {
                        // error
                        Log.e("VOLLEY", error.toString());
                    }
                }
        ) {
            @Override
            protected Map<String, String> getParams()
            {
                Map<String, String>  params = new HashMap<String, String>();
                params.put("bmiValue", String.valueOf(bmiValue));
                params.put("pregnancy", String.valueOf(pregnancy));
                params.put("age", String.valueOf(age));
                params.put("glucose", String.valueOf(glucose));
                params.put("pressure", String.valueOf(pressure));
                return params;
            }
        };
        queue.add(postRequest);
    }

}









