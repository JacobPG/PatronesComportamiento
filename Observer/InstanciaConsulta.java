import Patron.Subscriber;

public class InstanciaConsulta implements Subscriber {

    public InstanciaConsulta(InventarioLibros inv, String nombre) {
        inventario = inv;
        inventario.subscribe(this);
        this.nombre = nombre;
    }
    private InventarioLibros inventario;
    private String tituloactual;
    private String nombre;

    public void buscarlibro(String titulo) {
        tituloactual = titulo;
        LibroInventario libro = inventario.buscaLibro(titulo);
        System.out.println(this.nombre+ " Busca "+ libro.getLibro().getTitulo()+ " Hay "+libro.getCantidad());   
    }

    @Override
    public void update() {
        System.out.println("Inventario Actualizado en la instacia "+this.nombre);
        if(nombre!=""){this.buscarlibro(tituloactual);};
    }

}