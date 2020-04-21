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
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class registration extends AppCompatActivity {

    FirebaseFirestore db = FirebaseFirestore.getInstance();
    EditText Name, Email_ID, Password, Confirm_Password;
    Button btn_register;
    FirebaseAuth mfirebaseauth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);

    }

    public void btn_loginform(View view) {

        mfirebaseauth = FirebaseAuth.getInstance();
        Name = findViewById(R.id.name);
        Email_ID = findViewById(R.id.emailid);
        Password = findViewById(R.id.password);
        Confirm_Password = findViewById(R.id.confirm_password);

        // find the radiobutton by returned id
        btn_register = findViewById(R.id.login);
        btn_register.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                final String name = Name.getText().toString();
                final String email = Email_ID.getText().toString();
                final String password = Password.getText().toString();
                final String confirmPassword = Confirm_Password.getText().toString();

                if (email.isEmpty()) {
                    Email_ID.setError("Please enter email id");
                    Email_ID.requestFocus();
                } else if (!email.matches("[a-zA-Z0-9._-]+@[a-z]+.[a-z]+")) {
                    Toast.makeText(registration.this, "Invalid Email Address", Toast.LENGTH_SHORT).show();
                }else if (name.isEmpty()) {
                    Name.setError("Please enter your name");
                    Name.requestFocus();
                } else if (confirmPassword.isEmpty()) {
                    Confirm_Password.setError("Please enter your confirm password");
                    Confirm_Password.requestFocus();
                } else if (password.isEmpty()) {
                    Password.setError("Please enter your password");
                    Password.requestFocus();
                } else if (email.isEmpty() && password.isEmpty()) {
                    Toast.makeText(registration.this, "Fields Are Empty!", Toast.LENGTH_SHORT).show();
                } else if (!confirmPassword.equals(password)) {
                    Toast.makeText(registration.this, "Password do not match", Toast.LENGTH_SHORT).show();
                } else {
                    mfirebaseauth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(registration.this, new OnCompleteListener<AuthResult>() {
                        @Override
                        public void onComplete(@NonNull Task<AuthResult> task) {
                            if (!(task.isSuccessful())) {

                                Map<String, Object> user = new HashMap<>();

                                user.put("Name", name);
                                user.put("Email_ID", email);
                                user.put("Password", password);
                                user.put("Confirm_Password", confirmPassword);

                                // Add a new document with a generated ID
                                Task<DocumentReference> documentReferenceTask = db.collection("users")
                                        .add(user)
                                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                            @Override
                                            public void onSuccess(DocumentReference documentReference) {
//                        Log.d( "DocumentSnapshot added with ID: " + documentReference.getId());
                                                System.out.println("success");
                                            }
                                        })
                                        .addOnFailureListener(new OnFailureListener() {
                                            @Override
                                            public void onFailure(@NonNull Exception e) {
                                                //       Log.w( "Error adding document", e);
                                                System.out.println("fail");
                                            }
                                        });
                                Toast.makeText(registration.this, "SignUp successful", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(registration.this, login.class)); // After Register PAge
                            } else {
                                Toast.makeText(registration.this, "Please Try Again", Toast.LENGTH_SHORT).show();
                                startActivity(new Intent(registration.this, registration.class)); // After Register PAge

                            }
                        }
                    });
                }
            }
        });
    }

    public void btn_login(View view) {
        startActivity(new Intent(getApplicationContext(),login.class));
        finish();
    }
}