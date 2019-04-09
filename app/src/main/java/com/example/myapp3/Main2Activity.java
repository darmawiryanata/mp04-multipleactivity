package com.example.myapp3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Button btnTambah, btnKurang;
    EditText txtAngka1, txtAngka2, txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        txtAngka1 = (EditText) findViewById(R.id.txtAngka1);
        txtAngka2 = (EditText)findViewById(R.id.txtAngka2);
        btnTambah = (Button)findViewById(R.id.btnTambah);
        btnKurang = (Button)findViewById(R.id.btnKurang);
        txtHasil = (EditText) findViewById(R.id.txtHasil);
    }

    public void oprTambah(View v) {
        String nilai1= txtAngka1.getText().toString().trim();
        String nilai2= txtAngka2.getText().toString().trim();
        double a = Double.parseDouble(nilai1);
        double b = Double.parseDouble(nilai2);
        double Hasil = a + b;
        txtHasil.setText(String.valueOf(Hasil));
    }

    public void oprKurang(View v) {
        String nilai1= txtAngka1.getText().toString().trim();
        String nilai2= txtAngka2.getText().toString().trim();
        double a = Double.parseDouble(nilai1);
        double b = Double.parseDouble(nilai2);
        double Hasil = a - b;
        txtHasil.setText(String.valueOf(Hasil));
    }
}
