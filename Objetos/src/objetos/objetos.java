package objetos;
import java.util.*;//Esto hay que hacerlo para que funcione el Random. Importamos la librería
//si en vez de poner .Scanner o .Random ponemos .* estamos importando todas las librerias a la vez

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
			
			//String r="         epa, qué pasa aquí";
			//System.out.println(r);
			
			//r=r.trim();
			//System.out.println(r);
			
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
				//Ejercicio: usando Scanner y Math, calcular el volumen de una esfera
							
							/*System.out.println("Vamos a calcular el volumen de una esfera. ¿Cuál es el radio?");
							double rad= scDouble.nextDouble();
							double volumen= (4.0/3.0)*Math.PI*Math.pow(rad,3);
							System.out.println("El volumen de la esfera sería "+volumen);*/
							
				//Ejercicio: que el programa pregunte por 2 números enteros y te diga cuál es el mayor
							
							/*System.out.println("Dime el primer número entero");
							int num1= scInt.nextInt();
							System.out.println("Y ahora dime el segundo número");
							int num2= scInt.nextInt();
							System.out.println("El número que es mayor es el "+Math.max(num1, num2));*/
							
				//Ejercicio: que el programa pregunte por 3 números enteros y te diga cuál es el mayor
							
							/*System.out.println("Dime el primer número entero");
							int numero1= scInt.nextInt();
							System.out.println("Dime el segundo número");
							int numero2= scInt.nextInt();
							System.out.println("Y ahora dime el tercero");
							int numero3= scInt.nextInt();
							int primeraOperacion= Math.max(numero1, numero2);
							System.out.println("El número que es mayor es el "+Math.max(numero3, primeraOperacion));*/
							
				//Ejercicio: programa que pide un número con decimales y que devuelva el mismo número SIN LA PARTE ENTERA
							
							/*System.out.println("Dime un número con decimal");
							double decimal= scDouble.nextDouble(); 
							int enteroo= (int)decimal;
							double resultado= decimal-enteroo;				
							System.out.println("La parte decimal de ese número sería "+resultado);*/
				
							//otra manera de resolverlo
							
							/*System.out.println("Dime un número con decimal");
							double decimal= scDouble.nextDouble(); 
							double parteEntera= Math.floor(decimal);
							System.out.println("La parte decimal sería "+(decimal-parteEntera));*/
							
				//Ejercicio: programa que nos pide un número con muchos decimales. Lo queremos redondeado pero sólo con un decimal	
							
							/*System.out.println("Dime un número con muchos decimales");
							double numero= scDouble.nextDouble();
							double numero2= Math.round(numero*10.0)/10.0;
							System.out.println("El número con un decimal sería "+numero2);*/
				
		//RANDOM*/
				
				
				//int aleatorio= random.nextInt(1,7);//Sólo va desde el 1 al 6. El segundo parámetro siempre es un número menos
				//System.out.println(aleatorio);
				
				//Ejercicio: preguntar por una palabra y que devuelva un caracter aleatorio de esa palabra
				/*System.out.println("Introduce una palabra por favor");
				String palabra= scLine.nextLine();
				int longitud1= palabra.length();
				int aleatorio1= random.nextInt(longitud1);
				char a= palabra.charAt(aleatorio1);
				System.out.println("El caracter aleatorio es "+a);*/
				
				//Ejercicio: preguntar por una frase y que devuelva un caracter aleatorio y que no se muestre ningún espacio
				/*System.out.println("Introduce una frase por favor");
				String frase= scLine.nextLine();
				frase= frase.replace(" ", "");				
				int longitud1= frase.length();
				int aleatorio1= random.nextInt(longitud1);
				char a= frase.charAt(aleatorio1);
				System.out.println("El caracter aleatorio es "+a);*/
				
				//Ejercicio: que dé un número aleatorio entre 1 y 20. Tiene que poner El primer número aleatorio es x. Pulsa
				//enter para continuar - Después segundo numero aleatorio y enter para continuar y por último un número
				//aleatorio etre 3 y 12 del aleatorio anterior
				/*Random r= new Random();
				int a= r.nextInt();
				int num1= r.nextInt(20)+1;
				System.out.println("El primer número aleatorio es "+num1);
				System.out.println("Pulsa enter para continuar");
				scLine.nextLine();
				int num2= r.nextInt(20)+1;
				System.out.println("El segundo número aleatorio es "+num2);
				System.out.println("Pulsa enter para continuar");
				scLine.nextLine();
				int numMin= Math.min(num1,num2); 
				int numMay= Math.min(num1,num2); 
				
				//numero entero  aleatorio entre a y b  9 15
				
				//formula para poder hacer un random con 2 parámetros
				//int a= r.nextInt(b-a+1)+a;
								//(  0 6)  + a = 9 -15*/
				
				
				//EJERCICIO
				//Introducir una frase y que cambie todas las a minúsculas por otra vocal aleatoria
				
				Random r= new Random();
				System.out.println("Introduce una frase");
				String frase= scLine.nextLine();
				String vocales= "eiou";
				int al= r.nextInt(4);
				char aleatorio= vocales.charAt(al);
				frase= frase.replace('a', aleatorio);
				System.out.println(frase);
				
				
				
				
				
				
				
				
	}

}
