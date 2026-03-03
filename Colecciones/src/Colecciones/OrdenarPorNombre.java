package Colecciones;
import java.util.Comparator;

public class OrdenarPorNombre implements Comparator<Coche1>{

	@Override
	public int compare(Coche1 o1, Coche1 o2) {
		// TODO Auto-generated method stub
		return o1.getMarca().compareTo(o2.getMarca());
		
	}
	
	

}
