package paq1;

import java.util.*;
import PracticaColecciones.*;

public class Main {

	static Coche coche0 = new Coche("1111BBB", "Seat", "Ibiza", 110, 0);
	static Coche coche1 = new Coche("2222CCC", "Peugeot", "307", 100, 0);
	static Coche coche2 = new Coche("3333DDD", "Seat", "Leon", 120, 0);
	static Coche coche3 = new Coche("4444FFF", "Ford", "Focus", 90, 0);
	static Coche coche4 = new Coche("5555GGG", "Opel", "Corsa", 100, 0);

	static Scanner scLine = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);

	static List<Coche> disponibles = new ArrayList();
	static List<Coche> alquilados = new ArrayList();
	static List<Coche> todos = new ArrayList();

	static int opcion = 0;
	static int diasPasados = 1;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		todos.add(coche0);
		todos.add(coche1);
		todos.add(coche2);
		todos.add(coche3);
		todos.add(coche4);

		disponibles.add(coche0);
		disponibles.add(coche1);
		disponibles.add(coche2);
		disponibles.add(coche3);
		disponibles.add(coche4);

		do {
			mostrarMenu();

			switch (opcion) {
			case 1:
				listadoCoches();
				break;
			case 2:
				introducirCoche();
				break;
			case 3:
				alquilarCoche();
				break;
			case 4:
				devolverCoche();
				break;
			case 5:
				pasarDia();
				break;
			case 6:
				verCoches();
				break;
			}
		} while (opcion != 0);

	}

	private static void mostrarMenu() {
		// TODO Auto-generated method stub
		System.out.println("MENU DIA " + diasPasados + "\n" + "\n1.- Listado de coches disponibles y alquilados\n"
				+ "2.- Introducir nuevo coche\n" + "3.- Alquilar\n" + "4.- Devolver\n" + "5.- Pasar día\n"
				+ "6.- Ver listado de coches");
		System.out.println("\nIntroduzca una opción:");
		opcion = scInt.nextInt();
	}

	private static void listadoCoches() {
		// TODO Auto-generated method stub
		int contador = 1;
		System.out.println("Listado de coches disponibles\n");
		for (Coche c : disponibles) {
			if (c.getDiasAlquilados() == 0) {
				System.out.println(contador + ".-" + c.toString());
				contador++;
			}
		}
		if (alquilados.isEmpty()) {
			System.out.println("\nNo hay coches alquilados\n");
		} else {
			System.out.println("\nListado de coches alquilados\n");
			contador = 1;
			for (Coche c : alquilados) {
				if (c.getDiasAlquilados() > 0) {
					System.out.println(contador + ".-" + c.alquilados());
					contador++;
				}
			}
		}

		System.out.println("\nPulse ENTER para continuar");
		scLine.nextLine();

	}

	private static void introducirCoche() {
		// TODO Auto-generated method stub
		System.out.println("Matrícula");
		String matricula = scLine.nextLine();
		System.out.println("Marca");
		String marca = scLine.nextLine();
		System.out.println("Modelo");
		String modelo = scLine.nextLine();
		System.out.println("Potencia");
		int potencia = scInt.nextInt();

		Coche coche5 = new Coche(matricula, marca, modelo, potencia, 0);
		disponibles.add(coche5);
		todos.add(coche5);

		System.out.println("Coche añadido correctamente. Pulse ENTER para continuar\n");
		scLine.nextLine();
	}

	private static void alquilarCoche() {
		// TODO Auto-generated method stub
		int contador = 1;
		System.out.println("Listado de coches disponibles\n");
		for (Coche c : disponibles) {
			if (c.getDiasAlquilados() == 0) {
				System.out.println(contador + ".-" + c.toString());
				contador++;
			}
		}
		System.out.println("\n¿Qué coche quiere alquilar?");
		int alquilado = scInt.nextInt();
		Coche c = disponibles.get(alquilado - 1);
		alquilados.add(c);
		disponibles.remove(alquilado - 1);
		int dias = c.getDiasAlquilados();
		c.setDiasAlquilados(dias + 1);

		System.out.println("El coche con matrícula " + alquilados.get(alquilados.size() - 1).getMatricula()
				+ " ha sido alquilado\n");
		System.out.println("Pulse ENTER para continuar");
		scLine.nextLine();

	}

	private static void devolverCoche() {
		// TODO Auto-generated method stub
		System.out.println("Listado de coches alquilados\n");
		int contador = 1;
		if (alquilados.isEmpty()) {
			System.out.println("No hay coches alquilados para devolver\n");
		} else {
			for (Coche c : alquilados) {
				System.out.println(contador + ".-" + c.toString());
				contador++;
			}
			System.out.println("\n¿Qué coche quiere devolver?");
			int devolver = scInt.nextInt();
			Coche c = alquilados.get(devolver - 1);
			disponibles.add(c);
			alquilados.remove(devolver - 1);
			int dias = c.getDiasAlquilados();
			int precioAPagar = dias * 40;
			c.setDiasAlquilados(0);

			System.out.println("\nEl coche con matrícula " + disponibles.get(disponibles.size() - 1).getMatricula()
					+ " ha sido devuelto y el precio ha sido de " + precioAPagar+"$\n");
			System.out.println("Pulse ENTER para continuar");
			scLine.nextLine();
		}
	}

	private static void pasarDia() {
		// TODO Auto-generated method stub
		diasPasados++;
		for (Coche c : alquilados) {
			int dias = c.getDiasAlquilados();
			c.setDiasAlquilados(dias += 1);
		}
		System.out.println("Día terminado.Pulse ENTER para continuar");
		scLine.nextLine();
	}

	private static void verCoches() {
		// TODO Auto-generated method stub
		System.out.println("\n1.- Coches ordenados por matrícula\n" + "2.- Coches ordenados por marcas\n"
				+ "3.- Coches ordenados por potencia\n" + "4.- Coches alquilados ordenados días alquilados");
		System.out.println("\nIntroduzca una opción:");
		opcion = scInt.nextInt();
		switch (opcion) {
		case 1:
			ordenarMatricula();
			break;
		case 2:
			ordenarMarca();
			break;
		case 3:
			ordenarPotencia();
			break;
		case 4:
			ordenarDias();
			break;
		}
	}



	private static void ordenarMatricula() {
		// TODO Auto-generated method stub
		Collections.sort(todos, new OrdenarPorMatricula());
		System.out.println("Listado ordenado por matricula\n");
		for (Coche c : todos) {
			System.out.println(c.toString());
		}
		System.out.println("\nPulse ENTER para continuar");
		scLine.nextLine();
	}
	
	private static void ordenarMarca() {
		// TODO Auto-generated method stub
		Collections.sort(todos, new OrdenarPorMarca());
		System.out.println("Listado ordenado por marca\n");
		for (Coche c : todos) {
			System.out.println(c.toString());
		}
		System.out.println("\nPulse ENTER para continuar");
		scLine.nextLine();
	}
	

	private static void ordenarPotencia() {
		// TODO Auto-generated method stub
		Collections.sort(todos, new OrdenarPorPotencia());
		System.out.println("Listado ordenado por potencia\n");
		for (Coche c : todos) {
			System.out.println(c.toString());
		}
		System.out.println("\nPulse ENTER para continuar");
		scLine.nextLine();
	}
	
	private static void ordenarDias() {
		// TODO Auto-generated method stub
		Collections.sort(alquilados, new OrdenarPorDias());
		System.out.println("Listado ordenado por dias alquilados\n");
		for (Coche c : alquilados) {
			System.out.println(c.alquilados());
		}
		System.out.println("\nPulse ENTER para continuar");
		scLine.nextLine();
	}

}
