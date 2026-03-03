package PracticaColecciones;

import java.util.*;

public class OrdenarPorPotencia implements Comparator<Coche> {
	@Override
	public int compare(Coche o1, Coche o2) {
		int dev = Integer.compare(o1.getPotencia(), o2.getPotencia());
		return dev;
	}
}
