package com.example.nightwalker;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class LocationActivity extends AppCompatActivity {
    private BottomNavigationView bottomNavigationView;

    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_location);
        bottomNavigationView = findViewById(R.id.bottom_navigation);
        TextView location = (TextView) findViewById(R.id.location_text);
        location.setText("This is Location Activity");

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.action_home:
                        Intent a = new Intent(LocationActivity.this,MainActivity.class);
                        startActivity(a);
                        break;
                    case R.id.action_location:
                        break;
                    case R.id.action_social:
                         Intent c = new Intent(LocationActivity.this,SocialActivity.class);
                          startActivity(c);
                        break;
                }
                return true;
            }
        });
    }
}