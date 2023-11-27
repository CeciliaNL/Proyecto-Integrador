package servicios;

import entidades.Persona;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Cecilia
 */
public class ServicioMenu {

    private ArrayList<Persona> listaPersonas = new ArrayList<>();
    private Persona persona;

    public String menu() {
        String menu = JOptionPane.showInputDialog("        **********MENÚ**********" + "\n" + "\n 1.INGRESAR DATOS PERSONA" + "\n 2.EDITAR DATOS PERSONA" + "\n 3.ELIMINAR PERSONA" + "\n 4.MOSTRAR PERSONAS" + "\n 5.SALIR" + "\n ");
        return menu;
    }

    public Persona crearPersona() {
        String nombre = optionPaneMetodo("Ingrese el nombre: ");
        String apellido = optionPaneMetodo("Ingrese el apellido: ");
        long dni = compararDni();
        String fechaNacimiento = fechaMetodo();
        String email = emailMetodo();
        long telefono = Long.parseLong(optionPaneMetodo("Ingrese el teléfono: "));
        String direccion = optionPaneMetodo("Ingrese la dirección: ");

        persona = new Persona(nombre, apellido, dni, fechaNacimiento, email, telefono, direccion);

        return persona;
    }

    public void registrarPersona() {
        listaPersonas.add(crearPersona());
    }

    public String optionPaneMetodo(String string) {

        boolean validar = false;
        String datos = null;
        do {

            datos = (String)JOptionPane.showInputDialog(string);
            if (datos.isEmpty()) {
                validar = false;
                JOptionPane.showMessageDialog(null, "Campo vacio");

            } else {
                validar = true;
            }

        } while (!validar);

        return datos;
    }

    public String fechaMetodo() {

        boolean validar = false;
        String fecha;
        do {
            fecha = optionPaneMetodo("Ingrese la fecha de nacimiento: ");
            if (fecha.length() == 10 && fecha.charAt(2) == '/' && fecha.charAt(5) == '/') {
                validar = true;

            } else {
                validar = false;
                JOptionPane.showMessageDialog(null, "El formato de fecha debe ser DD/MM/YYYY");
            }
        } while (!validar);

        return fecha;
    }

    public String emailMetodo() {
        String email;
        boolean validar = false;
        do {
            email = optionPaneMetodo("Ingrese el email: ");
            if (email.contains("@") && email.contains(".com")) {
                validar = true;

            } else {
                validar = false;
                JOptionPane.showMessageDialog(null, "Formato de email incorrecto. 'ejemplo@ejemplo.com'");
            }
        } while (!validar);
        return email;
    }

    public boolean validarDni(long dni) {
        boolean validar = false;

        for (Persona listaAuxiliar : listaPersonas) {

            if (listaAuxiliar.getDni() == dni) {
                validar = true;
            }
        }
        return validar;
    }

    public Long compararDni() {
        boolean validar;
        Long dni;
        do {
            dni = Long.parseLong(optionPaneMetodo("Ingrese el DNI: "));
            validar = validarDni(dni);
            if (validar) {
                JOptionPane.showMessageDialog(null, "DNI ya registrado. Ingrese otro");
            }

        } while (validar);

        return dni;
    }

public void editarDatosPersona() {
    boolean validar = false;
    long dni = Long.parseLong(optionPaneMetodo("Ingrese el DNI de la persona que desea editar:"));
     for(Persona personaAxuliar : listaPersonas){
         if (personaAxuliar.getDni() == dni) {
             JOptionPane.showMessageDialog(null, "Usuario " + dni + " encontrado.");
             listaPersonas.remove(personaAxuliar);
             validar = true;
             break;
         }
}
     if (validar) {
              persona = crearPersona();
             listaPersonas.add(persona);
        
    } else {
         JOptionPane.showMessageDialog(null, "DNI inexistente!");
     }
     }
    
    public void personasprueba(){
        Persona persona1= new Persona("Franco", "Roldriguez", 37414197, "12/12/1992", "francoemmanuelroldan@gmail.com", 223696629, "Rio negro 6332");
        
        listaPersonas.add(persona1);

                
    }
    
    
    public void eliminarPersona(){
        long dni =Long.parseLong(JOptionPane.showInputDialog("Ingrese el DNI de la Persona a eliminar."));
        boolean validar = false;
        for(Persona personaAuxiliar : listaPersonas){
            if (personaAuxiliar.getDni() == dni) {
                JOptionPane.showMessageDialog(null, "Persona eliminada con éxito!");
                listaPersonas.remove(personaAuxiliar);
                validar = true;
                break;
            }
        }
        if (!validar) {
            JOptionPane.showMessageDialog(null, "DNI inexistente");
        }
    }
    

    
    public void MostrarPersonas() {
    String listaString = "";

    for (Persona persona : listaPersonas) {
        listaString += persona.toString() + "\n";
    }
        if (listaPersonas.isEmpty()) {
           JOptionPane.showMessageDialog(null, "No hay usuarios registrados");
        } else{
            JOptionPane.showMessageDialog(null, listaString);
        }
    
}
    
}
