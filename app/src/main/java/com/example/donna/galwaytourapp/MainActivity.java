package com.example.donna.galwaytourapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout drawer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_main);
// ceaate toolbar with support for navigation drawer
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        drawer = findViewById(R.id.drawer_layout);
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // Action to open or close navigation drawer
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawer, toolbar,
                R.string.nav_drawer_open, R.string.nav_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        // Fragment to open on start of app
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                    new DiningFragment()).commit();
            navigationView.setCheckedItem(R.id.nav_dining);
        }
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.nav_dining:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new DiningFragment()).commit();
                break;
            case R.id.nav_hotel:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new AccommodationsFragment()).commit();
                break;
            case R.id.nav_see:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new SitesFragment()).commit();
                break;

            case R.id.nav_events:
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container,
                        new EventsFragment()).commit();
                break;

            case R.id.nav_share:

                Intent sendIntent = new Intent();
                sendIntent.setAction(Intent.ACTION_SEND);
                sendIntent.putExtra(Intent.EXTRA_TEXT, "This is my text to send.");
                sendIntent.setType("text/plain");
                startActivity(sendIntent);
                break;
            case R.id.nav_send:
                Intent email = new Intent(Intent.ACTION_SEND);
                email.putExtra(Intent.EXTRA_EMAIL, new String[]{"abc@gmail.com"});
                email.putExtra(Intent.EXTRA_SUBJECT, "Sunject Text Here..");
                email.putExtra(Intent.EXTRA_TEXT, "");
                email.setType("message/rfc822");
                startActivity(Intent.createChooser(email, "Send Mail Using :"));

                break;
        }
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }


    @Override
    public void onBackPressed() {
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }
}


