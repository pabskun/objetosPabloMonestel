package UI;
import javax.swing.*;
import java.awt.*;

public class Form2 extends JPanel {
    public Form2() {
        setLayout(new BorderLayout());

        JLabel label = new JLabel("Formulario 2", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24));

        add(label, BorderLayout.CENTER);
    }
}