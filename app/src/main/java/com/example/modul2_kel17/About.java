package com.example.modul2_kel17;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class About extends AppCompatActivity {
    private Button btnBack;
    private Button back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        initView();
    }




    private void initView() {
        btnBack = findViewById(R.id.btnBack);
        back = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                About.this.startActivity(new Intent(About.this, MainActivity.class));
            }
        });
    }

    @Override
    public void onBackPressed() {
        // Panggil super.onBackPressed() untuk memproses perintah kembali default
        super.onBackPressed();
    }

}