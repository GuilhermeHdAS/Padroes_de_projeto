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
public class EstadoForte extends Estado{
    
        public EstadoForte (Personagem p)
        {
            System.out.println (getClass().getName());
            p.setAtaque(new AtacarForte());
            p.setCorrida(new CorrerRapido());
            p.setPulo(new PularAlto());
        }
    
        public void verificarEstado (Personagem p)
        {
            if ((p.getLife() >= 30) && (p.getLife()<= 70))
                p.setEstado(new EstadoNormal(p));
            if ((p.getLife() > 0) && (p.getLife() < 30))
                p.setEstado(new EstadoPerigo(p));
            else if (p.getLife() <= 0)
                p.setEstado(new EstadoMorto(p));
        }
    
}
