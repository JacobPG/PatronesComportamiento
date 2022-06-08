
package tostadora;

/**
 *
 * @author JacobPG
 */
public class EstadoTostando extends Estado{

    public EstadoTostando(Tostadora tostadora) {
        super(tostadora);
    }   

    @Override
    public void ejecutarAccion() {
        System.out.println("\tRealizando el tostado.\n");
    }

}
