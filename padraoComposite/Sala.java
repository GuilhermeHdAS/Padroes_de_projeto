package padraoComposite;

import inimigos.*;
import personagens.*;

public class Sala implements Component{

    private Component caminho1;
    private Component caminho2;
    private String nome;
    
    public Sala(Component c1, Component c2, String nome){
        this.caminho1 = c1;
        this.caminho2 = c2;
        this.nome = nome;
        }

        public void andar(Personagem p){
            try{
              Thread.sleep(2000);
            }
            catch(Exception e){
            } 
            
        double opcao = Math.random();
        
        if (opcao <=0.2)
           System.out.println("Personagem "+p.getClass().getName()+" entrou na sala "+this.nome+" e está enfrentando o inimigo Ceifador do mal");
        else if (opcao >=0.3 && opcao < 0.6)
           System.out.println("Personagem "+p.getClass().getName()+" entrou na sala "+this.nome+" e está enfrentando o inimigo Atirador do mal");
        else if (opcao >=0.6 && opcao < 0.8)
           System.out.println("Personagem "+p.getClass().getName()+" entrou na sala "+this.nome+" e está enfrentando o inimigo El Macabro");
        else if (opcao >=0.8)
           System.out.println("Personagem "+p.getClass().getName()+" entrou na sala "+this.nome+" e está enfrentando o inimigo Feiticeiro");

        double valor = Math.random();


        if (valor < 0.5) {
            System.out.println("Personagem "+p.getClass().getName()+" pegou caminho 1"); 
            caminho1.andar(p);
                }
        else {

            System.out.println("Personagem "+p.getClass().getName()+" pegou caminho 2");   
            caminho2.andar(p);

                }

    }
        
       
}
