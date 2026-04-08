package paqEscribir;

import paqCoche.*;

import java.io.*;
import java.util.*;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Para guardar los datos hay que parsear los datos. Parsear es transformar los datos de los objetos en información que luego
		// vamos a grabar en un fichero de texto

		// Tiene baja portabilidad. Es decir, si lo creamos en binario tenemos que
		// exportarlo en binario

		// SERIALIZACIÓN: es convertir datos internos en un fichero binario
			// Escritura:
				// FileOutputStream: opera a bajo nivel. Abre el fichero y lo escribe en bites
				// ObjectOutputStream: opera a alto nivel. Convierte objetos en bites
			// Lectura:
				// FileInputStream: abre el fichero y lee bites
				// ObjectInputStream: lee los bites y los convierte en objetos

			// Para poder serializar nos apoyamos en la interfaz serializable. Esta interfaz no exige implementar ningún método
		
			List<Coche> lista = new ArrayList<>();

			Coche c0 = new Coche("1111BBB", "Seat", 100);
			Coche c1 = new Coche("2222CCC", "Opel", 110);
			Coche c2 = new Coche("3333DDD", "Citroen", 120);

			lista.add(c0);
			lista.add(c1);
			lista.add(c2);

			try (FileOutputStream fos = new FileOutputStream("coches.bin");
					ObjectOutputStream oos = new ObjectOutputStream(fos)) {
				
				oos.writeObject(lista);
				System.out.println("El fichero ha sido creado correctamente");
				
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
