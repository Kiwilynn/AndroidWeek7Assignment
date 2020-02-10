package com.example.notebookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = (TextView)findViewById(R.id.textView3);
        textView.setText(getIntent().getStringExtra("NAME"));
    }

    public void goBack(View view){
        Intent intent = new Intent(SecondActivity.this, MainActivity.class);
        startActivity(intent);
    }
}
