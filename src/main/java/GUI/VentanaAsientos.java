package GUI;

import Buses.Bus;
import Logica.Recorrido;

import javax.swing.*;
import java.awt.*;

public class VentanaAsientos  extends JFrame {
    private PanelAsientos panelAsientos;
    private static VentanasMediator mediator;
    public VentanaAsientos(Recorrido recorrido) {
        super();
        this.setTitle("Asientos - " + recorrido.toString());
        this.setLayout(new BorderLayout());
        this.setSize(800, 600);

        this.mediator = new VentanasMediator(this);
        panelAsientos = new PanelAsientos(Color.lightGray, recorrido, mediator);

        this.add(panelAsientos, BorderLayout.CENTER);
        mostrarInformacionBus(recorrido);
    }

    //esto despues cambiarlo y que se vea la informacion en una parte del PanelAsientos, esto de la mensaje emergente es solo temporal para ver que se muestra bien la info de cada bus
    private void mostrarInformacionBus(Recorrido recorrido) {
        Bus bus = recorrido.getBus();
        if (bus != null) {
            String cantidadAsientos = bus.toString();

            String mensaje = "Información del Bus:\n" +
                    "Tipo: " + bus.getTipo() + "\n" +
                    "Asientos: " + cantidadAsientos + "\n";
            JOptionPane.showMessageDialog(this, mensaje);
        }
    }
    public void cerrarVentana() {
        this.dispose(); // Cierra la ventana
    }
}