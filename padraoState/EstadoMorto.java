/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoState;
import personagens.*;
import padraoStrategy.*;

/**
 *
 * @author gui
 */
public class EstadoMorto extends Estado{
    
    public EstadoMorto (Personagem p)
    {
        System.out.println (getClass().getName());
        p.setAtaque(new SemAtaque());
        p.setCorrida(new SemCorrer());
        p.setPulo(new SemPulo());
    }
    
    public void verificarEstado (Personagem p)
    {
    }

}
