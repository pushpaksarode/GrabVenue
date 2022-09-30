package com.example.grabvenue;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.Toast;

public class UserAllVenue extends AppCompatActivity implements AdapterView.OnItemSelectedListener {

    String venueTitles[] = {"Volleyball Ground", "Hockey Ground", "Cricket Ground", "Basketball Court", "Badminton Court", "Football Ground", "Swimming Pool"};
    int venueLogos[] = {R.drawable.volleyballlogo, R.drawable.hockeylogo, R.drawable.cricketlogo, R.drawable.basketballlogo, R.drawable.badmintonlogo, R.drawable.footballlogo, R.drawable.swimmingpoollogo};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_all_venue);

//       Header
        ActionBar actionBar;
        actionBar = getSupportActionBar();
        actionBar.setTitle("Outdoor Venues");
        ColorDrawable colorDrawable
                = new ColorDrawable(Color.parseColor("#a18d8d"));

        actionBar.setBackgroundDrawable(colorDrawable);

//        Spinner for Sort
        Spinner sortBySpin = findViewById(R.id.sortBySpin);
        ArrayAdapter<CharSequence> adpt = ArrayAdapter.createFromResource(this,R.array.sortByValues, android.R.layout.simple_spinner_item);
        adpt.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sortBySpin.setPrompt("Sort by");
        sortBySpin.setAdapter(adpt);

        sortBySpin.setOnItemSelectedListener(this);

//        All venues list
        listView = findViewById(R.id.venueList);
        VenueListAdapter venueListAdapter = new VenueListAdapter(getApplicationContext(), venueTitles, venueLogos);
        listView.setAdapter(venueListAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        String str = adapterView.getItemAtPosition(i).toString();
        Toast.makeText(this,"Venue Sorting by - " + str, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}