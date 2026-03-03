package Opcional;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// EJERCICIO 1

//		int a[] = { 4, 7, 4, 7, 3, 23, -4, 12, 6 };
//		int b[] = { 5, 7, 8, 9, 10 };
//		int c[] = new int[a.length + b.length];
//		int contador = 0;
//
//		for (int i = 0; i < a.length; i++) {
//			if (i < a.length) {
//				c[contador] = a[i];
//				contador++;
//			}
//			if (i < b.length) {
//				c[contador] = b[i];
//				contador++;
//			}
//		}
//
//		System.out.println(Arrays.toString(c));

		// EJERCICIO 2
//		int a[] = { 4, 7, 9, -6, 5 };
//		int b[] = { 5, 7, 1, 7, 2, 7, 23 };
//		int c[] = { 5, 6, 10 };
//		int solucion[] = new int[b.length];
//
//		int numA = 0;
//		int numB = 0;
//		int numC = 0;
//
//		for (int i = 0; i < solucion.length; i++) {
//			numA = 0;
//			numB = 0;
//			numC = 0;
//			if (i < a.length) {
//				numA = a[i];
//			}
//			if (i < b.length) {
//				numB = b[i];
//			}
//			if (i < c.length) {
//				numC = c[i];
//			}
//
//			solucion[i] = numA + numB + numC;
//
//		}
//		System.out.println(Arrays.toString(solucion));
		
		//EJERCICIO 3
		int a[]= {2, -3, 0, 1, 2, -2} ;
		int contador=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==3||a[i]==-3) {
				contador+=3;
			}			
			if(a[i]==2||a[i]==-2) {
				contador+=2;
			}			
			if(a[i]==1||a[i]==-1) {
				contador+=1;
			}
			
			
		}
		System.out.println(contador);
		int sol[]=new int[contador];
		contador=0;
		for(int i=0; i<a.length; i++) {
			int valorActual=a[i];
			if(valorActual==2 || valorActual==-2) {
				sol[contador]=valorActual;
				sol[contador+1]=valorActual;
				contador= contador+2;
			}
			if(valorActual==3 || valorActual==-3) {
				sol[contador]=valorActual;
				sol[contador+1]=valorActual;
				sol[contador+2]=valorActual;
				contador= contador+3;
			}
			if(valorActual==1 || valorActual==-1) {
				sol[contador]=valorActual;
				contador= contador+1;
			}
		}
		System.out.println(Arrays.toString(sol));
	}

}
