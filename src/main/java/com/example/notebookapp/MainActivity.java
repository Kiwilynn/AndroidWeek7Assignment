package com.example.notebookapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText textBox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textBox = (EditText) findViewById(R.id.textBox);

    }

    public void saveButton(View view ){

        String savedText = textBox.getText().toString();
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("NAME", savedText);

        Toast.makeText(this, "Saved!", Toast.LENGTH_LONG).show();

        startActivity(intent);
    }
}
