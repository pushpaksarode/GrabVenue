package com.example.grabvenue;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class UserSettings extends AppCompatActivity {


    ImageButton profileEdit, homeBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_settings);

        profileEdit = findViewById(R.id.profileEdit);
        homeBtn = findViewById(R.id.homeBtn);

        profileEdit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSettings.this, UserAccountSettings.class);
                startActivity(i);
            }
        });

        homeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(UserSettings.this, HomePage.class);
                startActivity(i);
                finish();
            }
        });

    }
}