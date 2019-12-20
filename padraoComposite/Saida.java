package padraoComposite;

import inimigos.InimigoComposite;
import personagens.*;

public class Saida implements Component{


	public void andar(Personagem p){ 
	    System.out.println("Saída encontrada pelo personagem " +p.getClass().getName());
            System.out.println (p.getClass().getName()+" Abateu o inimigo chefão da sala");
            
        double valor = Math.random();
            
        if (valor <=0.2)
           System.out.println("Personagem ganhou com 100% de vida");
        else if (valor >=0.3 && valor < 0.6)
           System.out.println("Personagem ganhou com 60% de vida");
        else if (valor >=0.6 && valor < 0.8)
           System.out.println("Personagem ganhou com 30% de vida");
        else if (valor >=0.8)
           System.out.println("Personagem ganhou com 10% de vida");
	}
        
}
