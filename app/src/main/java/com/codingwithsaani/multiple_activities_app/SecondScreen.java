package com.codingwithsaani.multiple_activities_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class SecondScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);

        if(getIntent()!=null) {
            Intent secondIntent = getIntent();
            Bundle objectBundle=getIntent().getExtras();

            String studentName=objectBundle.getString("stuName");
            String retrievedValue = secondIntent.getStringExtra("myString");

            int retrievedRollNo = secondIntent.getIntExtra("rollNo", 0);
            Toast.makeText(this, "Value From Previous Screen:" + retrievedValue, Toast.LENGTH_SHORT).show();

            Toast.makeText(this, "Roll No" + retrievedRollNo, Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "Student Name :"+studentName, Toast.LENGTH_SHORT).show();
        }
        else
        {
            Toast.makeText(this, "No data is retrieved", Toast.LENGTH_SHORT).show();
        }
    }

    public void moveBack(View view)
    {
        Intent objectIntent=new Intent(this,MainActivity.class);
        startActivity(objectIntent);

        this.finish();
    }

    @Override
    public void onBackPressed() {
        //super.onBackPressed();
        Toast.makeText(this, "you have pressed back btn", Toast.LENGTH_SHORT).show();
    }
}