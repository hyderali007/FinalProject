package com.example.hyder.finalproject;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button info = (Button) findViewById(R.id.button);
        info.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Uri webpage = Uri.parse("https://en.wikipedia.org/wiki/Grand_Canyon");
                Intent info = new Intent(Intent.ACTION_VIEW, webpage);
                startActivity(info);
            }
        });

        Button map = (Button) findViewById(R.id.button2);
        map.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String url = "https://www.google.com.hk/maps/dir/''/grand+canyon/@36.1069448,-112.3931508,92652m/data=!3m1!1e3!4m8!4m7!1m0!1m5!1m1!1s0x873312ae759b4d15:0x1f38a9bec9912029!2m2!1d-112.1129972!2d36.1069652";
                Intent i = new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        Button next = (Button) findViewById(R.id.button3);
        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent taj= new Intent(getBaseContext(), Main3Activity.class);
                startActivity(taj);
            }
        });


    }
}
