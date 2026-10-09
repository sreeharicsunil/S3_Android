package com.example.program9;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.List;

public class MainActivity extends AppCompatActivity {
    ListView listview;

    String[] Animal = {"Cat", "Dog", "Lion", "Tiger"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        try {
            setContentView(R.layout.activity_main);
            listview = findViewById(R.id.ListView);
            if (listview == null) {
                throw new NullPointerException("ListView not found");
            }
            ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.activity_list_item, Animal);
            listview.setAdapter(adapter);
        } catch (NullPointerException e) {
            Toast.makeText(this, "ListView not found", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        } catch (Exception e) {
            Toast.makeText(this, "An unexpected error occurred", Toast.LENGTH_SHORT).show();
            e.printStackTrace();
        }
    }
}



