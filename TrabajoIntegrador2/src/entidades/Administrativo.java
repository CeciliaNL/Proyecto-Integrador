
package entidades;

/**
 *
 * @author Cecilia
 */
public class Administrativo extends Usuario{
    private String cargo;

    public Administrativo() {
    }


    public Administrativo(String cargo, String Nombre, String Apellido, Long dni, String usuario, String contrasena) {
        super(Nombre, Apellido, dni, usuario, contrasena);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    
    
    
    


    
}
