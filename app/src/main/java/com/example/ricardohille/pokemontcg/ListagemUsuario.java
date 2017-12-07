package com.example.ricardohille.pokemontcg;

import android.os.Bundle;
import android.os.CpuUsageInfo;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.JsonReader;
import android.util.Log;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.example.ricardohille.pokemontcg.servico.ListaObjetosServico;

import java.util.List;
/**
 * Created by Ricardo.Hille on 06/12/2017.
 */

public class ListagemUsuario extends AppCompatActivity {
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        setContentView(R.layout.activity_home);

        //ListaObjetosServico listaObjetosServico = new ListaObjetosServico();

        List<Usuario> listaUsuarios = ListaObjetosServico.listaUsuarios;
        //ListView listaDeUsuarios = (ListView) findViewById(R.layout.listagemUsuario);
        //ArrayAdapter<Usuario> adapter = new ArrayAdapter<Usuario>(this, android.R.layout.simple_list_item_1, listaUsuarios);
        //listaDeUsuarios.setAdapter(adapter);
    }
}
