/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;
import inimigos.*;
import personagens.*;
import padraoStrategy.*;
import padraoComposite.*;
import padraoCadeiaResponsabilidade.*;
import padraoSimpleFactory.*;
import padraoDecorator.*;
import java.util.*;

/**
 *
 * @author Guilherme Henrique de Araujo Santos - 11721BSI220
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws InterruptedException {
        
        int opcao;
        int decisao;
        
        System.out.println("Se deseja ver o resultado das praticas digite 1");
        Scanner ler = new Scanner (System.in);
        decisao = ler.nextInt();
        
        while (decisao == 1){
            
            System.out.println("Digite o número da prática correspondente (1 a 8):");
            opcao = ler.nextInt();

            switch (opcao)
            {
                case 1: 
                    System.out.println("Pratica 1:");
                    System.out.println("Personagem 1:");
                    Personagem p = new PersonagemA ();
                    p.atacar();
                    p.correr();
                    p.pular();
                    System.out.println ();

                    System.out.println("Personagem 2:");
                    p = new PersonagemB();
                    p.atacar();
                    p.correr();
                    p.pular();
                    System.out.println ();

                    System.out.println("Personagem 3:");
                    p = new PersonagemC ();
                    p.atacar();
                    p.correr();
                    p.pular();

                break;

                case 2:
                    System.out.println("Pratica 2:");
                    Personagem h = new Personagem(10,20);
                    h.atacar();
                    h.correr();
                    h.pular();
                    System.out.println();
                   
                    h.recuperarLife(10);
                   
                    h.show();
                    h.atacar();
                    h.correr();
                    h.pular();
                    System.out.println();
                    
                    h.perderLife(70);
                   
                    h.show();
                    h.atacar();
                    h.correr();
                    h.pular();
                    System.out.println();
                    
                    h.recuperarLife(200);
                   
                    h.show();
                    h.atacar();
                    h.correr();
                    h.pular();
                    System.out.println();
                    
                    h.perderLife(100);
                    
                    h.show();
                    h.atacar();
                    h.correr();
                    h.pular();
                    System.out.println();
                    
                    h.recuperarLife(1000);
                    
                    h.show();
                    h.atacar();
                    h.correr();
                    h.pular();
                    

                break;

                case 3:
                    System.out.println("Pratica 3:");
                    Personagem x = new Personagem (0,0);

                    InimigoA n0 = new InimigoA(5,5);
                    InimigoB n1 = new InimigoB(10,10);
                    InimigoC n2 = new InimigoC(20,20);
                    

                    x.adicionarObservador(n0);
                    x.adicionarObservador(n1);
                    x.adicionarObservador(n2);

                    int look;
                    Scanner ver = new Scanner (System.in);
                    System.out.println("Deseja ver o resultado? 1 para sim, contém Loop infinito");
                    look = ver.nextInt();

                    while(look == 1){
                        x.mostrar();
                        Thread.sleep(200);
                    }            

                break;

                case 4:
                    System.out.println("Pratica 4:");
                    Escudo escudoForte = new EscudoForte ();
                    Escudo escudoMedio = new EscudoMedio ();
                    Escudo escudoFraco = new EscudoFraco ();

                    escudoForte.setSucessor(escudoMedio);
                    escudoMedio.setSucessor(escudoFraco);
                    escudoFraco.setSucessor(null);

                    Personagem g = new Personagem(10,20);
                    g.perderLife(60);

                    escudoForte.processaEscudo(57, g);
                    g.perderLife(70);

                    escudoForte.processaEscudo(57, g);
                    
                break;    

                case 5:
                    System.out.println("Pratica 5:");
                    Poder poder1;
                    poder1 = new Ataque();
                    poder1 = new SuperForca (poder1);
                    Poder poder2;
                    poder2 = new Ataque();
                    poder2 = new Raio (poder2);
                    Poder poder3;
                    poder3 = new Ataque();
                    poder3 = new Tonteamento (poder3);


                    Personagem a = new PersonagemA (poder1);
                    Personagem b = new PersonagemB (poder2);
                    Personagem c = new PersonagemC (poder3);


                    System.out.println ("Propriedades do personagem A:");
                    a.atacar();
                    a.correr();
                    a.pular();
                    System.out.println("Dano: " +poder1.getDano());
                    System.out.println(poder1.getSobre());
                    System.out.println ();

                    System.out.println ("Propriedades do personagem B:");
                    b.atacar();
                    b.correr();
                    b.pular();
                    System.out.println("Dano: " +poder2.getDano());
                    System.out.println(poder2.getSobre());
                    System.out.println ();

                    System.out.println ("Propriedades do personagem C:");
                    c.atacar();
                    c.correr();
                    c.pular();
                    System.out.println("Dano: " +poder3.getDano());
                    System.out.println(poder3.getSobre());
                    System.out.println ();

                break;    
                case 6:
                    System.out.println("Pratica 6:");
                    Component labirinto = new Sala(new Abismo(), new Sala(new Sala(new Abismo(), new Sala(new Abismo(), new Saida(),"Sala3"),"Sala4"), new Saida(),"Sala2"),"Sala1");
                    Personagem p1 = new PersonagemA ();
                    Personagem p2 = new PersonagemB ();
                    Personagem p3 = new PersonagemC ();
                    
                    InimigoComposite ic1 = new InimigoComposite ();
                    InimigoComposite ic2 = new InimigoComposite ();
                    InimigoComposite ic3 = new InimigoComposite ();
                    
                    Thread t1 = new Thread(new Game(labirinto, p1, ic1));
                    Thread t2 = new Thread(new Game(labirinto, p2, ic2));
                    Thread t3 = new Thread(new Game(labirinto, p3, ic3));

                    t1.start();
                    t2.start();
                    t3.start();
                break;
                case 7:
                    System.out.println("Pratica 7:");
                    SimplePersonagemFactory.createPersonagem ();
                    SimplePersonagemFactory.createPersonagem ();
                    SimplePersonagemFactory.createPersonagem ();
                    SimplePersonagemFactory.createPersonagem ();
                    SimplePersonagemFactory.createPersonagem ();                                        
                break;
                
                case 8:
                    System.out.println("Pratica 8:");
                    int i;
                    for (i = 0; i < 1000; i++){
                        Personagem2 personagem = Personagem2.getInstancia();
                    }   
                    
                    System.out.println("Pode-se observar que era para ter criado 1000 instâncias, mas devido ao padrão singleton, tem-se apenas 1 personagem instanciado");
                break;

                default: 
                    System.out.println("Escolha uma opção valida");
                    break;
            }
            System.out.println();
            System.out.println("Para continuar digite 1, para sair digite outro numero");
            Scanner read1 = new Scanner (System.in);
            decisao = read1.nextInt();
            System.out.println ();
       
        }
    }
    
}
