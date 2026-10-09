package com.example.program8;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ImageView image;
    Button CLICK;
    boolean images1=true;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        image=findViewById(R.id.imageView);
        CLICK=findViewById(R.id.button);
        CLICK.setOnClickListener(v ->{
            if (images1) {
                image.setImageResource(R.drawable.images2);
                images1=false;
            }
            else {
                image.setImageResource(R.drawable.images1);
                images1=true;
            }
        });

    }
}