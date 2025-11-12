package Clases;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Coche coche0 = new Coche(); //Esto son objetos
		Coche coche1 = new Coche();
		Coche coche2 = new Coche();
		
//		coche0.marca= "Seat"; //Esto son atributos concretos del objeto
//		coche0.matricula="1111AAA";
//		coche0.modelo="Ibiza";
//		coche0.potencia= 90;
//		
//		coche1.marca= "Citroen";
//		coche1.matricula="222CCC";
//		coche1.modelo="C5";
//		coche1.potencia= 100;
//		
//		coche2.marca= "Opel";
//		coche2.matricula="3333BBB";
//		coche2.modelo="Astra";
//		coche2.potencia= 110;
		
		//System.out.println("La matrícula de coche 0 es "+coche0.matricula);
		
//		coche0.setMatricula("1111BBB");
//		coche1.setMatricula("2222CCC");
//		coche2.setMatricula("3333AAA");
//		
//		System.out.println("La matrícula de coche 0 es "+coche0.getMatricula());
		//coche0.setPotencia(100);
		//int nuevaPot= coche0.aumentarPotencia();
		//System.out.println(nuevaPot); //Se puede meter el coche0.aumentarPotencia() directamente, no hace falta guardarlo en variable
		//System.out.println(coche0.getPotencia());
		coche0.aumentarPotencia();
		coche0.aumentarPotencia();
		coche0.aumentarPotencia();
		
		int potenciaExtra=17;
		
		coche0.aumentarPotenciaFijada(potenciaExtra);
		System.out.println(coche0.getPotencia());
		
//		coche0.aumentarPotenciaFijadaConNombre(potenciaExtra, "Jaime");//Estos parámetros han de pasarse en el mismo orden que lo
		//hayamos configurado en el método
		
		coche0.aumentarPotenciaFijadaConNombre(potenciaExtra, "Jaime");
		
		
		
		
		
		
		
		
		
		
		
	//EJERCICIO:
		//hacer proyecto nuevo con una clase que se llame Persona que tenga los atributos dni, nombre y edad
		//hacer los getter y setter
		//Crear 2 objetos persona en el main. Darles valores y mostrarlos
		
//		Persona persona1= new Persona();
//		Persona persona2= new Persona();
//		
//		persona1.setDni("11111111A");		
//		persona1.setNombre("Ruth");		
//		persona1.setEdad(29);
//		
//		System.out.println("El DNI, nombre y edad de la persona 1 es "+persona1.getDni()+", "+persona1.getNombre()+", "+persona1.getEdad());
//		
//		persona2.setDni("22222222B");
//		persona2.setNombre("Cristian");	
//		persona2.setEdad(38);		
//		
//		System.out.println("El DNI, nombre y edad de la persona 2 es "+persona2.getDni()+", "+persona2.getNombre()+", "+persona2.getEdad());
//		
		
		
		
		
	}

}
