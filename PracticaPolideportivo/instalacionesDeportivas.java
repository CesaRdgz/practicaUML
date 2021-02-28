/**
 * Esta es la clase instalaciones Deportivas para el diagrama de polideportivo. Los he declarado como arrays list porque he asumido que habria mas de una pista
 * y que cada una tendria sus propias identificaciones.
 * @author Cesar Rodriguez
 * @version 1.0.0
 */
package PracticaPolideportivo;

import java.util.Arrays;

public class instalacionesDeportivas {
    private Arrays<instalacion> piscinas;
    /**
     * En este array list se guardara las piscinas
     */
    private Arrays<instalacion> frontones;
    /**
     * En este array list se guardara los frontones
     */
    private Arrays<instalacion> gimnasios;
    /**
     * En este array list se guardara los gimnasios
     */
    private Arrays<instalacion> pistasDeTenis;
    /**
     * En este array list se guardara las pistas de tenis
     */
    public instalacionesDeportivas(Arrays<instalacion> piscinas, Arrays<instalacion> frontones, Arrays<instalacion> gimnasios, Arrays<instalacion> pistasDeTenis) {
        this.piscinas = piscinas;
        this.frontones = frontones;
        this.gimnasios = gimnasios;
        this.pistasDeTenis = pistasDeTenis;
    }
    /**
     * Constructor de instalacionesDeportivas
     */
    public Arrays<instalacion> getPiscinas() {
        return piscinas;
        /**
         * getter de piscinas
         * @return piscinas
         */
    }

    public Arrays<instalacion> getFrontones() {
        return frontones;
        /**
         * getter de frontones
         * @return frontones
         */
    }

    public Arrays<instalacion> getGimnasios() {
        return gimnasios;
        /**
         * getter de gimnasios
         * @return gimnasios
         */
    }

    public Arrays<instalacion> getPistasDeTenis() {
        return pistasDeTenis;
        /**
         * getter de pistasDeTenis
         * @return pistasDeTenis
         */
    }

    public void setPiscinas(Arrays<instalacion> piscinas) {
        this.piscinas = piscinas;
        /**
         * setter piscinas
         * @param piscinas
         */
    }

    public void setFrontones(Arrays<instalacion> frontones) {
        this.frontones = frontones;
        /**
         * setter frontones
         * @param frontones
         */
    }

    public void setGimnasios(Arrays<instalacion> gimnasios) {
        this.gimnasios = gimnasios;
        /**
         * setter gimnasios
         * @param gimnasios
         */
    }

    public void setPistasDeTenis(Arrays<instalacion> pistasDeTenis) {
        this.pistasDeTenis = pistasDeTenis;
        /**
         * setter pistasDeTenis
         * @param pistasDeTenis
         */
    }
}
