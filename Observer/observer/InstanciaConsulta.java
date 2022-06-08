package observer;
import java.util.ArrayList;
import java.util.List;

import observer.Patron.Subscriber;

public class InstanciaConsulta implements Subscriber {

    public InstanciaConsulta(String nombre) {
        this.nombre = nombre;
        listalibros = new ArrayList<LibroInventario>();
    }
    private List<LibroInventario> listalibros;
    private String tituloactual;
    private String nombre;

    public void buscarLibro(String titulo){
        LibroInventario resultado = null;
        tituloactual = titulo;
        for (LibroInventario libroInventario : listalibros) {
            if(libroInventario.getLibro().getTitulo().equals(titulo))
            {
                resultado =libroInventario;
                break;
            }
        }
        if(resultado!=null){
            System.out.println(this.nombre+ " Busco Libro "+resultado.getLibro().getTitulo()+" y hay "+resultado.getCantidad());
        }
    }

    @Override
    public void update(Object listalibros) {
        this.listalibros = (List<LibroInventario>) listalibros;
        System.out.println("Inventario Actualizado en "+this.nombre);
        if(nombre!=""){
            this.buscarLibro(tituloactual);
        };
    }
}