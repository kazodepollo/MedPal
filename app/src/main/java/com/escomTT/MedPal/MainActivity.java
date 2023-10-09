package com.escomTT.MedPal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


// Comentario de prueba (Max)
//  """           """
//  """           """
//
//  -              -
//   --------------

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button mMedico = (Button) findViewById(R.id.medico);
        Button mPaciente = (Button) findViewById(R.id.paciente);

        mMedico.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MedicoLogin.class);
                startActivity(intent);
                finish();
                return;
            }
        });

        mPaciente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, PacienteLogin.class);
                startActivity(intent);
                finish();
                return;
            }
        });
    }
}