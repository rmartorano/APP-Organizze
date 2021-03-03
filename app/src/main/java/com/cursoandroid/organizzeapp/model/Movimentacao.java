package com.cursoandroid.organizzeapp.model;

import com.cursoandroid.organizzeapp.config.ConfiguracaoFirebase;
import com.cursoandroid.organizzeapp.helper.Base64Custom;
import com.cursoandroid.organizzeapp.helper.DateUtil;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;

public class Movimentacao {

    private String data, categoria, descricao, tipo;
    private double valor;


    public Movimentacao() {
    }

    public void salvar(String dataEscolhida){

        FirebaseAuth autenticacao = ConfiguracaoFirebase.getFirebaseAutenticacao();
        String idUsuario = Base64Custom.codificarBase64(autenticacao.getCurrentUser().getEmail());

        DatabaseReference firebase = ConfiguracaoFirebase.getFirebaseDatabase();
        firebase.child("movimentacao")
                .child(idUsuario)
                .child(DateUtil.mesAnoDataEscolhia(dataEscolhida))
                .push() //cria um id único
                .setValue(this);
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
