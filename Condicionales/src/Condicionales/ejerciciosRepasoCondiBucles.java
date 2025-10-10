package Condicionales;

import java.util.*;

public class ejerciciosRepasoCondiBucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scLine = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		Scanner scDouble = new Scanner(System.in);
		Random r = new Random();

	// EJERCICIO: haz un programa usando SWITCH donde la máquina diga que
	// introduzcas s o n, que te
	// devuelva lo que has seleccionado y que vuelva a pedirte que introduzcas s o n
	// y después hacer que al darle a f se rompa el bucle y no pregunte más
		boolean bucle = true;
		while (bucle) {
			System.out.println("Pulse s/n para decir sí o no");
			String respuesta = scLine.nextLine();
			respuesta = respuesta.toLowerCase();
			char primerCaracter = respuesta.charAt(0);

			switch (primerCaracter) {
			case 's':
				System.out.println("Has elegido sí");
				break;

			case 'n':
				System.out.println("Has elegido No");
				break;

			case 'f':
				System.out.println("Hemos terminado");
				bucle = false;
				break;

			default:
				System.out.println("No has elegido bien");
				break;

			}

		}

	}

}
