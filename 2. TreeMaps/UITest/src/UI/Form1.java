package UI;

import javax.swing.*;
import java.awt.*;

public class Form1 extends JPanel {
    public Form1() {
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Formulario 1", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));

        add(label, BorderLayout.CENTER);
    }
}
