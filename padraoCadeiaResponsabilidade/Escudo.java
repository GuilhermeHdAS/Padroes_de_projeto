/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoCadeiaResponsabilidade;

import personagens.Personagem;
import padraoState.*;
/**
 *
 * @author gui
 */
public abstract class Escudo {
    
    private Escudo sucessor;

    public Escudo getSucessor() {
        return sucessor;
    }

    public void setSucessor(Escudo sucessor) {
        this.sucessor = sucessor;
    }
    
    public abstract void processaEscudo(int valor, Personagem personagem);
               
}
