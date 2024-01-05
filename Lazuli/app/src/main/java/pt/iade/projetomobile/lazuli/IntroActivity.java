package pt.iade.projetomobile.lazuli;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class IntroActivity extends AppCompatActivity {
    private Button agenda;
    private Button uc;
    private Button horario;
    private Button nota;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro);

        agenda = (Button)findViewById(R.id.agendaButton);
        uc = (Button)findViewById(R.id.ucButton);
        nota = (Button)findViewById(R.id.notaButton);
        horario = (Button)findViewById(R.id.horaButton);
        ImageButton settings = (ImageButton)findViewById(R.id.settingsButton);
        agenda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this, AgendaActivity.class);
                startActivity(intent);
            }
        });
        uc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this, UcActivity.class);
                startActivity(intent);
            }
        });
        nota.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this, NotaActivity.class);
                startActivity(intent);
            }
        });
        horario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this, HorarioActivity.class);
                startActivity(intent);
            }
        });
        settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(IntroActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}