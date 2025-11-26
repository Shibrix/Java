package PracticaMenu;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static boolean control = true;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		do {

			System.out.println("\nMENÚ");
			System.out.println("Por favor, elija una de las siguientes opciones (1-4)");
			System.out.println("1.-Ver el menú del día");
			System.out.println("2.-Realizar una reserva");
			System.out.println("3.-Ver los platos especiales");
			System.out.println("4.-Salir del programa");

			int opcion = sc.nextInt();
			sc.nextLine();

			switch (opcion) {

			case 1:
				verMenu();
				break;

			case 2:
				realizarReserva();
				break;

			case 3:
				verPlatosEspeciales();
				sc.nextLine();
				break;

			case 4:
				salirPrograma();
				break;
			}

		} while (control == true);
		System.out.println("El programa ha finalizado");
	}
	
	//MÉTODOS FUERA DEL MAIN

	private static void verMenu() {
		// TODO Auto-generated method stub
		System.out.println("PRIMEROS:\n" + "-Ensalada mixta casera\n" + "-Sopa de cocido\n" + "-Revuelto de setas\n");
		System.out.println(
				"SEGUNDOS:\n" + "-Pollo asado al horno\n" + "-Merluza en salsa verde\n" + "-Albóndigas caseras\n");
		System.out.println("POSTRES:\n" + "-Flan casero\n" + "-Tarta de queso al horno\n" + "-Fruta del tiempo\n");
		System.out.println("INCLUYE:\n" + "-Pan casero\n" + "-1 bebida\n" + "--Precio: 12,90 €");
		System.out.println("Pulse ENTER para volver al menú principal");
		sc.nextLine();
	}

	private static void realizarReserva() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca a nombre de quién estará la reserva y el número de comensales");
		String reserva = sc.nextLine();
		System.out.println("Pulse ENTER para volver al menú principal");
		sc.nextLine();

	}

	private static void verPlatosEspeciales() {
		// TODO Auto-generated method stub
		System.out.println("Seleccione una opción (1-2)");
		System.out.println("1.-Platos especiales de la semana");
		System.out.println("2.-Platos vegetarianos");
		int opciones = sc.nextInt();
		switch (opciones) {
		case 1:
			platosEspeciales();
			break;

		case 2:
			platosVegetarianos();
			break;
		}

	}

	private static void platosEspeciales() {
		// TODO Auto-generated method stub
		System.out.println("Los platos especiales son:\n" + "-Solomillo a la pimienta\n" + "-Bacalao al pil-pil\n"
				+ "-Arroz meloso de carabineros\n" + "-Cochinillo al horno\n");
		System.out.println("Pulse ENTER para volver al menú principal");
		sc.nextLine();
	}

	private static void platosVegetarianos() {
		// TODO Auto-generated method stub
		System.out.println("Los platos vegetarianos son: \n" + "-Lasaña de verduras\n" + "-Hamburguesa vegetal casera\n"
				+ "-Curry suave de verduras\n" + "-Ensalada templada de quinoa");
		System.out.println("Pulse ENTER para volver al menú principal");
		sc.nextLine();
	}

	private static void salirPrograma() {
		// TODO Auto-generated method stub
		System.out.println("¿Seguro que desea salir del programa? (S/N)");
		String salir = sc.nextLine();
		if (salir.equalsIgnoreCase("S")) {
			control = false;
		} else {		
			control = true;
			System.out.println("Pulse ENTER para volver al menú principal");
			sc.nextLine();
		}
	}

}
