package com.example.ricardohille.pokemontcg.DAO;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseAuthException;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by Ricardo.Hille on 07/12/2017.
 */

public class ConfiguracaoFireBase {
    public static DatabaseReference referenciaFireBase;
    public static FirebaseAuth autenticacao;

    public static DatabaseReference getFirebase(){
        if (referenciaFireBase == null){
            referenciaFireBase = FirebaseDatabase.getInstance().getReference();
        }
        return referenciaFireBase;
    }

    public static FirebaseAuth getFireBaseAutenticacao(){
        if (autenticacao == null){
            autenticacao = FirebaseAuth.getInstance();
        }

        return autenticacao;
    }
}
