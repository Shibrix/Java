package paq1;

import java.io.BufferedWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File f0 = new File("miFichero.txt");

		File f1 = new File("src/paq1");// Hay que especificar la ruta relativa

		String archivos[] = f1.list();// Lo metemos en un array para mostrar los archivos que hay dentro de la ruta de
										// antes

		System.out.println(Arrays.toString(archivos));

		for (int i = 0; i < archivos.length; i++) {
			System.out.println(archivos[i]);
		}

		File f2 = new File("src/paq1/Coche.java");

		boolean existe = f2.exists();// Vemos si el fichero existe

		System.out.println(existe);

		if (f2.exists()) {
			System.out.println("Nombre del fichero: " + f2.getName());
			System.out.println("Ruta relativa: " + f2.getPath());
			System.out.println("Ruta absoluta: " + f2.getAbsolutePath());
			System.out.println("¿Se puede leer?: " + f2.canRead());
			System.out.println("¿Se puede escribir?: " + f2.canWrite());
			System.out.println("Tamaño de fichero: " + f2.length() + " Bites");
			System.out.println("¿Es un directorio?: " + f2.isDirectory());
			System.out.println("¿Es un fichero?: " + f2.isFile());

		} else {
			System.out.println("El fichero no existe");
		}

		// Creamos un directorio
		File f3 = new File("NUEVO_DIR");
		f3.mkdir();

		File f4 = new File(f3, "MiFichero.txt");
		try {
			f4.createNewFile();// Aquí da error porque el programa ya entra a disco y es OBLIGATORIO hacer un
								// try_catch
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("FICHEROS DE TEXTO");
		// Son ficheros que se pueden leer, hay binarios también
		// Las excepciones tienen que hacerse con Try with resources (hace codigo más
		// limpio y el cierre es automático)
		// Pueden tener datos simples o registros estructurados (objetos con atributos)

		// ***LEER***
		System.out.println("---LEER UN FICHERO-----");
		System.out.println("---LEER UN FICHERO con FileReader-----");
		// FileReader lee caracteres individuales

		// creas primero el FileReader y dará error, lo select.y poner source,
		// surroundwith, try with resources
		try (FileReader fr = new FileReader("src/paq1/Coche.java")) {
			int c;
			while ((c = fr.read()) != -1) {

				System.out.print((char) c); // castear el c para que salga letras y no el numero caracter
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// BufferReader lee lineas + usado
		System.out.println("---LEER UN FICHERO-----");
		System.out.println("---LEER UN FICHERO con BufferReader-----");

		try (FileReader fr = new FileReader("src/paq1/Coche.java"); BufferedReader br = new BufferedReader(fr)) {
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("probamos con el fichero MiFichero.txt");

		// BufferReader lee lineas + usado

		try (FileReader fr = new FileReader("NUEVO_DIR/MiFichero.txt"); BufferedReader br = new BufferedReader(fr)) {
			String linea;
			while ((linea = br.readLine()) != null) {
				System.out.println(linea);
				String atributos[] = linea.split(";");

				System.out.println(atributos[0]);
				System.out.println(atributos[1]);
				System.out.println(atributos[2]);

				String matricula = atributos[0];
				String marca = atributos[1];
				int potencia = Integer.valueOf(atributos[2]);
				Coche cx = new Coche(matricula, marca, potencia);
				System.out.println(cx);

			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\nEscribiendo fichero con FileWriter");

		try (FileWriter fw = new FileWriter("NUEVO_DIR/MiFichero2.txt");) {
			// Si ponemos un fichero ya existente, machaca la información. Si al lado del
			// fichero existente ponemos true, simplemente le añade información
			fw.write("hola\n");
			fw.write("adiós\n");
			fw.write("hola de nuevo");

			System.out.println("Fichero escrito");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("\nEscribiendo con BufferedWriter");

		try (FileWriter fw = new FileWriter("NUEVO_DIR/MiFichero3.txt"); BufferedWriter bw = new BufferedWriter(fw)) {
			bw.write("Esta es una línea de mi fichero");
			bw.newLine();
			bw.write("Esta es una nueva línea");
			System.out.println("Fichero escrito");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println("Guardar un objeto en fichero con formato CSV");
		try (FileWriter fw = new FileWriter("NUEVO_DIR/Datos.csv"); PrintWriter pw = new PrintWriter(fw)) {
			Coche cx = new Coche("1234CBD", "Seat", 120);

			String matricula = cx.getMatricula();
			String marca = cx.getMarca();
			int potencia = cx.getPotencia();

			pw.printf("%s;%s;%d", matricula, marca, potencia);

			System.out.println("Fichero escrito");

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
