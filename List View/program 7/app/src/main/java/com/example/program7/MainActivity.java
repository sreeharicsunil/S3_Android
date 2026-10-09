package com.example.program7;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    ListView list_item;
    String [] fruits= {"Apple","Orange","Mango","Kiwi"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        list_item = findViewById(R.id.list_item);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,android.R.layout.activity_list_item,fruits);
        list_item.setAdapter(adapter);
    }

}