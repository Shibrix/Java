package ControlErrores;
import java.util.*;
public class Practica1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//EJERCICIO 1
//		
//		try (Scanner scInt = new Scanner(System.in)) {
//			System.out.println("Introduzca un número entero");
//			int num1 = scInt.nextInt();
//			System.out.println("Introduzca otro número entero");
//			int num2 = scInt.nextInt();
//			System.out.println("La suma de los números introducidos es: " + (num1 + num2));
//		} catch (java.util.InputMismatchException e) {
//			System.out.println("No ha introducido un número");
//		}
		
		
		//EJERCICIO 2
		
//		try (Scanner scLine = new Scanner(System.in)) {
//			System.out.println("Introduzca un número en forma de texto");
//			String numero = scLine.nextLine();
//			Double convertido = Double.parseDouble(numero);
//			System.out.println(convertido);
//		} catch (java.lang.NumberFormatException e) {
//			System.out.println("No se puede convertir a número");
//		}
		
		//EJERCICIO 3
		
//		int numero = 0;
//		int longitud = 0;
//		try (Scanner scLine = new Scanner(System.in); Scanner scInt = new Scanner(System.in)) {
//			System.out.println("Introduzca una palabra");
//			String palabra = scLine.nextLine();
//			System.out.println("Ahora introduzca un número");
//			numero = scInt.nextInt();
//			longitud = palabra.length();
//			palabra = palabra.substring(0, numero);
//			if (numero == 0) {
//				System.out.println("El número no puede ser 0");
//			}
//			System.out.println(palabra);
//
//		} catch (StringIndexOutOfBoundsException e) {
//
//			if (numero < 0) {
//				System.out.println("Ha elegido un número menor al límite de caracteres de la palabra");
//			}
//
//			if (numero > longitud) {
//				System.out.println("Ha elegido un número que supera el límite de caracteres de la palabra");
//			}
//
//		} catch (InputMismatchException e) {
//			System.out.println("No ha introducido un número");
//		}
		
		//EJERCICIO 4
		
//		Scanner scInt = new Scanner(System.in);
//		boolean control = false;
//		do {
//			try {
//				System.out.println("Introduzca un número entero");
//				int num1 = scInt.nextInt();
//				System.out.println("Introduzca otro número entero");
//				int num2 = scInt.nextInt();
//				System.out.println("La división de los números es " + (num1 / num2));				
//				break;
//			} catch (ArithmeticException e) {
//				scInt.nextLine();
//				control = true;
//				System.out.println("No puede dividir entre 0");
//			} catch (InputMismatchException e) {
//				scInt.nextLine();
//				control = true;
//				System.out.println("No ha introducido un número");
//			}
//		} while (control = true);
//
//		scInt.close();
		
		//EJERCICIO 5
		
//		try (Scanner scInt = new Scanner(System.in); Scanner scLine = new Scanner(System.in)) {
//			System.out.println("Introduzca un número entero");
//			int num1 = scInt.nextInt();
//			System.out.println("Introduzca otro número entero");
//			int num2 = scInt.nextInt();
//			System.out.println("Introduzca una operación: suma, resta, multiplicación, división");
//			String operacion = scLine.nextLine();
//			operacion = operacion.toLowerCase();
//
//			switch (operacion) {
//			case "suma":
//				int suma = num1 + num2;
//				System.out.println("La suma de los números " + num1 + " y " + num2 + " es igual a " + suma);
//				break;
//			case "resta":
//				int resta = num1 - num2;
//				System.out.println("La resta de los números " + num1 + " y " + num2 + " es igual a " + resta);
//				break;
//			case "división":
//				int division = num1 / num2;
//				System.out.println("La division de los números " + num1 + " y " + num2 + " es igual a " + division);
//				break;
//			case "multiplicación":
//				int multiplicacion = num1 * num2;
//				System.out.println(
//						"La multiplicación de los números " + num1 + " y " + num2 + " es igual a " + multiplicacion);
//				break;
//			default:
//				System.out.println("No ha elegido ninguna de las opciones disponibles");
//			}
//		} catch (InputMismatchException e) {
//			System.out.println("No ha introducido un número");
//		} catch (ArithmeticException e) {
//			System.out.println("No puede dividir entre 0");
//		} catch (Exception e) {
//			System.out.println("Ha habido otro error");
//		}
//		
		
		//EJERCICIO 6
		
//		Scanner scLine = new Scanner(System.in);
//		int contador = 0;
//		int suma = 0;
//		double promedio = 0;
//		String numero;
//
//		System.out.println("Introduzca un número entero (escribe fin para terminar)");
//		do {
//			numero = scLine.nextLine();
//			if (numero.equalsIgnoreCase("fin")) {
//				break;
//			} else {
//				try {
//					contador++;
//					int convertido = Integer.parseInt(numero);
//					suma = suma + convertido;
//					promedio = (double) suma / contador;
//				} catch (NumberFormatException e) {
//					System.out.println("Error: '" + numero + "' es un número");
//				}
//			}
//		} while (true);
//		System.out.println("Has introducido " + contador + " números válidos");
//		System.out.println("La suma total de los números es " + suma);
//		System.out.println("El promedio de los número es " + (Math.round(promedio*100.0)/100.0));
//		
			
		
	}

}
