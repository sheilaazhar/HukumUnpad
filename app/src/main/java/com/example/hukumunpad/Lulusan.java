package com.example.hukumunpad;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.widget.TextView;

import com.google.android.material.navigation.NavigationView;

import me.biubiubiu.justifytext.library.JustifyTextView;

public class Lulusan extends AppCompatActivity {

    Toolbar toolbar;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lulusan);

        toolbar = findViewById(R.id.toolbar);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);
        toolbarText.setText("Profil Lulusan");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String kompetensi = "         Kurikulum Program Studi S1 Ilmu Hukum Fakultas Hukum " +
                "Universitas Padjadjaran telah memuat kompetensi lulusan secara " +
                "lengkap, baik kompetensi utama, kompetensi pendukung dan " +
                "kompetensi lainnya, yang terumuskan secara sangat jelas, serta " +
                "sesuai dengan Visi , Misi dan sudah berorientasi ke masa depan.\n\n" +
                "         Kompetensi utama lulusan secara lengkap sudah sesuai dengan " +
                "visi dan misi Program Studi S1 Ilmu Hukum Fakultas Hukum " +
                "Universitas Padjadjaran, yang meliputi:\n" +
                "a. Berdaya guna dan berdaya saing dalam pasar kerja nasional \n" +
                "maupun internasional;\n" +
                "b. Memahami Hukum Sebagai Sarana Pembangunan;\n" +
                "c. Tanggap untuk menyikapi permasalahan hukum yang \n" +
                "berkembang di masyarakat.\n" +
                "d. Menganalisa masalah-masalah hukum dalam masyarakat;\n" +
                "e. Menerapkan hukum yang berkeadilan;\n" +
                "f. Memberikan pelayanan hukum kepada masyarakat yang sebaik-baiknya berdasarkan keahlian dan keterampilan yang \n" +
                "dimiliki;\n" +
                "g. Mengembangkan keahlian dan keterampilan dalam bidang \n" + "hukum;\n" +
                "h. Mengembangkan dan meningkatkan profesionalisme hukum \n" +
                "dengan menjunjung tinggi etika profesi hukum.\n\n" +
                "         Kompetensi pendukung lulusan secara lengkap sudah sesuai " +
                "dengan visi dan misi Program Studi S1 Ilmu Hukum Fakultas Hukum " +
                "Universitas Padjadjaran, yang meliputi:\n" +
                "a. Menggunakan hukum sebagai sarana untuk memecahkan " +
                "masalah yang konkret dengan bijaksana dan tetap mendasarkan " +
                "pada pemecahan masalah dan penyelenggaraan kebutuhan " +
                "masyarakat pada prinsip-prinsip hukum yang berkeadilan.\n" +
                "b. Menguasai ilmu pengetahuan teknologi (iptek) dan profesi bidang " +
                "hukum dengan penuh tanggung jawab.\n\n" +
                "         Kompetensi lainnya/pilihan lulusan secara lengkap sudah " +
                "sesuai dengan visi dan misi Program Studi S1 Ilmu Hukum Fakultas " +
                "Hukum Universitas Padjadjaran, yang meliputi:\n" +
                "a. Mempunyai rasa ingin tahu tentang perkembangan hukum " +
                "sebagai sarana pembaharuan dalam masyarakat (law as a tool of " +
                "social engineering);\n" +
                "b. Memiliki motivasi yang kuat untuk mengembangkan ilmu hukum " +
                "dan menerapkannya dalam kehidupan sehari-hari di bidang " +
                "pekerjaan, sosial dan masyarakat;\n" +
                "c. Kemauan untuk meningkatkan pengetahuan, sikap, kemampuan " +
                "dan keterampilan.\n";

        String lulusan = "A. Hakim;\n" +
                "B. Jaksa;\n" +
                "C. Pengacara/Advokat/Penasehat Hukum;\n" +
                "D. Notaris;\n" +
                "E. Birokrat/Diplomat;\n" +
                "F. in-house lawyer/legal officer pada korporasi\n" +
                "G. Perancang peraturan perundang-undangan (legislative drafter);\n" +
                "H. Perancang Kontrak (contract drafter);\n" +
                "I. Arbiter/Mediator/Negosiator;\n" +
                "J. Konsultan Hukum/Legal Consultant;\n" +
                "K. Ilmuwan hukum/Peneliti dan profesi hukum lainnya.\n";

        JustifyTextView textView24 = (JustifyTextView) findViewById(R.id.textView24);
        textView24.setText(kompetensi);

        JustifyTextView textView26 = (JustifyTextView) findViewById(R.id.textView26);
        textView26.setText(lulusan);
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