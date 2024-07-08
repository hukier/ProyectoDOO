package GUI;

import Buses.Asiento;
import Logica.SistemaAsientos;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Clase abstracta que define la estructura común de un panel de pisos para la
 * representación gráfica de los asientos de un autobús.
 * Esta clase extiende de JPanel y proporciona la base para la creación de
 * paneles específicos de cada piso en la interfaz gráfica.
 */
public abstract class AbsPanelPisos extends JPanel {
    protected JLabel label_piso; // Etiqueta para mostrar información del piso
    protected JPanel panel_piso; // Panel para contener los asientos del piso
    protected SistemaAsientos sistema_asientos; // Referencia al sistema de asientos para interactuar con la lógica de
                                                // negocio

    /**
     * Constructor que inicializa el panel de piso con un color específico y una
     * referencia al sistema de asientos.
     * 
     * @param color            Color de fondo para el panel del piso.
     * @param sistema_asientos Referencia al sistema de asientos para obtener
     *                         información y realizar operaciones.
     */
    public AbsPanelPisos(Color color, SistemaAsientos sistema_asientos) {
        this.sistema_asientos = sistema_asientos; // Asigna el sistema de asientos
        setLayout(new BorderLayout()); // Establece el layout del panel
        panel_piso = new JPanel(); // Inicializa el panel que contendrá los asientos
    }

    /**
     * Método abstracto para agregar asientos al panel.
     * Las clases que hereden de AbsPanelPisos deben implementar este método para
     * definir cómo se agregan los asientos al panel.
     * 
     * @param asientos Lista de asientos a agregar al panel.
     * @param cantidad Cantidad de asientos a agregar.
     */
    public abstract void agregarAsientos(ArrayList<Asiento> asientos, int cantidad);

    /**
     * Sobrescribe el método paint de JPanel para realizar dibujos personalizados en
     * el panel.
     * 
     * @param g Contexto gráfico utilizado para dibujar en el panel.
     */
    @Override
    public void paint(Graphics g) {
        super.paint(g); // Llama a la implementación de paint de la superclase JPanel
    }

}