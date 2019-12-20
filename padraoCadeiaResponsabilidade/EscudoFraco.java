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
public class EscudoFraco extends Escudo {
    
     public void processaEscudo(int valor, Personagem personagem) {
        
        int protecao = valor/2;
        int resto = valor%2;
        
        if (protecao != 0){
            if (personagem.getLife() <= 0)
                    protecao = 0;
            
            System.out.println("Protecao baixa: "+protecao);
            
            //Ganha 2 de life, para cada decremento de protecao, valor do escudo
            while (protecao > 0){
                personagem.setLife(personagem.getLife() + 2);
                protecao--;
                if (personagem.getLife() >= 100)
                    personagem.setLife(100);
            }
            personagem.verificarLife();
            System.out.println("Life = " +personagem.getLife());
        }
        
         if (resto != 0 && getSucessor() != null)
            getSucessor().processaEscudo(resto, personagem);
            
        
    }
    
}
