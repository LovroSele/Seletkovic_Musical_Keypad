package com.example.seletkovic_musical_keypad;


import androidx.appcompat.app.AppCompatActivity;

import android.media.SoundPool;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button Do, re, mi, fa, so, la, ti, Doo;

    int noteA, noteB, noteC, noteD, noteE, noteF, noteG, noteG1;
    SoundPool soundPool;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Do=(Button) findViewById(R.id.BtnDo);
        re=(Button) findViewById(R.id.BtnRe);
        mi=(Button) findViewById(R.id.BtnMi);
        fa=(Button) findViewById(R.id.BtnFa);
        so=(Button) findViewById(R.id.BtnSo);
        la=(Button) findViewById(R.id.BtnLa);
        ti=(Button) findViewById(R.id.BtnTi);
        Doo=(Button) findViewById(R.id.BtnDoo);

        soundPool = new SoundPool.Builder().setMaxStreams(5).build();

        noteA = soundPool.load(this, R.raw.do1,1);
        noteB = soundPool.load(this, R.raw.re,1);
        noteC = soundPool.load(this, R.raw.mi,1);
        noteD = soundPool.load(this, R.raw.fa,1);
        noteE = soundPool.load(this, R.raw.so,1);
        noteF = soundPool.load(this, R.raw.la,1);
        noteG = soundPool.load(this, R.raw.ti,1);
        noteG1 = soundPool.load(this, R.raw.doo,1);

        Do.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteA, 1,1,0,0,1);
            }
        });
        re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteB, 1,1,0,0,1);
            }
        });
        mi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteC, 1,1,0,0,1);
            }
        });
        fa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteD, 1,1,0,0,1);
            }
        });
        so.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteE, 1,1,0,0,1);
            }
        });
        la.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteF, 1,1,0,0,1);
            }
        });
        ti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteG, 1,1,0,0,1);
            }
        });
        Doo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                soundPool.play(noteG1, 1,1,0,0,1);
            }
        });


    }
}