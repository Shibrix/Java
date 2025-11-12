package Constructores;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	//	EJERCICIO: hacer la clase mascota y crear dos objetos mascota usando 2 constructores diferentes
		
		Mascota mascota0 = new Mascota("Perro", "Negro", 2, false);		
		//TAMBIÉN PODEMOS GUARDAR EL ATRIBUTO EN UNA VARIABLE Y PASARLE LA VARIABLE COMO PARÁMETRO
		String especie1= "Hamster";
		Mascota mascota1 = new Mascota(especie1, "Gris", 1);		
		Mascota mascota2= new Mascota(); //DE ESTA MANERA PODEMOS FIJAR LOS VALORES CON SET
		mascota0.setEdad(3);
		
		//el Mascota mascota0 es la declaración de la mascota
		//El new Mascota() es una instancia. Es decir, lo estamos creando.
		//Además el new Mascota() es un constructor, que por defecto viene vacío		
		
	// EJERCICIO: crear la clase Persona y crear un objeto Persona
		
		Persona persona0= new Persona("Ruth", "Velázquez", "ruth@gmail.com");
		Mascota mascota3= new Mascota("Pez", 1, persona0);
		
		//¿Cómo accedemos al nombre del dueño de la mascota 3?
		
		System.out.println("El nombre del dueño de la mascota 3 es "+mascota3.getDuenio().getNombre());
		
		//Otro ejemplo obteniendo nombre y email del dueño
		
		Persona persona1 = new Persona("María", "Díaz", "mdiaz@gmail.com");

		Mascota mascota5 = new Mascota("Canario", 3, persona1);

		System.out.println("El nombre de la dueña de la mascota 5 es " + mascota5.getDuenio().getNombre()
				+ ", y su email es " + mascota5.getDuenio().getEmail());
		
		
		
		
		

	}

}
