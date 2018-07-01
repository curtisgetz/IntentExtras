package com.curtisgetz.intentextras;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //create member variable for edit text

    private EditText mEditText;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //bind edittext to variable
        mEditText = (EditText) findViewById(R.id.edittext);


    }


    //onClick method of button.  set up in xml
    public void nextActivity(View view){

        //get value of edit text,  then create intent,  then add String as extra
        String editTextValue = mEditText.getText().toString();
        Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
        //put String as extra.  Need a key first to call later,  then the actual string
        intent.putExtra("stingtopass", editTextValue);
        startActivity(intent);

    }



}
