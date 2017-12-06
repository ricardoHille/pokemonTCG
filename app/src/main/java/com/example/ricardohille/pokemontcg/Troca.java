package com.example.ricardohille.pokemontcg;

/**
 * Created by Ricardo.Hille on 05/12/2017.
 */

public class Troca {
    private int id;
    private Usuario usuarioFornecedor;
    private Usuario usuarioRecebedor;
    private String dataTroca;
    private Carta cartaFornecida;
    private Carta cartaRecebida;

    public void setId(int id){
        this.id = id;
    }

    public void setUsuarioFornecedor(Usuario usuarioFornecedor){
        this.usuarioFornecedor = usuarioFornecedor;
    }

    public void setUsuarioRecebedor(Usuario usuarioRecebedor){
        this.usuarioRecebedor = usuarioRecebedor;
    }

    public void setDataTroca(String dataTroca){
        this.dataTroca = dataTroca;
    }

    public void setCartaFornecida(Carta cartaFornecida){
        this.cartaFornecida = cartaFornecida;
    }

    public void setCartaRecebida(Carta cartaRecebida){
        this.cartaRecebida = cartaRecebida;
    }

    public Usuario getUsuarioFornecedor(){
        return usuarioFornecedor;
    }

    public Usuario getUsuarioRecebedor(){
        return usuarioRecebedor;
    }

    public String getDataTroca(){
        return dataTroca;
    }

    public Carta getCartaFornecida(){
        return cartaFornecida;
    }

    public Carta getCartaRecebida(){
        return cartaRecebida;
    }
}

