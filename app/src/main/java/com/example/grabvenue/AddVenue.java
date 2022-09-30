package com.example.grabvenue;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class AddVenue extends AppCompatActivity {

    Spinner venueType;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_venue);

        String[] arraySpinner = new String[] {
                "Select Type", "Hall", "Outdoor", "Indoor", "Workshop", "Fest", "Others"
        };
        Spinner s = (Spinner) findViewById(R.id.venuType);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_spinner_item, arraySpinner);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        s.setAdapter(adapter);
    }
}