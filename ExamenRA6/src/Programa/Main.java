package Programa;

import java.util.*;

public class Main {

	static Paciente p0 = new Paciente("1A", "Jose", 42);
	static Paciente p1 = new Paciente("2A", "Eva", 39);
	static Paciente p2 = new Paciente("3A", "Luis", 25);
	static Paciente p3 = new Paciente("4A", "Elena", 38);

	static Set<Paciente> pacientes = new HashSet<>();

	static List<Paciente> enCurso = new ArrayList<>();

	static List<Paciente> consultas = new ArrayList<>();

	static Scanner scLine = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);

	static int opcion;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		pacientes.add(p0);
		pacientes.add(p1);
		pacientes.add(p2);
		pacientes.add(p3);

		enCurso.add(p0);
		enCurso.add(p1);
		enCurso.add(p2);

		do {

			mostrarMenu();
			switch (opcion) {
			case 1:
				listaPacientes();
				break;
			case 2:
				mostrarDatos();
				break;
			case 3:
				introducirPaciente();
				break;
			case 4:
				pasarEnCursoAConsulta();
				break;
			case 5:
				eliminarPaciente();
				break;
			}

		} while (true);

	}

	private static void mostrarMenu() {
		// TODO Auto-generated method stub
		System.out.println("MENU" + "\n1.- Lista de pacientes identificados\n" + "2.- Mostrar datos paciente\n"
				+ "3.- Introducir paciente\n" + "4.- Pasar en curso a en consulta\n" + "5.- Eliminar paciente");
		System.out.println("\nElige una opción:");
		opcion = scInt.nextInt();

	}

	private static void listaPacientes() {
		// TODO Auto-generated method stub

		for (Paciente p : pacientes) {
			System.out.println(p.toString());
		}

		System.out.println("\nPulse ENTER para continuar");
		scLine.nextLine();

	}

	private static void mostrarDatos() {
		// TODO Auto-generated method stub
		System.out.println("Introduce la identificación del paciente: ");
		String id = scLine.nextLine();
		Paciente px = new Paciente(id, "", 0);
		System.out.println("Datos del paciente:");
		if (pacientes.contains(px)) {
			for (Paciente p : pacientes) {
				if (p.getIdClinico().equals(id)) {
					System.out.println(p.toString());
				}
			}
		}

		System.out.println("\nPulse ENTER para continuar");
		scLine.nextLine();

	}

	private static void introducirPaciente() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca identificador:");
		String id = scLine.nextLine();
		System.out.println("Introduzca nombre:");
		String nombre = scLine.nextLine();
		System.out.println("Introduzca edad:");
		int edad = scInt.nextInt();

		Paciente p4 = new Paciente(id, nombre, edad);
		pacientes.add(p4);

		System.out.println("Paciente añadido correctamente");
		System.out.println("\nPulse ENTER para continuar");
		scLine.nextLine();

	}

	private static void pasarEnCursoAConsulta() {
		// TODO Auto-generated method stub
		for (int i = 0; i < enCurso.size(); i++) {
			System.out.println(i + ".- " + enCurso.get(i).toString());
		}
		System.out.println("\n¿Qué paciente pasamos de en curso a en consulta?");
		opcion = scInt.nextInt();

		Paciente curso = enCurso.get(opcion);
		consultas.add(curso);
		enCurso.remove(opcion);

		System.out.println("Pacientes en curso: ");

		for (Paciente p : enCurso) {
			System.out.println(p.toString());
		}
		System.out.println("\n");
		System.out.println("Pacientes en consulta: ");
		for (Paciente p : consultas) {
			System.out.println(p.toString());
		}
		System.out.println("\nPulse ENTER para continuar");
		scLine.nextLine();
	}

	private static void eliminarPaciente() {
		// TODO Auto-generated method stub
		System.out.println("Introduce el ID del paciente a eliminar");
		String id = scLine.nextLine();

		Paciente px = new Paciente(id, "", 0);

		if (pacientes.contains(px) || enCurso.contains(px) || consultas.contains(px)) {
			for (Paciente p : pacientes) {
				if (p.getIdClinico().equals(id)) {
					pacientes.remove(px);
					System.out.println("Paciente borrado del registro general");
					break;
				}

			}
			for (Paciente p : enCurso) {
				if (p.getIdClinico().equals(id)) {
					enCurso.remove(px);
					System.out.println("Paciente borrado de pacientes en curso");
					break;
				}
			}
			for (Paciente p : consultas) {
				if (p.getIdClinico().equals(id)) {
					consultas.remove(px);
					System.out.println("Paciente borrado de pacientes en consulta");
					break;
				}
			}

		}

		System.out.println("\nPulse ENTER para continuar");
		scLine.nextLine();
	}
}
