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
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.squareup.okhttp.Call;
import com.squareup.okhttp.Callback;
import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

//Main activity class start here
public class bmi extends AppCompatActivity {

    //Define layout
    private RequestQueue requestQueue;

    int age ;
    int glucose ;
    int pressure ;
    float bmiValue ;

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

                        Submit(abc);

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);

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

                        Submit(abc);

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);

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

                        Submit(abc);

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);

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

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);

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

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);

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

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);

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

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);

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

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);

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

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);

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

                        Intent intent = new Intent(bmi.this, BmioutputActivity.class);
                        intent.putExtra("key", abc);
                        startActivity(intent);

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

    public void Submit(String abc) {

        MediaType MEDIA_TYPE = MediaType.parse("application/json");
        String url = "http://127.0.0.1:5000/predict";

        OkHttpClient client = new OkHttpClient();

        JSONObject postdata = new JSONObject();
        try {
            postdata.put("bmiValue", bmiValue);
            postdata.put("Age", age);
            postdata.put("glucose", glucose);
            postdata.put("pressure", pressure);

        } catch(JSONException e){
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        RequestBody body = RequestBody.create(MEDIA_TYPE, postdata.toString());

        Request request = new Request.Builder()
                .url(url)
                .post(body)
                .header("Accept", "application/json")
                .header("Content-Type", "application/json")
                .build();

        client.newCall(request).enqueue(new Callback() {
            @Override
            public void onFailure(Request request, IOException e) {
                String mMessage = e.getMessage().toString();
                Log.w("failure Response", mMessage);
                //call.cancel();

            }

            @Override
            public void onResponse(Response response) throws IOException {
                String mMessage = response.body().string();
                Log.e("failure Start", mMessage);

            }
        });
    }

}








