package Buses;

/**
 * @author Martin Gonzalez
 *         Clase AsientoCama que extiende de la clase Asiento para representar
 *         un asiento cama dentro de un autobús.
 *         Este tipo de asiento ofrece características adicionales como ser
 *         convertible en cama, proporcionando
 *         mayor comodidad para viajes largos. Hereda propiedades y métodos de
 *         la clase Asiento y especifica
 *         detalles propios de un asiento cama.
 */
public class AsientoCama extends Asiento {
    /**
     * Tipo de asiento, en este caso, cama. Es una constante que define las
     * características específicas
     * del asiento cama, incluyendo el precio.
     */
    private final TipoAsiento cama = TipoAsiento.CAMA;

    /**
     * Constructor para crear un nuevo AsientoCama.
     * Inicializa un asiento cama con un número identificador, establece su precio y
     * tipo
     * basándose en las propiedades del tipo de asiento cama, y marca el asiento
     * como no ocupado.
     * 
     * @param numero El número identificador del asiento cama.
     */
    public AsientoCama(int numero) {
        super(numero); // Llama al constructor de la clase base Asiento
        precio = cama.getPrecio(); // Establece el precio del asiento cama
        tipo = cama.toString(); // Establece el tipo de asiento como "CAMA"
        ocupado = false; // Inicializa el asiento como no ocupado
    }
}