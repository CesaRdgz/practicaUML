/**
 * Esta es la clase fecha para el diagrama de polideportivo.
 * @author Cesar Rodriguez
 * @version 1.0.0
 */
package PracticaPolideportivo;

public class fecha {
    private String horaDeEntrada;
    /**
     * En este String se almacena la hora de entrada
     */
    private String horaDeSalida;
    /**
     * En este String se almacena la hora de salida
     */
    public fecha(String horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
    }
    /**
     * Constructor de fecha
     */
    public String getHoraDeEntrada() {
        return horaDeEntrada;
        /**
         * getter de horaDeEntrada
         * @return horaDeEntrada
         */
    }

    public String getHoraDeSalida() {
        return horaDeSalida;
        /**
         * getter de horaDeSalida
         * @return horaDeSalida
         */
    }

    public void setHoraDeEntrada(String horaDeEntrada) {
        this.horaDeEntrada = horaDeEntrada;
        /**
         * setter horaDeEntrada
         * @param horaDeEntrada
         */
    }

    public void setHoraDeSalida(String horaDeSalida) {
        this.horaDeSalida = horaDeSalida;
        /**
         * setter horaDeSalida
         * @param horaDeSalida
         */
    }
}
