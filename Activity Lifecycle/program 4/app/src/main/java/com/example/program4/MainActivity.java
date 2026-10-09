package com.example.program4;

import android.os.Bundle;
import android.util.Log;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        Log.i("state","onCreate call");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("state","onStart call");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("state","onResume call");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("state","onPause call");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("state","onStop call");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("state","onDestroy call");
    }
}



