package com.example.android.calculadoraautomotiva;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Media2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_media2);
    }

    public void clickCalcular(View view) {
        EditText KmInicial = (EditText) findViewById(R.id.edt_media2_kmInicial);
        EditText KmFinal = (EditText) findViewById(R.id.edt_media2_kmFinal);
        EditText Litros = (EditText) findViewById(R.id.edt_media2_LitrosAbastecido);
        TextView consumo = (TextView) findViewById(R.id.text_Media2_consumo);

        if(Litros.getText().toString().equals("") || KmInicial.getText().toString().equals("") || KmFinal.getText().toString().equals("")){
            Toast.makeText(Media2Activity.this, "Preencha todos os campos!", Toast.LENGTH_SHORT).show();
        }
        else if (Float.valueOf(KmFinal.getText().toString()) < Float.valueOf(KmInicial.getText().toString())){
            Toast.makeText(Media2Activity.this, "Km final não pode ser menor que Km inicial", Toast.LENGTH_SHORT).show();
        }
        else{
            Float calculo = (Float.valueOf(KmFinal.getText().toString()) - Float.valueOf(KmInicial.getText().toString())) / Float.valueOf(Litros.getText().toString());
            consumo.setText("Seu carro fez "+String.format("%.2f", calculo)+ " KM/L");
        }

    }

    public void clickLimpar(View view) {
        EditText KmInicial = (EditText) findViewById(R.id.edt_media2_kmInicial);
        EditText KmFinal = (EditText) findViewById(R.id.edt_media2_kmFinal);
        EditText Litros = (EditText) findViewById(R.id.edt_media2_LitrosAbastecido);
        TextView consumo = (TextView) findViewById(R.id.text_Media2_consumo);

        KmInicial.setText(null);
        KmFinal.setText(null);
        Litros.setText(null);
        consumo.setText(null);
    }

    public void clickVoltar(View view) {
        onBackPressed();
    }
}
