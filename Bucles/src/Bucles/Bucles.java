package Bucles;

import java.util.*;

public class Bucles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scLine = new Scanner(System.in);
		Scanner scInt = new Scanner(System.in);
		Scanner scDouble = new Scanner(System.in);
		Random r = new Random();

//		System.out.println("El bucle va a empezar");
//		//Si el int lo declaro en la línea del for, sólo va a existir dentro del bucle. Fuera esa variable
//		//no existe. Sin embargo, si la declaro fuera existe fuera y detro del bucle
//		
//		for(int i=0; i<5; i++) { //Aquí sí llega hasta el número que le marcas
//			System.out.println("Manuel, i= "+i);
//			
//		}
//		
//		System.out.println("El bucle ha acabado");
//		
//		for(int i=0; i<10; i++) { 
//			System.out.println("María, i= "+i);
//			
//		}
//		
//		//EJERCICIO Hacer un bucle que saque todos los número pares entre el 0 y el 500
//		
//		for(int i=0; i<=500; i=i+2) {
//			System.out.println(i);
//		}

		// EJERCICIO Preguntamos por un número entre 0 y 50 y que salga a partir de ese
		// número hasta 500
		// con todos los números pares

		/*
		 * System.out.println("Introduzca un número entre 0 y 50"); int i=
		 * scInt.nextInt(); int par= i%2; par= 0; if(i==par) { for(i=i;i<=500;i=i+2) {
		 * System.out.println(i); } } else { for(i=i;i<500;i=i+2) {
		 * System.out.println(i); }
		 * 
		 * }
		 */
		// EJERCICIO Pedir un número de 1 a 500 y que muestre los que sean múltiplos de
		// 3 y 4
//		System.out.println("Introduzca un número entre 1 y 50");
//		int j = scInt.nextInt();
//
//		for (j = j; j <= 500; j++) {
//			if (j % 3 == 0 && j % 4 == 0) {
//				System.out.println(j);
//
//			}
//
//		}
//		
// BUCLE WHILE
		//El while normal puede ser que nunca se ejecute

		
//		 int suma=0;
//		 int contador=0;
//		 while(suma<176) {
//			 contador++;
//			 suma=suma+contador;
//			 System.out.println("while suma "+suma+" sumo: "+contador);
//		 }
//		  
//		 //Mientras que la suma //no llegue a 176, seguirá sumando }
//		  System.out.println("Suma: "+suma); System.out.println("contador: "+contador);
		 

		// EJERCICIO: HACER BUCLE CON WHILE QUE VAYA DEL 0 AL 60 Y DE 3 EN 3. Y DESPUÉS NO PONER LOS
		// QUE ESTÁN ENTE 20 Y 40

//		int contador = 0; // Esto es equivalente al int i=0 del for
//		while (contador < 61) { // Equivale al i<=60 del for
//			if (contador <= 20 || contador >= 40) {
//				System.out.println(contador);
//			}
//
//			contador = contador + 3;
//
//		}
			//Otra manera de hacerlo: if(!(contador>=20 && contador<=40))
			//contador=contador+3;//Equivalente a i=i+3 del for

		
		//EJERCICIO: HAZ UN LISTADO DEL 1 AL 10 Y EN EL 5 QUE SALGA LA PALABRA CINCO
		
//		System.out.println("Empieza el for");
//		int i=1;
//		for(i=1; i<=10; i++) {
//			if(i==5) {
//				System.out.println("Cinco");
//			}
//			else{
//				System.out.println(i);
//			}
//		}
//	
//		System.out.println("\nEmpieza el while");
//		int j=1;
//		while(j<=10) {			
//			if(j<5 || j>5) {
//				System.out.println(j);
//			}
//			else {
//				System.out.println("Cinco");
//			}
//			
//			j++;
//		}
//BUCLE DO WHILE
		//Aquí en el do while, el while se evalúa al final. Va a imprimir 1 ĺínea al menos, independientemente
		//del número que pongamos en la variable
		
		/*int i=0;
		do {
			System.out.println(i);
			i++;
		}
		while(i<11);*/
		
		/*int opcion=0;
		do {
			System.out.println("Menú");
			System.out.println("1.Opción 1");
			System.out.println("2.Opción 2");
			System.out.println("3.Opción 3");
			System.out.println("\nElige una opción (1-3)");
			opcion= scInt.nextInt();
			System.out.println("Has elegido la opción "+opcion);
			scLine.nextLine();
		}while(opcion!=3);*/
		
		//EJERCICIO: hacer un bucle infinito en el que el usuario tenga que meter un número entero
		//y siempre salga la opción de "ha elegido esto, introduzca un número"
//		while(true) {
//			System.out.println("Introduzca un número entero");
//			int numero = scInt.nextInt();
//			System.out.println("Has elegido "+numero);
//			if(numero<=-1) {
//				System.out.println("Has acabado el bucle");
//				break;
//			}
//			
//		}
		
		
//		do {
//			System.out.println("Introduzca un número entero");
//			int numero = scInt.nextInt();
//			System.out.println("El número introducido es: " + numero);
//		} while (true);
		
	}
}
