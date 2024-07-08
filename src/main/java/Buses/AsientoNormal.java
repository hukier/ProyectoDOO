package Buses;

/**
 * @author Martin Gonzalez
 *         Representa un asiento normal dentro de un autobús.
 *         Este tipo de asiento ofrece las características estándar de comodidad
 *         y es adecuado para viajes cortos o de duración media.
 *         Hereda de la clase Asiento y utiliza el enumerado TipoAsiento para
 *         definir sus propiedades específicas.
 */
public class AsientoNormal extends Asiento {
    /**
     * Define el tipo de asiento como NORMAL, utilizando el enumerado TipoAsiento.
     * Esta propiedad se utiliza para establecer las características específicas del
     * asiento normal,
     * como su precio y su representación en forma de cadena.
     */
    private final TipoAsiento normal = TipoAsiento.NORMAL;

    /**
     * Constructor para crear un nuevo AsientoNormal.
     * Inicializa un asiento normal con un número identificador, establece su precio
     * y tipo
     * basándose en las propiedades del tipo de asiento normal, y marca el asiento
     * como no ocupado.
     * 
     * @param numero El número identificador del asiento normal.
     */
    public AsientoNormal(int numero) {
        super(numero); // Llama al constructor de la clase base Asiento
        precio = normal.getPrecio(); // Establece el precio del asiento normal
        tipo = normal.toString(); // Establece el tipo de asiento como "NORMAL"
        ocupado = false; // Inicializa el asiento como no ocupado
    }
}