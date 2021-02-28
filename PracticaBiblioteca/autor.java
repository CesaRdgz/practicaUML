/**
 * Esta es la clase de autor para el diagrama de biblioteca
 * @author Cesar Rodriguez
 * @version 1.0.0
 */

package PracticaBiblioteca;

public class autor {
    private String nombre;
    /**
     * En el String nombre se definira el nombre del autor del libro
     */
    private String fecha_nacimiento;
    /**
     * En el String fecha_nacimiento se definira la fecha de nacimiento del autor. El String y no int para poder poner dd/mm/yy
     */
    private String nacionalidad;


    /**
     * En el String nacionalidad se definira la nacionalidad del autor del libro
     */
    public autor(String nombre, String fecha_nacimiento, String nacionalidad) {
        this.nombre = nombre;
        this.fecha_nacimiento = fecha_nacimiento;
        this.nacionalidad = nacionalidad;
    }
    /**
     * Constructor de autor
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * getter de nombre
     * @return nombre
     */

    public String getFecha_nacimiento() {
        return fecha_nacimiento;
    }
    /**
     * getter de fecha_nacimiento
     * @return fecha_nacimiento
     */
    public String getNacionalidad() {
        return nacionalidad;
    }
    /**
     * getter de nacionalidad
     * @return nacionalidad
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
        /**
         * setter nombre
         * @param nombre
         */
    }

    public void setFecha_nacimiento(String fecha_nacimiento) {
        this.fecha_nacimiento = fecha_nacimiento;
        /**
         * setter fecha_nacimiento
         * @param fecha_nacimiento
         */
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
        /**
         * setter nacionalidad
         * @param nacionalidad
         */
    }
}


