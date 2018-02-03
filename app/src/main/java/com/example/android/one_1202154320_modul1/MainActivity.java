package com.example.android.one_1202154320_modul1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText mIsiMenu;
    private EditText mIsiPorsi;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIsiMenu = (EditText) findViewById(R.id.menu);
        mIsiPorsi = (EditText) findViewById(R.id.porsi);

    }

    public void eatbus(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String isiMenu = mIsiMenu.getText().toString();
        String isiPorsi = mIsiPorsi.getText().toString();

        intent.putExtra("harga", "50000");
        intent.putExtra("menu", isiMenu);
        intent.putExtra("porsi", isiPorsi);
        intent.putExtra("toko", "Eatbus");

        startActivity(intent);
    }

    public void abnormal(View view) {
        Intent intent = new Intent(this, Main2Activity.class);

        String isiMenu = mIsiMenu.getText().toString();
        String isiPorsi = mIsiPorsi.getText().toString();

        intent.putExtra("harga", "30000");
        intent.putExtra("menu", isiMenu);
        intent.putExtra("porsi", isiPorsi);
        intent.putExtra("toko", "Abnormal");

        startActivity(intent);
    }
}
