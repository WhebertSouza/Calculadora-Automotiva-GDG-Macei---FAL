package com.example.android.calculadoraautomotiva;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QuantosLitrosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quantos_litros);
    }

    public void clickCalcular(View view) {
        EditText consumo = (EditText) findViewById(R.id.edt_media4_consumo);
        EditText kmPercorrer = (EditText) findViewById(R.id.edt_media4_kmPercorrer);
        TextView textConsumo = (TextView) findViewById(R.id.text_Media4_consumo);

        if(consumo.getText().toString().equals("") || kmPercorrer.getText().toString().equals("")){
            Toast.makeText(QuantosLitrosActivity.this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
        }else{
            Float calculo = Float.valueOf(kmPercorrer.getText().toString()) / Float.valueOf(consumo.getText().toString());
            textConsumo.setText("Você irá precisar de "+String.format("%.2f", calculo)+ " Litros");
        }

    }

    public void clickLimpar(View view) {

        EditText consumo = (EditText) findViewById(R.id.edt_media4_consumo);
        EditText kmPercorrer = (EditText) findViewById(R.id.edt_media4_kmPercorrer);
        TextView textConsumo = (TextView) findViewById(R.id.text_Media4_consumo);

        consumo.setText("");
        kmPercorrer.setText("");
        textConsumo.setText("");

    }

    public void clickVoltar(View view) {
        onBackPressed();
    }

}
