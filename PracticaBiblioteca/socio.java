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
}
