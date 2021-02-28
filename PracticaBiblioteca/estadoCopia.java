/**
 * Esta es la clase estadoCopia para el diagrama de biblioteca. Todos los atributos son booleanos
 * para ver el estado de estos estando solo un booleano en la posicion true.
 * @author Cesar Rodriguez
 * @version 1.0.0
 */
package PracticaBiblioteca;

public class estadoCopia {
    private boolean prestado;
    /**
     * booleano que si = True es que se encuentra en el estado prestado si = False es que no lo esta.
     */
    private boolean retraso;
    /**
     *booleano que si = True es que se encuentra en el estado retrasado si = False es que no lo esta.
     */
    private boolean biblioteca;
    /**
     *booleano que si = True es que se encuentra en el estado biblioteca si = False es que no lo esta.
     */
    private boolean repaaracion;
    /**
     *booleano que si = True es que se encuentra en el estado reparacion si = False es que no lo esta.
     */
    public estadoCopia(boolean prestado, boolean retraso, boolean biblioteca, boolean repaaracion) {
        this.prestado = prestado;
        this.retraso = retraso;
        this.biblioteca = biblioteca;
        this.repaaracion = repaaracion;
    }
    /**
     * Constructor de estadoCopia
     */
    public boolean isPrestado() {
        return prestado;
    }
    /**
     * getter de prestado
     * @return prestado
     */
    public boolean isRetraso() {
        return retraso;
    }
    /**
     * getter de retraso
     * @return retraso
     */
    public boolean isBiblioteca() {
        return biblioteca;
    }
    /**
     * getter de biblioteca
     * @return biblioteca
     */
    public boolean isRepaaracion() {
        return repaaracion;
    }
    /**
     * getter de repaaracion
     * @return repaaracion
     */
    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
        /**
         * setter direccion
         * @param direccion
         */
    }

    public void setRetraso(boolean retraso) {
        this.retraso = retraso;
        /**
         * setter direccion
         * @param direccion
         */
    }

    public void setBiblioteca(boolean biblioteca) {
        this.biblioteca = biblioteca;
        /**
         * setter biblioteca
         * @param biblioteca
         */
    }

    public void setRepaaracion(boolean repaaracion) {
        this.repaaracion = repaaracion;
        /**
         * setter repaaracion
         * @param repaaracion
         */
    }
}
