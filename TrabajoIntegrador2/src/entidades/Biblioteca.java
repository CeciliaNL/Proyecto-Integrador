
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Cecilia
 */
public class Biblioteca {
    private ArrayList<Libro> bibliotecaLibros;

    public Biblioteca() {
    }

    public Biblioteca(ArrayList<Libro> bibliotecaLibros) {
        this.bibliotecaLibros = bibliotecaLibros;
    }

    public ArrayList<Libro> getBibliotecaLibros() {
        return bibliotecaLibros;
    }

    public void setBibliotecaLibros(ArrayList<Libro> bibliotecaLibros) {
        this.bibliotecaLibros = bibliotecaLibros;
    }
    
    
}
