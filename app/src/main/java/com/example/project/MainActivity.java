package com.example.project;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1 , btn2 , btn3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btnn1);
        btn2 = findViewById(R.id.btnn2);
        btn3 = findViewById(R.id.btnn3);

      btn1.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent intent = new Intent(MainActivity.this,page_one.class);
              startActivity(intent);
          }
      });
      btn2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent intent = new Intent(MainActivity.this,page_two.class);
              startActivity(intent);
          }
      });
      btn3.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {

              Intent intent = new Intent(MainActivity.this,page_three.class);
              startActivity(intent);
          }
      });
    }
}