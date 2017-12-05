package com.example.ricardohille.pokemontcg;

/**
 * Created by Ricardo.Hille on 05/12/2017.
 */

public class Carta {
    private int id;
    private String nome;
    private String colecao;
    private String tipo;
    private String imgUrl;
    private String tipoCarta;
    private String subTipoCarta;

    public void setId(int id){
        this.id = id;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setColecao(String colecao){
        this.colecao = colecao;
    }

    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public void setImgURL(String imgUrl){
        this.imgUrl = imgUrl;
    }

    public void setTipoCarta(String tipoCarta){
        this.tipoCarta = tipoCarta;
    }

    public void setSubTipoCarta(String subTipoCarta){
        this.subTipoCarta = subTipoCarta;
    }

    public int getId(){
        return id;
    }

    public String getNome(){
        return nome;
    }

    public String getColecao(){
        return colecao;
    }

    public String getTipo(){
        return tipo;
    }

    public String getImgURL(){
        return imgUrl;
    }

    public String getTipoCarta(){
        return tipoCarta;
    }

    public String getSubTipoCarta(){
        return subTipoCarta;
    }

    @Override
    public String toString() {
        return "Carta: "+getNome()+" Coleção: "+getColecao()+" Tipo:"+getTipo();
    }
}
