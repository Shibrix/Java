package paq2;

import java.awt.*;
import javax.swing.*;

public class Main {

	public static void main(String[] args) {		
		// TODO Auto-generated method stub
		
		//MARCO
		JFrame marcoIzquierda= new JFrame("Ventana izquierda");
		marcoIzquierda.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marcoIzquierda.setSize(200,200);
		marcoIzquierda.setLocation(500,400);
		
		JFrame marcoDerecha= new JFrame("Ventana derecha");		
		marcoDerecha.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		marcoDerecha.setSize(300,100);		
		marcoDerecha.setLocation(700, 400);
		
		//PANEL		
		JPanel panelIzquierda= new JPanel(new FlowLayout());
		JPanel panelDerecha= new JPanel(new FlowLayout());
		
		//COMPONENTES
		JLabel texto= new JLabel("INTRODUCE UN TEXTO");
		JTextField contenido= new JTextField(10);
		JButton boton= new JButton("PULSA");
		JLabel mostrar= new JLabel();
		
		panelIzquierda.add(texto);
		panelIzquierda.add(contenido);
		panelDerecha.add(boton);
		panelDerecha.add(mostrar);
		
		boton.addActionListener(e ->{	
			mostrar.setText(contenido.getText());			
		});
		
		//VISIBILIDAD
		marcoIzquierda.setContentPane(panelIzquierda);
		marcoDerecha.setContentPane(panelDerecha);
		marcoIzquierda.setVisible(true);
		marcoDerecha.setVisible(true);
		

	}

}
