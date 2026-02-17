package com.example.multiscreenapp;

import android.annotation.SuppressLint;
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

public class oddEvenActivity extends AppCompatActivity {
    EditText inputnum;
    Button submitOE;
    TextView showres;

    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_odd_even);



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void backBtn(View view){
        finish();
    }
     public void checkOddEven(View view) {
         inputnum=findViewById(R.id.inputnum);
         submitOE=findViewById(R.id.submitOE);
         showres=findViewById(R.id.showres);
        int num=Integer.parseInt(inputnum.getText().toString());

            if(num<=1){
                showres.setText(" Enter a valid number 😒!");
            }
            else if (num%2==0){
                showres.setText(num+" is an Even number 👍");
            }

            else {
                showres.setText(num+" is  an Odd number 👌");
            }

     }
}