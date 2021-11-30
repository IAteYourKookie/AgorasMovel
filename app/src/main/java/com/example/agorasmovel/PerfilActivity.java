package com.example.agorasmovel;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class PerfilActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_perfil);

        Toolbar toolbar = findViewById(R.id.tbMain);
        setSupportActionBar(toolbar);

        toolbar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PerfilActivity.this, HomeActivity.class);
                startActivity(i);
            }
        });

        Button btnEditPassword = findViewById(R.id.btnEditPassword);
        btnEditPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PerfilActivity.this, EditPasswordActivity.class);
                startActivity(i);
            }
        });

        ImageButton imEditPerfil = findViewById(R.id.imEditPerfil);
        imEditPerfil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(PerfilActivity.this, EditPerfilActivity.class);
                startActivity(i);
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_toolbar, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        super.onOptionsItemSelected(item);
        Intent i;
        switch (item.getItemId()){
            case R.id.tema:
                i = new Intent(PerfilActivity.this, SuggestionActivity.class);
                startActivity(i);
                return true;

            case R.id.oldDebate:
                i = new Intent(PerfilActivity.this, OldDebatesActivity.class);
                startActivity(i);
                return true;

            case R.id.ajuda:
                i = new Intent(PerfilActivity.this, HelpActivity.class);
                startActivity(i);
            default:
                return super.onOptionsItemSelected(item);
        }
    }


}