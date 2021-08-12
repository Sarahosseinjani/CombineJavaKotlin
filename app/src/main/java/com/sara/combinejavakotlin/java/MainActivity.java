package com.sara.combinejavakotlin.java;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.sara.combinejavakotlin.R;
import com.sara.combinejavakotlin.kotlin.KotlinClass;

public class MainActivity extends AppCompatActivity {

    TextView textView;
    Button java_btn, kotlin_btn;
    KotlinClass kotlinClass = new KotlinClass();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView = findViewById(R.id.textView);
        java_btn = findViewById(R.id.java_btn);
        kotlin_btn = findViewById(R.id.kotlin_btn);
//java button
        java_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               fromJava(textView);
            }
        });
//kotlin button
        kotlin_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               kotlinClass.fromKotlin(textView);
            }
        });
    }

    private void fromJava(TextView myTextView){
        myTextView.setText("Come From Java :)");
    }
}