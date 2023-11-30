
package entidades;

/**
 *
 * @author Cecilia
 */
public class Libro {
    private String isbn;
    private Long cantidad;
    private String titulo;
    private String autor;
    private String genero;

    public Libro() {
    }

    public Libro(String isbn, Long cantidad, String titulo, String autor, String genero) {
        this.isbn = isbn;
        this.cantidad = cantidad;
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getCantidad() {
        return cantidad;
    }

    public void setCantidad(Long cantidad) {
        this.cantidad = cantidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        return "                                                   **********************************" + "\n" + "ISBN: " + isbn  + " - TÍTULO: " + " ' " +  titulo + "' " + " - AUTOR: " + autor + " - GÉNERO: " + genero + "\n";
    }
    
    
    
}
