package com.example.multiscreenapp;

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

public class FiboActivity extends AppCompatActivity {

    Button submit;
    EditText inputUser;

    TextView output;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_fibo);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public  void homeBar(View view){
        finish();
    }
    public void resultshow(View view){


        inputUser=findViewById(R.id.inputUser);
        submit=findViewById(R.id.submit);
        output=findViewById(R.id.output);
        int num=Integer.parseInt(inputUser.getText().toString());
         output.setText("");

        int a=0;
        int b=1;
        output.append("\n"+a);
        output.append("\n"+b);

        for(int i=2; i<num; i++){

            int fibo=a+b;
            output.append("\n"+fibo);
            a = b;
            b = fibo;
        }

    }
}