package trabajointegrador_1;

import servicios.ServicioMenu;
import javax.swing.JOptionPane;

/**
 *
 * @author Cecilia
 */
public class TrabajoIntegrador_1 { //HAY QUE SACAR PERSONAS PRUEBA!!!!!!

    public static void main(String[] args) {

        ServicioMenu servicioMenu = new ServicioMenu();
        servicioMenu.personasprueba();
        int opcion = 0;
        do {
            String menu =(String)JOptionPane.showInputDialog("        **********MENÚ**********" + "\n" + "\n 1.INGRESAR DATOS PERSONA" + "\n 2.EDITAR DATOS PERSONA" + "\n 3.ELIMINAR PERSONA" + "\n 4.MOSTRAR PERSONAS" + "\n 5.SALIR" + "\n ");
            if (menu == null) {
                JOptionPane.showMessageDialog(null, "Hasta Luego!");
                break;
            } else {
                opcion = Integer.parseInt(menu);
            }
            
            switch (opcion) {
                case 1:
                    servicioMenu.registrarPersona();

                    break;
                case 2:
                    servicioMenu.editarDatosPersona();

                    break;
                case 3:
                    servicioMenu.eliminarPersona();
                    break;

                case 4:
                    servicioMenu.MostrarPersonas();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Hasta luego!");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opcion no valida!");
                    break;
            }

        } while (opcion != 5);

    }
       

}
