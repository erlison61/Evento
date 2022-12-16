package com.mycompany.event;

import java.util.ArrayList;


public class EventoBeneficente {
    private ArrayList<Pessoa> artistas;
    
    
    public EventoBeneficente() {
        this.artistas=new ArrayList<>();
    }

    public void adicionarArtista(Pessoa artista){
        artistas.add(artista);
    }
    
    public Pessoa pesquisarArtistaPeloNome(String nome){
        for(Pessoa artista:artistas){
           if(artista.getNome().equals(nome)) return artista;
        }
        return null;
    }
    
    public Pessoa mostrarDados(){
      for(Pessoa artista:artistas) return artista;
      
      return null;
    }
}
