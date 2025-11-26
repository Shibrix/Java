package Static;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador jugador0= new Jugador("Pedro", 10, "delantero", 1.73, 88);
		Jugador jugador1= new Jugador("Mario", 5, "defensa", 1.92, 87);
		
		Jugador.equipo="Barcelona"; //esto hace referencia al static, y ponemos directamente el nombre de la Clase
		
		double pesoBizcocho= 1.5;			
		jugador0.aumentarPeso(pesoBizcocho);
		jugador0.aumentarPeso(pesoBizcocho);
		
		double pesoEnsalada= 0.4;		
		jugador1.aumentarPeso(pesoEnsalada);
		
		double IMCJugador= jugador0.calculoIMC();
		System.out.println(jugador0.getNombre()+", te has descuidado mucho. Tu IMC ahora es de "+IMCJugador+". Ahora te"
				+ " vamos a degradar a "+jugador0.getPosicion());
		
	
		jugador1.posicionSiConvocado(jugador1.seConvoca());
		
		System.out.println(jugador0.getNombre()+", ahora pesas "+jugador0.getPeso()+" por lo que "+	jugador0.posicionSiConvocado(jugador0.seConvoca()));
		
		Entrenador e0= new Entrenador("Alberto", 49, jugador1);
		//Aquí le pasamos el nombre del entrenador, su edad y su jugador favorito
		
		e0.opinionEntrenador();
		
	//STATIC
		Jugador.cambiarEquipo("Espanyol"); // aunque nosotros pongamos jugador0 o jugador1, se está aplicando a todos los objetos Jugador		
		

	}
	

}
