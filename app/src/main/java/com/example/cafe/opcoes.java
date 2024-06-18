package com.example.cafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class opcoes extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_opcoes);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        final ImageView logo = (ImageView)
                findViewById(R.id.logos);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(opcoes.this, opcoes.class);
                startActivity(i);
            }
        });
        final ImageView pao = (ImageView)
                findViewById(R.id.imageView6);
        pao.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(opcoes.this, pao.class);
                startActivity(i);
            }
        });
        final ImageView coxinha =(ImageView)
                findViewById(R.id.imageView3);
        coxinha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(opcoes.this, coxinha.class);
                startActivity(i);
            }
        });
        final ImageView kibe =(ImageView)
                findViewById(R.id.imageView5);
        kibe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(opcoes.this, kibe.class);
                startActivity(i);
            }
        });
        final ImageView enroladinho =(ImageView)
                findViewById(R.id.imageView4);
        enroladinho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(opcoes.this, enroladinnho.class);
                startActivity(i);
            }
        });
        final ImageView pf =(ImageView)
                findViewById(R.id.imageView10);
        pf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(opcoes.this, pf.class);
                startActivity(i);
            }
        });

        final ImageView cafe =(ImageView)
                findViewById(R.id.imageView11);
        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(opcoes.this, MainActivity.class);
                startActivity(i);
            }
        });
        final ImageView litro =(ImageView)
                findViewById(R.id.imageView12);
        litro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(opcoes.this, litro.class);
                startActivity(i);
            }
        });

        final ImageView lata =(ImageView)
                findViewById(R.id.imageView9);
        lata.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(opcoes.this, lata.class);
                startActivity(i);
            }
        });

        final ImageView suco =(ImageView)
                findViewById(R.id.imageView7);
        suco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new  Intent(opcoes.this, suco.class);
                startActivity(i);
            }
        });

    }
}