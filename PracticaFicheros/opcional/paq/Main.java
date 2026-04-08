package paq;

import java.util.*;

import paqVehiculo.Coche;
import paqVehiculo.Furgoneta;
import paqVehiculo.Moto;
import paqVehiculo.Vehiculo;

import java.io.*;

public class Main {

	static List<Vehiculo> vehiculos = new ArrayList<>();
	static int opcion;
	static Vehiculo vx;
	static String tipo;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehiculo v0 = new Coche("1111AAA", "Seat", 2000, 5, false);
		cargarFichero();

		do {
			cargarMenu();
			switch (opcion) {
			case 1:
				cargarDesdeFichero();
				break;
			case 2:
				mostrarVehiculos();
				break;
			}

		} while (opcion != 7);

	}

	private static void cargarFichero() {
		// TODO Auto-generated method stub
		File archivo = new File("vehiculos.txt");
		if (!archivo.exists()) {
			return;
		} else {
			try (FileReader fr = new FileReader("vehiculos.txt"); BufferedReader br = new BufferedReader(fr)) {
				String linea;
				while ((linea = br.readLine()) != null) {
					String atributos[] = linea.split(";");
					tipo = atributos[0];
					String matricula = atributos[1];
					String marca = atributos[2];
					int anio = Integer.valueOf(atributos[3]);

					switch (tipo) {
					case "Coche":
						int numeroPuertas = Integer.valueOf(atributos[4]);
						boolean automatico = Boolean.valueOf(atributos[5]);
						vx = new Coche(matricula, marca, anio, numeroPuertas, automatico);
						vehiculos.add(vx);
						break;
					case "Moto":
						int cilindrada = Integer.valueOf(atributos[4]);
						vx = new Moto(matricula, marca, anio, cilindrada);
						vehiculos.add(vx);
						break;
					case "Furgoneta":
						double capacidadCarga = Double.valueOf(atributos[4]);
						vx = new Furgoneta(matricula, marca, anio, capacidadCarga);
						vehiculos.add(vx);
						break;
					}

				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	private static void cargarMenu() {
		// TODO Auto-generated method stub
		System.out.println("1.- Cargar vehículos desde fichero\n" + "2.- Mostrar todos los vehículos\n"
				+ "3.- Añadir un nuevo vehículo\n" + "4.- Eliminar un vehículo por matrícula\n"
				+ "5.- Buscar vehículos por marca\n" + "6.- Guardar vehículos en fichero\n" + "7.- Salir");
	}

	private static void cargarDesdeFichero() {
		// TODO Auto-generated method stub
		vehiculos.clear();
		try (FileReader fr = new FileReader("vehiculos.txt"); BufferedReader br = new BufferedReader(fr)) {
			String linea;
			while ((linea = br.readLine()) != null) {
				String atributos[] = linea.split(";");
				tipo = atributos[0];
				String matricula = atributos[1];
				String marca = atributos[2];
				int anio = Integer.valueOf(atributos[3]);

				switch (tipo) {
				case "Coche":
					int numeroPuertas = Integer.valueOf(atributos[4]);
					boolean automatico = Boolean.valueOf(atributos[5]);
					vx = new Coche(matricula, marca, anio, numeroPuertas, automatico);
					vehiculos.add(vx);
					break;
				case "Moto":
					int cilindrada = Integer.valueOf(atributos[4]);
					vx = new Moto(matricula, marca, anio, cilindrada);
					vehiculos.add(vx);
					break;
				case "Furgoneta":
					double capacidadCarga = Double.valueOf(atributos[4]);
					vx = new Furgoneta(matricula, marca, anio, capacidadCarga);
					vehiculos.add(vx);
				}

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void mostrarVehiculos() {
		// TODO Auto-generated method stub

	}

}
