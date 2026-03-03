package PracticaHashSet;

import java.util.*;

public class Main {

	static Scanner scLine = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);
	static int opcion;
	static Alumno a0 = new Alumno(1, "Ana Pérez", "1ºDAM");
	static Alumno a1 = new Alumno(2, "Luis Solís", "1ºDAM");
	static Alumno a2 = new Alumno(3, "Marta Ruiz", "1ºDAM");
	static Alumno a3 = new Alumno(4, "Javier Ortega", "1ºDAM");
	static Alumno a4 = new Alumno(5, "Lucía Sánchez", "1ºDAM");
	static Alumno a5 = new Alumno(6, "Carlos Martín", "1ºDAM");
	static Set<Alumno> censo = new HashSet<>(Arrays.asList(a0, a1, a2, a3, a4, a5));
	static List<Alumno> partes = new ArrayList<>(Arrays.asList(a0, a1, a0, a3, a0, a4, a1, a3));

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {
			System.out.println("MENÚ\n" + "1. Mostrar censo de alumnos\n" + "2. Mostrar registro de partes\n"
					+ "3. Añadir alumno al censo\n" + "4. Eliminar alumno del censo por ID.\n"
					+ "5. Poner parte a un alumno buscándolo por ID\n" + "6. Mostrar número de alumnos en el censo\n"
					+ "7. Mostrar número total de partes registrados\n"
					+ "8. Buscar datos alumno por ID y mostrar cuántos partes tiene\n"
					+ "9. Eliminar un parte del registro\n" + "10. Alumnos sin partes\n"
					+ "11. Alumnos con al menos 1 parte\n" + "12. Mostrar alumnos con N partes\n"
					+ "13. Buscar por nombre\n" + "14. Salir");
			opcion = scInt.nextInt();

			switch (opcion) {
			case 1:
				mostrarCenso();
				break;
			case 2:
				mostrarPartes();
				break;
			case 3:
				anadirAlumno();
				break;
			case 4:
				eliminarAlumnoId();
				break;
			case 5:
				ponerParteId();
				break;
			case 6:
				mostrarNumeroAlumnosCenso();
				break;
			case 7:
				partesTotales();
				break;
			case 8:
				mostrarPartesAlumno();
				break;
			case 9:
				eliminarParteRegistro();
				break;
			case 10:
				alumnosSinPartes();
				break;
			case 11:
				alumnosConAlMenos1Parte();
				break;
			case 12:
				alumnosConAlMenosNPartes();
				break;
			case 13:
				buscarAlumnoPorNombre();
				break;
			case 14:
				salir();
				break;

			}
		} while (opcion != 14);

	}

	private static void mostrarCenso() {
		// TODO Auto-generated method stub
		System.out.println("\n---CENSO DE ALUMNOS---");
		for (Alumno c : censo) {
			System.out.println(c.toString());
		}
		System.out.println("\n");
	}

	private static void mostrarPartes() {
		// TODO Auto-generated method stub
		int contador = 1;
		System.out.println("\n---REGISTRO DE PARTES(histórico)---");
		for (Alumno p : partes) {
			System.out.println(contador + ". " + p.toString());
			contador++;
		}
		System.out.println("\n");
	}

	private static void anadirAlumno() {
		// TODO Auto-generated method stub
		System.out.println("\nIntroduzca los datos del alumno\n");
		System.out.println("Nombre: ");
		String nombre = scLine.nextLine();
		System.out.println("Curso: ");
		String curso = scLine.nextLine();
		System.out.println("Id: ");
		int id = scInt.nextInt();
		Alumno a6 = new Alumno(id, "", "");
		if (censo.contains(a6)) {
			System.out.println("Lo sentimos, ese id ya está en uso\n");

		} else {
			a6 = new Alumno(id, nombre, curso);
			censo.add(a6);
			System.out.println("\nEl alumno ha sido añadido correctamente\n");

		}
	}

	private static void eliminarAlumnoId() {
		// TODO Auto-generated method stub
		System.out.println("\n---CENSO DE ALUMNOS---");
		for (Alumno c : censo) {
			System.out.println(c.toString());
		}
		System.out.println("\nElija el ID del alumno que quiere eliminar");
		opcion = scInt.nextInt();
		Alumno a = new Alumno(opcion, "", "");

		if (censo.contains(a)) {
			for (Alumno c : censo) {
				if (c.getId() == opcion) {
					censo.remove(a);
					break;
				}
			}
		}
		System.out.println("\nEl alumno con id " + opcion + " ha sido eliminado del censo\n");
	}

	private static void ponerParteId() {
		// TODO Auto-generated method stub
		System.out.println("\n---CENSO DE ALUMNOS---");
		for (Alumno c : censo) {
			System.out.println(c.toString());
		}
		System.out.println("\nElija el ID del alumno al que quiere poner un parte");
		opcion = scInt.nextInt();
		Alumno a = new Alumno(opcion, "", "");

		if (censo.contains(a)) {
			for (Alumno c : censo) {
				if (c.getId() == opcion) {
					String nombre = c.getNombre();
					String curso = c.getCurso();
					a = new Alumno(opcion, nombre, curso);
					partes.add(a);
					break;
				}
			}
		}
		System.out.println("\nAl alumno con id " + opcion + " se le ha puesto un parte\n");
	}

	private static void mostrarNumeroAlumnosCenso() {
		// TODO Auto-generated method stub
		System.out.println("\nEl número total de alumnos en el censo es de " + censo.size() + "\n");
	}

	private static void partesTotales() {
		// TODO Auto-generated method stub
		System.out.println("\nEl número total de partes que hay es de " + partes.size() + "\n");

	}

	private static void mostrarPartesAlumno() {
		// TODO Auto-generated method stub
		System.out.println("\n---CENSO DE ALUMNOS---");
		for (Alumno c : censo) {
			System.out.println(c.toString());
		}
		System.out.println("\nElija el ID del alumno del que quiere ver los partes");
		opcion = scInt.nextInt();
		Alumno a = new Alumno(opcion, "", "");
		int contador = 0;

		if (partes.contains(a)) {
			for (Alumno c : partes) {
				if (c.getId() == opcion) {
					contador++;
				}
			}
		}
		System.out.println("\nEl alumno con id " + opcion + " tiene un total de " + contador + " partes\n");

	}

	private static void eliminarParteRegistro() {
		// TODO Auto-generated method stub
		int contador = 1;
		System.out.println("¿Qué parte desea eliminar?\n");
		for (Alumno p : partes) {
			System.out.println(contador + ". " + p.toString());
			contador++;
		}
		opcion = scInt.nextInt();
		contador = 1;
		for (int i = 0; i < partes.size(); i++) {
			if (opcion == contador) {
				partes.remove(opcion - 1);
				break;
			} else {
				contador++;
			}
		}
		System.out.println("El parte ha sido eliminado correctamente\n");

	}

	private static void alumnosSinPartes() {
		// TODO Auto-generated method stub
		System.out.println("Los alumnos sin partes son: ");
		for (Alumno c : censo) {
			if (!partes.contains(c)) {
				System.out.println(c.getNombre());
			}
		}
		System.out.println("\n");
	}

	private static void alumnosConAlMenos1Parte() {
		// TODO Auto-generated method stub
		System.out.println("Los alumnos que tiene al menos 1 parte son: ");
		for (Alumno c : censo) {
			if (partes.contains(c)) {
				System.out.println(c.getNombre());
			}
		}
		System.out.println("\n");
	}

	private static void alumnosConAlMenosNPartes() {
		// TODO Auto-generated method stub
		System.out.println("Elija un número para ver qué alumnos tienen al menos esa cantidad de partes");
		int cantidad = scInt.nextInt();
		List<Integer> ids = new ArrayList<>();
		System.out.println("Los alumnos con al menos " + cantidad + " partes son: ");

		for (Alumno p : partes) {
			int id = p.getId();
			if (!ids.contains(id)) {
				int contador = 0;
				for (Alumno p1 : partes) {
					if (p1.getId() == id) {
						contador++;
					}
				}
				if (contador >= cantidad) {
					System.out.println(p.getNombre() + ", " + contador + " partes");
				}
				ids.add(id);
			}
		}
		System.out.println("\n");
	}

	private static void buscarAlumnoPorNombre() {
		// TODO Auto-generated method stub
		System.out.println("Escriba el nombre del alumno que quiere buscar");
		String buscar = scLine.nextLine().toLowerCase();
		boolean encontrado = false;
		for (Alumno c : censo) {
			String nombre = c.getNombre().toLowerCase();
			if (nombre.contains(buscar)) {
				System.out.println("Hemos encontrado al alumno " + c.getNombre() + "\n");
				encontrado = true;

			}

		}
		if (!encontrado) {
			System.out.println("Lo sentimos, ese alumno no figura\n");

		}
	}

	private static void salir() {
		// TODO Auto-generated method stub
		System.out.println("El programa ha finalizado");
	}

}
