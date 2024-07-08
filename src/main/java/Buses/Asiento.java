package Buses;

/**
 * @author Martin Gonzalez
 *         Clase abstracta Asiento que representa un asiento dentro de un
 *         autobús.
 *         Esta clase proporciona la estructura básica de un asiento, incluyendo
 *         su número,
 *         precio, tipo, y estado (ocupado o no, seleccionado temporalmente o
 *         no).
 */
public abstract class Asiento {
    protected int precio; // Precio del asiento
    private int numero; // Número identificador del asiento
    protected String tipo; // Tipo de asiento (puede ser normal, VIP, etc.)
    public boolean ocupado; // Estado del asiento (ocupado o no)
    protected boolean temp_seleccionado; // Estado temporal de selección del asiento

    /**
     * Constructor para crear un nuevo Asiento.
     * 
     * @param numero El número identificador del asiento.
     */
    public Asiento(int numero) {
        this.ocupado = false; // Empieza con todos los asientos desocupados
        this.temp_seleccionado = false; // Empieza con todos los asientos sin seleccionar
        this.numero = numero;
    }

    /**
     * Obtiene el precio del asiento.
     * 
     * @return El precio del asiento.
     */
    public int getPrecio() {
        return precio;
    }

    /**
     * Obtiene el tipo de asiento.
     * 
     * @return El tipo de asiento.
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * Obtiene el número del asiento.
     * 
     * @return El número del asiento.
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Establece el estado de ocupación del asiento.
     * 
     * @param estado El estado de ocupación del asiento (true para ocupado, false
     *               para desocupado).
     */
    public void setOcupado(boolean estado) {
        ocupado = estado;
    }

    /**
     * Verifica si el asiento está ocupado.
     * 
     * @return true si el asiento está ocupado, de lo contrario false.
     */
    public boolean isOcupado() {
        return ocupado;
    }

    /**
     * Obtiene el estado temporal de selección del asiento.
     * 
     * @return true si el asiento está temporalmente seleccionado, de lo contrario
     *         false.
     */
    public boolean getTemp_seleccionado() {
        return temp_seleccionado;
    }

    /**
     * Establece el estado temporal de selección del asiento.
     * 
     * @param temp_seleccionado El estado temporal de selección del asiento.
     */
    public void setTemp_seleccionado(boolean temp_seleccionado) {
        this.temp_seleccionado = temp_seleccionado;
    }

    /**
     * Representación en cadena de texto del asiento.
     * 
     * @return Una cadena de texto que representa el asiento.
     */
    @Override
    public String toString() {
        return "Asiento " + numero + "(" + tipo + ")";
    }
}