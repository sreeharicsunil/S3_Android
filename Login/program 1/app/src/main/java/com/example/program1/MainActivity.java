package com.example.program1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText USERNAME,PASSWORD;
    Button SUBMIT;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        USERNAME = findViewById(R.id.editTextText);
        PASSWORD = findViewById(R.id.editTextTextPassword);
        SUBMIT = findViewById(R.id.button);
        SUBMIT.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View v) {
                String USER=USERNAME.getText().toString();
                String PASS=PASSWORD.getText().toString();
                if (USER.equals("ADMIN") && PASS.equals("123"))
                {
                    Toast.makeText(MainActivity.this, "Login successfully", Toast.LENGTH_SHORT).show();
                }
                else
                {
                    Toast.makeText(MainActivity.this,"Login unsuccessfully",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
