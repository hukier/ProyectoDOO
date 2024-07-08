package Buses;

/**
 * @author Martin Gonzalez
 *         Enumeración que representa los diferentes tipos de asientos
 *         disponibles en un autobús.
 *         Cada tipo de asiento tiene asociado un precio específico.
 */
public enum TipoAsiento {
    /**
     * Asiento normal con un precio base.
     */
    NORMAL(3000),
    /**
     * Asiento semicama con un precio mayor que el asiento normal.
     */
    SEMICAMA(4000),
    /**
     * Asiento cama con el precio más alto, ofreciendo mayor comodidad.
     */
    CAMA(5000);

    private final int precio; // Precio del tipo de asiento

    /**
     * Constructor privado para inicializar el tipo de asiento con su precio.
     * 
     * @param precio Precio del tipo de asiento.
     */
    TipoAsiento(int precio) {
        this.precio = precio;
    }

    /**
     * Obtiene el precio del tipo de asiento.
     * 
     * @return Precio del tipo de asiento.
     */
    public int getPrecio() {
        return this.precio;
    }

    /**
     * Representación en cadena del tipo de asiento.
     * 
     * @return Nombre del tipo de asiento.
     */
    public String toString() {
        return this.name();
    }
}