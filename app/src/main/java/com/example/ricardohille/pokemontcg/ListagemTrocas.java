package com.example.ricardohille.pokemontcg;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import java.util.List;

/**
 * Created by Ricardo.Hille on 06/12/2017.
 */

public class ListagemTrocas extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_home);

        //ListaObjetosServico listaObjetosServico = new ListaObjetosServico();

        //List<Troca> listaTrocas = ListaObjetosServico.listaTrocas;
        //ListView listaDeTrocas = (ListView) findViewById(R.layout.listagemTroca);
        //ArrayAdapter<Usuario> adapter = new ArrayAdapter<Usuario>(this, android.R.layout.simple_list_item_1, listaTrocas);
        //listaDeTrocas.setAdapter(adapter);
    }
}
