package MiniBingo;
import java.util.*;
public class Bombo {
	Random r = new Random();
	Scanner sc = new Scanner(System.in);
	
	private int bola;

	public int getBola() {
		return bola;
	}

	public void setBola(int bola) {
		this.bola = bola;
	}

	public int sacarBola() {	
		System.out.println("\n");
		System.out.println("Pulsa ENTER para sacar una bola");
		sc.nextLine();
		int nuevaBola;

		do {
			nuevaBola = r.nextInt(1, 21);

		} while (this.bola == nuevaBola);

		this.bola= nuevaBola;

		System.out.println("Ha salido la bola " + nuevaBola + "\n");
		return bola;

	}
		
	
	
	
	
	
	
}
