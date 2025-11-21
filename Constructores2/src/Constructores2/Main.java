package Constructores2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Atraccion a1= new Atraccion("El tren de la bruja", 5, true, 6);
		
		Atraccion a2= new Atraccion("La olla loca", 6, false, 3);
		
		//HABIENDO CREADO EL MÉTODO TO STRING, PODEMOS HACER EL SYSO SIMPLEMENTE PONIENDO EL NOMBRE DEL OBJETO. YA NO HACE FALTA
		//USAR LOS GETTER PARA PINTARLO
		
//		System.out.println(a1);
//		System.out.println(a2);
//		
//		a1.formatoSinPublico();
//		
//		//SI SÓLO TENEMOS UN MÉTODO TO STRING, NO HACE FALTA PONER OBJETO.TO STRING. PERO SI TENEMOS VARIOS, HAY QUE PONERLO PARA SABER
//		//CUÁL TIENE QUE USAR
//		System.out.println(a1.toStringSinPrecio());
//		
//		a2.formatoSoloRiesgo();
		
		
		
//EJERCICIO PERSONAS
		
		Persona p0= new Persona("Ruth", "Velázquez", "11111111E", false);
		Persona p1= new Persona("Cristian", "Devolx", "22222222A", true);
		
		System.out.println(p0);
		System.out.println(p1);
		
		
		
		
		
		
		

	}

}
