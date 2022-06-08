public class Main {

    public static void main(String[] args)
    {
        InventarioLibros inventario = new InventarioLibros();
        Libro libro1 = new Libro("titulo1", "autor1", "edicion1");
        Libro libro2 = new Libro("titulo2", "autor2", "edicion2");
        Libro libro3 = new Libro("titulo3", "autor3", "edicion3");
        Libro libro4 = new Libro("titulo4", "autor4", "edicion4");
        inventario.agregarLibro(libro1, 4);
        inventario.agregarLibro(libro2, 3);
        inventario.agregarLibro(libro3, 6);
        inventario.agregarLibro(libro4, 14);
        InstanciaConsulta instacia1 = new InstanciaConsulta(inventario,"Instancia1");
        InstanciaConsulta instacia2 = new InstanciaConsulta(inventario,"Instancia2");
        InstanciaConsulta instacia3 = new InstanciaConsulta(inventario,"Instancia3");

        instacia1.buscarlibro("titulo2");
        instacia2.buscarlibro("titulo3");
        instacia3.buscarlibro("titulo1");

        System.out.println("**********************************");
        inventario.devolverlibro(libro1);
        System.out.println("**********************************");
        inventario.devolverlibro(libro2);
        System.out.println("**********************************");
        inventario.prestarlibro(libro4);
        System.out.println("**********************************");
        inventario.prestarlibro(libro4);
        }

    
}
