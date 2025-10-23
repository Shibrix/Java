package EstructurasControl;
import java.util.*;

public class repasoEstructurasControl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//EJERCICIO: con un bucle do while mostrar todos los números que sean múltiplos del 3 y además del 4 entre 0 y 150
		
//		int contador=0;
//		do {			
//			int divisible3=contador%3; 
//			int divisible4= contador%4;
//			
//			if(divisible3 == 0 || divisible4 == 0) {
//				System.out.println("Los números divisibles son "+contador);				
//				
//			}
//			contador++;
//		}
//		while(contador<=150);
		
		//EJERCICIO: modificar el ejercicio anterior para que no salgan los que son múltiplos de ambos.
		//Que tampoco salgan los que acaban en 6
		//Que tampoco salgan los que están entre el 50 y el 80 incluídos

//		int contador = 0;
//		do {
//			int divisible3 = contador % 3;
//			int divisible4 = contador % 4;
//			if (contador >= 50 && contador <= 80) {
//
//			}
//
//			else if (contador % 10 == 6) {
//
//			} else if (divisible3 == 0 && divisible4 == 0) {
//				// Si lo dejo en blanco es como decirle que no haga nada, por lo que no pinta
//				// nada
//			} else if (divisible3 == 0 || divisible4 == 0) {
//				System.out.println("Los números divisibles son " + contador);
//
//			}
//
//			contador++;
//		} while (contador <= 150);
		
		//EJERCICIO: hacer que salgan las tablas de multiplicar del 1 al 10
		
//		int i = 0;
//		for (i = 1; i < 11; i++) {
//			int j = 0;
//			for (j = 0; j < 11; j++) {
//				int resultado = i * j;
//				System.out.println(i + "x" + j + "=" + resultado);
//			}
//			System.out.println();
//		}
		
		//EJERCICIO: Que os pida introducir una frase y nos diga cuantas palabras tiene la frase y que se repita hasta que pongas fin
		Scanner scLine= new Scanner(System.in);
		
		while(true) {
		
		System.out.println("Introduzca una frase para que contemos las palabras");
		String frase= scLine.nextLine();
		frase=frase.trim();
		int primerEspacio= frase.indexOf(" ");
		if(frase.equalsIgnoreCase("fin")) {
			break;
		}
//		//MODO 1 DE HACERLO
//		int longitud= frase.length();
//		frase= frase.replace(" ","");
//		int longitud2= frase.length();
//		int palabras= longitud-longitud2+1;
//		System.out.println("Numero palabras: "+palabras);
		//MODO 2
		int contador= 0;
		for(int i=0; i<frase.length(); i++) {
			if(frase.charAt(i)== ' ' ) {
				contador++;
			}
			int palabras= contador+1;
			System.out.println("Numero de palabras "+palabras);
			
		}
		
		}
		
		
		
		
	}

}
