/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoState;
import personagens.*;
/**
 *
 * @author gui
 */
public abstract class Estado {
    
        public abstract void verificarEstado (Personagem p);
    
        public void recuperarLife (int x, Personagem p)
        {
           if (p.getLife() > 0)
               p.setLife(p.getLife() + x);
        }
        
        public void perderLife (int x, Personagem p)
        {
            if (p.getLife() > 0)
               p.setLife(p.getLife() - x);
        }
}
