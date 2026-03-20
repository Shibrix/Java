package paq1;

import Videoclub.*;
import java.awt.*;
import javax.swing.*;
import java.util.*;

public class Main {

	static int dia = 1;
	static double precioPeli;
	static double precioDisco;
	static int codigoPeli = 10000;
	static int codigoCd = 20000;
	static java.util.List<Pelicula> pelisDisponibles = new ArrayList<>();
	static java.util.List<Pelicula> pelisAlquiladas = new ArrayList<>();
	static java.util.List<Cd> cds = new ArrayList<>();
	static Scanner scInt = new Scanner(System.in);
	static Scanner scLine = new Scanner(System.in);
	static Pelicula p0 = new Pelicula();
	static Cd c0 = new Cd();
	static int opcion = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		creacionPelis();
		creacionCds();

		do {
			mostrarMenu();
			opcion = scInt.nextInt();
			switch (opcion) {
			case 1:
				eliminarProducto();
				break;
			case 2:
				verPelis();
				break;
			case 3:
				verCds();
				break;
			case 4:
				alquilarPeli();
				break;
			case 5:
				venderDisco();
				break;
			case 6:
				verAlquiladas();
				break;
			case 7:
				verGanancias();
				break;
			case 8:
				pasarDia();
				break;

			}
		} while (true);

	}

	private static void mostrarMenu() {
		// TODO Auto-generated method stub
		System.out.println("MENU: DIA " + dia + "\n" + "1.- Eliminar producto\n" + "2.- Ver listado de películas\n"
				+ "3.- Ver listado de CDs\n" + "4.- Alquilar película\n" + "5.- Vender disco\n"
				+ "6.- Ver películas en alquiler\n" + "7.- Ver ganancias\n" + "8.- Pasar al día siguiente");
	}

	private static void creacionPelis() {
		// TODO Auto-generated method stub

		JFrame marcoPelis = new JFrame("Introducir pelicula");
		marcoPelis.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marcoPelis.setSize(300, 200);
		marcoPelis.setLocation(400, 300);

		JLabel tituloPeli = new JLabel("Titulo");
		JTextField campoPeli = new JTextField(20);
		JRadioButton novedad = new JRadioButton("Novedad");
		JRadioButton semi = new JRadioButton("Seminovedad");
		JRadioButton antigua = new JRadioButton("Antigua");
		JLabel unidades = new JLabel("Unidades");
		JTextField campoUni = new JTextField(5);
		ButtonGroup categoria = new ButtonGroup();
		categoria.add(novedad);
		categoria.add(semi);
		categoria.add(antigua);
		JPanel panelPeli = new JPanel(new FlowLayout());
		JButton boton = new JButton("Introducir");
		panelPeli.add(tituloPeli);
		panelPeli.add(campoPeli);
		panelPeli.add(novedad);
		panelPeli.add(semi);
		panelPeli.add(antigua);
		panelPeli.add(unidades);
		panelPeli.add(campoUni);
		panelPeli.add(boton);
		marcoPelis.setContentPane(panelPeli);
		marcoPelis.setVisible(true);

		boton.addActionListener(e -> {
			String titPeli = campoPeli.getText();
			String cantidad = campoUni.getText();
			int casteoCantidad = Integer.parseInt(cantidad);

			if (novedad.isSelected()) {
				if (casteoCantidad == 1) {
					p0 = new Pelicula(codigoPeli, titPeli, CategoriaPeli.NOVEDADES);
					pelisDisponibles.add(p0);
					codigoPeli += 1;
				} else {
					for (int i = 0; i < casteoCantidad; i++) {
						p0 = new Pelicula(codigoPeli, titPeli, CategoriaPeli.NOVEDADES);
						pelisDisponibles.add(p0);
						codigoPeli += 1;
					}

				}
			} else if (semi.isSelected()) {
				if (casteoCantidad == 1) {
					p0 = new Pelicula(codigoPeli, titPeli, CategoriaPeli.SEMI_NOVEDADES);
					pelisDisponibles.add(p0);
					codigoPeli += 1;
				} else {
					for (int i = 0; i < casteoCantidad; i++) {
						p0 = new Pelicula(codigoPeli, titPeli, CategoriaPeli.SEMI_NOVEDADES);
						pelisDisponibles.add(p0);
						codigoPeli += 1;
					}
				}

			} else {
				if (casteoCantidad == 1) {
					p0 = new Pelicula(codigoPeli, titPeli, CategoriaPeli.ANTIGUAS);
					pelisDisponibles.add(p0);
					codigoPeli += 1;
				} else {
					for (int i = 0; i < casteoCantidad; i++) {
						p0 = new Pelicula(codigoPeli, titPeli, CategoriaPeli.ANTIGUAS);
						pelisDisponibles.add(p0);
						codigoPeli += 1;
					}
				}

			}

		});
	}

	private static void creacionCds() {
		// TODO Auto-generated method stub

		JFrame marcoCd = new JFrame("Introducir CD");
		marcoCd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		marcoCd.setSize(300, 200);
		marcoCd.setLocation(800, 300);

		JLabel tituloCd = new JLabel("Titulo");
		JTextField campoCd = new JTextField(20);
		JLabel cantante = new JLabel("Cantante");
		JTextField campoCant = new JTextField(20);
		JLabel precio = new JLabel("Precio");
		JTextField campoPrecio = new JTextField(10);
		JLabel unidades1 = new JLabel("Unidades");
		JTextField campoUni1 = new JTextField(5);
		JButton boton1 = new JButton("Introducir");
		JPanel panelCd = new JPanel(new FlowLayout());

		panelCd.add(tituloCd);
		panelCd.add(campoCd);
		panelCd.add(cantante);
		panelCd.add(campoCant);
		panelCd.add(precio);
		panelCd.add(campoPrecio);
		panelCd.add(unidades1);
		panelCd.add(campoUni1);
		panelCd.add(boton1);
		marcoCd.setContentPane(panelCd);
		marcoCd.setVisible(true);

		boton1.addActionListener(e -> {

			String titCd = campoCd.getText();
			String titCantante = campoCant.getText();
			String campPre = campoPrecio.getText();
			double casteoCampPre = Double.parseDouble(campPre);
			String campUni1 = campoUni1.getText();
			int casteoUni = Integer.parseInt(campUni1);

			if (casteoUni == 1) {
				c0 = new Cd(codigoCd, titCd, titCantante, casteoCampPre);
				cds.add(c0);
				codigoCd += 1;
			} else {
				for (int i = 0; i < casteoUni; i++) {
					c0 = new Cd(codigoCd, titCantante, titCd, casteoCampPre);
					cds.add(c0);
					codigoCd += 1;
				}
			}

		});
	}

	private static void eliminarProducto() {
		// TODO Auto-generated method stub
		System.out.println("¿Qué producto quiere eliminar? Elija el código\n");
		System.out.println("PELICULAS:");
		for (Pelicula p : pelisDisponibles) {
			System.out.println(p.getCodigo() + ".- " + p.getTitulo() + ", " + p.getCategoria());
		}
		System.out.println("\n");
		System.out.println("CDS:");
		for (Cd c : cds) {
			System.out.println(c.getCodigo() + ".- " + c.getTitulo() + ", " + c.getCantante() + ", " + c.getPrecio());
		}

		opcion = scInt.nextInt();

		for (Pelicula p : pelisDisponibles) {
			if (opcion == p.getCodigo()) {
				pelisDisponibles.remove(p);
				break;
			}
		}

		for (Cd c : cds) {
			if (opcion == c.getCodigo()) {
				cds.remove(c);
				break;
			}
		}
	}

	private static void verPelis() {
		// TODO Auto-generated method stub
		Collections.sort(pelisDisponibles, new OrdenarCodigo());
		for (Pelicula p : pelisDisponibles) {
			System.out.println(p.getCodigo() + ".- " + p.getTitulo() + ", " + p.getCategoria());
		}
		System.out.println("\n");
	}

	private static void verCds() {
		// TODO Auto-generated method stub
		for (Cd c : cds) {
			System.out.println(c.getCodigo() + ".- " + c.getTitulo() + ", " + c.getCantante() + ", " + c.getPrecio());
		}
		System.out.println("\n");
	}

	private static void alquilarPeli() {
		// TODO Auto-generated method stub
		System.out.println("¿Qué película quiere alquilar?");

		for (Pelicula p : pelisDisponibles) {
			if (p.getCategoria() == CategoriaPeli.ANTIGUAS) {
				p.getCategoria().setDiasAlquiler(4);
			}
			if (p.getCategoria() == CategoriaPeli.SEMI_NOVEDADES) {
				p.getCategoria().setDiasAlquiler(2);
			}
			if (p.getCategoria() == CategoriaPeli.NOVEDADES) {
				p.getCategoria().setDiasAlquiler(1);
			}

			System.out.println(p.getCodigo() + ".- " + p.getTitulo() + ", " + p.getCategoria());
		}

		opcion = scInt.nextInt();

		for (Pelicula p : pelisDisponibles) {
			if (opcion == p.getCodigo()) {
				pelisAlquiladas.add(p);
				pelisDisponibles.remove(p);
				precioPeli += p.getCategoria().getPrecio();
				System.out.println("La película " + p.getTitulo() + " ha sido alquilada por "
						+ p.getCategoria().getDiasAlquiler() + " dias\n");
				break;
			}

		}

	}

	private static void venderDisco() {
		// TODO Auto-generated method stub

		System.out.println("¿Qué disco quiere comprar?\n");

		for (Cd c : cds) {
			System.out.println(c.getCodigo() + ".- " + c.getTitulo() + ", " + c.getCantante() + ", " + c.getPrecio());
		}

		opcion = scInt.nextInt();

		for (Cd c : cds) {
			if (opcion == c.getCodigo()) {
				cds.remove(c);
				System.out.println("El disco " + c.getTitulo() + " de " + c.getCantante() + " ha sido vendido por "
						+ c.getPrecio() + " euros\n");
				precioDisco += c.getPrecio();
				break;
			}

		}

	}

	private static void verAlquiladas() {
		// TODO Auto-generated method stub
		Collections.sort(pelisAlquiladas, new OrdenarCodigo());
		for (Pelicula p : pelisAlquiladas) {
			if (p.getCategoria().getDiasAlquiler() < 1) {
				pelisDisponibles.add(p);
				pelisAlquiladas.remove(p);
				break;
			}
			System.out.println(p.getCodigo() + ".- " + p.getTitulo() + ", " + p.getCategoria() + ", días de alquiler: "
					+ p.getCategoria().getDiasAlquiler());

		}
	}

	private static void verGanancias() {
		// TODO Auto-generated method stub
		System.out.println("Las películas alquiladas son:\n");
		for (Pelicula p : pelisAlquiladas) {
			System.out.println(p.getCodigo() + ".- " + p.getTitulo() + ", " + p.getCategoria() + ", precio: "
					+ p.getCategoria().getPrecio());
		}
		double precioTotal = precioPeli + precioDisco;
		System.out.println("Sumado al precio de los cds vendidos daría un total de " + precioTotal + " €\n");
	}

	private static void pasarDia() {
		// TODO Auto-generated method stub
		System.out.println("¿Quiere pasar al día siguiente? (s/n)");
		String eleccion = scLine.nextLine();
		if (eleccion.equals("s")) {
			dia += 1;
			for (Pelicula p : pelisAlquiladas) {
				if (p.getCategoria().getDiasAlquiler() < 1) {
					pelisDisponibles.add(p);
					pelisAlquiladas.remove(p);
					break;
				}
				p.getCategoria().setDiasAlquiler(p.getCategoria().getDiasAlquiler() - 1);
			}
		}

	}

}
