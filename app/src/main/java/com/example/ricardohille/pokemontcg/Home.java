package com.example.ricardohille.pokemontcg;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ricardohille.pokemontcg.Serviço.CriarListaObjetosServico;
import com.google.firebase.FirebaseApp;
import java.util.List;

public class Home extends AppCompatActivity {

    private TextView mTextMessage;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTextMessage.setText(R.string.title_home);
                    return true;
                case R.id.navigation_dashboard:
                    mTextMessage.setText(R.string.title_dashboard);
                    return true;
                case R.id.navigation_notifications:
                    mTextMessage.setText(R.string.title_notifications);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        FirebaseApp.initializeApp(Home.this);

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);

        final CriarListaObjetosServico servicoLista = new CriarListaObjetosServico();

        List<Carta> cartas = servicoLista.cartas;
        ListView listaDeCartas = (ListView) findViewById(R.id.listagem);
        ArrayAdapter<Carta> adapter = new ArrayAdapter<Carta>(this, android.R.layout.simple_list_item_1,cartas);
        listaDeCartas.setAdapter(adapter);

        listaDeCartas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                int idCarta = (int) adapterView.getAdapter().getItemId(i);

                Carta carta = servicoLista.cartas.get(idCarta);

                Intent intent = new Intent(Home.this, InfoCarta.class);
                Bundle bundle = new Bundle();

                String urlImagem = carta.getImgURL();

                bundle.putString("imgURL", urlImagem);
                intent.putExtras(bundle);

                startActivity(intent);
            }
        });
    }
}
