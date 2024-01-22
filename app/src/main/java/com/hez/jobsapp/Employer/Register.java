package com.hez.jobsapp.Employer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hez.jobsapp.R;

public class Register extends AppCompatActivity {
    private EditText employer_username, employer_email, employer_password, employer_confirmpassword;
    private TextView employer_register, employer_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register2);

        EditText employer_username = findViewById(R.id.employer_username);
        employer_email = findViewById(R.id.employer_email);
        employer_password = findViewById(R.id.employer_password);
        employer_confirmpassword = findViewById(R.id.employer_confirmpassword);
        TextView employer_login = findViewById(R.id.employer_login);

        employer_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Register.this, login_Em.class);
                startActivity(intent);
            }
        });
    }
}