package Videoclub;

import java.util.*;

public class OrdenarCodigo implements Comparator<Pelicula> {

	@Override
	public int compare(Pelicula o1, Pelicula o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o1.getCodigo(), o2.getCodigo());
	}

}
