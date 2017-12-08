package com.example.ricardohille.pokemontcg;

/**
 * Created by Ricardo.Hille on 05/12/2017.
 */

public class CartaUsuario {
    private int id;
    private Usuario usuario;
    private Carta carta;

    public CartaUsuario(int id, Usuario usuario, Carta carta){
        this.id = id;
        this.usuario = usuario;
        this.carta = carta;
    }

    public void setId(int id){
        this.id = id;
    }

    public void setUsuario(Usuario usuario){
        this.usuario = usuario;
    }

    public void setCarta(Carta carta){
        this.carta = carta;
    }

    public int getId(){
        return id;
    }

    public Usuario getUsuario(){
        return usuario;
    }

    public Carta getCarta(){
        return carta;
    }
}
