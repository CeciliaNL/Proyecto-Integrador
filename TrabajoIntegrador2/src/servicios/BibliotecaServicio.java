
package servicios;

import entidades.Libro;
import java.util.ArrayList;

/**
 *
 * @author Cecilia
 */
public class BibliotecaServicio {
    public ArrayList<Libro> rellenarBibliotecaEjemplos(){
        ArrayList<Libro> libros = new ArrayList<>();
        Libro libro1 = new Libro("22354985", 50L,"Cien años de soledad ", "Gabriel García Márquez","Novela");
        Libro libro2 = new Libro("50486528", 23L,"El resplandor ", "Stephen King","Terror");
        libros.add(libro1);
        libros.add(libro2);
        return libros;
    }
    
    
}
