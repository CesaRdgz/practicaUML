package PracticaBiblioteca;
/**
 * Esta es la clase genero para el diagrama de biblioteca. Todos los atributos son booleanos
 * para ver el estado de estos estando solo un booleano en la posicion true.
 * @author Cesar Rodriguez
 * @version 1.0.0
 */
public class genero {
    private boolean novela;
    /**
     * booleano que si = True es que pertenece al genero novela si = False es que no lo esta.
     */
    private boolean teatro;
    /**
     * booleano que si = True es que pertenece al genero teatro si = False es que no lo esta.
     */
    private boolean poesia;
    /**
     * booleano que si = True es que pertenece al genero poesia si = False es que no lo esta.
     */
    private boolean ensayo;
    /**
     * booleano que si = True es que pertenece al genero ensayo si = False es que no lo esta.
     */
    public genero(boolean novela, boolean teatro, boolean poesia, boolean ensayo) {
        this.novela = novela;
        this.teatro = teatro;
        this.poesia = poesia;
        this.ensayo = ensayo;
    }
    /**
     * Constructor de genero
     */
    public boolean isNovela() {
        return novela;
    }
    /**
     * getter de novela
     * @return novela
     */
    public boolean isTeatro() {
        return teatro;
    }
    /**
     * getter de teatro
     * @return teatro
     */
    public boolean isPoesia() {
        return poesia;
    }
    /**
     * getter de poesia
     * @return poesia
     */
    public boolean isEnsayo() {
        return ensayo;
    }
    /**
     * getter de ensayo
     * @return ensayo
     */
    public void setNovela(boolean novela) {
        this.novela = novela;
        /**
         * setter novela
         * @param novela
         */
    }

    public void setTeatro(boolean teatro) {
        this.teatro = teatro;
        /**
         * setter teatro
         * @param teatro
         */
    }

    public void setPoesia(boolean poesia) {
        this.poesia = poesia;
        /**
         * setter poesia
         * @param poesia
         */
    }

    public void setEnsayo(boolean ensayo) {
        this.ensayo = ensayo;
        /**
         * setter ensayo
         * @param ensayo
         */
    }
}
