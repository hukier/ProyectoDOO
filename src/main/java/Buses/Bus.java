package Buses;

import java.util.ArrayList;

/**
 * @author Martin Gonzalez
 *         Clase abstracta Bus que define la estructura básica de un autobús.
 *         Esta clase proporciona la base para diferentes tipos de autobuses,
 *         especificando propiedades comunes
 *         como la cantidad de asientos de diferentes tipos y la tarifa. Utiliza
 *         una fábrica de asientos para crear
 *         y gestionar los asientos dentro del autobús.
 */
public abstract class Bus {
    protected int ASIENTOS_NORMAL; // Número de asientos normales en el autobús
    protected int ASIENTOS_SEMI; // Número de asientos semicama en el autobús
    protected int ASIENTOS_CAMA; // Número de asientos cama en el autobús
    private int ASIENTOS_TOTAL; // Número total de asientos en el autobús
    private int tarifa; // Tarifa base para viajar en el autobús
    private final ArrayList<Asiento> asientos; // Lista de asientos en el autobús
    private final AsientoFactory asientoFactory; // Fábrica para crear instancias de asientos

    /**
     * Constructor por defecto de la clase Bus.
     * Inicializa la fábrica de asientos y la lista de asientos.
     */
    public Bus() {
        asientoFactory = new AsientoFactory(); // Inicializa la fábrica de asientos
        asientos = new ArrayList<>(); // Inicializa la lista de asientos
    }

    /**
     * Crea los asientos del bus según las cantidades especificadas y los agrega al
     * ArrayList de asientos.
     * Utiliza la fábrica de asientos para crear instancias de asientos de los tipos
     * especificados.
     */
    protected void crearAsientos() {
        for (int i = 0; i < ASIENTOS_NORMAL; i++) {
            Asiento aux = asientoFactory.crearAsiento(TipoAsiento.NORMAL, i);
            asientos.add(aux);
        }
        for (int i = 0; i < ASIENTOS_SEMI; i++) {
            Asiento aux = asientoFactory.crearAsiento(TipoAsiento.SEMICAMA, i + ASIENTOS_NORMAL);
            asientos.add(aux);
        }
        for (int i = 0; i < ASIENTOS_CAMA; i++) {
            Asiento aux = asientoFactory.crearAsiento(TipoAsiento.CAMA, i + ASIENTOS_NORMAL + ASIENTOS_SEMI);
            asientos.add(aux);
        }

        ASIENTOS_TOTAL = ASIENTOS_NORMAL + ASIENTOS_SEMI + ASIENTOS_CAMA; // Calcula el total de asientos
    }

    /**
     * Obtiene el ArrayList de asientos del autobús.
     * 
     * @return ArrayList de asientos del autobús.
     */
    public ArrayList<Asiento> getAsientosArray() {
        return asientos;
    }

    /**
     * Método abstracto para obtener el tipo de autobús.
     * 
     * @return String que representa el tipo de autobús.
     */
    public abstract String getTipo();

    /**
     * Método abstracto para obtener la cantidad de pisos del autobús.
     * 
     * @return int que representa la cantidad de pisos del autobús.
     */
    public abstract int getCantidadPisos();

    /**
     * Obtiene el número total de asientos en el autobús.
     * 
     * @return int que representa el número total de asientos en el autobús.
     */
    public int getAsientosTotalInt() {
        return ASIENTOS_TOTAL;
    }

    /**
     * Obtiene el número de asientos cama en el autobús.
     * 
     * @return int que representa el número de asientos cama en el autobús.
     */
    public int getAsientosCamaInt() {
        return ASIENTOS_CAMA;
    }

    /**
     * Obtiene el número de asientos semicama en el autobús.
     * 
     * @return int que representa el número de asientos semicama en el autobús.
     */
    public int getAsientosSemiInt() {
        return ASIENTOS_SEMI;
    }

    /**
     * Obtiene el número de asientos normales en el autobús.
     * 
     * @return int que representa el número de asientos normales en el autobús.
     */
    public int getAsientosNormalInt() {
        return ASIENTOS_NORMAL;
    }

    /**
     * Obtiene la tarifa base para viajar en el autobús.
     * 
     * @return int que representa la tarifa base para viajar en el autobús.
     */
    public int getTarifa() {
        return tarifa;
    }

    /**
     * Establece la tarifa base para viajar en el autobús.
     * 
     * @param precio int que representa la nueva tarifa base para viajar en el
     *               autobús.
     */
    public void setTarifa(int precio) {
        this.tarifa = precio;
    }

    /**
     * Método abstracto para obtener la representación en cadena del autobús.
     * 
     * @return String que representa el autobús.
     */
    public abstract String toString();
}