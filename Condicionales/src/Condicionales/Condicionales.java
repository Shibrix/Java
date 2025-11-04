package Condicionales;

import java.util.*;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scLine = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		Scanner scDouble = new Scanner(System.in);
		Random r = new Random();
		
//		System.out.println("Introduce una palabra");
//		String palabra= scLine.nextLine();
//		//para hacer un if con palabras es mejor usar equals en vez de ==
//		if(palabra.equalsIgnoreCase("jueves")) {
//			System.out.println("Has introducido jueves");// si pones equalsIgnoreCase ignora las mayúsculas o minúsculas, se fija en las palabras
//		}
//		else {
//			System.out.println("Has introducido algo diferente a jueves");
//		}
//		System.out.println("Introduce un número");
//		int a = scInt.nextInt();
//		System.out.println("Introduce otro número");
//		int b = scInt.nextInt();
//		System.out.println("Introduce otro número");
//		int c = scInt.nextInt();
		

//		System.out.println("Introduce un número del 1 al 4");
//		int opcion = scInt.nextInt();
	// IF, ELSEIF, ELSE

		/*
		 * if (a > b) { System.out.println("El primer número es el mayor");
		 * System.out.println("Esta línea forma parte del bloque");
		 * System.out.println("Esta también");// Para formatear, ctrl+a y después
		 * ctrl+shift+f if (a > 5) { System.out.println("Y además a es mayor de 5"); }
		 * else { System.out.println("a es menor o igual a 5"); } } else {
		 * System.out.println("a no es mayor que b"); }
		 * System.out.println("El programa continúa por aquí");
		 * 
		 * if (a < b) System.out.println("El segundo número es el mayor"); if (a == b)
		 * System.out.println("El primer número es igual al segundo");
		 */

//		if (a > b) {
//			System.out.println("a es mayor que b");
//		} else if (a == 4) {
//			System.out.println("a es igual a 4");
//			System.out.println("a es menor o igual a b");
//		} else if (b == 4) {
//			System.out.println("b es igual a 4");
//			System.out.println("a es menor o igual a b");
//			System.out.println("a es diferente de 4");
//		} else {
//			System.out.println("A unas malas seguro que esto sale");
//		}
//		System.out.println("El programa continúa por aquí");

//		if(a==4 || b==3) {
//			System.out.println("A es igual a 4 o B es igual a 3");
//		}
//		else if(a==4 && b== 3) {
//			System.out.println("A es igual a 4 y B es igual a 3");
//		}
//		else if((a==4 && b== 3) || c==5) {
//			System.out.println("Ha entrado");
//		}
//		else if(c!=5) {
//			System.out.println("C es diferente de 5"); // el diferente también se puede poner como (!(C==5))
//		}
//	// SWITCH: se usa cuando las opciones son más restringidas
//
//		switch (opcion) {
//		case 1:
//			System.out.println("Has elegido 1");
//			break;
//		case 2:
//			System.out.println("Has elegido 2");
//			break;
//		case 3:
//			System.out.println("Has elegido 3");
//			break;
//		case 4:
//			System.out.println("Has elegido 4");
//			break;
//		default:
//			System.out.println("No has elegido bien");
//			break;
//		}
		
		//EJERCICIO: hacer programa que pida introduce s/n y que dé la respuesta adecuada. Si dices otra cosa, que diga no lo entiendo
		System.out.println("Introduce un (s/n)");
		String sOn= scLine.nextLine();
		
		if(sOn.equalsIgnoreCase("s")) {
			System.out.println("Has dicho que sí");
		}
		else if(sOn.equalsIgnoreCase("n")) {
			System.out.println("Has dicho que no");
		}
		else {
			System.out.println("No entiendo lo que dices");
		}
		
	}
}
