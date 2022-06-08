
package tostadora;

/**
 *
 * @author JacobPG
 */
public abstract class Estado {
    protected Tostadora tostadora;

    public Estado(Tostadora tostadora) {
        this.tostadora = tostadora;
    }
    
    public abstract void ejecutarAccion();
    
}
