package servicios;

import entidades.Administrativo;
import entidades.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cecilia
 */
public class AdministrativoServicio {

    public ArrayList<Administrativo> administrativos;
   private ArrayList<Libro> libros = new ArrayList<>();
    
    private Administrativo administrativo;
    private Integer opcion;

    public Administrativo rellenarAdministrativoEjemplo() {
        Administrativo administrativo = new Administrativo("Recepcionista", "Julio", "Díaz", 22262492L,"diazju", "1960");
       
       return administrativo;
    }
    
    public Administrativo crearAdministrativo(){
        String cargo = (String) JOptionPane.showInputDialog("Ingrese el cargo");
          String nombre = (String) JOptionPane.showInputDialog("Ingrese el nombre");
        String apellido = (String) JOptionPane.showInputDialog("Ingrese el apellido");
        Long dni = Long.valueOf((String) JOptionPane.showInputDialog("Ingrese el DNI"));
        String usuario = (String) JOptionPane.showInputDialog("Ingrese el usuario");
        String contrasena = (String) JOptionPane.showInputDialog("Ingrese la contraseña");
        administrativo= new Administrativo(cargo, nombre, apellido, dni, usuario, contrasena);
        return administrativo;
    }
    
    public Administrativo loginRegistro(ArrayList<Administrativo> administrativos) {

        opcion = Integer.valueOf((String) JOptionPane.showInputDialog("******LOGIN ADMINISTRATIVO*****" + "\n" + "1.Acceder" + "\n" + "2.Registrarse" + "\n" + "3.Volver"));
        switch (opcion) {
            case 1:
                administrativo = login(administrativos);
                menuLogueado(administrativo);
                break;
            case 2:
                administrativo = crearAdministrativo();
                JOptionPane.showMessageDialog(null, "Administrativo registrado con éxito!");
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta");
                break;

        }
        return administrativo;
    }
    
    public Administrativo login(ArrayList<Administrativo> administrativos) {
        String Usuario = (String) JOptionPane.showInputDialog("Usuario");
        String contrasena = (String) JOptionPane.showInputDialog("Contraseña");
        Boolean validar = false;
        Administrativo administrativoActual = new Administrativo();
        for (Administrativo aux : administrativos) {
            if (aux.getUsuario().equals(Usuario) || aux.getContrasena().equals(contrasena)) {
                administrativoActual = aux;
                validar = true;
            }
        }
        if (validar) {
            JOptionPane.showMessageDialog(null, "Ingresaste con éxito!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
        }

        return administrativoActual;
    }
    
    public void menuLogueado(Administrativo alumno) {
        Integer opciones;
        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("1.Agregar libro a la biblioteca " + "\n" + "2.Eliminar libro" + "\n" + "3.Mostrar biblioteca" + "\n" + "4.Cerrar sesión"));
            switch (opciones) {
                case 1:
                    LibroServicio libroServicio = new LibroServicio();
                    Libro libro =libroServicio.AgregarLibroNuevo();
                    Boolean validar = validarLibro(libro);
                    if (validar) {
                        JOptionPane.showMessageDialog(null, "Libro ya registrado");
                    } else {
                         libros.add(libro);
                    }
                    break;
                case 2:
                    String isbnEliminar = JOptionPane.showInputDialog("INGRESE EL ISBN DEL LIBRO A ELIMINAR" + "\n" + corregirString());
                   Boolean eliminarval = eliminarLibro(isbnEliminar);
                    if (eliminarval) {
                        JOptionPane.showMessageDialog(null, "Libro eliminado con éxito");
                    } else {
                        JOptionPane.showMessageDialog(null, "El libro no se pudo eliminar");
                    }
                    
                    
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "BIBLIOTECA" + "\n" + corregirString());
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Sesión cerrada");
                    break;
              
                default:
                    JOptionPane.showConfirmDialog(null, "Opción invalida");
                    break;
            }

        } while (opciones != 4);
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }
    
    
    public boolean validarLibro(Libro libro){
        Boolean validar = false;
        for(Libro aux : libros){
            if (libro.getIsbn().equals(aux.getIsbn())) {
                validar = true;
            }
        }
        
        return validar;
    }
    
   public String corregirString() {
    String listaLibrosString = "";

    for (Libro aux : libros) {
        listaLibrosString += aux.toString() + "\n";
    }
   
    return listaLibrosString;
}
   
   public boolean eliminarLibro(String isbn) {
       Boolean validar = false;
     for(Libro aux : libros){
            if (aux.getIsbn().equals(isbn)) {
                validar = true;
                libros.remove(aux);
                break;
            }
        }
        
        return validar;
   }

    
}
