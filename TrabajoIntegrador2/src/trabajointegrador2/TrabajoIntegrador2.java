package trabajointegrador2;

import entidades.Administrativo;
import entidades.Alumno;
import entidades.Libro;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import servicios.AdministrativoServicio;
import servicios.AlumnoServicio;
import servicios.BibliotecaServicio;

/**
 * "
 *
 * @author Cecilia
 */
public class TrabajoIntegrador2 {

    public static void main(String[] args) {
        AlumnoServicio alumnoServicio = new AlumnoServicio();
        BibliotecaServicio bibliotecaServicio = new BibliotecaServicio();
        AdministrativoServicio administrativoServicio = new AdministrativoServicio();
        ArrayList<Libro> listaLibros = new ArrayList<>(bibliotecaServicio.rellenarBibliotecaEjemplos());
        ArrayList<Alumno> listadoAlumnos = new ArrayList<>();
        ArrayList<Administrativo> listadoAdministrativos = new ArrayList<>();
        alumnoServicio.setLibrosDisponibles(listaLibros);
       listadoAlumnos.add(alumnoServicio.alumnosEjemplos(listaLibros)) ;
       listadoAdministrativos.add(administrativoServicio.rellenarAdministrativoEjemplo());
        String menu;
        int opcion = 0;
        do {
            menu = (String) JOptionPane.showInputDialog("     **********MENÚ**********" + "\n" + "1.USUARIO ADMINISTRATIVO" + "\n" + "2.USUARIO ALUMNO" + "\n" + "3.SALIR");
            if (menu == null) {
                JOptionPane.showMessageDialog(null, "HASTA LUEGO!");
                break;
            } else {
                opcion = Integer.parseInt(menu);
            }

            switch (opcion) {
                case 1:
                    administrativoServicio.setLibros(listaLibros);
                    Administrativo administrativoActual = administrativoServicio.loginRegistro(listadoAdministrativos);
                    administrativoServicio.setLibros(listaLibros);
                     listadoAdministrativos.add(administrativoActual);
                    listaLibros = administrativoServicio.getLibros();
                    break;
                case 2:

                    Alumno alumnoActual = alumnoServicio.loginRegistro(listadoAlumnos);
                    listadoAlumnos.add(alumnoActual);

                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "HASTA LUEGO!");
                    break;
            }
        } while (opcion != 3);
    }

}
