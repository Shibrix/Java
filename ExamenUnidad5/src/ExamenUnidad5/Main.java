package ExamenUnidad5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		Movil m0 = new Movil("Oppo", 150.0, 678111222, true);
		Movil m1 = new Movil("Xiaomi", 175.0, 678333444, false);

		boolean control = true;

		do {
			System.out.println("MENÚ");
			System.out.println("1.- Mostrar datos");
			System.out.println("2.- Cambiar número");
			System.out.println("3.- Apagar/Encender");
			System.out.println("4.- Recibir llamada");
			System.out.println("5.- Contar móviles encendidos");
			System.out.println("Elige una opción");

			int opcion = sc.nextInt();

			switch (opcion) {

			case 1:
				mostrarDatos(m0, m1);
				break;

			case 2:
				m0.cambiarNumero();
				break;

			case 3:
				m1.apagarEncender();
				break;

			case 4:
				m1.recibirLlamada();
				break;
			}

		} while (control == true);

	}

	private static void mostrarDatos(Movil m0, Movil m1) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println(m0);
		System.out.println(m1);
		System.out.println("\n");
		System.out.println("Pulse enter para continuar");
		sc.nextLine();

	}

}
