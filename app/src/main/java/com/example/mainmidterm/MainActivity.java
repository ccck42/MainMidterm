package com.example.mainmidterm;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView textView,textView2,textView3,title;
    ImageButton imageButton,imageButton2,imageButton3;
    int n1=0;
    int n2=0;
    int n3=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        title = (TextView) findViewById(R.id.mainTitle);
        textView = (TextView) findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        imageButton = (ImageButton) findViewById(R.id.imageButton);
        imageButton2 = (ImageButton)findViewById(R.id.imageButton2);
        imageButton3 = (ImageButton)findViewById(R.id.imageButton3);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n1 += 1;
                textView.setText("Selected "+String.valueOf(n1)+" times");
                title.setText("Hi");

            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n2 += 1;
                textView2.setText("Selected "+String.valueOf(n2)+" times");
            }
        });
        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                n3 += 1;
                textView3.setText("Selected "+String.valueOf(n3)+" times");
            }
        });
    }
}