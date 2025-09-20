package objetos;

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
			System.out.println(sv);//aquí tendría que salir es un e, me sale eje
		
		
		
	
	
	
	
	
	}

}
