package com.example.android.calculadoraautomotiva;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Media1Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media1);
    }


    public void clickCalcular(View view) {
        EditText KmRodado = (EditText) findViewById(R.id.edt_media1_kmRodado);
        EditText Litros = (EditText) findViewById(R.id.edt_media1_LitrosAbastecido);
        TextView consumo = (TextView) findViewById(R.id.text_Media1_consumo);

        if(Litros.getText().toString().equals("") || KmRodado.getText().toString().equals("")){
            Toast.makeText(Media1Activity.this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
        }else{
            Float calculo = Float.valueOf(KmRodado.getText().toString()) / Float.valueOf(Litros.getText().toString());
            consumo.setText("Seu carro fez "+String.format("%.2f", calculo)+ " KM/L");
        }

    }

    public void clickLimpar(View view) {
        EditText KmRodado = (EditText) findViewById(R.id.edt_media1_kmRodado);
        EditText Litros = (EditText) findViewById(R.id.edt_media1_LitrosAbastecido);
        TextView consumo = (TextView) findViewById(R.id.text_Media1_consumo);

        KmRodado.setText(null);
        Litros.setText(null);
        consumo.setText(null);
    }

    public void clickVoltar(View view) {
        onBackPressed();
    }
}
