package UI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PersonaForm  extends JPanel{
    private JTextField nombreField;
    private JTextField nacimientoField;
    private JTextField correoField;
    private JPasswordField contrasennaField;
    private JTextField edadField;
    private JTextField cantDineroField;
    private JComboBox<String> mineralAsignadoCombo;
    private JLabel errorLabel;

    public PersonaForm() {
        // Configuración del layout
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(0, 1, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;

        // Nombre
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(new JLabel("Nombre:"), gbc);
        nombreField = new JTextField(20);
        gbc.gridx = 1;
        add(nombreField, gbc);

        // Nacimiento
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(new JLabel("Nacimiento (yyyy-MM-dd):"), gbc);
        nacimientoField = new JTextField(20);
        gbc.gridx = 1;
        add(nacimientoField, gbc);

        // Correo
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(new JLabel("Correo:"), gbc);
        correoField = new JTextField(20);
        gbc.gridx = 1;
        add(correoField, gbc);

        // Contraseña
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(new JLabel("Contraseña:"), gbc);
        contrasennaField = new JPasswordField(20);
        gbc.gridx = 1;
        add(contrasennaField, gbc);

        // Edad
        gbc.gridx = 0;
        gbc.gridy = 4;
        add(new JLabel("Edad:"), gbc);
        edadField = new JTextField(20);
        gbc.gridx = 1;
        add(edadField, gbc);

        // Cantidad de Dinero
        gbc.gridx = 0;
        gbc.gridy = 5;
        add(new JLabel("Cantidad de Dinero:"), gbc);
        cantDineroField = new JTextField(20);
        gbc.gridx = 1;
        add(cantDineroField, gbc);

        // Mineral Asignado
        gbc.gridx = 0;
        gbc.gridy = 6;
        add(new JLabel("Mineral Asignado:"), gbc);
        mineralAsignadoCombo = new JComboBox<>(new String[]{"Oro", "Plata", "Cobre"}); // Ejemplo de valores
        gbc.gridx = 1;
        add(mineralAsignadoCombo, gbc);

        // Botón Guardar
        JButton guardarButton = new JButton("Guardar");
        guardarButton.setPreferredSize(new Dimension(100, 40));
        gbc.gridx = 1;
        gbc.gridy = 7;
        add(guardarButton, gbc);

        // Etiqueta de error (oculta por defecto)
        errorLabel = new JLabel();
        errorLabel.setForeground(Color.RED);
        errorLabel.setVisible(false); // Oculto inicialmente
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 2;
        add(errorLabel, gbc);

        // Acción del botón Guardar
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (validarCampos()) {
                    errorLabel.setVisible(false); // Oculta el mensaje de error si la validación es correcta
                    JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
                    // Aquí se procesan los datos guardados
                } else {
                    errorLabel.setText("Error: Verifique los campos.");
                    errorLabel.setVisible(true); // Muestra el mensaje de error
                }
            }
        });
    }

    // Método para validar los campos
    private boolean validarCampos() {
        // Realizar validaciones básicas de los campos (puedes ampliar esto según sea necesario)
        if (nombreField.getText().isEmpty() ||
                nacimientoField.getText().isEmpty() ||
                correoField.getText().isEmpty() ||
                new String(contrasennaField.getPassword()).isEmpty() ||
                edadField.getText().isEmpty() ||
                cantDineroField.getText().isEmpty()) {
            return false; // Si algún campo está vacío, devuelve falso
        }
        // Puedes agregar más validaciones según tus necesidades
        return true;
    }
}
