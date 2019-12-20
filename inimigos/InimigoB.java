/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inimigos;

import padraoCadeiaResponsabilidade.*;
import padraoObserver.*;
import padraoState.*;
import padraoStrategy.*;
import personagens.*;

/**
 *
 * @author gui
 */
public class InimigoB implements Observador{
    
    int x;
    int y;
    private Atacar ataque;
    
    public InimigoB (int x, int y)
    {
        this.x = x;
        this.y = y; 
    }
    
    public InimigoB (){}
    
    public void atacar ()
    {
        this.ataque = ataque;
    }
    
    public void atualizar (Sujeito s)
    {
        Personagem p = (Personagem)s;
        
        if (this.x - p.getX() == 0 && this.y - p.getY() == 0)
        {
            System.out.println(this +" Atacou Personagem");
            p.perderLife (45);
            if (Math.random () < 0.5)
            {
                p.setPosicaoPersonagem(p.getX() + 5, p.getY() - 5);
            }else
                p.setPosicaoPersonagem(p.getX() - 5, p.getY() + 5);
                
        }
        else//se precisar andar em direcao ao personagem
        {
            p.recuperarLife(2);
            if (p.getX()>this.x)
                this.x = this.x+1;
            else 
                this.x = this.x-1;
            
            if (p.getY() > this.y)
                this.y = this.y+1;
            else 
                this.y = this.y-1;
        }
        
        
            
    }
    
}
