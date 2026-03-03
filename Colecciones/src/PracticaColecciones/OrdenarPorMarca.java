package PracticaColecciones;

import java.util.*;

public class OrdenarPorMarca implements Comparator<Coche> {
	@Override
	public int compare(Coche o1, Coche o2) {
		int dev = o1.getMarca().compareTo(o2.getMarca());
		return dev;
	}
}
