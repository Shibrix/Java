package practicaObjetos;
import java.util.*;

public class practicaObjetos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scLine= new Scanner(System.in);
		Scanner scInt= new Scanner(System.in);
		Scanner scDouble= new Scanner(System.in);
		Random r= new Random();
		
		//EJERCICIO 1
		
		/*System.out.println("Introduce tu nombre");
		String nombre= scLine.nextLine();
		System.out.println("Introduce tu primer apellido");
		String apellido1= scLine.nextLine();
		System.out.println("Introduce tu segundo apellido");
		String apellido2= scLine.nextLine();
		apellido1= apellido1.toUpperCase();
		apellido2= apellido2.toUpperCase();
		System.out.println("Formato: "+apellido1+" "+apellido2+", "+nombre);
		char nom= nombre.charAt(0);
		char ape1= apellido1.charAt(0);
		char ape2= apellido2.charAt(0);
		System.out.println("Iniciales: "+nom+"."+ape1+"."+ape2);
		String letras= nombre+apellido1+apellido2;
		int longitud= letras.length();
		System.out.println("Letras sin espacios: "+longitud);
		int posicion= letras.indexOf('a');
		System.out.println("Primera 'a' en índice: "+posicion);*/
		
		//EJERCICIO 2
		
		/*System.out.println("Introduce un número decimal a");
		double a= scDouble.nextDouble();
		System.out.println("Introduce un número decimal b");
		double b= scDouble.nextDouble();
		double suma= a+b;
		System.out.println("Suma: "+Math.round(suma*100)/100.0);
		double resta= a-b;
		System.out.println("Resta: "+Math.round(resta*100)/100.0);
		double multiplicacion= a*b;
		System.out.println("Multiplicacion: "+Math.round(multiplicacion*100)/100.0);
		double division= a/b;
		System.out.println("División: "+Math.round(division*100)/100.0);
		double potencia= Math.pow(a,b);
		System.out.println("Potencia: "+Math.round(potencia*100)/100.0);
		double raiz= Math.sqrt(a);
		System.out.println("Raíz: "+Math.round(raiz*100)/100.0);*/
		
		//EJERCICIO 3
		
		/*System.out.println("Introduce tu nombre:");
		String nombre= scLine.nextLine();
		System.out.println("Introduce tu apellido:");
		String apellido= scLine.nextLine();
		String letNom= nombre.substring(0,3);
		letNom= letNom.toLowerCase();		
		String letApe= apellido.substring(apellido.length()-3);
		letApe= letApe.toLowerCase();
		int aleatorio= r.nextInt(899+1)+100;
		System.out.println("Usuario sugerido: "+letNom+letApe+aleatorio);*/
		
		//EJERCICIO 4
		
		/*System.out.println("Introduce tu correo:");
		String correo= scLine.nextLine();
		int arroba= correo.indexOf('@');
		String usuario= correo.substring(0, arroba);
		System.out.println("Usuario: "+usuario);
		int punto= correo.indexOf('.', arroba);		
		String dominio= correo.substring(arroba+1, punto);
		System.out.println("Dominio: "+dominio);
		String tdl= correo.substring(punto+1);
		System.out.println("TDL: "+tdl);*/
		
		//EJERCICIO 5
		
		/*System.out.println("Introduce cantidad en euros:");
		double euros= scDouble.nextDouble();
		euros= Math.round(euros*100.0)/100.0;
		System.out.println("Introduce tipo de cambio EUR->USD: ");
		double usd= scDouble.nextDouble();
		System.out.println("Introduce tipo de cambio EUR->GBP: ");
		double gbp= scDouble.nextDouble();
		double dolares= euros*usd;
		dolares= Math.round(dolares*100)/100.0;
		double libras= euros*gbp;
		libras= Math.round(libras*100)/100.0;
		System.out.println("Euros: "+euros);
		System.out.println("Dólares: "+dolares);
		System.out.println("Libras: "+libras);*/
		
		//EJERCICIO 6
		
		/*int aleatorio= r.nextInt(5+1)+1;
		System.out.println("Dado 1: "+aleatorio);
		int aleatorio1= r.nextInt(5+1)+1;
		System.out.println("Dado 2: "+aleatorio1);
		int aleatorio2= r.nextInt(5+1)+1;
		System.out.println("Dado 3: "+aleatorio2);
		double media= (aleatorio+aleatorio1+aleatorio2)/3.0;
		media= Math.round(media*100.0)/100.0;
		System.out.println("Media: "+media);*/
		
		//EJERCICIO 7
		
		/*System.out.println("Introduce tu peso (Kg):");
		double peso= scDouble.nextDouble();
		peso= Math.round(peso*100.0)/100.0;
		System.out.println("Introduce tu altura (m):");
		double altura= scDouble.nextDouble();
		altura= Math.round(altura*100.0)/100.0;
		double imc= peso/Math.pow(altura,2);
		imc= Math.round(imc*100.0)/100.0;
		System.out.println("IMC: "+imc);
		System.out.println("IMC calculado correctamente");*/
		
		//EJERCICIO 8
		
		System.out.println("Introduzca su nombre:");
		String nombre= scLine.nextLine();
		System.out.println("Valore del 1 al 5 la usabilidad");
		int usabilidad= scInt.nextInt();
		System.out.println("Valore del 1 al 5 la diseño");
		int diseño= scInt.nextInt();
		System.out.println("Valore del 1 al 5 la rendimiento");
		int rendimiento= scInt.nextInt();
		double media= (usabilidad+diseño+rendimiento)/3.0;
		media= Math.round(media*100.0)/100.0;
		System.out.println("Media: "+media);
		double porcentaje= (media*100.0)/5.0;
		porcentaje= Math.round(porcentaje*100.0)/100.0;
		System.out.println("Porcentaje sobre 5: "+porcentaje+"%");
		
		
		
		
		
		
		
		
		
	}

}
