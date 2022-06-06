package com.example.snake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class ilk_giris extends AppCompatActivity {
ImageButton play,hakkimizda;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ilk_giris);
        play=findViewById(R.id.play);
        hakkimizda=findViewById(R.id.hakkimizda);
        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(ilk_giris.this,MainActivity.class);
                startActivity(intent);
            }
        });
        hakkimizda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(ilk_giris.this,hakkimizda.class);
                startActivity(intent);
            }
        });
    }
}