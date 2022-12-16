
package com.mycompany.event;

public class Ator extends Pessoa implements Artista  {
    private String oqueFaz;
    
    public Ator(String nome, char sexo) {
        super(nome, sexo);
        this.oqueFaz="Ator";
    }

    @Override
    public void apresentar() {
        System.out.println("~interpretando~");
    }
    
}
