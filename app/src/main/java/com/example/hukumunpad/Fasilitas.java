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

        String image1 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/elearning-banda-42-420x420.jpg";
        String image2 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/imam-bonjol-2-420x420.jpg";
        String image3 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/imam-bonjol-420x420.jpg";
        String image4 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/perpus-3-420x420.jpg";
        String image5 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/perpus-4-420x420.jpg";
        String image6 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/perpus-5-420x420.jpg";
        String image7 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/perpus-6-420x420.jpg";
        String image8 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/perpus-7-2-420x420.jpg";
        String image9 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/perpus-8-420x420.jpg";
        String image10 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/Picture-012-420x420.jpg";
        String image11 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/Picture-013-420x420.jpg";
        String image12 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/Picture-028-420x420.jpg";
        String image13 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/Picture-029-420x420.jpg";
        String image14 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/Picture-040-420x420.jpg";
        String image15 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/Picture-041-420x420.jpg";
        String image16 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/Syukuran-039-420x420.jpg";
        String image17 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/syukuran-1102-420x420.jpg";
        String image18 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/syukuran-113-420x420.jpg";
        String image19 = "https://fh.unpad.ac.id/wp-content/uploads/2014/09/syukuran-114-420x420.jpg";
        String image20 = "https://lh3.googleusercontent.com/proxy/xqrQA0A7mx9DwEglOkCfPgJHkEdktogFDHPRbk6GXrLvbihykBACAUR5gmRZ4UkOWnF0vxTb-Dk_HBSWh4OtqcyZumf8dN1lSVjfglQc0nvUH8TGdvVC";
        String image21 = "https://lh3.googleusercontent.com/2iT0GdZb0_qMjeKIXIj-lIbk4C6V5nY0eE11PwGkOI5J8YFXHfd_fGd6nLjO-GKE6CBk0w=s156";
        String image22 = "https://lh3.googleusercontent.com/proxy/MDWLMC5UXE_8Za7sYqz2FSLbKFOeRmB3VUZUqobp6mwCJyyEjgCD01INjtsowoujFZrTOAPotvG15b5ULgJmz8IbxtIz4b0NH4M1gYwyKJf3cihSjjFFKfTic2ySynw7UeYgksyLKJPuPVt_gRvgI_nPdlVNEZwA54U";

        model = new MyModel("Elearning Banda 42",image1);
        modelList.add(model);

        model = new MyModel("Imam Bonjol",image2);
        modelList.add(model);

        model = new MyModel("Imam Bonjol", image3);
        modelList.add(model);

        model = new MyModel("Perpustakaan", image4);
        modelList.add(model);

        model = new MyModel("Perpustakaan", image5);
        modelList.add(model);

        model = new MyModel("Perpustakaan", image6);
        modelList.add(model);

        model = new MyModel("Perpustakaan", image7);
        modelList.add(model);

        model = new MyModel("Perpustakaan", image8);
        modelList.add(model);

        model = new MyModel("Perpustakaan", image9);
        modelList.add(model);

        model = new MyModel("Hukum Unpad", image10);
        modelList.add(model);

        model = new MyModel("Hukum Unpad", image11);
        modelList.add(model);

        model = new MyModel("Hukum Unpad", image12);
        modelList.add(model);

        model = new MyModel("Hukum Unpad", image13);
        modelList.add(model);

        model = new MyModel("Hukum Unpad", image14);
        modelList.add(model);

        model = new MyModel("Hukum Unpad", image15);
        modelList.add(model);

        model = new MyModel("Hukum Unpad", image16);
        modelList.add(model);

        model = new MyModel("Hukum Unpad", image17);
        modelList.add(model);

        model = new MyModel("Hukum Unpad", image18);
        modelList.add(model);

        model = new MyModel("Hukum Unpad", image19);
        modelList.add(model);

        model = new MyModel("Ruang Auditorium Tommy Koh-Mochtar Kusumatmadja", image20);
        modelList.add(model);

        model = new MyModel("Ruang Moot Court Adjie Sena Kolopaking (ASAK)", image21);
        modelList.add(model);

        model = new MyModel("Student Center", image22);
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