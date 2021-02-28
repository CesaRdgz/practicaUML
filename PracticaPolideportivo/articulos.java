/**
 * Esta es la clase articulos para el diagrama de polideportivo.
 * @author Cesar Rodriguez
 * @version 1.0.0
 */
package PracticaPolideportivo;

public class articulos {
    private int balones;
    /**
     * En este int se almacenara el numero de balones de los que se dispongan
     */
    private int redes;
    /**
     * En este int se almacenara el numero de redes de las que se dispongan
     */
    private int raquetas;
    /**
     * En este int se almacenara el numero de raquetas de las que se dispongan
     */
    public articulos(int balones, int redes, int raquetas) {
        this.balones = balones;
        this.redes = redes;
        this.raquetas = raquetas;
    }
    /**
     * Constructor de articulos
     */
    public int getBalones() {
        return balones;
        /**
         * getter de balones
         * @return balones
         */
    }

    public int getRedes() {
        return redes;
        /**
         * getter de redes
         * @return redes
         */
    }

    public int getRaquetas() {
        return raquetas;
        /**
         * getter de raquetas
         * @return raquetas
         */
    }

    public void setBalones(int balones) {
        this.balones = balones;
        /**
         * setter balones
         * @param balones
         */
    }

    public void setRedes(int redes) {
        this.redes = redes;
        /**
         * setter redes
         * @param redes
         */
    }

    public void setRaquetas(int raquetas) {
        this.raquetas = raquetas;
        /**
         * setter raquetas
         * @param raquetas
         */
    }
}
