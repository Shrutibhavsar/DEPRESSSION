package com.example.depression;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {
ImageButton depres;
ImageButton caus;
ImageButton share;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        depres =(ImageButton)findViewById(R.id.depres);
        caus=(ImageButton)findViewById(R.id.caus);
        share=(ImageButton)findViewById(R.id.share);
        depres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), depression.class);
                startActivity(intent);
            }

        }
        );
        caus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(),Causes.class);
                startActivity(intent);
            }

        }
        );
        share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), share.class);
                startActivity(intent);
            }

        }
        );
    }
}

