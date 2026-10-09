package com.example.program11;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity implements SecondActivity2 {
    Button Previous;

    @SuppressLint("MissingInflatedId")
    @Override
    public void onCretate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actvity_main2);
        Previous = findViewById(R.id.button2);
        Previous.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });

    }
}

