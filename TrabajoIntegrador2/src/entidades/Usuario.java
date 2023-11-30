
package entidades;

/**
 *
 * @author Cecilia
 */
public abstract class Usuario {
    private String Nombre;
    private String Apellido;
    private Long dni;
    private String usuario;
    private String contrasena;

    public Usuario() {
    }

    public Usuario(String Nombre, String Apellido, Long dni, String usuario, String contrasena) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.dni = dni;
        this.usuario = usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public Long getDni() {
        return dni;
    }

    public void setDni(Long dni) {
        this.dni = dni;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return  "Nombre=" + Nombre + ", Apellido=" + Apellido + ", dni=" + dni + ", usuario=" + usuario + ", contrasena=" + contrasena + '}';
    }
    
    
}
