package Logica;

/**
 * @author Martin Gonzalez
 *         Enumeración que representa las ciudades disponibles con sus
 *         respectivas distancias.
 *         Cada ciudad tiene asociado un nombre único y una distancia que la
 *         separa de un punto de referencia.
 */
public enum EnumCiudades {
    /**
     * Ciudad Chillán con distancia 0 desde el punto de referencia.
     */
    CIUDAD_1("CHILLAN", 0),
    /**
     * Ciudad Concepción con distancia 1 desde el punto de referencia.
     */
    CIUDAD_2("CONCEPCION", 1),
    /**
     * Ciudad Los Ángeles con distancia 2 desde el punto de referencia.
     */
    CIUDAD_3("LOS ANGELES", 2),
    /**
     * Ciudad Santiago con distancia 5 desde el punto de referencia.
     */
    CIUDAD_4("SANTIAGO", 5);

    private final String nombre; // Nombre de la ciudad
    private final int distancia; // Distancia de la ciudad desde el punto de referencia

    /**
     * Constructor privado para inicializar cada ciudad con su nombre y distancia.
     * 
     * @param nombre    Nombre de la ciudad.
     * @param distancia Distancia de la ciudad desde el punto de referencia.
     */
    EnumCiudades(String nombre, int distancia) {
        this.nombre = nombre;
        this.distancia = distancia;
    }

    /**
     * Obtiene el nombre de la ciudad.
     * 
     * @return Nombre de la ciudad.
     */
    public String getNombre() {
        return this.nombre;
    }

    /**
     * Obtiene la distancia de la ciudad desde el punto de referencia.
     * 
     * @return Distancia de la ciudad.
     */
    public int getDistancia() {
        return this.distancia;
    }
}