package ui;

import javax.swing.*;
import java.awt.*;

public class FormRegistrarTenderos extends JPanel {

    private JPanel panel1;
    private JTextField txtNombre;
    private JTextField txtNacimiento;
    private JTextField txtCorreo;
    private JLabel lblNombre;
    private JLabel lblCorreo;
    private JLabel lblNacimiento;
    private JTextField txtNombre2;
    private JLabel lblNombre2;
    private JTextField txtNombre3;
    private JLabel lblNombre3;
    private JTextField txtNombre4;
    private JLabel lblNombre4;

    private JButton btnGuardar;
    public FormRegistrarTenderos() {
// Configurar layout
        setLayout(new GridLayout(7, 2));
// Inicializar componentes
        lblNombre = new JLabel("Nombre:");
        txtNombre = new JTextField(1);
        lblNacimiento = new JLabel("Fecha de Nacimiento:");
        txtNacimiento = new JTextField(1);
        lblCorreo = new JLabel("Correo electrónico:");
        txtCorreo = new JTextField(1);
        lblNombre2 = new JLabel("Nombre:");
        txtNombre2 = new JTextField(1);
        lblNombre3 = new JLabel("Nombre:");
        txtNombre3 = new JTextField(1);
        lblNombre4 = new JLabel("Nombre:");
        txtNombre4 = new JTextField(1);
        btnGuardar = new JButton("Guardar");



        // Añadir componentes al panel
        add(lblNombre);
        add(txtNombre);
        add(lblNacimiento);
        add(txtNacimiento);
        add(lblCorreo);
        add(txtCorreo);
        add(lblNombre2);
        add(txtNombre2);
        add(lblNombre3);
        add(txtNombre3);
        add(lblNombre4);
        add(txtNombre4);
        add(btnGuardar);
    }
}
