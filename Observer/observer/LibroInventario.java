package observer;
public class LibroInventario {
    
    private Libro libro;
    private int cantidad;

    public LibroInventario(Libro libro, int cantidad, boolean activo) {
        this.libro = libro;
        this.cantidad = cantidad;
        this.activo = activo;
    }
    private boolean activo;
    
    public Libro getLibro() {
        return libro;
    }
    public void setLibro(Libro libro) {
        this.libro = libro;
    }
    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}
