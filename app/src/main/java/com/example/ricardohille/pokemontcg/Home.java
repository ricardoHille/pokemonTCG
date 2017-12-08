package com.example.ricardohille.pokemontcg;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import com.example.ricardohille.pokemontcg.DAO.ConfiguracaoFireBase;
import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
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

        List<Carta> cartas = popularLista();
        ListView listaDeCartas = (ListView) findViewById(R.id.listagem);
        ArrayAdapter<Carta> adapter = new ArrayAdapter<Carta>(this, android.R.layout.simple_list_item_1,cartas);
        listaDeCartas.setAdapter(adapter);
    }

    private List<Carta> popularLista(){
        final List<Carta> listaCartas = new ArrayList<Carta>();
        ConfiguracaoFireBase.getFirebase().getRef().child("cartas").child("cartas").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(DataSnapshot dataSnapshot) {
                for (DataSnapshot objSnapshot : dataSnapshot.getChildren()){
                    Carta carta = objSnapshot.getValue(Carta.class);
                    listaCartas.add(carta);
                }
            }

            @Override
            public void onCancelled(DatabaseError databaseError) {

            }
        });

        return listaCartas;
    }
}
