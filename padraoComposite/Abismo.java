package padraoComposite;

import inimigos.InimigoComposite;
import personagens.*;

public class Abismo implements Component{


      	public void andar(Personagem p){ 
	    System.out.println("Abismo encontrado. Game over. Personagem"+p.getClass().getName()+" morreu!");
            System.out.println ("Hasta la vista baby ahahahah");
	   }

}
