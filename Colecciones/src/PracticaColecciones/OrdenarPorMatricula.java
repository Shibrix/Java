package PracticaColecciones;

import java.util.*;

public class OrdenarPorMatricula implements Comparator<Coche> {

	@Override
	public int compare(Coche o1, Coche o2) {
		int dev = o1.getMatricula().compareTo(o2.getMatricula());
		return dev;
	}

}
