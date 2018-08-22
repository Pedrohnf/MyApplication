package com.kkk.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onClique(View v){

        RadioGroup grupo = findViewById(R.id.grupo);
        EditText nome = findViewById(R.id.nome);

        CheckBox promocoes = findViewById(R.id.promocao);

        if(R.id.B1 == grupo.getCheckedRadioButtonId() && promocoes.isChecked()){

            Toast.makeText(this, "Escolha 1", Toast.LENGTH_SHORT).show();

        }else if(R.id.B2 == grupo.getCheckedRadioButtonId() && promocoes.isChecked()){

            Toast.makeText(this, "Escolha 2", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Errado", Toast.LENGTH_SHORT).show();
        }
    }


}
