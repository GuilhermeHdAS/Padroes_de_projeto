/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens;
import padraoDecorator.*;
import padraoStrategy.*;
/**
 *
 * @author gui
 */
public class PersonagemB extends Personagem{
    
    public PersonagemB(){
        Pular p = new PularAlto();
        this.setPulo(p);
        
        Correr c = new CorrerRapido ();
        this.setCorrida(c);
        
        Atacar a = new AtacarMedio ();
        this.setAtaque(a);
    }
    
    public PersonagemB (Poder poderio)
    {
        Pular p = new PularAlto();
        this.setPulo(p);
        
        Correr c = new CorrerRapido ();
        this.setCorrida(c);
        
        Atacar a = new AtacarMedio ();
        this.setAtaque(a);
    }
       
}
