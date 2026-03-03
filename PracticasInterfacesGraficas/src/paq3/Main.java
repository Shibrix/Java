package paq3;

import java.awt.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//MARCO
		JFrame marco= new JFrame("Cuentas");
		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marco.setSize(180,180);
		marco.setLocationRelativeTo(null);
		
		//PANEL
		JPanel panel= new JPanel(new FlowLayout());
		
		//COMPONENTES
		JLabel numero= new JLabel("0");
		JButton boton= new JButton("Pulsa para incrementar");
		
		
		panel.add(numero);
		panel.add(boton);
		
		boton.addActionListener(e->{
			int casteado= Integer.parseInt(numero.getText());
			casteado+=1;
			numero.setText(String.valueOf(casteado));			
			
		});
		
		//VISIBILIDAD
		marco.setContentPane(panel);
		marco.setVisible(true);
		
		
		
	}

}
