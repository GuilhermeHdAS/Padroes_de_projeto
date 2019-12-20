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
public abstract class AbstractFactory {
    public abstract PersonagemA criarPersonagemA();
    public abstract PersonagemB criarPersonagemB();
    public abstract PersonagemC criarPersonagemC();
    public abstract PersonagemD criarPersonagemD();
    public abstract Personagem criarPersonagemPadrao();
    
}
