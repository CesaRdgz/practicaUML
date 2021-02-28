package PracticaBiblioteca;

/**
 * Esta es la clase copia para el diagrama de biblioteca
 * @author Cesar Rodriguez
 * @version 1.0.0
 */
public class copia {
    private int referencia;
    /**
     * Aqui se registrara el numero de referencia de la copia
     */
    private estadoCopia;
    /**
     * Se hace referencia a la tabla EstadoCopia y se crea la vinculacion entre clases
     */
    public copia(int referencia) {
        this.referencia = referencia;
    }
    /**
     * Constructor de copia
     */
    public int getReferencia() {
        return referencia;
    }
    /**
     * getter de referencia
     * @return referencia
     */
    public void setReferencia(int referencia) {
        this.referencia = referencia;
        /**
         * setter referencia
         * @param referencia
         */
    }
}
