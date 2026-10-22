package com.example.campusconnect;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        // Bouton retour à l'écran précédent
        Button btnBack = findViewById(R.id.btnBackEvents);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // finish() ferme l'Activity courante et dépile l'écran
                finish();
            }
        });
    }
}
