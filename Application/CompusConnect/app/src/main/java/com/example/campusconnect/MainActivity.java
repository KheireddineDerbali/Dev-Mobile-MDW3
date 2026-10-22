package com.example.campusconnect;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    // Déclaration des 4 boutons de navigation
    private Button btnEvents;
    private Button btnServices;
    private Button btnTasks;
    private Button btnSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Associe le layout XML à cette Activity
        setContentView(R.layout.activity_main);

        // 1. Récupération des références visuelles grâce à leurs IDs XML
        btnEvents = findViewById(R.id.btnEvents);
        btnServices = findViewById(R.id.btnServices);
        btnTasks = findViewById(R.id.btnTasks);
        btnSettings = findViewById(R.id.btnSettings);

        // 2. Écouteur du bouton Événements
        btnEvents.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, EventsActivity.class);
                startActivity(intent);
            }
        });

        // 3. Écouteur du bouton Services
        btnServices.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ServicesActivity.class);
                startActivity(intent);
            }
        });

        // 4. Écouteur du bouton Mes tâches
        btnTasks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, TasksActivity.class);
                startActivity(intent);
            }
        });

        // 5. Écouteur du bouton Paramètres
        btnSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }
}
