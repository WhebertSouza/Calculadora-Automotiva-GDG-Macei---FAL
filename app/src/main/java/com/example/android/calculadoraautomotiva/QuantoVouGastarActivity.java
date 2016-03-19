package com.example.android.calculadoraautomotiva;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class QuantoVouGastarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quanto_vou_gastar);
    }

    public void clickCalcular(View view) {
        EditText consumo = (EditText) findViewById(R.id.edt_media3_consumo);
        EditText kmPercorrer = (EditText) findViewById(R.id.edt_media3_kmPercorrer);
        EditText valorCombustivel = (EditText) findViewById(R.id.edt_media3_valorDoCombustivel);
        TextView TextConsumo = (TextView) findViewById(R.id.text_Media3_consumo);

        if(consumo.getText().toString().equals("") || kmPercorrer.getText().toString().equals("") || valorCombustivel.getText().toString().equals("")){
            Toast.makeText(QuantoVouGastarActivity.this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
        }
        else{
            Float calculo = (Float.valueOf(kmPercorrer.getText().toString()) / Float.valueOf(consumo.getText().toString())) * Float.valueOf(valorCombustivel.getText().toString());
            TextConsumo.setText("Você irá gastar R$ "+String.format("%.2f", calculo));
        }

    }

    public void clickLimpar(View view) {
        EditText consumo = (EditText) findViewById(R.id.edt_media3_consumo);
        EditText kmPercorrer = (EditText) findViewById(R.id.edt_media3_kmPercorrer);
        EditText valorCombustivel = (EditText) findViewById(R.id.edt_media3_valorDoCombustivel);
        TextView TextConsumo = (TextView) findViewById(R.id.text_Media3_consumo);

        consumo.setText(null);
        kmPercorrer.setText(null);
        valorCombustivel.setText(null);
        TextConsumo.setText(null);
    }

    public void clickVoltar(View view) {
        onBackPressed();
    }

}
