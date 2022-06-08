
package tostadora;

/**
 *
 * @author JacobPG
 */
public class EstadoEspera extends Estado{

    public EstadoEspera(Tostadora tostadora) {
        super(tostadora);
    }

    @Override
    public void ejecutarAccion() {
        System.out.println("\tEsperando intensidad del tostado.\n");
    }

    
}
