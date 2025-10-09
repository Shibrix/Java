package EstructurasControl;

import java.util.*;

public class PracticasEstructurasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EJERCICIO 1
		/*int i = 0;
		for (i = 0; i <= 100; i++) {
			if (i == 0) {
				System.out.println(i);
			} else if (i % 10 == 0) {
				System.out.println("Cambio de decena");
			} else {
				System.out.println(i);
			}
		}*/
		
		//EJERCICIO 2
//		int contador=0;
//		int suma=0;		
//		while(suma<40) {	
//			System.out.println(suma+ " sumando "+contador);	
//			suma= suma+contador;
//			contador++;					
//		}
//		
//		System.out.println("El último numero sumado antes de pasar el 40 es el "+(contador-1));
		
		//EJERCICIO 3
//		int contador = 0;
//		int numero = 1;
//
//		while (contador <= 10) {
//			numero = numero * 2;
//			System.out.println(numero);
//			contador++;
//		}
		
		//EJERCICIO 4
//		int numero = 22;
//		do {
//			int par = numero % 2;
//			if (par == 0) {
//				System.out.println(numero);
//			}
//			numero++;
//		} while (numero <= 48);
		
		
		//EJERCICIO 5
		
//		double i = 0;
//		int contador = 0;
//		for (i = 0; i <= 23.40; i = i + 0.48) {
//			contador++;
//			i = Math.round(i * 100.0) / 100.0;
//			System.out.println("sumando " + i + " + 0,48 en la vuelta " + contador);
//
//		}
//		System.out.println("Hay que sumarlo un total de " + (contador + 1) + " veces");
//
		//EJERCICIO 6
		//int negativos= -21;
//		int resta = 0;
//		int suma = 0;
//		for (int negativos = -21; negativos <= -9; negativos++) {
//			int impares = negativos % 2;
//			// System.out.println(impares);
//			if (impares == -1) {
//				resta = negativos + resta;
//				// System.out.println(resta);
//
//			}
//
//		}
//		for (int positivos = 14; positivos <= 64; positivos++) {
//			int pares = positivos % 2;
//			if (pares == 0) {
//				suma = positivos + suma;
//				// System.out.println(suma);
//			}
//		}
//		System.out.println("La suma de pares e impares es de " + (suma + resta));
		
		//EJERCICIO 7
		
//		double numero = 4096;
//		int contador = 2;
//		while (contador <= 8) {
//			System.out.println("Dividiendo " + numero + " entre " + contador);
//			numero = numero / contador;
//			numero = Math.round(numero * 100.0) / 100.0;
//			contador++;
//		}
//		System.out.println("El resultado final es de " + numero);
		
		//EJERCICIO 8

		int i = 6;
		String numeros = "";
		for (i = 6; i <= 60; i++) {
			int multiplo = i % 6;
			if (multiplo == 0) {
				numeros = numeros + " " + i;
			}
		}
		System.out.println(numeros = numeros.trim());
		
		
		
		
		
		
		
	}

}
		
	

