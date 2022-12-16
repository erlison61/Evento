
package com.mycompany.event;

public class Comediante extends Pessoa implements Artista {
    private String oqueFaz;
    
    public Comediante(String nome, char sexo) {
        super(nome, sexo);
        this.oqueFaz="Comediante";
    }

    @Override
    public void apresentar() {
        System.out.println("~contando causo~");
    }
    
}
