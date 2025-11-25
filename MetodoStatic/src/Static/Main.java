package Static;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jugador jugador0= new Jugador("Pedro", 10, "delantero", 1.73, 88);
		Jugador jugador1= new Jugador("Mario", 5, "defensa", 1.92, 87);
		
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

	}

}
