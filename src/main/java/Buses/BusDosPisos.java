package Buses;

/**
 * @author Martin Gonzalez
 *         Representa un autobús de dos pisos, extendiendo la funcionalidad de
 *         la clase abstracta Bus.
 *         Este tipo de autobús está diseñado para acomodar una mayor cantidad
 *         de pasajeros, distribuidos en dos niveles,
 *         ofreciendo diferentes tipos de asientos: normal, semicama y cama.
 */
public class BusDosPisos extends Bus {
    /**
     * Constructor para crear una instancia de BusDosPisos.
     * Inicializa el autobús con una distribución específica de asientos y crea los
     * asientos correspondientes.
     */
    public BusDosPisos() {
        super(); // Llama al constructor de la clase base Bus
        ASIENTOS_NORMAL = 30; // Establece el número de asientos normales
        ASIENTOS_SEMI = 10; // Establece el número de asientos semicama
        ASIENTOS_CAMA = 10; // Establece el número de asientos cama
        crearAsientos(); // Crea los asientos en el autobús
    }

    /**
     * Obtiene el tipo de autobús.
     * 
     * @return Una cadena de texto que indica que este es un autobús de "Dos Pisos".
     */
    @Override
    public String getTipo() {
        return "Dos Pisos";
    }

    /**
     * Obtiene la cantidad de pisos del autobús.
     * 
     * @return El número de pisos del autobús, que es 2 para este tipo de autobús.
     */
    public int getCantidadPisos() {
        return 2;
    }

    /**
     * Representación en cadena del autobús de dos pisos.
     * 
     * @return Una cadena de texto que describe el autobús, incluyendo su tipo y
     *         tarifa.
     */
    public String toString() {
        return "2 Pisos. Tarifa: " + this.getTarifa();
    }

}