package com.example.modul2_kel17;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.FragmentActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private Button btnAbout;
    private Button btnKembali;
    private ImageView imgPhotoUser;
    private TextView tvEmail;
    private TextView tvNama;
    private TextView tvNamaPanggilan;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        this.tvNama = (TextView) findViewById(R.id.tv_first_name);
        this.tvNamaPanggilan = (TextView) findViewById(R.id.tv_last_name);
        this.tvEmail = (TextView) findViewById(R.id.tv_email);
        this.imgPhotoUser = (ImageView) findViewById(R.id.img_photo_user);
        this.btnKembali = (Button) findViewById(R.id.btn_back);
        this.btnAbout = (Button) findViewById(R.id.btn_about);
        if (getIntent().hasExtra("name") || getIntent().hasExtra("namepanggilan") || getIntent().hasExtra(NotificationCompat.CATEGORY_EMAIL)) {
            String FirstName = getIntent().getStringExtra("firstname");
            String LastName = getIntent().getStringExtra("lastname");
            String email = getIntent().getStringExtra(NotificationCompat.CATEGORY_EMAIL);
            String avatarUrl = getIntent().getStringExtra("avatar");
            this.tvNama.setText(FirstName);
            this.tvNamaPanggilan.setText(LastName);
            this.tvEmail.setText(email);
            Glide.with(this).load(avatarUrl).into(this.imgPhotoUser);
        }
        this.btnKembali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                DetailActivity.this.onBackPressed();
            }
        });
        this.btnAbout.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                DetailActivity.this.startActivity(new Intent(DetailActivity.this, About.class));
            }
        });
    }
}

