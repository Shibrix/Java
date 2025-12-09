
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Restaurante r0 = new Restaurante("Tagliatela", "Italiano", 1, true);
		Restaurante r1 = new Restaurante("Foster", "Americano", 2, false);
		
		//Con el to String evitamos que al imprimir el objeto salga feo (con la zona de memoria y el nombre de la clase)
		System.out.println(r0.toString());//Ambas cosas hacen lo mismo
		System.out.println(r1);
		
		r0.ganarEstrella();
		
		System.out.println(r0);

	}

}
