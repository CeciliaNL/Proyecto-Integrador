
package entidades;

/**
 *
 * @author Cecilia
 */
public class Persona {
    
    private String nombre;
    private String apellido;
    private long dni;
    private String fechaNacimiento;
    private String email;
    private long telefono;
    private String direccion;
    

    public Persona() {
    }

    public Persona(String nombre, String apellido, long dni, String fechaNacimiento, String email, long telefono, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.fechaNacimiento = fechaNacimiento;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public long getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getTelefono() {
        return telefono;
    }

    public void setTelefono(long telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }


    


    @Override
    public String toString() {
        return"\n" + "     ***********************" + "\n" +"NOMBRE: " + nombre +  "\n" + "APELLIDO: " + apellido +  "\n" + "DNI: " + dni +  "\n" +"FECHA DE NACIMIENTO: " + fechaNacimiento +   "\n" + "EMAIL: " + email +  "\n" + "TELEFONO: " + telefono +  "\n" + "DIRECCIÓN: " + direccion;
    }






}

