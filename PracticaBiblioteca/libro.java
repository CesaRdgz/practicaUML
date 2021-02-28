package PracticaBiblioteca;
/**
 * Esta es la clase libro para el diagrama de biblioteca.
 * @author Cesar Rodriguez
 * @version 1.0.0
 */
public class libro {
    private String titulo;
    /**
     * En este String se almacenara el titulo del libro
     */
    private int año;
    /**
     * En esta int se almacenara el año de publicacion de el libro
     */
    private String editorial;
    /**
     * En este String se almacenara el nombre de la editotrial
     */
    private String tipo;

    /**
     * En este String se almacenara el tipo del libro
     */
    public libro(String titulo) {
        this.titulo = titulo;
    }
    /**
     * Constructor de libro
     */
    public String getTitulo() {
        return titulo;
    }
    /**
     * getter de titulo
     * @return titulo
     */
    public int getAño() {
        return año;
    }
    /**
     * getter de año
     * @return año
     */
    public String getEditorial() {
        return editorial;
    }
    /**
     * getter de editorial
     * @return editorial
     */
    public String getTipo() {
        return tipo;
    }
    /**
     * getter de tipo
     * @return tipo
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
        /**
         * setter titulo
         * @param titulo
         */
    }

    public void setAño(int año) {
        this.año = año;
        /**
         * setter año
         * @param año
         */
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
        /**
         * setter editorial
         * @param editorial
         */
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
        /**
         * setter tipo
         * @param tipo
         */
    }
}
