package MainOpcional;

import java.util.*;
import AtraccionOpcional.CocheChoque;
import AtraccionOpcional.Cuadrante;
import AtraccionOpcional.Feriante;
import AtraccionOpcional.Noria;
import AtraccionOpcional.TioVivo;
import AtraccionOpcional.*;

public class Main {
	static Scanner scLine = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);
	static Random r = new Random();

	static int opcion;

	static Atraccion t0 = new TioVivo("Tío vivo", 2.5);
	static Atraccion n0 = new Noria("Noria", 2.5);
	static Atraccion c0 = new CocheChoque("Coches de choque", 2.5);

	static List<Feriante> feriantes = new ArrayList<>();
	static List<Cuadrante> cuadrantes = new ArrayList<>();
	static Set<Atraccion> atracciones = new HashSet<>();
	static List<Cuadrante> cuadranteAleatorio = new ArrayList<>();

	static int ganancias[][] = new int[7][3];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		atracciones.add(t0);
		atracciones.add(n0);
		atracciones.add(c0);

		while (true) {

			menu();

			switch (opcion) {

			case 1:
				mostrarPrecios();
				break;
			case 2:
				introducirFeriante();
				break;
			case 3:
				eliminarFeriante();
				break;
			case 4:
				hacerCuadrante();
				break;
			case 5:
				mostrarCuadrante();
				break;
			case 6:
				mostrarGanancias();
				break;
			case 7:
				maximosPorDia();
				break;
			case 8:
				cuadranteAutomatico();
				break;

			}
		}

	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("MENU\n" + "1.- Mostrar precios\n" + "2.- Introducir feriante\n" + "3.- Eliminar feriante\n"
				+ "4.- Asociar día-atracción-feriante (cuadrante)\n" + "5.- Mostrar cuadrante\n"
				+ "6.- Mostrar ganancias de la semana\n" + "7.- Máximo de ganancias por día\n"
				+ "8.- Generación automática del cuadrante.");

		System.out.println("Elija una opción");
		opcion = scInt.nextInt();
	}

	private static void mostrarPrecios() {
		// TODO Auto-generated method stub
		System.out.println(t0.toString());
		System.out.println("Abono tío vivo: " + t0.precioAbono() + " euros\n");

		System.out.println(n0.toString());
		System.out.println("Abono noria: " + n0.precioAbono() + " euros\n");

		System.out.println(c0.toString());
		System.out.println("Abono coches de choque: " + c0.precioAbono() + " euros\n");
	}

	private static void introducirFeriante() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el nombre y el apellido del feriante");
		String nomApe = scLine.nextLine();
		System.out.println("Introduzca la edad");
		int edad = scInt.nextInt();

		Feriante f0 = new Feriante(nomApe, edad);
		feriantes.add(f0);

		System.out.println(nomApe + " añadido correctamente");
		System.out.println("Número de feriantes: " + feriantes.size() + "\n");
	}

	private static void eliminarFeriante() {
		// TODO Auto-generated method stub
		System.out.println("¿A qué feriante quiere eliminar?");
		int contador = 0;
		for (Feriante f : feriantes) {
			System.out.println(contador + ".- " + f.getNombreApellido());
			contador++;
		}
		opcion = scInt.nextInt();
		feriantes.remove(opcion);

		System.out.println("Feriante borrado correctamente\n");

	}

	private static void hacerCuadrante() {
		// TODO Auto-generated method stub

		int dia = 0;

		do {
			if (cuadrantes.size() == 7) {
				System.out.println("Ya no se pueden almacenar más días. El máximo son 7");
				break;
			}
			System.out.println("Introduzca los datos de qué feriante lleva cada atracción cada día");
			System.out.println("Introduzca el día: ");
			dia = scInt.nextInt();
			if (dia == -1) {
				break;
			}

			for (Cuadrante c : cuadrantes) {
				if (c.getDia() == dia) {
					System.out.println("Ese día ya está relleno. Por favor, introduzca otro día\n");
					System.out.println("Introduzca los datos de qué feriante lleva cada atracción cada día");
					System.out.println("Introduzca el día: ");
					dia = scInt.nextInt();
				}
			}

			int numFeriantes = feriantes.size();
			System.out.println("Introduzca el feriante (0-" + numFeriantes + ")");
			for (int i = 0; i < numFeriantes; i++) {
				System.out.println(i + ".- " + feriantes.get(i).getNombreApellido());
			}
			int contador = 0;
			int feriante = scInt.nextInt();
			Feriante fElegido = null;
			for (Feriante f : feriantes) {
				if (contador == feriante) {
					fElegido = f;
					break;
				}
				contador++;
			}
			System.out.println("Ha seleccionado a " + fElegido.getNombreApellido() + "\n");

			int numAtraccion = atracciones.size();
			System.out.println("Introduzca la atraccion (0-" + numAtraccion + ")");
			contador = 0;
			for (Atraccion a : atracciones) {
				System.out.println(contador + ".- " + a.getNombre());
				contador++;
			}
			int atraccion = scInt.nextInt();
			Atraccion aElegida = null;
			contador = 0;

			for (Atraccion at : atracciones) {
				if (contador == atraccion) {
					aElegida = at;
					break;
				}
				contador++;
			}
			System.out.println("Ha seleccionado a " + aElegida.getNombre() + "\n");

			Cuadrante cu0 = new Cuadrante(dia, fElegido, aElegida);
			cuadrantes.add(cu0);
			System.out.println("El día " + dia + " de feria, " + fElegido.getNombreApellido()
					+ " se encargó de la atraccion " + aElegida.getNombre());

		} while (dia != -1);

	}

	private static void mostrarCuadrante() {
		// TODO Auto-generated method stub
		for (Cuadrante c : cuadrantes) {
			System.out.println(c.toString());
		}
		System.out.println("\n");
	}

	private static void mostrarGanancias() {
		// TODO Auto-generated method stub

		int contador = 0;

		for (int i = 0; i < ganancias.length; i++) {
			for (int j = 0; j < ganancias[i].length; j++) {
				ganancias[i][j] = r.nextInt(100, 500);
			}
		}

		for (Atraccion a : atracciones) {
			String nombreAtraccion = a.getNombre();
			for (int i = 0; i < 7; i++) {
				int dia = i + 1;
				int dineroGanado = ganancias[i][contador];
				System.out.println("Dia " + dia + ", atraccion " + (contador) + " (" + nombreAtraccion
						+ ") : ganancias = " + dineroGanado + " euros");
			}
			contador++;
			System.out.println("\n");
		}

	}

	private static void maximosPorDia() {
		// TODO Auto-generated method stub
		for (int i = 0; i < ganancias.length; i++) {
			int dia = i + 1;
			int maxNum = 0;
			int atraccion = 0;
			for (int j = 0; j < ganancias[i].length; j++) {
				if (ganancias[i][j] > maxNum) {
					maxNum = ganancias[i][j];
					atraccion = j;
				}

			}
			int contador = 0;
			String nombreAtraccion = "";
			for (Atraccion a : atracciones) {
				if (contador == atraccion) {
					nombreAtraccion = a.getNombre();
					break;
				}
				contador++;
			}
			System.out.println("Dia " + dia + ": máximo del día: " + nombreAtraccion + " = " + maxNum);

		}
		System.out.println("\n");
	}

	private static void cuadranteAutomatico() {
		// TODO Auto-generated method stub
		if (feriantes.size() < 3) {
			System.out.println("Para generar el cuadrante tiene que haber 3 feriantes como mínimo");
			return;
		}

		Cuadrante cu1 = null;

		for (int i = 0; i < 7; i++) {
			int dia = i + 1;
			int numFeriante = r.nextInt(feriantes.size());
			int atraccion = r.nextInt(atracciones.size());
			Feriante fx = null;
			int contadorFeriante = 0;

			for (Feriante f : feriantes) {
				if (contadorFeriante == numFeriante) {
					fx = f;
					break;
				}
				contadorFeriante++;
			}
			
			Atraccion ax = null;
			int contadorAtraccion = 0;
			for (Atraccion a : atracciones) {
				if (contadorAtraccion == atraccion) {
					ax = a;
					break;
				}
				contadorAtraccion++;
			}
			
			cu1 = new Cuadrante(dia, fx, ax);
			cuadrantes.add(cu1);
			System.out.println(cu1.toString());

		}
		
		System.out.println("\n");
	}

}
