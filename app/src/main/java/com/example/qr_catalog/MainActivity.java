package com.example.qr_catalog;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("StaticFieldLeak")
    public static TextView resulttextview;
    Button scan_btn, result_btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resulttextview = findViewById(R.id.qrcodetextview);
        scan_btn = findViewById(R.id.buttonscan);
        result_btn = findViewById(R.id.buttonresult);

        scan_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),ScanCodeActivity.class));
            }
        });

        result_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,resulttextview.getText(),Toast.LENGTH_SHORT).show();
            }
        });
    }
}