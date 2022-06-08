package observer;

import java.util.*;

import observer.Patron.Publisher;

public class InventarioLibros extends Publisher {

    public InventarioLibros() {
        listalibros = new ArrayList<LibroInventario>();

    }

    private List<LibroInventario> listalibros;

    public void devolverlibro(Libro libro) {
        transaccionLibro(libro, TipoTransaccion.PRESTAMO);
    }

    public void prestarlibro(Libro libro) {
        transaccionLibro(libro, TipoTransaccion.PRESTAMO);
    }

    public void transaccionLibro(Libro libro, TipoTransaccion tipo) {
        int indice = -1;
        int contador = -1;
        for (LibroInventario libroInventario : listalibros) {
            contador++;
            if(libroInventario.getLibro()==libro){
                indice = contador;
                break;
            }
            
        }
        if(indice>=0){
            LibroInventario inventario = listalibros.get(indice);
            int cantidad = inventario.getCantidad();
            if(tipo == TipoTransaccion.DEVOLUCION)
            {cantidad++;}
            else {cantidad--;}
            inventario.setCantidad(cantidad);
            this.notifySybscribers(listalibros);
        }
    }

    public void agregarLibro(Libro libro, int cantidad){
        LibroInventario nuevolibro = new LibroInventario(libro, cantidad, true);
        listalibros.add(nuevolibro);
    }

    public void actualizarInventario()
    {
        this.notifySybscribers(listalibros);
    }

}