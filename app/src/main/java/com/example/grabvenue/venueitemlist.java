package com.example.grabvenue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class venueitemlist extends AppCompatActivity {

    LinearLayout card1, venueDetails;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_venueitemlist);

        card1 = findViewById(R.id.card1);
        venueDetails = findViewById(R.id.venueDetails);

        venueDetails.setVisibility(View.GONE);

        card1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                venueDetails.setVisibility(View.VISIBLE);
            }
        });

    }
}