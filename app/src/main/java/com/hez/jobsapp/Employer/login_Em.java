package com.hez.jobsapp.Employer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.hez.jobsapp.R;

public class login_Em extends AppCompatActivity {
    private EditText employer_username, employer_password;

    private  TextView employermain_register, employermain_login;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_em);
        employermain_register = findViewById(R.id.employermain_register);
        employermain_login = findViewById(R.id.emloyermain_login);

        employermain_register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(login_Em.this, Register.class);
                startActivity(intent);
            }
        });

    }
}