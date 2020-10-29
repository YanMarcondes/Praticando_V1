package com.example.praticando;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inicio);
        List<String> alunos = new ArrayList<>(Arrays.asList("Yan", "jess", "aquiles"));
        ListView listaDeAlunos = findViewById(R.id.activiy_lista_de_alunos);
        listaDeAlunos.setAdapter(new ArrayAdapter<>(this,android.R.layout.simple_list_item_1, alunos));
    }
}