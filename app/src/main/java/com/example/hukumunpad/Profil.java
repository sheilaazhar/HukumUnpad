package com.example.hukumunpad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;

import me.biubiubiu.justifytext.library.JustifyTextView;


public class Profil extends AppCompatActivity {

    Toolbar toolbar;
    ActionBar actionBar;

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        toolbar = findViewById(R.id.toolbar);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);
        toolbarText.setText("Profil");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bottomNavigationView=findViewById(R.id.navigasi);
        bottomNavigationView.setOnNavigationItemSelectedListener(bottomNavMethod);
        getSupportFragmentManager().beginTransaction().replace(R.id.container, new DescFragment()).commit();
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener bottomNavMethod=new
            BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                    Fragment fragment = null;

                    switch (item.getItemId()){
                        case R.id.deskripsi:
                            fragment = new DescFragment();
                            break;

                        case R.id.visi:
                            fragment = new VisiFragment();
                            break;

                        case R.id.tujuann:
                            fragment = new TujuanFragment();
                            break;

                    }
                    getSupportFragmentManager().beginTransaction().replace(R.id.container,fragment).commit();
                    return true;
                }
            };
}