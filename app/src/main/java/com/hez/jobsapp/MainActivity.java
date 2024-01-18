 package com.hez.jobsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.hez.jobsapp.Employer.Register;

 public class MainActivity extends AppCompatActivity {
    private TextView findajob, postajob;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView findajob = findViewById(R.id.seekajob);
        TextView postajob = findViewById(R.id.postajob);
         findajob.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this, register.class);
                 startActivity(intent);
             }
         });
         postajob.setOnClickListener(new View.OnClickListener() {
             @Override
             public void onClick(View view) {
                 Intent intent = new Intent(MainActivity.this, Register.class);
                 startActivity(intent);
             }
         });
    }
}