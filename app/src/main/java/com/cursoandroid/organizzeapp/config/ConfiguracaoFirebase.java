package com.cursoandroid.organizzeapp.config;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ConfiguracaoFirebase {

    private static FirebaseAuth autenticacao;
    private static DatabaseReference firebase;

    //retonra a instancia do FirebaseDatabase
    public static DatabaseReference getFirebaseDatabase(){
        if(firebase==null){
            firebase = FirebaseDatabase.getInstance().getReference();
        }
        return firebase;
    }

    //retorna a instância do FirebaseAuth
    public static FirebaseAuth getFirebaseAutenticacao(){
        if(autenticacao == null)
            autenticacao = FirebaseAuth.getInstance();
        return autenticacao;
    }
}
