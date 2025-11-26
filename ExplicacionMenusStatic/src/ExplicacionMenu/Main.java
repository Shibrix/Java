package ExplicacionMenu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		boolean control= true;
		
		do {

			System.out.println("\nMENÚ");
			System.out.println("1.-Opción A");
			System.out.println("2.-Opción B");
			System.out.println("Elija una opción (1-2)");

			int opcion = sc.nextInt();

			switch (opcion) {
			case 1:
				opcion1();
				break;
			case 2:
				opcion2();
				break;
			}

		} while (control==true);
		sc.close();
	}

	//MÉTODOS FUERA DEL MAIN, PARA NO SOBRECARGARLO DE CÓDIGO
	
	private static void opcion1() {
		// TODO Auto-generated method stub

		System.out.println("Usted ha elegido la opción 1");
	}

	private static void opcion2() {
		// TODO Auto-generated method stub

		System.out.println("Usted ha elegido la opción 2");

	}

}
