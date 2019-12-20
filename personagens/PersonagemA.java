/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens;
import padraoStrategy.*;
import padraoDecorator.*;
/**
 *
 * @author gui
 */
public class PersonagemA extends Personagem {
    
    public PersonagemA (){
        Pular p = new PularMedio();
        this.setPulo(p);
        
        Correr c = new CorrerMedio ();
        this.setCorrida(c);
        
        Atacar a = new AtacarForte ();
        this.setAtaque(a);
    }
    
    public PersonagemA (Poder poderio)
    {
        Pular p = new PularMedio();
        this.setPulo(p);
        
        Correr c = new CorrerMedio ();
        this.setCorrida(c);
        
        Atacar a = new AtacarForte ();
        this.setAtaque(a);
        
    }
    
}
