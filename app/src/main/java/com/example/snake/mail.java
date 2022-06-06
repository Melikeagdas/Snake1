package com.example.snake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class mail extends AppCompatActivity {
    EditText mk,mi;
    Button btn_gondre;
    String icerik,adres,konu;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mail);
        btn_gondre=(Button)findViewById(R.id.button2);
        mk=(EditText)findViewById(R.id.mailKonu);
        mi=(EditText)findViewById(R.id.mailİcerik);
        btn_gondre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                icerik=mi.getText().toString();
                adres="ogzhnaldemir3747@gmail.com";
                konu=mk.getText().toString();
                if(konu.length()==0 || adres.length()==0 || icerik.length()==0){
                    Toast.makeText(getApplicationContext(),"Hiçbir Alan Boş Geçilemez!!!!",Toast.LENGTH_LONG).show();
                }
                else{
                    Intent intentmail=new Intent(Intent.ACTION_SEND);
                    intentmail.setType("message/rfc822");
                    intentmail.putExtra(Intent.EXTRA_EMAIL,new String[]{adres});
                    intentmail.putExtra(Intent.EXTRA_SUBJECT,konu);
                    intentmail.putExtra(Intent.EXTRA_TEXT,icerik);
                    startActivity(intentmail);
                    Toast.makeText(getApplicationContext(),"Lütfen bekleyin, yönlendiriliyorsunuz..",Toast.LENGTH_LONG).show();
                    mk.setText("");
                    mi.setText("");

                }
            }
        });
    }
}