package com.example.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        final Button button2 =findViewById(R.id.button2);

        button.setOnClickListener (new View.OnClickListener(){
            public void onClick(View v){
                overridePendingTransition(R.anim.fade, R.anim.hold);
                Intent i = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(i);
            }
        });

        final MediaPlayer m = MediaPlayer.create(this, R.raw.bgm);
        final boolean mplay = true;
        m.start();

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mplay==true){
                    m.stop();
                }else{
                    m.start();
                }
            }
        });

    }
}
