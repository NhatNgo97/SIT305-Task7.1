package com.example.task71.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.task71.R;

public class MainActivity extends AppCompatActivity {

    Button createAdvertButton, showAdvertButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //linking the button variables to the ui elements
        createAdvertButton = findViewById(R.id.createAdvertButton);
        showAdvertButton = findViewById(R.id.showItemButton);

        //These intents are for the swapping to the other activities
        Intent showAdverts = new Intent(this, ShowAdvertActivity.class);
        Intent createAdverts= new Intent(this, CreateAdvertActivity.class);

        //these buttons swap to the other activities
        createAdvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(createAdverts);
            }
        });

        showAdvertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(showAdverts);
            }
        });
    }
}