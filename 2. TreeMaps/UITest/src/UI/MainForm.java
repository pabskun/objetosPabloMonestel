package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    private JPanel panelPrincipal;
    private JPanel southJPanel;
    private JPanel northJPanel;
    private JPanel leftJPanel;
    private JPanel rightJPanel;
    private JPanel centerJPanel;
    private JButton bntMenuPersonas;
    private JButton btnMenuTerrenos;
    private CardLayout cardLayout; // Usamos CardLayout para cambiar de paneles

    public MainForm(){
        // Inicializa los paneles
        panelPrincipal = new JPanel(new BorderLayout());
        southJPanel = new JPanel();
        northJPanel = new JPanel();
        leftJPanel = new JPanel();
        rightJPanel = new JPanel();
        centerJPanel = new JPanel();

        // Crea botones
        bntMenuPersonas = new JButton("Menu Personas");
        btnMenuTerrenos = new JButton("Menu Terrenos");

        // Configuración del CardLayout
        cardLayout = new CardLayout();
        centerJPanel.setLayout(cardLayout);

        // Añade los paneles al CardLayout
        centerJPanel.add(new PanelPersonas(), "Personas");
        centerJPanel.add(new PanelTerrenos(), "Terrenos");

        // Agrega ActionListeners a los botones
        bntMenuPersonas.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(centerJPanel, "Personas"); // Muestra el panel de Personas
            }
        });

        btnMenuTerrenos.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(centerJPanel, "Terrenos"); // Muestra el panel de Terrenos
            }
        });

        // Añade los botones a la parte norte del panel principal
        northJPanel.add(bntMenuPersonas);
        northJPanel.add(btnMenuTerrenos);

        // Configura el panel principal
        panelPrincipal.add(northJPanel, BorderLayout.NORTH);
        panelPrincipal.add(centerJPanel, BorderLayout.CENTER);
        panelPrincipal.add(southJPanel, BorderLayout.SOUTH);
        panelPrincipal.add(leftJPanel, BorderLayout.WEST);
        panelPrincipal.add(rightJPanel, BorderLayout.EAST);

        // Configura el JFrame
        setContentPane(panelPrincipal);
        setTitle("Aplicación");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(800,600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MainForm();
    }

    // Clase interna para el panel de Personas
    private class PanelPersonas extends JPanel {
        public PanelPersonas() {
            setLayout(new BorderLayout());
            add(new JLabel("Contenido del Panel de Personas"), BorderLayout.CENTER);
        }
    }

    // Clase interna para el panel de Terrenos
    private class PanelTerrenos extends JPanel {
        public PanelTerrenos() {
            setLayout(new BorderLayout());
            add(new JLabel("Contenido del Panel de Terrenos"), BorderLayout.CENTER);
        }
    }
}
