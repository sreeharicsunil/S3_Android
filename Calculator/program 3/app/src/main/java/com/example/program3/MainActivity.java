package com.example.program3;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText FIRSTNUMBER, SECONDNUMBER;
    Button ADD;
    Button SUB;
    Button MUL;
    Button DIV;
    TextView RESULT;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        FIRSTNUMBER = findViewById(R.id.editTextText);
        SECONDNUMBER = findViewById(R.id.editTextText2);
        ADD = findViewById(R.id.button);
        SUB = findViewById(R.id.button2);
        MUL = findViewById(R.id.button3);
        DIV = findViewById(R.id.button4);
        ADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(FIRSTNUMBER.getText().toString());
                int num2 = Integer.parseInt(FIRSTNUMBER.getText().toString());
                int sum = num1 + num2;
                RESULT.setText("Addition=" + sum);
            }
        });
        SUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(FIRSTNUMBER.getText().toString());
                int num2 = Integer.parseInt(FIRSTNUMBER.getText().toString());
                int diff = num1 - num2;
                RESULT.setText("Substraction=" + diff);
            }
        });
        MUL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(FIRSTNUMBER.getText().toString());
                int num2 = Integer.parseInt(FIRSTNUMBER.getText().toString());
                int pro = num1 * num2;
                RESULT.setText("Multiplication=" + pro);
            }
        });
        DIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(FIRSTNUMBER.getText().toString());
                int num2 = Integer.parseInt(FIRSTNUMBER.getText().toString());
                int quo = num1 / num2;
                RESULT.setText("Division=" + quo);
            }
        });
    }
}