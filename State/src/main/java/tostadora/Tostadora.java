
package tostadora;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JacobPG
 */
public class Tostadora {
    private Estado estado;
  
    public Tostadora() {
        this.estado = new EstadoReady(this);  
        this.estado.ejecutarAccion();
    }
    
    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void ponerPanes() {
        this.cambiarEstado(new EstadoEspera(this));
        this.estado.ejecutarAccion();        
    }

    public void tirarPalanca(int intensidad) {
        this.cambiarEstado(new EstadoTostando(this));
        this.estado.ejecutarAccion();
        
        try {
            TimeUnit.SECONDS.sleep(intensidad*2);
        } catch (InterruptedException ex) {
            Logger.getLogger(EstadoEnfriando.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        expulsarPanes(); 
    }

    public void expulsarPanes() {
        System.out.println("Panes listos!");
        
        this.cambiarEstado(new EstadoEnfriando(this));
        this.estado.ejecutarAccion();
    }
    
    
    
    
}
