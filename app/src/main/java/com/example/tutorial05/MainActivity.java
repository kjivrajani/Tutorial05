package com.example.tutorial05;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;
import android.widget.Switch;

public class MainActivity extends AppCompatActivity {

 Button btnRegister;
 EditText editFname,editLname,editEmail,editpassword;
 Switch swcBranch;
 Spinner spnCIty;
 CheckBox chkStatus;
 RadioGroup rgdgroup;
 RadioButton rtnGendedr;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRegister = findViewById(R.id.btnRegister);
        editFname = findViewById(R.id.editFname);
        editLname = findViewById(R.id.editLname);
        editEmail = findViewById(R.id.editEmail);
        editpassword = findViewById(R.id.editpassword);
        spnCIty = findViewById(R.id.spnCIty);
        swcBranch  = findViewById(R.id.swcBranch);
        chkStatus = findViewById(R.id.chkStatus);
        rgdgroup = findViewById(R.id.rgdgroup);

        btnRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int id = rgdgroup.getCheckedRadioButtonId();
                rtnGendedr = findViewById(id);
                String Fname = editFname.getText().toString();
                String Lname = editLname.getText().toString();
                String Email = editEmail.getText().toString();
                String password = editpassword.getText().toString();
                String countries = spnCIty.getSelectedItem().toString();
                String Gender = rtnGendedr.getText().toString();
                /*if(rtnGendedr.isChecked())
                {
                    Gender = "Male";
                }
                else
                    {
                    Gender = "Female";
                    }*/


                String Branch = "";
                String status = "";
                if(chkStatus.isChecked())
                {
                    status = "Active";
                }
                else{
                    status = "Inactive";
                }
                if(swcBranch.isChecked())
                {
                    Branch = swcBranch.getTextOn().toString();
                }
                else{
                    Branch = swcBranch.getTextOff().toString();
                }

                Intent intent = new Intent(MainActivity.this,login.class);
                intent.putExtra("Fname",Fname);
                intent.putExtra("Lname",Lname);
                intent.putExtra("Email",Email);
                intent.putExtra("password",password);
                intent.putExtra("countries",countries);
                intent.putExtra("status",status);
                intent.putExtra("Branch",Branch);
                intent.putExtra("Gender",Gender);
                startActivity(intent);
            }
        });
    }
}