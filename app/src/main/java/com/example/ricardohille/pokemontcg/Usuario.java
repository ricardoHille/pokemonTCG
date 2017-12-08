package com.example.ricardohille.pokemontcg;

/**
 * Created by Ricardo.Hille on 05/12/2017.
 */

public class Usuario {
    private int id;
    private String nome;
    private String senha;
    private boolean conectado;

    public Usuario (int id, String nome, String senha){
        this.id = id;
        this.nome = nome;
        this.senha = senha;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSenha(String senha) { this.senha = senha; }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }
    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public boolean getConectado(){
        return conectado;
    }

    public String getSenha() { return senha; }

    @Override
    public String toString() {
        return "Usuário: "+ getNome() + " Conectado: "+getConectado();
    }
}
