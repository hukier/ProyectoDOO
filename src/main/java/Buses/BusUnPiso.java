package Buses;

/**
 * @author Martin Gonzalez
 *         Representa un autobús de un solo piso, extendiendo la funcionalidad
 *         de la clase abstracta Bus.
 *         Este tipo de autobús está diseñado para acomodar pasajeros en un
 *         único nivel, ofreciendo diferentes tipos de asientos:
 *         normal y semicama. Los asientos cama no están disponibles en este
 *         modelo.
 */
public class BusUnPiso extends Bus {

    /**
     * Constructor para crear una instancia de BusUnPiso.
     * Inicializa el autobús con una distribución específica de asientos y crea los
     * asientos correspondientes.
     */
    public BusUnPiso() {
        super(); // Llama al constructor de la clase base Bus
        ASIENTOS_NORMAL = 30; // Establece el número de asientos normales
        ASIENTOS_SEMI = 10; // Establece el número de asientos semicama
        ASIENTOS_CAMA = 0; // Establece que no hay asientos cama
        crearAsientos(); // Crea los asientos en el autobús
    }

    /**
     * Obtiene el tipo de autobús.
     * 
     * @return Una cadena de texto que indica que este es un autobús de "Un Piso".
     */
    @Override
    public String getTipo() {
        return "Un Piso";
    }

    /**
     * Obtiene la cantidad de pisos del autobús.
     * 
     * @return El número de pisos del autobús, que es 1 para este tipo de autobús.
     */
    public int getCantidadPisos() {
        return 1;
    }

    /**
     * Representación en cadena del autobús de un piso.
     * 
     * @return Una cadena de texto que describe el autobús, incluyendo su tipo y
     *         tarifa.
     */
    public String toString() {
        return "1 Piso. Tarifa: " + this.getTarifa();
    }
}