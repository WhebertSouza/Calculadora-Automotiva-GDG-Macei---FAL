package com.example.android.calculadoraautomotiva;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void click_main_media1(View view) {
        Intent intent = new Intent(this, Media1Activity.class);
        startActivity(intent);
    }

    public void click_main_media2(View view) {
        Intent intent = new Intent(this, Media2Activity.class);
        startActivity(intent);
    }

    public void click_main_quantoVouGastar(View view) {
        Intent intent = new Intent(this, QuantoVouGastarActivity.class);
        startActivity(intent);
    }

    public void click_main_quantosLitros(View view) {
        Intent intent = new Intent(this, QuantosLitrosActivity.class);
        startActivity(intent);
    }
}
