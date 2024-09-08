package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame{
    private JPanel panelPrincipal;
    private JPanel panelSuperior;
    private JPanel panelCentral;
    private JMenuBar menuPrincipal;
    private JMenu menuTenderos;
    private JMenu menuRecolectores;
    private JMenuItem btnRegistrarTenderos;
    private JMenuItem btnRegistrarRecolectores;
    private CardLayout cardLayout; // Usamos CardLayout para cambiar de paneles

    public Main(){
        setTitle("Aplicación de Terrenos");
        setSize(800, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

// Inicializar componentes
        panelPrincipal = new JPanel(new BorderLayout());
        panelCentral = new JPanel(new BorderLayout());
        panelSuperior = new JPanel(new FlowLayout());

        menuPrincipal = new JMenuBar();
        menuTenderos = new JMenu("Tenderos");
        menuRecolectores = new JMenu("Recolectores");
        btnRegistrarTenderos = new JMenuItem("Registrar Tenderos");
        btnRegistrarRecolectores = new JMenuItem("Registrar Recolectores");

        // Añadir los botones al menú
        menuTenderos.add(btnRegistrarTenderos);
        menuRecolectores.add(btnRegistrarRecolectores);
        menuPrincipal.add(menuTenderos);
        menuPrincipal.add(menuRecolectores);

        // Configurar el panel principal
        setJMenuBar(menuPrincipal);
        panelPrincipal.add(panelSuperior, BorderLayout.NORTH);
        panelPrincipal.add(panelCentral, BorderLayout.CENTER);
        setContentPane(panelPrincipal);

        setContentPane(panelPrincipal);
        btnRegistrarTenderos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                mostrarFormulario(new FormRegistrarTenderos());
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
            Main frame = new Main();
            frame.setVisible(true);
        });
    }
}
