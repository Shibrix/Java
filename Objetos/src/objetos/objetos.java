package objetos;
import java.util.Scanner;//Esto hay que hacerlo para que funcione el Scanner. Importamos la librería

public class objetos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//STRING, LENGTH Y CHAR AT
		// string es una clase y con ella creamos objetos de tipo string
			String b= "Ey";
			String c= ",¿qué tal?";
			String d= b+" aquí estoy"+c+ " estoy bien";
		
			System.out.println(d);//Recordar que char es con comilla simple y string con comilla doble
			String aa= "hola, qué tal todo? Aquí estoy programando";
			String bb= "Hola";//Se distingue entre mayúsculas y minúsculas
		
		//creamos una variable donde vamos a guardar la longitud del string, mediante
		//el método length		
			int longitud= aa.length();		
			System.out.println(longitud);
			
		//podemos hacerlo de esta manera o de la siguiente
			System.out.println(bb.length());
		
			b="adiós";
			// 01234 --Estas son las posiciones de las letras. En programación siempre empezamos por 0		
			char cc= b.charAt(2);
			System.out.println(cc);
		
		//SUBSTRING
			String hh= "Hoy es viernes";
			
			String hh2= hh.substring(5);//Si sólo metemos 1 número, imprime desde el carácter indicado hasta el final
			System.out.println(hh2);
			hh2= hh.substring(5,9);//Si metemos 2 números, coge desde ese caracter hasta el anterior que le 
		//hayamos marcado es decir, desde el 5 hasta el 8
			System.out.println(hh2);
		
		//EQUALS (son condiciones)
			String aaa= "hola";
			String bbb= "HOLA";
			System.out.println(aaa==bbb);//No se recomienda usar los == porque pueden fallar. Mejor método equals
		
		//otra manera de hacerlo sería esta
		
			System.out.println(aaa.equals(bbb));
		
		//y otra manera
			boolean ccc= aaa.equals(bbb);
			System.out.println(ccc);
		
			ccc= aaa.equalsIgnoreCase(bbb);
			System.out.println(ccc);
		
		//STRING STR --es el contrario de charAt. Aquí devuelve la posición y sirve para CUALQUIER CARACTER
			String g= "ya estamos cati de finde";
			int posicion= g.indexOf('t');
			System.out.println(posicion);
		
		//si hubiese más caracteres iguales, SIEMPRE va a devolver la que esté en la primera posición
		//Para buscar el siguiente se haría así
		
			int posicion2= g.indexOf('t',6);
			System.out.println(posicion2);
		
		//S no hubiese ningún caracter de los que hemos dicho, devuelve un -1
			posicion2=g.indexOf('u');
			System.out.println(posicion2);

		//TO UPPER CASE / TO LOWER CASE
			String p= g.toUpperCase();//convierte a mayúsculas
			System.out.println(p);
		
			g=g.toUpperCase();//así hacemos que g sea todo mayúsculas
			System.out.println(g);
			g=g.toLowerCase();// y así hacemos que g sea minúsculas otra vez
			System.out.println(g);
		
		//TRIM--Elimina espacios que haya antes y después de una cadena
			
			String r="         epa, qué pasa aquí";
			System.out.println(r);
			
			r=r.trim();
			System.out.println(r);
			
		//REPLACE--Cambia caracteres o cadenas dentro de otra
			
			String j= "Mañana cojo el tren";
			j= j.replace("tren","autobús");
			System.out.println(j);//si hubiese más palabras iguales a la que quiero reemplazar, las cambia todas
			
			j= j.replace('o','i');
			System.out.println(j);
			
			String v= "esto es un ejercicio";
			//hacer un substring entre la segunda y la tercera e
			int primeraE= v.indexOf('e');
			System.out.println(primeraE);
			int segundaE= v.indexOf('e',primeraE+1);
			int terceraE= v.indexOf('e',segundaE+1);
			
			String sv= v.substring(segundaE,terceraE+1);
			System.out.println(sv);
			
		//SCANNER
			
			Scanner scLine= new Scanner(System.in);//Este es el constructo para iniciar la clase Scanner. Sino NO FUNCIONA
			
			Scanner scInt= new Scanner(System.in);
			
			Scanner scDouble= new Scanner(System.in);
			
			/*System.out.println("Cómo te llamas?");
			
			String nombre= scLine.nextLine(); //Esto es un método que actúa sobre el sc. Si al ejecutarlo
			//pones algo en la consola y le das a Enter, te saluda con eso que le hayas puesto
			System.out.println("Hola "+nombre);	
			
			System.out.println("\nY tu apellido?");
			
			String apellido= scLine.nextLine();
			
			System.out.println("Encantado "+nombre+" "+apellido);
			//Antes de poner un sc.nextLine hay que poner un syso con una pregunta. Sino el sistema no sabe
			//qué haces
			//Con números hay que crear otro objeto y es obligatorio responderle
			System.out.println("Cuántos años tienes "+nombre+"?");
			
			int edad= scInt.nextInt();
			
			System.out.println("Oh, pues aparentas "+(edad-10));
			
			System.out.println("Y cuánto mides "+nombre+"?");
			
			double altura= scDouble.nextDouble();//La respuesta para el decimal tiene que ser con coma, no punto
			
			System.out.println("Pues pareces más bajita");*/
			
			//Ejercicio: usando scanner, usar una palabra y que al responder nos devuelva primero una mitad
			//y después la otra pero en mayúsculas			
			/*System.out.println("Introduce una palabra o frase");
			String palabra1= scLine.nextLine();
			int lon= palabra1.length();
			int mitadLon= lon/2;
			String primeraParte= palabra1.substring(0, mitadLon);
			String segundaParte= palabra1.substring(mitadLon);
			segundaParte= segundaParte.toUpperCase();
			primeraParte= primeraParte.toLowerCase();
			System.out.println("¿La palabra es "+primeraParte+" \n"+segundaParte+" ?");*/
			
			//Ejercicio 2: pregunte por tu nombre, a continuación que pregunte por la edad y por último
			//que diga "nombre, Te faltan x años par llegar a los 100"
			
			/*System.out.println("¿Cuál es tu nombre?");
			String nombre= scLine.nextLine();
			System.out.println("¿Y qué edad tienes?");
			int edad= scInt.nextInt();
			int edadDiferencia= 100-(edad);
			System.out.println(nombre+",te faltan "+edadDiferencia+" años para llegar a los 100");
			
			//Es de buena práctica que si no vamos a usar más el Scanner, lo cerremos
			scLine.close();
			scInt.close();
			scDouble.close();*/
			
		//MATH	
			//El Math es para usar constantes directamente
			System.out.println(Math.PI);
			
			//MÉTODO VALOR ABSOLUTO (abs())
			int entero= -10;
			System.out.println(Math.abs(entero));
			
			//MÉTODO POW(BASE, EXPONENTE)
			int radioo= 4;
			System.out.println(Math.pow(radioo,2));//Devuelve el elevado a (lo que sea)
			// el método math.pow no reconoce los int, tiene que estar declarado como double
			
			//METODO SQRT()
			 //Devuelve la raíz cuadrada
				double rr= Math.sqrt(25);
				System.out.println(rr);
			
			//METODO MIN Y MAX
				int a1= 10;
				int b1= 20;
				
				System.out.println(Math.max(a1, b1)); //Entre 2 valores aportados, te dice el máximo
				System.out.println(Math.min(a1, b1)); //Entre 2 valores aportados, te dice el mínimo
			
			//MÉTODO ROUND
				//Sirve para redondear al número entero más cercano				
				double d1= 28.716372462;
				long ff= Math.round(d1);
				int g1=(int)ff;
				System.out.println(g1);
				
			//MATH FLOOR Y CEIL
				//Floor redondea hacia abajo y Ceil redondea hacia arriba
				
			//MATH RANDOM
				//Da números aleatorios entre 0.0 y 1.0
				//Se puede castear a número entero, como podemos ver abajo
				int z= (int)(Math.random()*6)+1;//Simulo la tirada de un dado
					//Aquí iría desde 0 a 5. Si a final ponemos un +1, abarca desde 1 a 6
				System.out.println(z);
	
	
	}

}
