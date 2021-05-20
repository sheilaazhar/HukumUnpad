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


public class Profil extends AppCompatActivity {

    Toolbar toolbar;
    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profil);

        toolbar = findViewById(R.id.toolbar);

        TextView toolbarText = (TextView) findViewById(R.id.toolbar_text);
        toolbarText.setText("Profil");
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String par1 = "         Kurikulum adalah seperangkat rencana dan pengaturan mengenai isi maupun bahan kajian dan pelajaran serta cara penyampaian dan penilaiannya yang digunakan sebagai petunjuk penyelenggaraan kegiatan belajar mengajar di Fakultas Hukum Universitas Padjadjaran, yang harus ditempuh oleh mahasiswa dalam rangka pencapaian gelar sarjana hukum. \n " +
                "         Universitas Padjadjaran menyediakan kurikulum dengan jumlah SKS sekurang-kurangnya 144 dan sebanyak-banyaknya 160, yang dapat ditempuh dalam waktu 8 (delapan) semester. Kurikulum memungkinkan untuk ditempuh kurang dari delapan semester bagi mahasiswa yang memiliki kemampuan akademik lebih baik dengan memanfaatkan semester biasa dan semester alih tahun. Jenis matakuliah di dalam kurikulum Fakultas Hukum Universitas Padjadjaran terdiri atas Kurikulum Inti dan Kurikulum Institusional yang meliput kelompok: Matakuliah Pengembangan Kepribadian (MPK), Matakuliah Keilmuan dan Keterampilan (MKK), Matakuliah Keahlian Berkarya (MKB), Matakuliah Perilaku Berkarya (MPB), dan Matakuliah Berkehidupan Bermasyarakat (MBB)\n";

        JustifyTextView textView19 = (JustifyTextView) findViewById(R.id.textView19);
        textView19.setText(par1);

        String visi = "         Menjadi Program Studi S1 Ilmu Hukum yang menyelenggaran pendidikan hukum  yang berfungsi sebagai sarana pembaharuan masyarakat dan memiliki keunggulan serta reputasi tinggi di tingkat nasional dan internasional tahun 2026.\n";
        String misi = "1. Menyelenggarakan dan mengembangkan sistem pendidikan ilmu hukum berbasis riset secara efektif dan efisien melalui penerapan sistem student centered learning yang dapat merespon kebutuhan masyarakat.\n" +
                "2. Meningkatkan kuantitas dan kualitas penelitian hukum yang berguna bagi pendidikan hukum pada khususnya, masyarakat dan pembangunan hukum nasional pada umumnya.\n" +
                "3. Meningkatkan kuantitas dan kualitas pengabdian kepada masyarakat guna meningkatkan kesadaran hukum masyarakat, dan membantu memecahkan masalah hukum di masyarakat , serta menunjang pembangunan nasional.\n" +
                "4. Meningkatkan kualitas tenaga pendidik dan tenaga kependidikan guna menghasilkan lulusan yang berkualitas yang berguna bagi bangsa dan negara.\n" +
                "5. Menjalin hubungan kerjasama strategis dengan masyarakat, pemerintah, kelompok bisnis dan industri, institusi pendidikan, serta perguruan tinggi lain baik didalam negeri maupun luar negeri secara berkelanjutan dengan menerapkan prinsip kesetaraan, kemitraan, dan saling percaya.\n";

        JustifyTextView textView27 = (JustifyTextView) findViewById(R.id.textView27);
        textView27.setText(visi);

        JustifyTextView textView30 = (JustifyTextView) findViewById(R.id.textView30);
        textView30.setText(misi);

        String tujuan = "a. Menghasilkan lulusan Program Studi Sarjana (S1) Ilmu Hukum  Fakultas Hukum Universitas Padjadjaran yang berdaya guna dan  berdaya saing dalam pasar kerja nasional maupun internasional,  dengan mampu:\n" +
                "1. Memahami Hukum sebagai Sarana Pembangunan;\n" +
                "2. Menganalisis masalah-masalah hukum dalam masyarakat;\n" +
                "3. Menerapkan hukum yang berkeadilan;\n" +
                "4. Mengembangkan keahlian dan keterampilan dalam bidang \n" +
                "hukum;\n" +
                "5. Mengembangkan dan meningkatkan profesionalisme hukum " +
                "dengan menjunjung tinggi etika profesi hukum.\n\n" +
                "b. Meningkatnya kuantitas dan kualitas penelitian yang berorientasi pada perkembangan hukum nasional dan internasional serta berguna bagi pendidikan Program Studi S1 Ilmu Hukum dalam rangka pembangunan hukum nasional.\n\n" +
                "c. Meningkatnya kuantitas dan kualitas pengabdian kepada" +
                " masyarakat untuk menunjang pembelajaran Program Studi S1 Ilmu Hukum dan meningkatkan kesadaran hukum masyarakat.\n\n" +
                "d. Terselenggaranya proses pembelajaran yang efektif dan efisien untuk menghasilkan lulusan yang berdaya guna dan berdaya saing dalam pasar kerja nasional maupun internasional.\n\n" +
                "e. Meningkatnya jumlah keterlibatan mahasiswa pada kegiatan penelitian dan pengabdian masyarakat yang menunjang pengembangan keilmuan dalam berkontribusi bagi pemerintah, industri, masyarakat, dan pemangku kepentingan lainnya.\n\n" +
                "f. Terwujudnya kerjasama dengan berbagai pihak di tingkat nasional dan internasional untuk memperkuat pelaksanaan Tridharma Perguruan Tinggi.\n";

        JustifyTextView textView17 = (JustifyTextView) findViewById(R.id.textView17);
        textView17.setText(tujuan);
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