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
}
