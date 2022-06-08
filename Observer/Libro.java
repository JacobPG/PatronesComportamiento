


public class Libro {


    public Libro(String titulo,String autor,String edicion) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setEdicion(edicion);
    }


    private String titulo;
    private String autor;
    private String edicion;


    public String getEdicion() {
        return edicion;
    }

    public void setEdicion(String edicion) {
        this.edicion = edicion;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    


}