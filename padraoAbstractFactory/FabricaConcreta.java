/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoAbstractFactory;

import personagens.*;

/**
 *
 * @author guilh
 */
public class FabricaConcreta extends AbstractFactory{
    public PersonagemA criarPersonagemA()
    {
        return new PersonagemA();
    }
    
    public PersonagemB criarPersonagemB()
    {
        return new PersonagemB();
    }
    
    public PersonagemC criarPersonagemC()
    {
        return new PersonagemC();
    }
    
    public PersonagemD criarPersonagemD()
    {
        return new PersonagemD();
    }
    
    public Personagem criarPersonagemPadrao()
    {
        return new Personagem();
    }
    
}
