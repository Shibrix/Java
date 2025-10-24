package ControlErrores;
import java.util.*;
public class ControlErrores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TRY Y CATCH
		Scanner scInt= new Scanner(System.in);
		Scanner scLine= new Scanner(System.in);
		
//		System.out.println("Introduce un número");
		//Seleccionamos el bloque que pueda dar problema y nos vamos a Source, Surround With, Try/Catch block
		//Funciona similar al if/else
		
		//MODIFICAR CÓDIGO PARA QUE SIEMPRE QUE NO SE META UN NÚMERO ME VUELVA A PREGUNTAR POR EL NÚMERO Y ME AVISE DE QUE
		//NO LO HE INTRODUCIDO CORRECTAMENTE
		
//		int numero=0;
//		boolean letra= false;
//
//		do {
//			try {
//				System.out.println("Introduce un número por favor");
//				numero = scInt.nextInt();
//				letra = false;
//			} catch (Exception e) {
//				// TODO Auto-generated catch block
//				scInt.nextLine(); //Esto hay que ponerlo para resetear el enter de line, sino se genera bucle infinito
//				letra = true;
//				System.out.println("No has introducido un número"); // Al "coger" el error, el programa no se rompe.
//																	// Salta el error y continúa leyendo el código
//			}
//		} while (letra == true);
//		
//		System.out.println("El cuadrado del número es "+ Math.pow(numero,2));
//		
//		System.out.println("El programa continúa");
		
	//MULTICATCH
		
		//HACER UN TRY CON 2 CATCH (MULTICATCH). QUE UN CATCH DETECTE QUE HE PUESTO UNA LETRA EN LUGAR DE UN NÚMERO
		//Y EL OTRO QUE ME HE PASADO EN LA POSICION
		
		boolean letra= false;
		boolean longitud= false;
		
		try {
			System.out.println("Introduce una frase");
			String frase= scLine.nextLine();
			System.out.println("Introduce una posición");
			int posicion= scInt.nextInt();
			char largo= frase.charAt(posicion);
			letra= false;
			longitud= false;
		}catch (java.lang.StringIndexOutOfBoundsException e) {
			longitud= true;
			System.out.println("La posición te pasa de la frase");					
		}catch (java.util.InputMismatchException e) {
			letra= true;
			System.out.println("Has introducido una letra");	
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
