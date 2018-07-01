package com.curtisgetz.intentextras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        //get incoming intent
        Intent intent = getIntent();

        if(intent != null){
            //get string extra using same key as before
            String passedString = intent.getStringExtra("stingtopass");
            //do whatever you want with this String.  I'll just show a Toast here
            Toast.makeText(this, passedString, Toast.LENGTH_LONG).show();


        }

    }
}
