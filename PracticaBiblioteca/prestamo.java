/**
 * Esta es la clase copia para el diagrama de biblioteca.
 * @author Cesar Rodriguez
 * @version 1.0.0
 */
package PracticaBiblioteca;

public class prestamo {
    private String inicio;
    /**
     * El String sirve para definir la fecha del inicio del prestamo en formato dd/mm/yy
     */
    private String fin;
    /**
     * El String sirve para definir la fecha del final del prestamo en formato dd/mm/yy
     */
    public prestamo(String inicio, String fin) {
        this.inicio = inicio;
        this.fin = fin;
    }
    /**
     * Constructor de prestamo
     */
    public String getInicio() {
        return inicio;
    }
    /**
     * getter de inicio
     * @return inicio
     */
    public String getFin() {
        return fin;
    }
    /**
     * getter de fin
     * @return fin
     */
    public void setInicio(String inicio) {
        this.inicio = inicio;
        /**
         * setter inicio
         * @param inicio
         */
    }

    public void setFin(String fin) {
        this.fin = fin;
        /**
         * setter fin
         * @param fin
         */
    }
}
