package paq4;

import java.awt.*;
import javax.swing.*;

import java.util.*;

public class Main {
	static int cantidadElegida;
	static double precioTotal = 0;
	static int cantidadRecuperada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ARRAYS

		Producto p0 = new Producto("Lejía", 2.5);
		Producto p1 = new Producto("Chocolate", 1.25);
		Producto p2 = new Producto("Brick de leche", 0.90);
		Producto p3 = new Producto("Macarrones", 1.5);
		Producto p4 = new Producto("Jamón", 5.75);
		Producto p5 = new Producto("Pulpo", 10.5);
		Producto p6 = new Producto("Mantequilla", 1.0);
		Producto p7 = new Producto("Lomo", 3.5);
		Producto p8 = new Producto("Natillas", 2.25);
		Producto p9 = new Producto("Caviar", 32.5);

		Producto productos[] = { p0, p1, p2, p3, p4, p5, p6, p7, p8, p9 };
		JRadioButton[] etiquetas = new JRadioButton[productos.length];
		JLabel[] produc = new JLabel[productos.length];

		// MARCOS
		JFrame ventana1 = new JFrame("Supermercado");
		JFrame ventana2 = new JFrame("Pedidos supermercado");
		ventana1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ventana2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ventana1.setSize(250, 250);
		ventana2.setSize(220, 250);

		ventana1.setLocation(500, 400);
		ventana2.setLocation(800, 400);

		// ETIQUETAS

		ButtonGroup prod = new ButtonGroup();
		for (int i = 0; i < productos.length; i++) {
			etiquetas[i] = new JRadioButton(productos[i].getNombre() + "(" + productos[i].getPrecio() + ")");
			prod.add(etiquetas[i]);

		}
		JLabel cantidad = new JLabel("Cantidad");
		JTextField texto = new JTextField(5);

		// PRODUCTOS
		for (int i = 0; i < productos.length; i++) {
			produc[i] = new JLabel(productos[i].getNombre() + ": " + productos[i].getCantidad());

		}

		JLabel total = new JLabel("Precio total: " + precioTotal);

		// BOTONES
		JButton comprar = new JButton("Comprar");
		JButton devolver = new JButton("Devolver");

		// PANEL
		JPanel panel1 = new JPanel();

		for (int i = 0; i < productos.length; i++) {
			panel1.add(etiquetas[i]);
		}

		panel1.add(cantidad);
		panel1.add(texto);
		panel1.add(comprar);
		panel1.add(devolver);

		JPanel panel2 = new JPanel();

		for (int i = 0; i < productos.length; i++) {
			panel2.add(produc[i]);
		}

		panel2.add(total);

		// VISIBILIDAD
		ventana1.setContentPane(panel1);
		ventana2.setContentPane(panel2);

		ventana1.setVisible(true);
		ventana2.setVisible(true);

		// LISTENER
		comprar.addActionListener(e -> {

			cantidadElegida = Integer.parseInt(texto.getText());

			for (int i = 0; i < productos.length; i++) {
				if (etiquetas[i].isSelected()) {
					cantidadRecuperada = productos[i].getCantidad();
					productos[i].setCantidad(cantidadElegida + cantidadRecuperada);
					produc[i].setText(
							productos[i].getNombre() + ": " + String.valueOf(cantidadElegida + cantidadRecuperada));
					precioTotal = precioTotal + (productos[i].getPrecio() * cantidadElegida);
					total.setText("Precio total: " + precioTotal);
				}
			}

		});

		devolver.addActionListener(e -> {

			cantidadElegida = Integer.parseInt(texto.getText());

			for (int i = 0; i < productos.length; i++) {
				boolean error = false;
				if (etiquetas[i].isSelected() && cantidadElegida > productos[i].getCantidad()) {
					error = true;
				}
				if (error) {
					JOptionPane.showMessageDialog(ventana1,
							"No es posible devolver " + cantidadElegida + " unidades de " + productos[i].getNombre()
									+ ", sólo quedan " + productos[i].getCantidad(),
							"Ventana de error", JOptionPane.PLAIN_MESSAGE);
					break;
				}

				else {
					if (etiquetas[i].isSelected()) {
						cantidadRecuperada = productos[i].getCantidad();
						productos[i].setCantidad(cantidadRecuperada - cantidadElegida);
						produc[i].setText(
								productos[i].getNombre() + ": " + String.valueOf(cantidadRecuperada - cantidadElegida));
						precioTotal = precioTotal - (productos[i].getPrecio() * cantidadElegida);
						total.setText("Precio total: " + precioTotal);
					}
				}
			}

		});
	}

}
