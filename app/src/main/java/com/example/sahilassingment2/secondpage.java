package com.example.sahilassingment2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class secondpage extends AppCompatActivity {

    TextView tv1= findViewById(R.id.titletv);
    Intent newintent= getIntent();
    RecyclerView rvstudents;
    private studentadapter madapter;
    RecyclerView.LayoutManager layoutManager;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondpage);
        tv1.setText("wELCOME");
        rvstudents=findViewById(R.id.rvstudents);
        layoutManager = new LinearLayoutManager(this);
        rvstudents.setLayoutManager(layoutManager);
        madapter= new studentadapter(getApplicationContext());
        rvstudents.setAdapter(madapter);
        final  student stud=student.getInstance();
        etname=findViewById(R.id.etname);
        etid=findViewById(R.id.etid);
        etpass=findViewById(R.id.etpass);
        String name=etname.getText.toString();
        int id=etid.getText.toString();
        String pass= etpass.getText.tosString();


        Student student=new Student();
        Student.name=etname;
        Student.id=etid;
        Student.pass=et.pass;

        madapter.update();
    }
}
