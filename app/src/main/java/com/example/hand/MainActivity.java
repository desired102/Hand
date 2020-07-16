package com.example.hand;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_game,btn_snooze;
    TextView desc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_game = (Button)findViewById(R.id.game);
        btn_snooze=(Button)findViewById(R.id.snooze);
        desc.setText("Hey! seems like today you have been"+"   text  \n It must be hurting a little around your"+"  Muscle or arm pain  \n"+"How about we play"+ "   GAME NAME   "+"today?");
        btn_game.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_g = new Intent(getApplicationContext(), game.class);
                startActivity(intent_g);
            }
        });
        btn_snooze.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent intent_s = new Intent(getApplicationContext(), snooze.class);
                startActivity(intent_s);
            }
        });
        }
    }
