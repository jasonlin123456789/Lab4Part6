package com.example.lab4part6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void OnRotateClick(View view) {
        Intent intent = new Intent(this, RotateActivity.class);
        startActivity(intent);
    }

    public void OnClockClick(View view) {
        Intent intent = new Intent(this, ClockActivity.class);
        startActivity(intent);
    }
}