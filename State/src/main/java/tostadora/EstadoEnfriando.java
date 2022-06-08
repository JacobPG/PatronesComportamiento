
package tostadora;

import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author JacobPG
 */
public class EstadoEnfriando extends Estado{

    public EstadoEnfriando(Tostadora tostadora) {
        super(tostadora);
    }

    @Override
    public void ejecutarAccion() {
        System.out.println("\tEnfriando el dispositivo.\n");
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException ex) {
            Logger.getLogger(EstadoEnfriando.class.getName()).log(Level.SEVERE, null, ex);
        }
        tostadora.cambiarEstado(new EstadoReady(tostadora));
        tostadora.getEstado().ejecutarAccion();
        
    }
    

}
