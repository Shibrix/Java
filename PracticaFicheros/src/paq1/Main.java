package paq1;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.File;
import java.io.BufferedReader;
import java.io.BufferedWriter;

public class Main {
	static Scanner scLine = new Scanner(System.in);
	static Scanner scInt = new Scanner(System.in);
	static int opcion;
	static java.util.List<Contacto> contactos = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		cargarContactos();

		do {
			menu();
			opcion = scInt.nextInt();
			switch (opcion) {
			case 1:
				listarContactos();
				break;
			case 2:
				buscarContacto();
				break;
			case 3:
				introducirContacto();
				break;
			case 4:
				eliminarContacto();
				break;
			}
		} while (true);
	}

	private static void cargarContactos() {
		// TODO Auto-generated method stub
		File archivo = new File("contactos.csv");
		if (!archivo.exists()) {
			return;
		} else {
			try (FileReader fr = new FileReader(archivo); BufferedReader br = new BufferedReader(fr)) {
				String linea;
				while ((linea = br.readLine()) != null) {
					String atributos[] = linea.split(";");
					String nombre = atributos[0];
					String apellidos = atributos[1];
					int telefono = Integer.valueOf(atributos[2]);
					String email = atributos[3];

					Contacto cx = new Contacto(nombre, apellidos, telefono, email);
					contactos.add(cx);
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

	private static void menu() {
		// TODO Auto-generated method stub
		System.out.println("1. Listado de contactos\n" + "2. Buscar un contacto.\n"
				+ "3. Introducir un nuevo contacto.\n" + "4. Eliminar un contacto.");
	}

	private static void listarContactos() {
		// TODO Auto-generated method stub
			if(contactos.size()==0){
				System.out.println("No hay contactos que mostrar");
			}
			else {
				for(Contacto c:contactos) {					
			System.out.println(c.toString());
			}
		}
		System.out.println();
	}

	private static void buscarContacto() {
		// TODO Auto-generated method stub
		System.out.println("¿Cómo desea buscarlo?");
		System.out.println("1. Teléfono\n" + "2. Email");
		opcion = scInt.nextInt();
		switch (opcion) {
		case 1:
			buscarPorTelefono();
			break;
		case 2:
			buscarPorEmail();
			break;
		}
	}

	private static void buscarPorTelefono() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el número de teléfono");
		opcion = scInt.nextInt();
		boolean existe=false;
		for (Contacto c : contactos) {
			if (c.getTelefono() == opcion) {
				existe=true;
				System.out.println(c.toString()+"\n");				
				break;
			} 
		}
		if(existe==false){
			System.out.println("Lo sentimos, no se ha encontrado ningún contacto con ese teléfono\n");			
		}
	}

	private static void buscarPorEmail() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el email");
		String email = scLine.nextLine();
		boolean existe=false;
		for (Contacto c : contactos) {
			if (c.getEmail().equalsIgnoreCase(email)) {
				existe=true;
				System.out.println(c.toString()+"\n");
				break;
			} 
		}
		if(existe=false) {
				System.out.println("Lo sentimos, no se ha encontrado ningún contacto con ese email\n");
		}
	}

	private static void introducirContacto() {
		// TODO Auto-generated method stub
		System.out.println("Introduzca el nombre");
		String nombre = scLine.nextLine();
		System.out.println("Introduzca los apellidos");
		String apellidos = scLine.nextLine();
		System.out.println("Introduzca el teléfono");
		int telefono = scInt.nextInt();
		System.out.println("Introduzca el email");
		String email = scLine.nextLine();

		boolean existe = false;

		for (Contacto c : contactos) {
			if (c.getTelefono() == telefono && c.getEmail().equalsIgnoreCase(email)) {
				existe = true;
				System.out.println("Lo sentimos, ya existe un contacto con el teléfono y el email introducidos\n");
				break;
			}
			if (c.getTelefono() == telefono) {
				existe = true;
				System.out.println("Lo sentimos, ya existe un contacto con el teléfono introducido\n");
				break;
			}
			if (c.getEmail().equalsIgnoreCase(email)) {
				existe = true;
				System.out.println("Lo sentimos, ya existe un contacto con el email introducido\n");
				break;
			}
		}

		if (existe == false) {
			Contacto contacto = new Contacto(nombre, apellidos, telefono, email);
			contactos.add(contacto);
			try (FileWriter fw = new FileWriter("contactos.csv", true); PrintWriter pw = new PrintWriter(fw)) {
				pw.printf("%s;%s;%d;%s%n", nombre, apellidos, telefono, email);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Contacto añadido correctamente\n");
		}
	}

	private static void eliminarContacto() {
		// TODO Auto-generated method stub
		System.out.println("¿Qué contacto desea elminar?");
		for (int i = 0; i < contactos.size(); i++) {
			System.out.println((i + 1) + ".-" + contactos.get(i).toString());
		}
		opcion = scInt.nextInt();
		int eliminar = opcion - 1;
		contactos.remove(eliminar);

		try (FileWriter fw = new FileWriter("contactos.csv"); PrintWriter pw = new PrintWriter(fw)) {
			for (Contacto c : contactos) {
				pw.printf("%s;%s;%d;%s%n", c.getNombre(), c.getApellidos(), c.getTelefono(), c.getEmail());
			}

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Contacto eliminado correctamente\n");
	}
}
