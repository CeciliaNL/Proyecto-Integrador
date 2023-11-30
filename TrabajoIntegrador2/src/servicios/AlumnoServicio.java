package servicios;

import entidades.Alumno;
import entidades.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cecilia
 */
public class AlumnoServicio {

    private Alumno alumno;
    private Integer opcion;
    private ArrayList<Libro> librosDisponibles;

    public Alumno crearAlumno() {
        String nombre = (String) JOptionPane.showInputDialog("Ingrese el nombre");
        String apellido = (String) JOptionPane.showInputDialog("Ingrese el apellido");
        Long dni = Long.valueOf((String) JOptionPane.showInputDialog("Ingrese el DNI"));
        String usuario = (String) JOptionPane.showInputDialog("Ingrese el usuario");
        String contrasena = (String) JOptionPane.showInputDialog("Ingrese la contraseña");
        alumno = new Alumno(nombre, apellido, dni, usuario, contrasena);
        return alumno;
    }

    public Alumno loginRegistro(ArrayList<Alumno> alumnos) {

        opcion = Integer.valueOf((String) JOptionPane.showInputDialog("***********LOGIN ALUMNO**********" + "\n" + "1.Acceder" + "\n" + "2.Registrarse" + "\n" + "3.Volver"));
        switch (opcion) {
            case 1:
                alumno = login(alumnos);
                if (alumno.getUsuario() == null) {
                    
                }else {
                    menuLogueado(alumno);
                }
                
                break;
            case 2:
                alumno = crearAlumno();
                JOptionPane.showMessageDialog(null, "Alumno registrado con éxito!");
                break;
            case 3:
                break;
            default:
                JOptionPane.showMessageDialog(null, "Opción incorrecta");
                break;

        }
        return alumno;
    }

    public Alumno login(ArrayList<Alumno> alumnos) {
        String Usuario = (String) JOptionPane.showInputDialog("Usuario");
        String contrasena = (String) JOptionPane.showInputDialog("Contraseña");
        Boolean validar = false;
        Alumno alumnoActual = new Alumno();
        for (Alumno alumnosAux : alumnos) {
            if (alumnosAux.getUsuario().equals(Usuario) && alumnosAux.getContrasena().equals(contrasena)) {
                alumnoActual = alumnosAux;
                validar = true;
                break;
            }
        }
        if (validar) {
            JOptionPane.showMessageDialog(null, "Ingresaste con éxito!");
        } else {
            JOptionPane.showMessageDialog(null, "Usuario o contraseña incorrecto");
        }

        return alumnoActual;
    }

    public Alumno alumnosEjemplos(ArrayList<Libro> libros) {
        alumno = new Alumno("Facundo", "Roldan", 45852964L, "facu2002", "123456");
        alumno.setCantidadLibros(libros);
        return alumno;
    }

    public void menuLogueado(Alumno alumno) {
        Integer opciones;
        do {
            opciones = Integer.parseInt(JOptionPane.showInputDialog("1.Mostrar libros alquilados" + "\n" + "2.Alquilar nuevo libro" + "\n" + "3.Devolver libro" + "\n" + "4.Cerrar sesión"));
            switch (opciones) {
                case 1:
                    if (alumno.getCantidadLibros().isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay libros alquilados!");
                    } else {
                        JOptionPane.showMessageDialog(null, "                                            LISTA LIBROS ALQUILADOS" + "\n" + alumno.getCantidadLibros());
                    }
                    break;
                case 2:
                    String isbn = JOptionPane.showInputDialog("                                                  LISTA LIBROS DISPONIBLES" + "\n" + stringArreglado() + "\n" + "Ingrese el ISBN del libro a alquilar:"  );
                    alquilarLibro(isbn);
                    break;
                case 3:
                    Boolean mensaje = devolverLibro();
                    if (mensaje) {
                        JOptionPane.showMessageDialog(null, "Libro devuelto con éxito!");
                    } else {
                        JOptionPane.showMessageDialog(null, "El libro no pudo ser devuelto!");
                    }
                    break;
                case 4:

                    break;
                default:
                    break;
            }

        } while (opciones != 4);
    }

    public void setLibrosDisponibles(ArrayList<Libro> librosDisponibles) {
        this.librosDisponibles = librosDisponibles;
    }

    public void alquilarLibro(String isbn) {
        Boolean respuesta = validarLibro(isbn);
        int validar = 0;
        if (respuesta) {
            JOptionPane.showMessageDialog(null, "El libro ya se encuentra en su poder");
            validar = -1;
        } else {
            for (Libro aux : librosDisponibles) {
                if (isbn.equals(aux.getIsbn())) {
                    alumno.setLibro(aux);
                    validar = 1;
                    break;
                }
            }

        }

        if (validar == 1) {
            JOptionPane.showMessageDialog(null, "Libro alquilado con éxito!");
        } else if (validar == 0) {
            JOptionPane.showMessageDialog(null, "Libro no encontrado!");
        }

    }

    public boolean validarLibro(String isbn) {
        Boolean validar = false;
        for (Libro aux : alumno.getCantidadLibros()) {
            if (isbn.equals(aux.getIsbn())) {
                validar = true;
                break;
            }
        }

        return validar;
    }

    public boolean devolverLibro() {
        Boolean validar = false;
        String isbn = JOptionPane.showInputDialog("                                                .       LISTA LIBROS EN SU PODER" +  "\n" +  alumno.getCantidadLibros().toString() + "\n" + "Ingrese el ISBN del libro a devolver:" );
        for (Libro aux : alumno.getCantidadLibros()) {
            if (isbn.equals(aux.getIsbn())) {
                alumno.getCantidadLibros().remove(aux);
                validar = true;
                break;
            }

        }
        return validar;

    }
    
    public String stringArreglado(){
    String librosString = "";

    for (Libro aux : librosDisponibles) {
        librosString += aux.toString() + "\n";
    }
   
    return librosString;
}
    }
    
    


