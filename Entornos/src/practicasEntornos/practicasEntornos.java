package practicasEntornos;

import java.util.*;

public class practicasEntornos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try (Scanner scInt = new Scanner(System.in); Scanner scLine = new Scanner(System.in)) {
			//System.out.println("Introduzca un número entero");
			int num1 = Integer.parseInt(args [1]);
			//System.out.println("Introduzca otro número entero");
			int num2 = Integer.parseInt(args [2]);
			//System.out.println("Introduzca una operación: suma, resta, multiplicación, división");
			String operacion = args[0];
			operacion = operacion.toLowerCase();

			switch (operacion) {
			case "suma":
				int suma = num1 + num2;
				System.out.println("La suma de los números " + num1 + " y " + num2 + " es igual a " + suma);
				break;
			case "resta":
				int resta = num1 - num2;
				System.out.println("La resta de los números " + num1 + " y " + num2 + " es igual a " + resta);
				break;
			case "división":
				int division = num1 / num2;
				System.out.println("La division de los números " + num1 + " y " + num2 + " es igual a " + division);
				break;
			case "multiplicación":
				int multiplicacion = num1 * num2;
				System.out.println(
						"La multiplicación de los números " + num1 + " y " + num2 + " es igual a " + multiplicacion);
				break;
			default:
				System.out.println("No ha elegido ninguna de las opciones disponibles");
			}
		} catch (InputMismatchException e) {
			System.out.println("No ha introducido un número");
		} catch (ArithmeticException e) {
			System.out.println("No puede dividir entre 0");
		} catch (Exception e) {
			System.out.println("Ha habido otro error");
		}

	}

}
