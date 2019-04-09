package com.example.myapp3;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {
    Button btnTel;
    TextView txtNomor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        btnTel = (Button)findViewById(R.id.btnTelepon);
        txtNomor = (TextView)findViewById(R.id.txtTel1);
    }

    public void runTelepon(View v) {
        String tel = "tel:" + txtNomor.getText().toString();
        Intent impl = new Intent(Intent.ACTION_CALL, Uri.parse(tel));
        startActivity(impl);
    }
}
