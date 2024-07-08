package Buses;

/**
 * @author Martin Gonzalez
 *         Representa un asiento semicama dentro de un autobús.
 *         Este tipo de asiento ofrece un nivel intermedio de comodidad entre un
 *         asiento normal y un asiento cama,
 *         siendo una opción adecuada para viajes de larga distancia que no
 *         requieren la comodidad completa de un asiento cama.
 *         Hereda de la clase Asiento y utiliza el enumerado TipoAsiento para
 *         definir sus propiedades específicas.
 */
public class AsientoSemiCama extends Asiento {
    /**
     * Define el tipo de asiento como SEMICAMA, utilizando el enumerado TipoAsiento.
     * Esta propiedad se utiliza para establecer las características específicas del
     * asiento semicama,
     * como su precio y su representación en forma de cadena.
     */
    private final TipoAsiento semi_cama = TipoAsiento.SEMICAMA;

    /**
     * Constructor para crear un nuevo AsientoSemiCama.
     * Inicializa un asiento semicama con un número identificador, establece su
     * precio y tipo
     * basándose en las propiedades del tipo de asiento semicama, y marca el asiento
     * como no ocupado.
     * 
     * @param numero El número identificador del asiento semicama.
     */
    public AsientoSemiCama(int numero) {
        super(numero); // Llama al constructor de la clase base Asiento
        precio = semi_cama.getPrecio(); // Establece el precio del asiento semicama
        tipo = semi_cama.toString(); // Establece el tipo de asiento como "SEMICAMA"
        ocupado = false; // Inicializa el asiento como no ocupado
    }
}