package ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrarPersonasForm extends JPanel {
    private JTextField txtNombre;//input del nombre
    private JTextField txtNacimiento;//input de la fecha de nacimiento
    private JTextField txtCorreo;

    public RegistrarPersonasForm() {
        //Configuración del layout
        setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.insets = new Insets(5, 5, 5, 5);
        c.fill = GridBagConstraints.HORIZONTAL;

        //Configuración del label e input de nombre
        c.gridx = 0;
        c.gridy = 0;
        add(new JLabel("Nombre: "), c);
        txtNombre = new JTextField();
        c.gridx = 1;
        txtNombre.setPreferredSize(new Dimension(200, 35));
        add(txtNombre, c);

        //Configuración del label e input de fecha de nacimiento
        c.gridx = 0;
        c.gridy = 1;
        add(new JLabel("Fecha de nacimiento (yyyy-MM-dd): "), c);
        txtNacimiento = new JTextField();
        c.gridx = 1;
        txtNacimiento.setPreferredSize(new Dimension(200, 35));
        add(txtNacimiento, c);

        //Configuración del label e input de correo
        c.gridx = 0;
        c.gridy = 2;
        add(new JLabel("Correo electrónico: "), c);
        txtCorreo = new JTextField();
        c.gridx = 1;
        txtCorreo.setPreferredSize(new Dimension(200, 35));
        add(txtCorreo, c);

        //Configuración del botón de guardar
        JButton btnGuardar = new JButton("Guardar");
        btnGuardar.setPreferredSize(new Dimension(100,40));
        c.gridx = 1;
        c.gridy = 3;
        add(btnGuardar, c);

        //Configuración del mensaje de error
        JLabel lblError = new JLabel();
        lblError.setForeground(Color.RED);
        lblError.setVisible(false); //Oculto inicialmente
        c.gridx = 0;
        c.gridy = 4;
        add(lblError, c);

        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(validarCampos()){
                    lblError.setVisible(false);
                    //Llamar al gestor al método registrarPersona()
                    JOptionPane.showMessageDialog(null, "Datos guardados exitosamente.");
                    limpiarForm();
                }else{
                    lblError.setText("Por favor verifique los campos resaltados");
                    lblError.setVisible(true);
                }
            }
        });
    }
    private boolean validarCampos(){
        boolean correcto = true;
        if(txtNombre.getText().isEmpty() ){
            txtNombre.setBackground(Color.RED);
            correcto = false;
        }else{
            txtNombre.setBackground(Color.WHITE);
        }
        if(txtNacimiento.getText().isEmpty() ){
            txtNacimiento.setBackground(Color.RED);
            correcto = false;
        }else{
            txtNacimiento.setBackground(Color.WHITE);
        }
        if(txtCorreo.getText().isEmpty() ){
            txtCorreo.setBackground(Color.RED);
            correcto = false;
        }else{
            txtCorreo.setBackground(Color.WHITE);
        }

        return correcto;
    }
    private void limpiarForm(){
        txtNombre.setText("");
        txtNacimiento.setText("");
        txtCorreo.setText("");
    }
}
