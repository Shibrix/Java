package Colecciones;
import java.util.*;
public class OrdenarPorPotencia implements Comparator<Coche1>{

	@Override
	public int compare(Coche1 o1, Coche1 o2) {
		
		return Integer.compare(o1.getPotencia(), o2.getPotencia());
		
		
	}



}
