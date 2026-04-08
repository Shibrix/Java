package paqLeer;

import paqCoche.*;
import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Coche> lista = new ArrayList<>();
		Set<Coche> lista0= new HashSet<>();
		
		try (FileInputStream fis = new FileInputStream("coches.bin");
				ObjectInputStream ois = new ObjectInputStream(fis)) {
				lista=(List<Coche>)ois.readObject(); //Aquí da error porque llama a la superclase, por lo que hay que castearlo
				//Al castearlo seguirá dando error. Simplemente borramos el IO del catch
				System.out.println("Fichero leído correctamente\n");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Coche c : lista) {
			System.out.println(c);//Si hemos creado el toString, no hace falta ponerlo como tal. Con poner simplemente el objeto sirve
		}		
	
		
		//EJERCICIO: Modificar para trabajar con un HashSet
		
		
		try (FileInputStream fis0 = new FileInputStream("coches.bin");
				ObjectInputStream ois0 = new ObjectInputStream(fis0)) {
			lista0= (Set<Coche>)ois0.readObject();
			System.out.println("Fichero leído correctamente");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for(Coche c: lista0) {
			System.out.println(c);
		}
		
		
		
		
		
		

	}

}
