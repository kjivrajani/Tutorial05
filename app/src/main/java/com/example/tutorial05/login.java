package com.example.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class login extends AppCompatActivity {
         TextView textName,textLasName,txtemail,txtpass,txtcity,txtstuts,txtbranch,txtGender;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
       textName = findViewById(R.id.textName);
       textLasName = findViewById(R.id.textLasName);
        txtemail=findViewById(R.id.txtemail);
        txtpass = findViewById(R.id.txtpass);
        txtcity = findViewById(R.id.txtcity);
        txtstuts = findViewById(R.id.txtstuts);
        txtbranch = findViewById(R.id.txtbranch);
        txtGender = findViewById(R.id.txtGender);

        Bundle bundle = getIntent().getExtras();
        String Fname = bundle.getString("Fname");
        String Lname = bundle.getString("Lname");
        String Email = bundle.getString("Email");
        String password = bundle.getString("password");
        String countries = bundle.getString("countries");
        String status = bundle.getString("status");
        String Branch = bundle.getString("Branch");
        String Gender = bundle.getString("Gender");

        textName.setText("First Name : " + Fname);
        textLasName.setText("Last Name : " + Lname);
        txtemail.setText("Email : " + Email);
        txtpass.setText("Password : " + password);
        txtcity.setText("City : " + countries);
        txtstuts.setText("Status : " + status);
        txtbranch.setText("Branch : " + Branch);
        txtGender.setText("Gender : " + Gender);

    }
}