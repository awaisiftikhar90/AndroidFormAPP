package com.example.formapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void handleText(View v){

//       TextView t = findViewById(R.id.editTextText);
        EditText t = findViewById(R.id.editTextText);
        String inputText = t.getText().toString();
        ((TextView)findViewById(R.id.output)).setText(inputText);
        Toast.makeText(this,"Alert: Button Clicked",Toast.LENGTH_LONG).show();
        Log.d("Info",inputText);
    }
}