package com.example.hukumunpad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;
import com.thekhaeng.recyclerviewmargin.LayoutMarginDecoration;

import java.util.ArrayList;
import java.util.List;

public class Fasilitas extends AppCompatActivity {

    Toolbar toolbar;
    ActionBar actionBar;

    RecyclerView recyclerView;

    private List<MyModel> modelList = new ArrayList<>();
    private AdapterCard adapter;
    private MyModel model;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fasilitas);

        toolbar = findViewById(R.id.toolbar);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);
        toolbarText.setText("Fasilitas");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        adapter = new AdapterCard(this, modelList);

        String image1 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/02.jpg";
        String image2 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/01.jpg";
        String image3 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/03.jpg";
        String image4 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/04.jpg";
        String image5 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/07.jpg";
        String image6 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/05.jpg";
        String image7 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/bale-rumawat-watermark.jpg";
        String image8 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/09.jpg";
        String image9 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/16-1.jpg";
        String image10 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/08-1.jpg";
        String image11 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/15-1.jpg";
        String image12 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/20-1.jpg";
        String image13 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/18-1.jpg";
        String image14 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/22-1.jpg";
        String image15 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/rsgm-watermark.jpg";
        String image16 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/21-1.jpg";
        String image17 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/asrama-padjadjaran-2-watermark.jpg";
        String image18 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/asrama-padjadjaran-3-watermark.jpg";
        String image19 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/Asrama-Padjadjaran-4.png";
        String image20 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/Odong-odong-Unpad.png";
        String image21 = "https://fh.unpad.ac.id/wp-content/uploads/2021/11/17-1.jpg";

        model = new MyModel("Perpustakaan",image1);
        modelList.add(model);

        model = new MyModel("Perpustakaan",image2);
        modelList.add(model);

        model = new MyModel("Perpustakaan", image3);
        modelList.add(model);

        model = new MyModel("Moot Court Room", image4);
        modelList.add(model);

        model = new MyModel("Moot Court Room", image5);
        modelList.add(model);

        model = new MyModel("Auditorium", image6);
        modelList.add(model);

        model = new MyModel("Auditorium", image7);
        modelList.add(model);

        model = new MyModel("Auditorium", image8);
        modelList.add(model);

        model = new MyModel("Auditorium", image9);
        modelList.add(model);

        model = new MyModel("Masjid", image10);
        modelList.add(model);

        model = new MyModel("Masjid Unpad", image11);
        modelList.add(model);

        model = new MyModel("Sarana Olahraga", image12);
        modelList.add(model);

        model = new MyModel("Sarana Olahraga", image13);
        modelList.add(model);

        model = new MyModel("Layanan Kesehatan", image14);
        modelList.add(model);

        model = new MyModel("Layanan Kesehatan", image15);
        modelList.add(model);

        model = new MyModel("Asrama Padjadjaran 1", image16);
        modelList.add(model);

        model = new MyModel("Asrama Padjadjaran 2", image17);
        modelList.add(model);

        model = new MyModel("Asrama Padjadjaran 3", image18);
        modelList.add(model);

        model = new MyModel("Asrama Padjadjaran 4", image19);
        modelList.add(model);

        model = new MyModel("Transportasi Kampus", image20);
        modelList.add(model);

        model = new MyModel("Transportasi Kampus", image21);
        modelList.add(model);

        RecyclerView recyclerView = findViewById(R.id.list_fasilitas);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        LayoutMarginDecoration marginDecoration = new LayoutMarginDecoration(1, 20);
        marginDecoration.setPadding(recyclerView, 20, 20, 20, 20);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.addItemDecoration(marginDecoration);
        recyclerView.setAdapter(adapter);
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

}