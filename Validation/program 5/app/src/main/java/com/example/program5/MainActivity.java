package com.example.program5;

import android.os.Bundle;
import android.util.Patterns;
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
    EditText name, email, pass;
    Button SUBMIT;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        SUBMIT = findViewById(R.id.button);
        SUBMIT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validateFields();
            }
        });
    }

    private Void validateFields() {
        name = findViewById(R.id.editTextText);
        String User = name.getText().toString().trim();
        if (User.isEmpty()) {
            name.setError("Name cannot be empty");
            return null;
        }
        email = findViewById(R.id.editTextText2);
        String emailid = email.getText().toString().trim();
        if (!Patterns.EMAIL_ADDRESS.matcher(emailid).matches()) {
            email.setError("Invalid email format");
            return null;
        }
        pass = findViewById(R.id.editTextText3);
        String password = pass.getText().toString().trim();
        int length = 6;
        if (password.length() < length) {
            pass.setError("Password must be at least" + length + "characters long");
            return null;
        }
        Toast.makeText(this, "Valid inputs", Toast.LENGTH_SHORT).show();
        return null;
    }
}