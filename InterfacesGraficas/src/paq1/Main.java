package paq1;

import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Main {
	// Vamos a guardar los datos recogidos de los radio buttons. Creamos las
	// variables como static para poder usarlas a lo largo
	// del programa y guardamos los datos en el listener del botón
	static String sexoElegido = "";
	static boolean turnoElegido = false;
	static boolean checkMarcado = false;
	static Scanner scLine = new Scanner(System.in);

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// JFrame es una clase que actúa como ventana de la aplicación
		// JPanel es una contenedor intermedio que se usa para organizar componentes
		// El flowlayout organiza los componentes en fila, de izquierda a derecha y de
		// arriba a abajo
		// Componentes usados:
		// JLabel: muestra texto fijo
		// JTextField: Permite escribir texto.
		// JButton: Permite ejecutar una acción.
		//
//						JLabel label = new JLabel("Nombre:");
//						JTextField txt = new JTextField(15);
//						JButton btn = new JButton(”Pulsa aquí");
		// Tenemos también gestiones de eventos para botones. El addActionListener
		// detecta cuándo se ha pulsado el botón
		// JOptionPane muestra un cuadro de diálogo (para confirmación de acciones
		// digamos)
		// JCkeckBox: sirve para comprobar si el check box en cuestión está marcado (se
		// hace mediante booleanos)
		// JRadioButton: actúan igual que en los formularios de HTML.Creamos el radio
		// button
		// RadioButton: comprobamos si el radio button en cuestión está marcado.

		JFrame marco = new JFrame("Mi primera ventana");

		marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// Con esto hacemos que la aplicación se cierre del todo
		// y no en segundo plano corriendo

		marco.setSize(200, 200); // Con esto marcamos las dimensiones de la ventana
		marco.setLocation(200, 200);// Para indicar en qué coordenadas ha de abrirse la ventana
		marco.setLocationRelativeTo(null);// Así hacemos que la ventana se abra en el centro de la pantalla

		// AHORA DEFINIMOS LOS COMPONENTES
		JLabel etiqueta1 = new JLabel("Esto es la etiqueta 1");// Definimos una etiqueta. No se muestra hasta que no la
																// asociemos
		// a una ventana
		JLabel etiqueta2 = new JLabel("Esto es la etiqueta 2");

		JCheckBox check = new JCheckBox("Checkbox del viernes");// Definimos el checkbox

		JRadioButton radio = new JRadioButton("Hombre");// Creamos radiobuttons, pero hay que agruparlos por categorías
		JRadioButton radio1 = new JRadioButton("Mujer");
		JRadioButton radio2 = new JRadioButton("Otro");
		JRadioButton radio3 = new JRadioButton("Mañana");
		JRadioButton radio4 = new JRadioButton("Tarde");

		ButtonGroup sexo = new ButtonGroup();// Creamos las categorías para agrupar los botones
		sexo.add(radio);
		sexo.add(radio1);
		sexo.add(radio2);

		ButtonGroup turno = new ButtonGroup();
		turno.add(radio3);
		turno.add(radio4);

		JPanel panel = new JPanel(new FlowLayout());// Creamos el panel

		panel.add(etiqueta1);// Añadimos la etiqueta al panel
		panel.add(etiqueta2);

		panel.add(check);// Añadimos el check al panel
		check.setSelected(true);// Lo dejamos marcado por defecto

		panel.add(radio);// Añadimos los radio al panel
		panel.add(radio1);
		panel.add(radio2);
		radio.setSelected(true);// Dejamos marcado el radio de hombre por defecto
		panel.add(radio3);
		panel.add(radio4);
		radio3.setSelected(true);

		JTextField texto = new JTextField(10);// Creamos un campo de texto. El número marca la longitud de la caja de
												// texto,
		// no los caracteres que podemos meter
		panel.add(texto);

		JButton boton = new JButton("Guardar");// Ahora creamos un botón
		panel.add(boton);
		// Creamos un método listener para que el botón tenga funcionalidad. No hace
		// falta que el código ejecutable esté dentro
		// del método, como pasaba con los Scanner
		boton.addActionListener(e -> {
			if (check.isSelected()) {
				checkMarcado = true;
			} else {
				checkMarcado = false;
			}

			if (radio.isSelected()) {
				sexoElegido = "Hombre";
			} else if (radio1.isSelected()) {
				sexoElegido = "Mujer";
			} else {
				sexoElegido = "Otro";
			}

			if (radio3.isSelected()) {
				turnoElegido = true;
			} else {
				turnoElegido = false;
			}

			JOptionPane.showMessageDialog(marco, "¿Has introducido " + texto.getText() + "?", "Ventana de confirmación",
					JOptionPane.PLAIN_MESSAGE);
			// Primero ponemos la ventana, después el mensaje, después el nombre de la
			// ventana y por último que salga por la
			// ventana estándar. Esto es una ventana de confirmación de pulsación
			System.out.println("El botón ha sido pulsado");// Cada vez que le demos al botón, saldrá ese mensaje
		});

		marco.setContentPane(panel);// Y ya asociamos el panel al marco

		marco.setVisible(true); // Esto es para que sea vea el marco

		while (true) {
			System.out.println("Pulsa enter para ver las opciones elegidas");
			scLine.nextLine();

			if (checkMarcado) {
				System.out.println("Se ha elegido el checkbox del viernes");
			} else {
				System.out.println("No se ha elegido el checkbox del viernes");
			}

			System.out.println("\nEl sexo elegido ha sido " + sexoElegido);

			if (turnoElegido) {
				System.out.println("Se ha elegido el turno de mañana");
			} else {
				System.out.println("Se ha elegido el turno de tarde");
			}

		}

	}

}
