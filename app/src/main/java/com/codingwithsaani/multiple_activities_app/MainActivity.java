package com.codingwithsaani.multiple_activities_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void moveToSecondScreen(View view)
    {
        Intent objectIntent;
        objectIntent=new Intent(this,SecondScreen.class);

        objectIntent.putExtra("myString","Mobile Application Development");
        objectIntent.putExtra("rollNo",11);

        Bundle objectBundle=new Bundle();
        objectBundle.putString("stuName","Amir");

        objectIntent.putExtras(objectBundle);
        startActivity(objectIntent);
        this.finish();
    }

    @Override
    public void onBackPressed() {
//        super.onBackPressed();
        Toast.makeText(this, "you have pressed back btn", Toast.LENGTH_SHORT).show();
    }
}