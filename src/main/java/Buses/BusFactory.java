package Buses;

/**
 * Fábrica para crear instancias de diferentes tipos de autobuses.
 * Esta clase permite la creación de autobuses de un piso o dos pisos, según se
 * especifique.
 */
public class BusFactory {
    private Bus bus; // Variable para almacenar la instancia de Bus creada

    /**
     * Constructor por defecto de BusFactory.
     * Inicializa la fábrica sin crear ninguna instancia de autobús.
     */
    public BusFactory() {
    }

    /**
     * Crea una instancia de un autobús, ya sea de un piso o de dos pisos, basándose
     * en el parámetro proporcionado.
     * 
     * @param pisos El número de pisos del autobús a crear. 1 para un autobús de un
     *              piso, 2 para un autobús de dos pisos.
     * @return La instancia de Bus creada, que puede ser de tipo BusUnPiso o
     *         BusDosPisos.
     */
    public Bus crearBus(int pisos) {
        switch (pisos) {
            case 1 -> bus = new BusUnPiso(); // Crea un autobús de un piso
            case 2 -> bus = new BusDosPisos(); // Crea un autobús de dos pisos
        }
        return bus; // Retorna la instancia de autobús creada
    }
}