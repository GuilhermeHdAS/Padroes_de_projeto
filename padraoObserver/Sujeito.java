/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoObserver;

/**
 *
 * @author gui
 */
public interface Sujeito {
    
    public void adicionarObservador (Observador o);
    
    public void removerObservador (Observador o);
    
    public void notificarObservador ();
    
}
