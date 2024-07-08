package Buses;

/**
 * @author Martin Gonzalez
 *         Clase AsientoFactory que se utiliza para crear instancias de
 *         diferentes tipos de asientos.
 *         Esta clase implementa el patrón de diseño Factory, permitiendo la
 *         creación de objetos de
 *         asientos sin especificar las clases concretas. La clase proporciona
 *         un método para crear
 *         asientos basándose en el tipo de asiento requerido.
 */
public class AsientoFactory {
    private Asiento asiento; // Variable para almacenar la instancia de Asiento creada

    /**
     * Constructor por defecto de AsientoFactory.
     * Inicializa una nueva instancia de la fábrica de asientos sin parámetros
     * específicos.
     */
    public AsientoFactory() {
    }

    /**
     * Crea y devuelve una instancia de un asiento basado en el tipo de asiento y el
     * número proporcionado.
     * Este método decide qué tipo de asiento instanciar basándose en el valor del
     * enumerado TipoAsiento.
     * 
     * @param tipo   El tipo de asiento a crear, especificado por el enumerado
     *               TipoAsiento.
     * @param numero El número identificador para el asiento a crear.
     * @return Una instancia de Asiento correspondiente al tipo especificado.
     */
    public Asiento crearAsiento(TipoAsiento tipo, int numero) {
        switch (tipo) {
            case NORMAL -> asiento = new AsientoNormal(numero); // Crea un asiento normal
            case SEMICAMA -> asiento = new AsientoSemiCama(numero); // Crea un asiento semicama
            case CAMA -> asiento = new AsientoCama(numero); // Crea un asiento cama
        }
        return asiento; // Devuelve la instancia de Asiento creada
    }
}