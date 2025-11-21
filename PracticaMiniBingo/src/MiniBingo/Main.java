package MiniBingo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador jugador1 = new Jugador("Pedro");
		Jugador jugador2 = new Jugador("María");
		Jugador jugador3 = new Jugador("Luis");
		Jugador jugador4 = new Jugador("Sonia");
		Jugador jugador5 = new Jugador("Pablo");

		jugador1.asignarCarton();
		jugador2.asignarCarton();
		jugador3.asignarCarton();
		jugador4.asignarCarton();
		jugador5.asignarCarton();

		Bombo bola = new Bombo();

		do {
			int bolaSacada = bola.sacarBola();

			jugador1.comprobarBola(bolaSacada);
			jugador2.comprobarBola(bolaSacada);
			jugador3.comprobarBola(bolaSacada);
			jugador4.comprobarBola(bolaSacada);
			jugador5.comprobarBola(bolaSacada);

			
			if (jugador1.esGanador()) {
				System.out.println("El jugador " + jugador1.getNombre() + " ha ganado la partida");
				System.out.println("\n");
				break;
			}
			if (jugador2.esGanador()) {
				System.out.println("El jugador " + jugador2.getNombre() + " ha ganado la partida");
				System.out.println("\n");
				break;
			}
			if (jugador3.esGanador()) {
				System.out.println("El jugador " + jugador3.getNombre() + " ha ganado la partida");
				System.out.println("\n");
				break;
			}
			if (jugador4.esGanador()) {
				System.out.println("El jugador " + jugador4.getNombre() + " ha ganado la partida");
				System.out.println("\n");
				break;
			}
			if (jugador5.esGanador()) {
				System.out.println("El jugador " + jugador5.getNombre() + " ha ganado la partida");
				System.out.println("\n");
				break;
			}

		} while (!jugador1.esGanador() || !jugador2.esGanador() || jugador3.esGanador() || jugador4.esGanador()
				|| jugador5.esGanador());
		System.out.println("La partida ha finalizado");
	}

}
