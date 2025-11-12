package ExamenVariables;
import java.util.*;
public class examenEstructurasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EJERCICIO 1
		
//		for (int i = 7; i <= 70; i++) {
//			if (i % 7 == 0) {
//				System.out.println(i);
//			}
//
//		}
		
		//EJERCICIO 2
		
//		Scanner scInt = new Scanner(System.in);
//
//		System.out.println("Introduzca un número entero");
//		int numero1 = scInt.nextInt();
//		System.out.println("Introduzca otro número entero");
//		int numero2 = scInt.nextInt();
//
//		int maximo = Math.max(numero1, numero2);
//
//		if (numero1 > numero2) {
//			System.out.println("El primer número (" + numero1 + ") es mayor que el segundo número (" + numero2 + ")");
//		} else if (numero2 > numero1) {
//			System.out.println("El segundo número (" + numero2 + ") es mayor que el primer número (" + numero1 + ")");
//		} else {
//			System.out.println("El primer y segundo número son iguales");
//		}
		
		//EJERCICIO 3
		
//		for (int i = 5; i <= 200; i++) {
//			
//			if (i % 25 == 0) {
//				System.out.println(i + "*");
//			}
//			else if (i % 5 == 0) {
//					System.out.println(i);
//			}
//	}
		
		//EJERCICIO 4
		
//		int suma = 0;
//
//		for (int i = 1; i <= 400; i++) {
//			int multiplosTres = i % 3;
//			if (multiplosTres == 0) {
//				int multiplos12 = i % 12;
//				if (multiplos12 == 0) {
//				} else {
//					suma = suma + i;
//					System.out.println("I vale " + i + " y la suma vale " + suma);
//				}
//			}
//		}
		
		//EJERCICIO 5		
		
		
//		for (int i = -40; i >= -100; i--) {
//			if (i % 2 == 0) {
//				if (i <= -59 && i >= -79) {
//
//				} else {
//					System.out.println(i);
//				}
//			}
//		}
		
		//EJERCICIO 6
		
		Scanner scLine = new Scanner(System.in);
		System.out.println("Introduzca una frase");
		String frase = scLine.nextLine();
		int longitud = frase.length();

		for (int i = 0; i < longitud; i++) {
			if (i % 2 == 0) {
				char solicitado = frase.charAt(i);
				if (solicitado == ' ') {

				} else {
					System.out.println(solicitado);
				}
			}
		}
		
		//EJERCICIO 7
		
//		try (Scanner scInt = new Scanner(System.in)) {
//			System.out.println("Introduzca un número entero");
//			int numero = scInt.nextInt();
//			int multiplicacion = numero * 2;
//			System.out.println("El número introducido multiplicado por 2 es igual a " + multiplicacion);
//		} catch (InputMismatchException e) {
//			System.out.println("El dato introducido no es válido");
//		}
		
		//EJERCICIO 8
		
//		Scanner scLine = new Scanner(System.in);
//		Scanner scInt = new Scanner(System.in);
//		try {
//			System.out.println("Introduzca una frase");
//			String frase = scLine.nextLine();
//			System.out.println("Introduzca un número entero");
//			int numero1 = scInt.nextInt();
//			System.out.println("Introduzca otro número entero");
//			int numero2 = scInt.nextInt();
//
//			char num1 = frase.charAt(numero1);
//			char num2 = frase.charAt(numero2);
//
//			int minimo = Math.min(numero1, numero2);
//			int maximo = Math.max(numero1, numero2);
//
//			int division = maximo / minimo;
//			System.out.println("los caracteres son " + num1 + "," + num2);
//			System.out.println("El resultado de dividir " + maximo + " y " + minimo + " es " + division);
//		} catch (InputMismatchException e) {
//			System.out.println("No ha introducido un número");
//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println("Ha introducido un número superior a la longitud de la frase");
//		} catch (ArithmeticException e) {
//			System.out.println("No puede dividir entre 0");
//		}
//		scInt.close();
//		scLine.close();
	}

}
