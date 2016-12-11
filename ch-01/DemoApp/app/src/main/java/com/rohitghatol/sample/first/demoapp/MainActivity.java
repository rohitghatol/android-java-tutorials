package com.rohitghatol.sample.first.demoapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public void onClick(View view){
        Log.i("MainActivity","Button clicked");
        EditText input = (EditText)findViewById(R.id.nameInput);
        TextView output = (TextView) findViewById(R.id.nameOutput);
        output.setText(input.getText());

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
