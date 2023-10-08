package com.example.modul2_kel17;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
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
    }

}