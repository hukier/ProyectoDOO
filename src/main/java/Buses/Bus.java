package Buses;

import java.util.ArrayList;

public abstract class Bus {
    protected int ASIENTOS_NORMAL;
    protected int ASIENTOS_SEMI;
    protected int ASIENTOS_CAMA;
    private int ASIENTOS_TOTAL;
    private int tarifa;
    private final ArrayList<Asiento> asientos;
    private final AsientoFactory asientoFactory;

    public Bus() {
        asientoFactory = new AsientoFactory();
        asientos = new ArrayList();
    }

    /**
     * Crea los asientos del bus y los agrega al ArrayList
     */
    protected void crearAsientos() {
        for (int i = 0; i < ASIENTOS_NORMAL; i++) {
            Asiento aux = asientoFactory.crearAsiento(TipoAsiento.NORMAL, i);
            asientos.add(aux);
        }
        for (int i = 0; i < ASIENTOS_SEMI; i++) {
            Asiento aux = asientoFactory.crearAsiento(TipoAsiento.SEMICAMA, i + ASIENTOS_NORMAL);
            asientos.add(aux);
        }
        for (int i = 0; i < ASIENTOS_CAMA; i++) {
            Asiento aux = asientoFactory.crearAsiento(TipoAsiento.CAMA, i + ASIENTOS_NORMAL + ASIENTOS_SEMI);
            asientos.add(aux);
        }

        ASIENTOS_TOTAL = ASIENTOS_NORMAL + ASIENTOS_SEMI + ASIENTOS_CAMA;
    }
    public ArrayList getAsientosArray() {
        return asientos;
    }
    public abstract String getTipo();
    public abstract int getCantidadPisos();
    public int getAsientosTotalInt() {
        return ASIENTOS_TOTAL;
    }
    public int getAsientosCamaInt() {
        return ASIENTOS_CAMA;
    }
    public int getAsientosSemiInt() {
        return ASIENTOS_SEMI;
    }
    public int getAsientosNormalInt() {
        return ASIENTOS_NORMAL;
    }
    public int getTarifa() {
        return tarifa;
    }
    public void setTarifa(int precio) {
        this.tarifa = precio;
    }
    public abstract String toString() ;
}