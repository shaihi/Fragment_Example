package com.shaihi.fragment_example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FirstFragment firstFragment = new FirstFragment();
        SecondFragment secondFragment = new SecondFragment();

        getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, firstFragment).commit();

        Button frg1Btn = findViewById(R.id.fragOneBtn);
        Button frg2Btn = findViewById(R.id.fragTwoBtn);

        frg1Btn.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, firstFragment).commit();
        });
        frg2Btn.setOnClickListener(v -> {
            getSupportFragmentManager().beginTransaction().replace(R.id.flFragment, secondFragment).commit();
        });
    }
}