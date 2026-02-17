package com.example.multiscreenapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.view.View;

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
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }
    public void explain(View view){
        Intent intent =new Intent(getApplicationContext(),explainActivity.class);
        startActivity(intent);
    }

    public void checkPrime(View view) {
        Intent intent = new Intent(getApplicationContext(), PrimeActivity.class);
        startActivity(intent);
    }
    public void checkFibo(View view) {
        Intent intent = new Intent(getApplicationContext(), FiboActivity.class);
        startActivity(intent);
    }
    public void oddEven(View view){
        Intent intent=new Intent(getApplicationContext(),oddEvenActivity.class);
        startActivity(intent);
    }
}