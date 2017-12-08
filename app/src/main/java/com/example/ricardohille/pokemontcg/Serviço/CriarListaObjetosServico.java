package com.example.ricardohille.pokemontcg.Serviço;

import com.example.ricardohille.pokemontcg.Carta;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ricardo.Hille on 08/12/2017.
 */

public class CriarListaObjetosServico {
    public List<Carta> cartas;

    public CriarListaObjetosServico(){
        cartas = new ArrayList<Carta>();
        cartas = popularListaCartas();
    }

    private List<Carta> popularListaCartas(){
        cartas.add(new Carta(1, "Shroomish", "Primal Clash", "Planta", "https://images.pokemontcg.io/xy5/15.png", "Pokémon", "Básico"));
        cartas.add(new Carta(2, "Breloom","Primal Clash","Planta","https://images.pokemontcg.io/xy5/16.png","Pokémon","Estágio 1"));
        cartas.add(new Carta(3, "Pidgeot","POP Series 2","Incolor","https://images.pokemontcg.io/pop2/2.png","Pokémon","Estágio 2"));
        cartas.add(new Carta(4, "Braixen","XY","Fogo","https://images.pokemontcg.io/xy0/9.png","Pokémon","Estágio 1"));
        cartas.add(new Carta(5, "Panpour","XY","Água","https://images.pokemontcg.io/xy0/11.png","Pokémon","Básico"));
        cartas.add(new Carta(6, "Combee","Ancient Origins","Planta","https://images.pokemontcg.io/xy7/9.png","Pokémon","Básico"));

        return cartas;
    }

}
