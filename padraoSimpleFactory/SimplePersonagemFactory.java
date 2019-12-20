/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoSimpleFactory;
import personagens.*;
/**
 *
 * @author guilh
 */
public class SimplePersonagemFactory {
    
    public static Personagem createPersonagem(){
    Personagem p = null;
    
    double N = Math.random();
    
    if (N <= 0.2)
    {
        p = new PersonagemA();
        System.out.println ("Personagem A foi criado!");
    }
    else if (0.2 < N && N <= 0.4)
    {
        p = new PersonagemB();
        System.out.println ("Personagem B foi criado!");
    }
    else if (0.4 < N && N <= 0.6)
    {
        p = new PersonagemC();
        System.out.println ("Personagem C foi criado!");
    }
    else if (0.6 < N && N <= 0.8)
    {
        p = new PersonagemD();
        System.out.println ("Personagem D foi criado!");
    }else if (0.8 < N && N <= 1.0)
    {
        p = new Personagem();
        System.out.println ("Personagem Padrão foi criado!");
    }
    
    return p;
    
    }
}
