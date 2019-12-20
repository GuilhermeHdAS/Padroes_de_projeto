package padraoComposite;

import inimigos.InimigoComposite;
import personagens.*;

public class Game implements Runnable
{
    private Component labirinto;
    private Personagem p;
    private InimigoComposite ic;
    
    public Game(Component labirinto, Personagem p, InimigoComposite ic){
        this.labirinto = labirinto;
        this.p = p;
        this.ic = ic;
    }    
        
    
    public void run(){
        
        labirinto.andar(p);
        
    }     
}
