package Arrays;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EJERCICIO 1

//		int a[] = { 1, 2, 3, 4, 5, 6 };
//		int b[] = { 2, 2, 2, 3, 3, 3 };
//		int solucion[] = new int[a.length];
//
//		for (int i = 0; i < solucion.length; i++) {
//			if (i % 2 == 0) {
//				solucion[i] = a[i] + b[i];
//			}
//
//		}
//		System.out.println(Arrays.toString(solucion));

		// EJERCICIO 2

//		int a[] = { 3, 7, 1, 4, 2, 3, 10 };
//		int longitud = a.length;
//		
//		for (int i = 0; i < longitud; i++) {
//			int valorCentral = longitud / 2;
//			if (i == valorCentral) {
//				System.out.println(a[i]);
//			}
//		}

		// EJERCICIO 3

		int a[][] = { { 1, 1, 1 }, { 2, 2, 2 }, { 3, 3, 3 }, { 4, 4, 4 } };

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (i % 2 == 0) {
					a[i][j] = a[i][j] * 4;
				}
			}
		}
		System.out.println(Arrays.deepToString(a));

	}

}
