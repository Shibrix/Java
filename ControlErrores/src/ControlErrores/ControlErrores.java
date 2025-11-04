package ControlErrores;
import java.util.*;
public class ControlErrores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//TRY Y CATCH
		
		Scanner scLine= new Scanner(System.in);
		
//		System.out.println("Introduce un número");
//Seleccionamos el bloque que pueda dar problema y nos vamos a Source, Surround With, Try/Catch block
//Funciona similar al if/else
		
		//MODIFICAR CÓDIGO PARA QUE SIEMPRE QUE NO SE META UN NÚMERO ME VUELVA A PREGUNTAR POR EL NÚMERO Y ME AVISE DE QUE
		//NO LO HE INTRODUCIDO CORRECTAMENTE
		
		int numero=0;
		boolean letra= false;
//
		do {
			Scanner scInt= new Scanner(System.in); //Poniendo el Scanner aquí, no saltará error en el bucle aunque lo hayamos cerrado
		 //en el finally
			try {
				System.out.println("Introduce un número por favor");
				numero = scInt.nextInt();
				letra = false;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				scInt.nextLine(); //Esto hay que ponerlo para resetear el enter de line, sino se genera bucle infinito
				letra = true;
				System.out.println("No has introducido un número"); // Al "coger" el error, el programa no se rompe.
																	// Salta el error y continúa leyendo el código
			} finally {
				//Lo que está aquí dentro se ejecuta siempre sí o sí,aunque pongamos un break para romper el código
				//¿Para qué sirve? Está pensado para cerrar los recursos de entrada que hemos usado
				//EJEMPLO: el Scanner ya no se va a usar más, así que ejecutamos un close
				scInt.close();
			}
		} while (letra == true);
		
		System.out.println("El cuadrado del número es "+ Math.pow(numero,2));
		
		System.out.println("El programa continúa");
		
	//MULTICATCH
		
		//HACER UN TRY CON 2 CATCH (MULTICATCH). QUE UN CATCH DETECTE QUE HE PUESTO UNA LETRA EN LUGAR DE UN NÚMERO
		//Y EL OTRO QUE ME HE PASADO EN LA POSICION
		
//		boolean letra= false;
//		boolean longitud= false;
//		
//		try {
//			System.out.println("Introduce una frase");
//			String frase= scLine.nextLine();
//			System.out.println("Introduce una posición");
//			int posicion= scInt.nextInt();
//			char largo= frase.charAt(posicion);
//			letra= false;
//			longitud= false;
//		}catch (java.lang.StringIndexOutOfBoundsException e) {
//			longitud= true;
//			System.out.println("La posición te pasa de la frase");					
//		}catch (java.util.InputMismatchException e) {
//			letra= true;
//			System.out.println("Has introducido una letra");	
//		}
		
		
		//TRY CON RESOURCES: ¡¡¡ES DE EXAMEN!!!
		
		//Con este try no hace falta poner finally, lo lleva ya implementado. Tampoco es obligatorio poner un catch
		//Hay que declarar el Scanner dentro de los paréntesis del try.
		
//		try (Scanner scInt2 = new Scanner(System.in); Scanner scDouble1 = new Scanner(System.in)) {
//			// Se pueden declarar 2 Scanner diferentes en el mismo try, separados por ;
//			System.out.println("Introduce un número por favor");
//			numero = scInt2.nextInt();
//			double numero1 = scDouble1.nextDouble();
//			letra = false;
//		} catch (Exception e) {
//
//		}
		
		//Bajo la misma declaración de Scanner se puede llevar los int y los double. A la variable se le puede llamar 
		//como queramos. Generalmente lo llamamos scLine, scInt o scDouble para relacionarlo con el método (se refiere
		//al .nextLine, .nextInt o .nextDouble. Si al Scanner lo llamamos, por ejemplo, scNumero, se puede usar tanto
		//para .nextInt como para .nextDouble
		
//		Scanner scNumero= new Scanner (System.in);
//		int entero= scNumero.nextInt();
//		double decimal= scNumero.nextDouble();
		
		
		//Para generar un número aleatorio decimal primero necesitamos crear un número random entero y después un número
		//decimal random y sumarlo. NO HAY OTRA FORMA DE HACERLO. El random decimal sólo va de 0 a 1 (con decimales)
		//POSIBLE PREGUNTA DE EXAMEN
		//Obtener un número aleatorio entre 5 y 10 con decimales con la clase Random
		Random r= new Random();
		
		int parteEntera= r.nextInt(5,10);
		double parteDecimal= r.nextDouble();
		double suma= parteEntera+parteDecimal;
		System.out.println(suma);
		
		//Con el método Math.random
		
		int parteEntera2= (int) Math.random()*5 +5; // El paréntesis va del 0 al 1 con decimales. Multiplica por 5
		//(así se consigue que vaya del 0 al 4) y después se le suma 5 para que consiga ir desde el 5 al 10
		double parteDecimal2= Math.random();
		double suma2= parteEntera2+parteDecimal2;
		
		System.out.println(suma2);
		 
		 
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
