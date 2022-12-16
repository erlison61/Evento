package com.mycompany.event;
public class Event {
    public static void main(String[] args) {
     EventoBeneficente evento = new EventoBeneficente();   
        
     Cantor c=new Cantor("joão",'M');
     
     Comediante c2= new Comediante("julia",'F');
     
     Ator a=new Ator("mario",'t');
     
     
     
     evento.adicionarArtista(a);
     evento.adicionarArtista(c);
     evento.adicionarArtista(c2);
     
     System.out.println(evento.pesquisarArtistaPeloNome("mario"));
     System.out.println(evento.mostrarDados());
     
    }
}
