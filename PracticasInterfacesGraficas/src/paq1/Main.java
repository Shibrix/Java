package paq1;

import java.awt.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// MARCO
		JFrame marco = new JFrame("Ventana principal");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setSize(200, 200);
		marco.setLocationRelativeTo(null);

		// PANEL
		JPanel panel = new JPanel(new FlowLayout());

		// COMPONENTES
		JLabel nombre = new JLabel("Introduce tu nombre");
		panel.add(nombre);
		JTextField textoNombre = new JTextField(10);
		panel.add(textoNombre);
		
		JButton boton = new JButton("Continuar");
		panel.add(boton);

		boton.addActionListener(e -> {
			//JOptionPane.showMessageDialog(marco, "Hola " + textoNombre.getText(), "Confirmación", JOptionPane.PLAIN_MESSAGE);
			nombre.setText("Introduce tu apellido");//Cambiamos el contenido de la etiqueta para que salga otro texto

		});

		// ASOCIAR PANEL Y MOSTRAR MARCO
		marco.setContentPane(panel);
		marco.setVisible(true);

	}

}
