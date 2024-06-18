package com.example.cafe;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class coxinha extends AppCompatActivity {

    private RadioGroup grupo;
    private RadioButton rb1, rb2, rb3;
    private Button comprarButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coxinha);

        // Configurar o EdgeToEdge para gerenciar as bordas do sistema
        EdgeToEdge.enable(this);

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Referenciar os RadioButtons e o botão de Comprar
        grupo = findViewById(R.id.grupo);
        rb1 = findViewById(R.id.rb1);
        rb2 = findViewById(R.id.rb2);
        rb3 = findViewById(R.id.rb3);
        comprarButton = findViewById(R.id.button4);

        // Configurar o OnClickListener para o botão de Comprar
        comprarButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Verificar se algum RadioButton está selecionado
                if (grupo.getCheckedRadioButtonId() == -1) {
                    // Nenhum RadioButton selecionado
                    Toast.makeText(coxinha.this, "Selecione um sabor de coxinha!", Toast.LENGTH_SHORT).show();
                } else {
                    // RadioButton selecionado, permitir a compra
                    Intent i = new Intent(coxinha.this, informacoes.class);
                    startActivity(i);
                }
            }
        });
        final ImageView logo = (ImageView)
                findViewById(R.id.logo);
        logo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coxinha.this, opcoes.class);
                startActivity(i);
            }
        });

        final Button button4 = (Button)
                findViewById(R.id.button4);
        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(coxinha.this, informacoes.class);
            }
        });
    }
}