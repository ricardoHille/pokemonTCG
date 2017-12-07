package com.example.ricardohille.pokemontcg.servico;

import android.util.JsonReader;
import android.util.Log;

import com.example.ricardohille.pokemontcg.Carta;
import com.example.ricardohille.pokemontcg.CartaUsuario;
import com.example.ricardohille.pokemontcg.Troca;
import com.example.ricardohille.pokemontcg.Usuario;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ricardo.Hille on 06/12/2017.
 */

public class ListaObjetosServico {
    public static List<Usuario> listaUsuarios;
    public static List<Carta> listaCartas;
    public static List<Troca> listaTrocas;
    public static List<CartaUsuario> listaCartaUsuario;

    public ListaObjetosServico(){
        IniciarListaCartas();
        IniciarListaUsuarios();
        IniciarListaTrocas();
        IniciarListaCartaUsuario();
    }

    public void IniciarListaCartas(){
        listaCartas = popularListaCartas();
    }

    public void IniciarListaUsuarios(){
        listaUsuarios = popularListaUsuarios();
    }

    public void IniciarListaTrocas(){
        listaTrocas = popularListaTrocas();
    }

    public void IniciarListaCartaUsuario(){
        listaCartaUsuario = popularListaCartaUsuario();
    }

    private List<Carta> popularListaCartas(){
        List<Carta> listaCartas = new ArrayList<Carta>();

        try{
            InputStream file = new FileInputStream(".../json/json_cartas.txt");
            JsonReader jsonReader = new JsonReader(new InputStreamReader(file));

            jsonReader.beginArray();
            while(jsonReader.hasNext()){
                listaCartas.add(retornarCarta(jsonReader));
            }
            jsonReader.endArray();

        }catch(IOException ex){
            Log.i("myExceptionTag", ex.getMessage());
        }

        return listaCartas;
    }

    private Carta retornarCarta(JsonReader jsonReader){
        Carta carta = new Carta();
        String nameTag = "";

        try{
            jsonReader.beginObject();
            while(jsonReader.hasNext()){
                nameTag = jsonReader.nextName();
                if(nameTag.equals("id")){
                    carta.setId(jsonReader.nextInt());
                }else if(nameTag.equals("nome")){
                    carta.setNome(jsonReader.nextString());
                }else if(nameTag.equals("colecao")){
                    carta.setColecao(jsonReader.nextString());
                }else if(nameTag.equals("tipo")){
                    carta.setTipo(jsonReader.nextString());
                }else if(nameTag.equals("imgUrl")){
                    carta.setImgURL(jsonReader.nextString());
                }else if(nameTag.equals("tipoCarta")){
                    carta.setTipoCarta(jsonReader.nextString());
                }else if(nameTag.equals("subTipoCarta")){
                    carta.setSubTipoCarta(jsonReader.nextString());
                }
            }
            jsonReader.endObject();
        }catch(IOException ex){
            Log.i("myExceptionTag", ex.getMessage());
        }
        return carta;
    }

    private List<Usuario> popularListaUsuarios(){
        List<Usuario> listaUsuarios = new ArrayList<Usuario>();

        try{
            InputStream file = new FileInputStream("C:/Users/ricardo.hille.BENNER/Desktop/json_usuario.txt");
            JsonReader jsonReader = new JsonReader(new InputStreamReader(file));

            jsonReader.beginArray();
            while(jsonReader.hasNext()){
                listaUsuarios.add(retornarUsuario(jsonReader));
            }
            jsonReader.endArray();

        }catch(IOException ex){
            Log.i("myExceptionTag", ex.getMessage());
        }

        return listaUsuarios;
    }

    private Usuario retornarUsuario(JsonReader jsonReader){
        Usuario usuario = new Usuario();
        String nameTag = "";

        try{
            jsonReader.beginObject();
            while(jsonReader.hasNext()){
                nameTag = jsonReader.nextName();
                if(nameTag.equals("id")){
                    usuario.setId(jsonReader.nextInt());
                }else if(nameTag.equals("nome")) {
                    usuario.setNome(jsonReader.nextString());
                }
            }
            jsonReader.endObject();
        }catch(IOException ex){
            Log.i("myExceptionTag", ex.getMessage());
        }
        return usuario;
    }

    private List<Troca> popularListaTrocas(){
        List<Troca> listaTroca = new ArrayList<Troca>();

        try{
            InputStream file = new FileInputStream("C:/Users/ricardo.hille.BENNER/Desktop/json_troca.txt");
            JsonReader jsonReader = new JsonReader(new InputStreamReader(file));

            jsonReader.beginArray();
            while(jsonReader.hasNext()){
                listaTroca.add(retornarTroca(jsonReader));
            }
            jsonReader.endArray();

        }catch(IOException ex){
            Log.i("myExceptionTag", ex.getMessage());
        }

        return listaTroca;
    }

    private Troca retornarTroca(JsonReader jsonReader){
        Troca troca = new Troca();
        String nameTag = "";

        try{
            jsonReader.beginObject();
            while(jsonReader.hasNext()) {
                if(nameTag.equals("id")){
                    troca.setId(jsonReader.nextInt());
                }else if(nameTag.equals("usuarioFornecedor")){
                    troca.setUsuarioFornecedor(getUsuario(jsonReader.nextInt()));
                }else if (nameTag.equals("usuarioRecebedor")){
                    troca.setUsuarioRecebedor(getUsuario(jsonReader.nextInt()));
                }else if(nameTag.equals("cartaFornecida")){
                    troca.setCartaFornecida(getCarta(jsonReader.nextInt()));
                }else if(nameTag.equals("cartaRecebida")){
                    troca.setCartaRecebida(getCarta(jsonReader.nextInt()));
                }else if(nameTag.equals("dataTroca")){
                    troca.setDataTroca(jsonReader.nextString());
                }
            }
            jsonReader.endObject();
        }catch(IOException ex){
            Log.i("myExceptionTag", ex.getMessage());
        }

        return troca;
    }

    private List<CartaUsuario> popularListaCartaUsuario(){
        List<CartaUsuario> listaCartaUsuario = new ArrayList<CartaUsuario>();

        try{
            InputStream file = new FileInputStream("C:/Users/ricardo.hille.BENNER/Desktop/json_carta_usuario.txt");
            JsonReader jsonReader = new JsonReader(new InputStreamReader(file));

            jsonReader.beginArray();
            while(jsonReader.hasNext()){
                listaCartaUsuario.add(retornarCartaUsuario(jsonReader));
            }
            jsonReader.endArray();

        }catch(IOException ex){
            Log.i("myExceptionTag", ex.getMessage());
        }

        return listaCartaUsuario;
    }

    private CartaUsuario retornarCartaUsuario(JsonReader jsonReader){
        CartaUsuario cartaUsuario = new CartaUsuario();
        String nameTag = "";

        try{
            jsonReader.beginObject();
            while(jsonReader.hasNext()) {
                if(nameTag.equals("id")){
                    cartaUsuario.setId(jsonReader.nextInt());
                }else if(nameTag.equals("usuario")){
                    cartaUsuario.setUsuario(getUsuario(jsonReader.nextInt()));
                }else if (nameTag.equals("carta")){
                    cartaUsuario.setCarta(getCarta(jsonReader.nextInt()));
                }
            }
            jsonReader.endObject();
        }catch(IOException ex){
            Log.i("myExceptionTag", ex.getMessage());
        }

        return cartaUsuario;
    }

    private Usuario getUsuario(int idUsuario){
        return listaUsuarios.get(idUsuario);
    }

    private Carta getCarta(int idCarta){
        return listaCartas.get(idCarta);
    }

}
