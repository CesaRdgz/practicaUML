/**
 * Esta es la clase socios para el diagrama de polideportivo.
 * @author Cesar Rodriguez
 * @version 1.0.0
 */
package PracticaPolideportivo;

public class socios {

    private String nombre;
    /**
     * En este String se guarda el nombre del socio
     */
    private String direccion;
    /**
     * En este String se guarda el nombre del socio
     */
    private String ciudad;
    /**
     * En este String se guarda la ciudad del socio
     */
    private String provincia;
    /**
     * En este String se guarda la provincia donde vive del socio
     */
    private String telefono;
    /**
     * En este String se guarda el telefono del socio. Es String para guardarlo con prefijo (+34 666 666 666)
     */
    private int cuota;
    /**
     * En este int se guarda la cuota del socio
     */
    reservar();
    /**
     * @param reservar servira para dar de alta al socio en la pista, con el material necesitado y con la fecha asignada.
     */
    public socios(String nombre, String direccion, String ciudad, String provincia, String telefono, int cuota) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.provincia = provincia;
        this.telefono = telefono;
        this.cuota = cuota;
    }
    /**
     * Constructor de socios
     */
    public String getNombre() {
        return nombre;
        /**
         * getter de nombre
         * @return nombre
         */
    }

    public String getDireccion() {
        return direccion;
        /**
         * getter de direccion
         * @return direccion
         */
    }

    public String getCiudad() {
        return ciudad;
        /**
         * getter de ciudad
         * @return ciudad
         */
    }

    public String getProvincia() {
        return provincia;
        /**
         * getter de provincia
         * @return provincia
         */
    }

    public String getTelefono() {
        return telefono;
        /**
         * getter de telefono
         * @return telefono
         */
    }

    public int getCuota() {
        return cuota;
        /**
         * getter de cuota
         * @return cuota
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

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
        /**
         * setter ciudad
         * @param ciudad
         */
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
        /**
         * setter provincia
         * @param provincia
         */
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
        /**
         * setter telefono
         * @param telefono
         */
    }

    public void setCuota(int cuota) {
        this.cuota = cuota;
        /**
         * setter cuota
         * @param cuota
         */
    }
}


