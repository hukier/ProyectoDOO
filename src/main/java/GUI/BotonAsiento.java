package GUI;

import Buses.Asiento;
import Logica.SistemaAsientos;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Clase que representa un botón de asiento en la interfaz gráfica de usuario.
 * Cada botón de asiento está asociado a un objeto Asiento específico y permite
 * al usuario seleccionar o deseleccionar el asiento.
 */
public class BotonAsiento extends JButton {
    private Asiento asiento; // Objeto Asiento asociado a este botón
    private SistemaAsientos sistema_asientos; // Referencia al sistema de asientos para realizar operaciones sobre los
                                              // asientos

    /**
     * Constructor que crea un nuevo botón de asiento.
     * 
     * @param asiento          Objeto Asiento asociado a este botón.
     * @param sistema_asientos Referencia al sistema de asientos para realizar
     *                         operaciones.
     */
    public BotonAsiento(Asiento asiento, SistemaAsientos sistema_asientos) {
        super(); // Llama al constructor de la superclase JButton
        this.setSize(100, 25); // Establece el tamaño del botón
        this.asiento = asiento; // Asigna el objeto Asiento
        this.sistema_asientos = sistema_asientos; // Asigna el sistema de asientos

        // Establece el texto del botón con el número y tipo de asiento
        this.setText("<html> " + String.valueOf(asiento.getNumero()) + "<br />" + asiento.getTipo() + "</html>");

        actualizarEstado(); // Actualiza el estado visual del botón según el estado del asiento
        this.addActionListener(new AsientoListener()); // Añade un listener para manejar clics en el botón
    }

    /**
     * Actualiza el estado visual del botón basado en el estado del asiento
     * asociado.
     * El color del botón cambia según si el asiento está ocupado, seleccionado
     * temporalmente o disponible.
     */
    public void actualizarEstado() {
        if (asiento.isOcupado()) {
            this.setBackground(Color.gray); // Asiento ocupado
        } else {
            if (asiento.getTemp_seleccionado() == true) {
                this.setBackground(Color.red); // Asiento seleccionado temporalmente
            } else {
                this.setBackground(Color.green); // Asiento disponible
            }
        }
    }

    /**
     * Clase interna que implementa ActionListener para manejar eventos de clic en
     * el botón de asiento.
     */
    private class AsientoListener implements ActionListener {
        /**
         * Maneja el evento de clic en el botón de asiento.
         * Si el asiento está disponible, permite seleccionarlo o deseleccionarlo.
         * 
         * @param e Evento de acción generado por el clic en el botón.
         */
        public void actionPerformed(ActionEvent e) {
            if (asiento.isOcupado()) {
                // Muestra un mensaje de error si el asiento ya está ocupado
                JOptionPane.showMessageDialog(null, "Este asiento ya está ocupado.", "Error",
                        JOptionPane.ERROR_MESSAGE);
            } else {
                if (asiento.getTemp_seleccionado() == false) {
                    // Selecciona el asiento si no estaba seleccionado
                    System.out.println("Asiento " + asiento.getNumero() + " seleccionado");
                    sistema_asientos.elegirAsiento(asiento.getNumero());
                    actualizarEstado(); // Actualiza el estado visual del botón
                } else if (asiento.getTemp_seleccionado() == true) {
                    // Deselecciona el asiento si estaba seleccionado
                    sistema_asientos.deselegirAsiento(asiento.getNumero());
                    actualizarEstado(); // Actualiza el estado visual del botón
                }
            }
        }
    }
}