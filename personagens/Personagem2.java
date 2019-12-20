/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personagens;
import inimigos.InimigoA;
import padraoStrategy.*;
import padraoState.*;
import java.util.*;
import padraoObserver.*;
import padraoCadeiaResponsabilidade.*;
import padraoDecorator.*;
/**
 *
 * @author gui
 */
public class Personagem2 implements Sujeito{
    
    private Atacar ataque;
    private Correr corrida;
    private Pular pulo;
    private int life;
    private Estado estado;
    private ArrayList <Observador> observadores = new ArrayList <Observador>();
    private int x;
    private int y;
    private static Personagem2 instancia = null;
    
    private Personagem2 (){
        super();
        this.life = 70;
    }
    
    public static Personagem2 getInstancia(){
        if (instancia == null){
            System.out.println("Foi criada a instância");
            instancia = new Personagem2 ();
        }
        return instancia;
    }
    
    public void show()
    {
        verificarLife();

        System.out.println("Life: "+this.getLife ());
    }
    
    public void mostrar ()
    {
        notificarObservador();
    }
    
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    public void setPosicaoPersonagem2 (int x, int y)
    {
        this.x = x;
        this.y = y;
        System.out.println("Posicao Personagem2: ("+this.x+", "+this.y+")");
    }
    
    public void adicionarObservador (Observador observador)
    {
        observadores.add(observador);
    }
    
    public void removerObservador (Observador observador)
    {
        observadores.remove(observador);
    }
    
    public void notificarObservador ()
    {
        for (Observador obj: observadores)
            obj.atualizar(this);
    }
    
    
    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
    
    public void verificarLife ()
    {
        if (getLife() <= 0)
           this.life = getLife () - getLife();
        if (getLife() > 100)
           this.life = 100;
    }

    public Atacar getAtaque() {
        return ataque;
    }

    public void setAtaque(Atacar ataque) {
        this.ataque = ataque;
    }
    
    public void atacar()
    {
        this.ataque.atacar();
    }

    public Correr getCorrida() {
        return corrida;
    }

    public void setCorrida(Correr corrida) {
        this.corrida = corrida;
    }
    
    public void correr()
    {
        this.corrida.correr();
    }

    public Pular getPulo() {
        return pulo;
    }

    public void setPulo(Pular pulo) {
        this.pulo = pulo;
    }
    
    public void pular()
    {
        this.pulo.pular();
    }    


}
