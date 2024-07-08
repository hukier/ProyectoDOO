package Logica;

import Buses.Bus;
import Buses.BusFactory;

import java.time.LocalTime;

public class Recorrido implements Comparable<Recorrido> {

    private final EnumHorarios horario_salida;
    private final String origen;
    private final String destino;
    private final LocalTime hora_salida;
    private final int distancia;
    private LocalTime hora_llegada;

    private BusFactory busFactory;
    private Bus bus;
    private int tarifa;

    /**
     *
     * @param origen origen del viaje
     * @param destino destino del viaje
     * @param horario_salida hora de salida del viaje
     * Se crea un recorrido con los parametros entregados, se calcula la distancia entre las ciudades
     */
    public Recorrido(EnumCiudades origen , EnumCiudades destino, EnumHorarios horario_salida) {
        this.origen = origen.getNombre();
        this.destino = destino.getNombre();
        this.horario_salida = horario_salida;
        this.hora_salida = horario_salida.getHora();
        this.distancia = Math.abs(origen.getDistancia() - destino.getDistancia());
        this.busFactory = new BusFactory();
        asignarBus();
    }

    /**
     * Se asigna un bus aleatorio al recorrido
     */
    private void asignarBus() {
        this.bus = busFactory.crearBus((Math.random() <= 0.5) ? 1 : 2);
        bus.setTarifa(calcularPrecio());
        calcularHoraLLegada();
    }

    /**
     * Se asigna un bus al recorrido, se utiliza para debuggear
     * @param pisos bus de pisos pisos
     */
    public void debugAsignarBus(int pisos) {
        this.bus = busFactory.crearBus(pisos);
        bus.setTarifa(calcularPrecio());
        calcularHoraLLegada();
    }

    /**
     * Se calcula la hora de llegada del viaje
     */
    void calcularHoraLLegada() {
        //if distancia < 2 entonces el viaje dura 1 hora y media
        final int MEDIA_HORA = 30;
        int indice_aux;

        switch (distancia) {
            case 0, 1, 2 -> indice_aux = MEDIA_HORA * 3; //Chillan-Concepcion-LosAngeles
            case 3,4 -> indice_aux = MEDIA_HORA * 10;//LosAngeles/Concepcion - Santiago
            case 5 -> indice_aux = MEDIA_HORA * 9;//Chillan-Santiago
            default -> indice_aux = 0;
        }

        hora_llegada = horario_salida.getHora().plusMinutes(indice_aux);
    }

    //Getters y Setters de los atributos internos
    public EnumHorarios getHorario_salida() {
        return horario_salida;
    }
    public String getOrigen() {
        return origen;
    }
    public String getDestino() {
        return destino;
    }
    public LocalTime getHora_salida() {
        return hora_salida;
    }
    public int getDistancia() {
        return distancia;
    }
    public LocalTime getHora_llegada() {
        return hora_llegada;
    }
    public Bus getBus() {
        return bus;
    }

    /**
     * Se calcula el precio del viaje
     * @return
     */
    public int calcularPrecio() {
        tarifa = 2000 * distancia;
        return tarifa;
    }
    public String toString() {
        return hora_salida + "-" + hora_llegada + " " + origen + "-" + destino ;
    }

    public int compareTo(Recorrido recorrido) {
        return this.hora_salida.compareTo(recorrido.getHora_salida());
    }

}