
package entidades;

import java.util.ArrayList;

/**
 *
 * @author Cecilia
 */
public class Alumno extends Usuario{
   private ArrayList<Libro> cantidadLibros;

    public Alumno() {
    }

    public Alumno(String Nombre, String Apellido, Long dni, String usuario, String contrasena) {
        super(Nombre, Apellido, dni, usuario, contrasena);
        cantidadLibros = new ArrayList<>();
    }

    public ArrayList<Libro> getCantidadLibros() {
        return cantidadLibros;
    }

    public void setCantidadLibros(ArrayList<Libro> cantidadLibros) {
        this.cantidadLibros = new ArrayList<>(cantidadLibros);
    }
   
    public void setLibro(Libro libro){
        cantidadLibros.add(libro);
    }
    
}
