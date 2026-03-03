package PracticaColecciones;

import java.util.*;

public class OrdenarPorDias implements Comparator<Coche> {
	@Override
	public int compare(Coche o1, Coche o2) {
		int dev = Integer.compare(o1.getDiasAlquilados(), o2.getDiasAlquilados());
		return dev;
	}
}
