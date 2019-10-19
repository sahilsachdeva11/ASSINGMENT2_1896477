package com.example.sahilassingment2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText etname= findViewById(R.id.editTextname);
    EditText etid= findViewById(R.id.editTextid);
    EditText etpass= findViewById(R.id.editText3);
    Button lgnbutton= findViewById(R.id.lgnbutton);
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lgnbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name=etname.getText().toString();
                String pass=etpass.getText().toString();
                int id=Integer.parseInt(etid.getText().toString());
                Intent myintent= new Intent( MainActivity.this,secondpage.class);
                if(name=="sahil"&& pass=="1234")
                {
                    startActivity(myintent);
                }


            }
        });
    }
}
