/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoState;
import padraoStrategy.*;
import personagens.*;
/**
 *
 * @author gui
 */
public class EstadoPerigo extends Estado{
    
    public EstadoPerigo (Personagem p)
    {
        System.out.println (getClass().getName());
        p.setAtaque(new AtacarFraco());
        p.setCorrida(new CorrerDevagar());
        p.setPulo(new PularBaixo());
    }
    
    public void verificarEstado (Personagem p)
    {
        if ((p.getLife() >= 30) && (p.getLife()<= 70))
            p.setEstado(new EstadoNormal(p));
        else if (p.getLife() > 70)
            p.setEstado(new EstadoForte (p));
        else if (p.getLife() <= 0)
            p.setEstado(new EstadoMorto(p));
    }
    
}
