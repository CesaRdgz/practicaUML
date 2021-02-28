/**
 * Esta es la socio copia para el diagrama de biblioteca.
 * @author Cesar Rodriguez
 * @version 1.0.0
 */
package PracticaBiblioteca;

public class socio {
    private int numero;
    /**
     * En este int se almacenara el numero de socio
     */
    private String nombre;
    /**
     *En este String se almacenara el nombre
     */
    private String direccion;
    /**
     *En este String se almacenara la direccion
     */
    private String telefono;
    /**
     *En este String se almacenara el telefono, es un string para poder poner prefijo (+34 666 666 666)
     */
    public socio(int numero, String nombre, String direccion, String telefono) {
        this.numero = numero;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
    }
    /**
     * Constructor de socio
     */
    public int getNumero() {
        return numero;
    }
    /**
     * getter de numero
     * @return numero
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * getter de nombre
     * @return nombre
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     * getter de direccion
     * @return direccion
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * getter de telefono
     * @return telefono
     */

    public void setNumero(int numero) {
        this.numero = numero;
    /**
     * setter numero
     * @param numero
     */
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
        /**
         * setter nombre
         * @param nombre
         */
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
        /**
         * setter direccion
         * @param direccion
         */
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
        /**
         * setter telefono
         * @param telefono
         */
    }
}
