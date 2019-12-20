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
public class PersonagemD extends Personagem{
    
    public PersonagemD() {
        Pular p = new PularBaixo();
        this.setPulo(p);
        
        Correr c = new CorrerRapido ();
        this.setCorrida(c);
        
        Atacar a = new AtacarForte ();
        this.setAtaque(a);
    }
    
       public PersonagemD (Poder poderio)
    {
        Pular p = new PularBaixo();
        this.setPulo(p);
        
        Correr c = new CorrerRapido ();
        this.setCorrida(c);
        
        Atacar a = new AtacarForte ();
        this.setAtaque(a);
    }
    
}
