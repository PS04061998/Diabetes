package com.example.healthylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class machine extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_machine);
    }
    public void btn_back(View view) {
        startActivity(new Intent(getApplicationContext(),Diabetes.class));
        finish();
    }

    public void btn_menu(View view) {
        startActivity(new Intent(getApplicationContext(),Menu.class));
        finish();
    }

    public void btn_checkresult(View view) {

        final TextView tv4 = (TextView) findViewById(R.id.tv4);

        RadioButton low,moderate,vigorous;

        low = findViewById(R.id.radio0);
        moderate = findViewById(R.id.radio1);
        vigorous = findViewById(R.id.radio2);

        if(low.isChecked()) {
            tv4.setText("According to research and study \n Your blood glucose level is within normal limits and you do not have diabetes at present");

            low .setChecked(false);
            moderate.setChecked(false);
            vigorous.setChecked(false);

        }
        else if (moderate.isChecked()) {
            tv4.setText("According to research and study \n Your blood glucose level is above normal and this is seen in pre-diabetes");

            low .setChecked(false);
            moderate.setChecked(false);
            vigorous.setChecked(false);

        }

        else if(vigorous.isChecked()) {
            tv4.setText("According to research and study \n You have higher level of fasting blood glucose which indicates that the possibility for you to have diabetes is more");

            low .setChecked(false);
            moderate.setChecked(false);
            vigorous.setChecked(false);

        }
        else{
            tv4.setText("Please Select One Option");
        }
    }
}
