package Bidimensionales;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EJERCICIO 1

//		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 3, 2, 1 } };
//		int resultado[][] = new int[a.length][a[0].length];
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				resultado[i][j] = 5 * a[i][j];
//
//			}
//		}
//
//		System.out.println(Arrays.deepToString(resultado));

		// EJERCICIO 2

//		int a[][] = { { 1, 1, 1, 1, }, { 2, 2, 2, 2 }, { 3, 4, 5, 6 } };
//		int suma = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				suma = suma + a[i][j];
//			}
//		}
//
//		System.out.println("La suma total es: " + suma);

		// EJERCICIO 3

//		int a[][] = { { 1, 2, 3, 2, 1 }, { 1, 1, 1, 1, 1 } };
//		int b[][] = { { 3, 2, 1, 2, 3 }, { 2, 2, 1, 1, 1 } };
//		int c[][] = { { 2, 2, 2, 2, 2 }, { 0, 0, 0, 0, 0 } };
//
//		int resultado[][] = new int[a.length][a[0].length];
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				resultado[i][j] = a[i][j] + b[i][j] + c[i][j];
//			}
//		}
//
//		System.out.println(Arrays.deepToString(resultado));

		// EJERCICIO 4
//
//		int a[][] = { { 3, 5, 8, 9 }, { 4, 12, 14, 10 }, { 0, 2, 20, 5 } };
//		int posicionI = 0;
//		int posicionJ = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			for (int j = 0; j < a[i].length; j++) {
//				if (a[i][j] == 0) {
//					posicionI = posicionI + i;
//					posicionJ = posicionJ + j;
//				}
//			}
//		}
//
//		System.out.println("El 0 en i se encuentra en la posición " + posicionI
//				+ " y en la j se encuentra en la posicion " + posicionJ);

		// EJERCICIO 5

		int a[][] = { { 3, 5, 8, 9 }, { 4, 12, 14, 10 }, { 0, 2, 20, 5 } };
		int mayor = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j] > mayor) {
					mayor = a[i][j];
				}

			}
		}
		System.out.println("El número más grande dentro del array es el " + mayor);
	}

}
