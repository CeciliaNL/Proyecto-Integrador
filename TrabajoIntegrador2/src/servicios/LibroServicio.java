
package servicios;

import entidades.Libro;
import javax.swing.JOptionPane;

public class LibroServicio {
    private Libro libro;
 public Libro AgregarLibroNuevo(){
     String isbn = JOptionPane.showInputDialog("Ingrese el ISBN");
     Long cantidad = Long.valueOf(JOptionPane.showInputDialog("Ingrese la cantidad"));
     String titulo = JOptionPane.showInputDialog("Ingrese el título");
     String autor = JOptionPane.showInputDialog("Ingrese el autor");
     String genero = JOptionPane.showInputDialog("Ingrese el genero");
     libro = new Libro(isbn, cantidad, titulo, autor, genero);
     return libro;
 } 
 
 
}
