package com.hez.jobsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class register extends AppCompatActivity {
    private EditText emp_username, emp_email, emp_password, emp_confirm_password;
    private TextView emp_register, emp_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        TextView employee_login = findViewById(R.id.emp_login);

        employee_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(register.this, Login.class);
                startActivity(intent);
            }
        });
    }
}