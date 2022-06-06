package com.example.snake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class hakkimizda extends AppCompatActivity {
ImageButton github,linkedin,mail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hakkimizda);
        github=(ImageButton) findViewById(R.id.btn_github);
        linkedin=findViewById(R.id.linkedin);
        mail=findViewById(R.id.mail);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link=Uri.parse("https://github.com/ogzhnaldemir");
                Intent intent=new Intent(Intent.ACTION_VIEW,link);
                startActivity(intent);
            }
        });
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri link=Uri.parse("https://www.linkedin.com/in/oğuzhan-aldemir-81251b23b/");
                Intent intent=new Intent(Intent.ACTION_VIEW,link);
                startActivity(intent);
            }
        });
        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(hakkimizda.this,mail.class);
                startActivity(intent);
            }
        });


    }
}