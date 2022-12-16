package com.mycompany.event;

public class Cantor extends Pessoa implements Artista {
    
    private String oqueFaz;

    public Cantor(String nome, char sexo) {
        super(nome, sexo);
        this.oqueFaz="cantor";
    }

    @Override
    public void apresentar() {
        System.out.println("~cantoria~");
    }
    
}
