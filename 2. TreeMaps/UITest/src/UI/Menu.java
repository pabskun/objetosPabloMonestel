package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Menu extends JFrame{
    private JMenu menuPersonas;
    private JMenuItem registrarTerrenos;
    private JMenuItem registrarPersonas;
    private JMenu menuTerrenos;
    private JPanel panelCentral;
    private JPanel panelPrincipal;

    public Menu() {
        // Configuración básica de la ventana
        setTitle("Aplicación de Formularios");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setContentPane(panelPrincipal);

        // Panel central para contenido dinámico
        panelCentral = new JPanel(new BorderLayout());
        add(panelCentral, BorderLayout.CENTER);

        // Añadir acción para los items del menú
        registrarPersonas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFormulario(new PersonaForm());
            }
        });

        registrarTerrenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFormulario(new Form2());
            }
        });
    }

    private void mostrarFormulario(JPanel form) {
        // Cambiar el contenido del panel central
        panelCentral.removeAll();
        panelCentral.add(form, BorderLayout.CENTER);
        panelCentral.revalidate();
        panelCentral.repaint();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            Menu frame = new Menu();
            frame.setVisible(true);
        });
    }
}
