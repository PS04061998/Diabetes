package com.example.healthylife;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;

public class login extends AppCompatActivity {

    EditText emailId, password;
    Button btnSignIn;
    FirebaseAuth mFirebaseAuth;
    FirebaseFirestore db = FirebaseFirestore.getInstance();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void btn_registrationform(View view) {
        startActivity(new Intent(getApplicationContext(),registration.class));
        finish();
    }
    public void btn_pageofmenu(View view) {

        mFirebaseAuth = FirebaseAuth.getInstance();
        emailId = findViewById(R.id.emailid);
        password = findViewById(R.id.password);
        btnSignIn = findViewById(R.id.login);
        btnSignIn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                String email = emailId.getText().toString();
                String pwd = password.getText().toString();

                if(email.isEmpty()){
                    emailId.setError("Please enter email id");
                    emailId.requestFocus();
                }else if (!email.matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+")) {
                    Toast.makeText(login.this, "Invalid Email Address", Toast.LENGTH_SHORT).show();
                } else  if(pwd.isEmpty()){
                    password.setError("Please enter your password");
                    password.requestFocus();
                }
                else  if(email.isEmpty() && pwd.isEmpty()){
                    Toast.makeText(login.this,"Fields Are Empty!",Toast.LENGTH_SHORT).show();
                }
                else  if(!(email.isEmpty() && pwd.isEmpty())){
                    mFirebaseAuth.signInWithEmailAndPassword(email, pwd).addOnCompleteListener(login.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if(task.isSuccessful()){
                                Toast.makeText(login.this,"Login Error, Please Login Again",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(login.this,Menu.class );
                                startActivity(intent);
                                finish();
                            }
                            else{
                                Intent intToHome = new Intent(login.this,Menu.class);
                                startActivity(intToHome);
                                emailId.getText().clear();
                                password.getText().clear();
                            }

                        }

                    });
                }
                else{
                    Toast.makeText(login.this,"Error Occurred!",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
