package com.example.hyder.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button map2 = (Button) findViewById(R.id.button4);
        map2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.google.com.hk/maps/dir/''/taj+mahal+location/@27.1749977,77.9721149,25505m/data=!3m2!1e3!4b1!4m8!4m7!1m0!1m5!1m1!1s0x39747121d702ff6d:0xdd2ae4803f767dde!2m2!1d78.0421552!2d27.1750151";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        Button info2 = (Button) findViewById(R.id.button5);
        info2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://en.wikipedia.org/wiki/Taj_Mahal");
                Intent info = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(info);
            }
        });

        Button next2 = (Button) findViewById(R.id.button6);
        next2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent taj= new Intent(getBaseContext(), Main4Activity.class);
                startActivity(taj);
            }
        });


    }
};
