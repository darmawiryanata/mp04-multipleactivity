package com.example.myapp3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnKal, btnTelp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnKal = (Button)findViewById(R.id.btnKalkulator);
        btnTelp = (Button)findViewById(R.id.btnTelepon);
    }

    public void kalkulator(View v) {
        Intent impl = new Intent(MainActivity.this,Main2Activity.class);
        startActivity(impl);
    }

    public void telepon(View v) {
        Intent impl = new Intent(MainActivity.this,Main3Activity.class);
        startActivity(impl);
    }
}
