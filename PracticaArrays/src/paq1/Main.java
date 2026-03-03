package paq1;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EJERCICIO 1

		int a[] = { 2, 3, 4, 7, 8 };
		int multiplicador= 10;
		int aa[] = new int[a.length];

		for (int i = 0; i < a.length; i++) {
			aa[i] = a[i] * multiplicador;
			multiplicador= multiplicador*10;
		}
		System.out.println(Arrays.toString(aa));
		
		
		//EJERCICIO 2
//		double a[]={1, 3, 5, 7, 9};
//		double b[]={6, 4, 2, 1, 3};
//		
//		double c[]= new double[a.length];
//		
//		for(int i=0; i<a.length; i++) {
//			c[i]= (a[i]*b[i])/10.0;
//		}
//		
//		System.out.println(Arrays.toString(c));
		
		//EJERCICIO 3
//		double a[] = { 6, 9, 8, 10, 11 };
//		double b[] = { 2, 3, 4, 2, 3 };
//
//		double c[] = new double[a.length];
//
//		for (int i = 0; i < a.length; i++) {
//			c[i] = a[i] / b[i];
//			if (c[i] < 4) {
//				c[i] = Math.round((c[i] + 10) * 100.0) / 100.0;
//			}
//		}
//		System.out.println(Arrays.toString(c));
		
		//EJERCICIO 4
		
//		String a[] = { "Coche", "Tren", "Avión", "Furgoneta", "Moto", "Barco", "Autobus" };
//		boolean b[] = { false, true, true, false, true, true, false };
//
//		String c[] = new String[a.length];
//
//		for (int i = 0; i < a.length; i++) {
//			if (b[i] == true) {
//				c[i] = a[i].toUpperCase();
//			} else {
//				c[i] = a[i].toLowerCase();
//			}
//		}
//
//		System.out.println(Arrays.toString(c));
		
		//EJERCICIO 5
		
//		int a[] = { 2, 3, 4, 7, 8, 10, 11 };
//		int b[] = new int[a.length * 2];
//
//		for (int i = 0; i < a.length; i++) {
//			b[i * 2] = a[i];
//			b[i * 2 + 1] = 0;
//		}
//		System.out.println(Arrays.toString(b));
		
		//EJERCICIO 6
		
//		char a[]= {'P', 'a', 'l', 'a', 'b', 'r', 'a'};
//		String b= String.valueOf(a);
//		System.out.println(b);
		
		//EJERCICIO 7
//		int a[] = { 4, 6, 1, 5, 6, 15, 12, 7 };
//		Arrays.sort(a);
//		int b[] = new int[a.length];
//
//		for (int i = 0; i < a.length; i++) {
//			b[i] = a[a.length - 1 - i];
//
//		}
//		System.out.println(Arrays.toString(b));
		
		//EJERCICIO 8
		
//		int a[] = { 2, 8, 4, 7, 3, 10, 11 };
//		int contadorMenores = 0;
//		int contadorMayores = 0;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] < 6) {
//				contadorMenores++;
//			} else {
//				contadorMayores++;
//			}
//		}
//
//		int menores[] = new int[contadorMenores];
//		int mayores[] = new int[contadorMayores];
//
//		contadorMenores = 0;
//		contadorMayores = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] < 6) {
//				menores[contadorMenores] = a[i];
//				contadorMenores++;
//			} else {
//				mayores[contadorMayores] = a[i];
//				contadorMayores++;
//			}
//		}
//		System.out.println(Arrays.toString(menores));
//		System.out.println(Arrays.toString(mayores));
		
	}

}
