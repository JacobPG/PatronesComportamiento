
package tostadora;

/**
 *
 * @author JacobPG
 */
public class EstadoReady extends Estado{

    public EstadoReady(Tostadora tostadora) {
        super(tostadora);
        
    }

    @Override
    public void ejecutarAccion() {
        System.out.println("\tTostadora lista para tostar.\n");
        
    }
    
    
}
