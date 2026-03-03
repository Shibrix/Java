package src;

import java.util.Scanner;

import paqMultimedia.*;

public class Main {
	static Scanner scInt = new Scanner(System.in);
	static Scanner scLine = new Scanner(System.in);
	static Scanner scDouble = new Scanner(System.in);
	static Contenido contenido0 = null;
	static Contenido contenido1 = null;
	static Contenido contenido2 = null;
	static int hueco;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcion;

		do {
			System.out.println("=== GESTOR MULTIMEDIA ===\n" + "1) Crear/registrar contenido\n" + "2) Mostrar ficha\n"
					+ "3) Mostrar detalle\n" + "4) Reproducir\n" + "5) Descargar\n" + "6) Calcular coste mensual\n"
					+ "7) Vaciar hueco\n" + "0) Salir\n Opción elegida:");
			opcion = scInt.nextInt();
			switch (opcion) {
			case 1:
				crearContenido();
				break;
			case 2:
				mostrarFicha();
				break;
			case 3:
				mostrarDetalle();
				break;
			case 4:
				reproducible();
				break;
			case 5:
				descargable();
				break;
			case 6:
				costeMensual();
				break;
			case 7:
				vaciarHueco();
				break;
			case 0:
				break;
			}

		} while (opcion != 0);
		System.out.println("Ha salido correctamente");
	}

	

	private static void crearContenido() {
		// TODO Auto-generated method stub
		System.out.println("Hueco (1-3)");
		hueco = scInt.nextInt();
		boolean premium0;
		if (hueco == 1) {
			if (contenido0 != null) {
				System.out.println("No se puede guardar contenido, el hueco ya está en uso");
			} else {
				System.out.println("Tipo (1=Pelicula, 2=Podcast, 3=Curso)\nElige tipo");
				int tipo = scInt.nextInt();

				if (tipo == 1) {
					System.out.println("ID:\n");
					String id = scLine.nextLine();
					System.out.println("Título: \n");
					String titulo = scLine.nextLine();
					if (titulo == "") {
						System.out.println("El título no puede estar vacío");
					}
					System.out.println("Año: \n");
					int anio = scInt.nextInt();
					if (anio == 0) {
						System.out.println("El año no puede estar vacío");
					}
					System.out.println("Premium (s/n)\n");
					String premium1 = scLine.nextLine();
					if (premium1.equalsIgnoreCase("s")) {
						premium0 = true;
					} else {
						premium0 = false;
					}
					System.out.println("Director: \n");
					String director = scLine.nextLine();
					System.out.println("Duración (min): \n");
					int duracion = scInt.nextInt();
					if (duracion <= 0) {
						System.out.println("La duración ha de ser superior a 0");
					}
					System.out.println("Calidad (GB): \n");
					double calidad = scDouble.nextDouble();

					contenido0 = new Pelicula(id, titulo, anio, premium0, director, duracion, calidad);

					System.out.println("Contenido guardado en el hueco 1");
				}
				if (tipo == 2) {
					System.out.println("ID:\n");
					String id = scLine.nextLine();
					System.out.println("Título: \n");
					String titulo = scLine.nextLine();
					if (titulo == "") {
						System.out.println("El título no puede estar vacío");
					}
					System.out.println("Año: \n");
					int anio = scInt.nextInt();
					if (anio == 0) {
						System.out.println("El año no puede estar vacío");
					}
					System.out.println("Premium (s/n)\n");
					String premium1 = scLine.nextLine();
					if (premium1.equalsIgnoreCase("s")) {
						premium0 = true;
					} else {
						premium0 = false;
					}
					System.out.println("Anfitrión: \n");
					String anfitrion = scLine.nextLine();
					System.out.println("Episodios: \n");
					int episodios = scInt.nextInt();
					System.out.println("Duración episodios (min): \n");
					int duracionEpisodios = scInt.nextInt();

					contenido0 = new Podcast(id, titulo, anio, premium0, anfitrion, episodios, duracionEpisodios);

					System.out.println("Contenido guardado en el hueco 1");
				}
				if (tipo == 3) {
					System.out.println("ID:\n");
					String id = scLine.nextLine();
					System.out.println("Título: \n");
					String titulo = scLine.nextLine();
					if (titulo == "") {
						System.out.println("El título no puede estar vacío");
					}
					System.out.println("Año: \n");
					int anio = scInt.nextInt();
					if (anio == 0) {
						System.out.println("El año no puede estar vacío");
					}
					System.out.println("Premium (s/n)\n");
					String premium1 = scLine.nextLine();
					if (premium1.equalsIgnoreCase("s")) {
						premium0 = true;
					} else {
						premium0 = false;
					}
					System.out.println("Plataforma: \n");
					String plataforma = scLine.nextLine();
					System.out.println("Horas: \n");
					int horas = scInt.nextInt();
					System.out.println("MB: \n");
					double MB = scDouble.nextDouble();

					contenido0 = new CursoOnline(id, titulo, anio, premium0, plataforma, horas, MB);

					System.out.println("Contenido guardado en el hueco 1");
				}
			}
		}
		if (hueco == 2) {
			if (contenido1 != null) {
				System.out.println("No se puede crear contenido, el hueco ya está en uso");
			} else {
				System.out.println("Tipo (1=Pelicula, 2=Podcast, 3=Curso)\nElige tipo");
				int tipo = scInt.nextInt();

				if (tipo == 1) {
					System.out.println("ID:\n");
					String id = scLine.nextLine();
					System.out.println("Título: \n");
					String titulo = scLine.nextLine();
					if (titulo == "") {
						System.out.println("El título no puede estar vacío");
					}
					System.out.println("Año: \n");
					int anio = scInt.nextInt();
					if (anio == 0) {
						System.out.println("El año no puede estar vacío");
					}
					System.out.println("Premium (s/n)\n");
					String premium1 = scLine.nextLine();
					if (premium1.equalsIgnoreCase("s")) {
						premium0 = true;
					} else {
						premium0 = false;
					}
					System.out.println("Director: \n");
					String director = scLine.nextLine();
					System.out.println("Duración (min): \n");
					int duracion = scInt.nextInt();
					if (duracion <= 0) {
						System.out.println("La duración ha de ser superior a 0");
					}
					System.out.println("Calidad (GB): \n");
					double calidad = scDouble.nextDouble();

					contenido1 = new Pelicula(id, titulo, anio, premium0, director, duracion, calidad);

					System.out.println("Contenido guardado en el hueco 2");
				}
				if (tipo == 2) {
					System.out.println("ID:\n");
					String id = scLine.nextLine();
					System.out.println("Título: \n");
					String titulo = scLine.nextLine();
					if (titulo == "") {
						System.out.println("El título no puede estar vacío");
					}
					System.out.println("Año: \n");
					int anio = scInt.nextInt();
					if (anio == 0) {
						System.out.println("El año no puede estar vacío");
					}
					System.out.println("Premium (s/n)\n");
					String premium1 = scLine.nextLine();
					if (premium1.equalsIgnoreCase("s")) {
						premium0 = true;
					} else {
						premium0 = false;
					}
					System.out.println("Anfitrión: \n");
					String anfitrion = scLine.nextLine();
					System.out.println("Episodios: \n");
					int episodios = scInt.nextInt();
					System.out.println("Duración episodios (min): \n");
					int duracionEpisodios = scInt.nextInt();

					contenido1 = new Podcast(id, titulo, anio, premium0, anfitrion, episodios, duracionEpisodios);

					System.out.println("Contenido guardado en el hueco 2");
				}
				if (tipo == 3) {
					System.out.println("ID:\n");
					String id = scLine.nextLine();
					System.out.println("Título: \n");
					String titulo = scLine.nextLine();
					if (titulo == "") {
						System.out.println("El título no puede estar vacío");
					}
					System.out.println("Año: \n");
					int anio = scInt.nextInt();
					if (anio == 0) {
						System.out.println("El año no puede estar vacío");
					}
					System.out.println("Premium (s/n)\n");
					String premium1 = scLine.nextLine();
					if (premium1.equalsIgnoreCase("s")) {
						premium0 = true;
					} else {
						premium0 = false;
					}
					System.out.println("Plataforma: \n");
					String plataforma = scLine.nextLine();
					System.out.println("Horas: \n");
					int horas = scInt.nextInt();
					System.out.println("MB: \n");
					double MB = scDouble.nextDouble();

					contenido1 = new CursoOnline(id, titulo, anio, premium0, plataforma, horas, MB);

					System.out.println("Contenido guardado en el hueco 2");
				}
			}
		}
		if (hueco == 3) {
			if (contenido2 != null) {
				System.out.println("No se puede crear contenido, el hueco ya está en uso");
			} else {
				System.out.println("Tipo (1=Pelicula, 2=Podcast, 3=Curso)\nElige tipo");
				int tipo = scInt.nextInt();

				if (tipo == 1) {
					System.out.println("ID:\n");
					String id = scLine.nextLine();
					System.out.println("Título: \n");
					String titulo = scLine.nextLine();
					if (titulo == "") {
						System.out.println("El título no puede estar vacío");
					}
					System.out.println("Año: \n");
					int anio = scInt.nextInt();
					if (anio == 0) {
						System.out.println("El año no puede estar vacío");
					}
					System.out.println("Premium (s/n)\n");
					String premium1 = scLine.nextLine();
					if (premium1.equalsIgnoreCase("s")) {
						premium0 = true;
					} else {
						premium0 = false;
					}
					System.out.println("Director: \n");
					String director = scLine.nextLine();
					System.out.println("Duración (min): \n");
					int duracion = scInt.nextInt();
					if (duracion <= 0) {
						System.out.println("La duración ha de ser superior a 0");
					}
					System.out.println("Calidad (GB): \n");
					double calidad = scDouble.nextDouble();

					contenido2 = new Pelicula(id, titulo, anio, premium0, director, duracion, calidad);

					System.out.println("Contenido guardado en el hueco 3");
				}
				if (tipo == 2) {
					System.out.println("ID:\n");
					String id = scLine.nextLine();
					System.out.println("Título: \n");
					String titulo = scLine.nextLine();
					if (titulo == "") {
						System.out.println("El título no puede estar vacío");
					}
					System.out.println("Año: \n");
					int anio = scInt.nextInt();
					if (anio == 0) {
						System.out.println("El año no puede estar vacío");
					}
					System.out.println("Premium (s/n)\n");
					String premium1 = scLine.nextLine();
					if (premium1.equalsIgnoreCase("s")) {
						premium0 = true;
					} else {
						premium0 = false;
					}
					System.out.println("Anfitrión: \n");
					String anfitrion = scLine.nextLine();
					System.out.println("Episodios: \n");
					int episodios = scInt.nextInt();
					System.out.println("Duración episodios (min): \n");
					int duracionEpisodios = scInt.nextInt();

					contenido2 = new Podcast(id, titulo, anio, premium0, anfitrion, episodios, duracionEpisodios);

					System.out.println("Contenido guardado en el hueco 3");
				}
				if (tipo == 3) {
					System.out.println("ID:\n");
					String id = scLine.nextLine();
					System.out.println("Título: \n");
					String titulo = scLine.nextLine();
					if (titulo == "") {
						System.out.println("El título no puede estar vacío");
					}
					System.out.println("Año: \n");
					int anio = scInt.nextInt();
					if (anio == 0) {
						System.out.println("El año no puede estar vacío");
					}
					System.out.println("Premium (s/n)\n");
					String premium1 = scLine.nextLine();
					if (premium1.equalsIgnoreCase("s")) {
						premium0 = true;
					} else {
						premium0 = false;
					}
					System.out.println("Plataforma: \n");
					String plataforma = scLine.nextLine();
					System.out.println("Horas: \n");
					int horas = scInt.nextInt();
					System.out.println("MB: \n");
					double MB = scDouble.nextDouble();

					contenido2 = new CursoOnline(id, titulo, anio, premium0, plataforma, horas, MB);

					System.out.println("Contenido guardado en el hueco 3");
				}
			}
		}

	}

	private static void mostrarFicha() {
		// TODO Auto-generated method stub
		System.out.println("Hueco (1-3)");
		hueco = scInt.nextInt();
		if (hueco == 1) {
			if (contenido0 != null) {
				System.out.println(contenido0.ficha());
			} else {
				System.out.println("No se han guardado datos en este hueco");
			}
		}
		if (hueco == 2) {
			if (contenido1 != null) {
				System.out.println(contenido1.ficha());
			} else {
				System.out.println("No se han guardado datos en este hueco");
			}
		}
		if (hueco == 3) {
			if (contenido2 != null) {
				System.out.println(contenido2.ficha());
			} else {
				System.out.println("No se han guardado datos en este hueco");
			}
		}
	}

	private static void mostrarDetalle() {
		// TODO Auto-generated method stub
		System.out.println("Hueco (1-3)");
		hueco = scInt.nextInt();
		if (hueco == 1) {
			if (contenido0 != null) {
				contenido0.mostrarDetalle();
			} else {
				System.out.println("No hay contenido para mostrar");
			}
		}
		if (hueco == 2) {
			if (contenido1 != null) {
				contenido1.mostrarDetalle();
			} else {
				System.out.println("No hay contenido para mostrar");
			}
		}
		if (hueco == 3) {
			if (contenido2 != null) {
				contenido2.mostrarDetalle();
			} else {
				System.out.println("No hay contenido para mostrar");
			}
		}
	}

	private static void reproducible() {
		// TODO Auto-generated method stub
		System.out.println("Hueco (1-3)");
		hueco = scInt.nextInt();
		if (hueco == 1) {
			if (contenido0 instanceof Reproducible) {
				((Reproducible) contenido0).reproducir();
				System.out.println("Duración (segundos): " + ((Reproducible) contenido0).duracionSegundos());

			} else if (contenido0 == null) {
				System.out.println("El hueco se encuentra vacío");
			} else {
				System.out.println("El contenido no es reproducible");
			}
		}
		if (hueco == 2) {
			if (contenido1 instanceof Reproducible) {
				((Reproducible) contenido1).reproducir();
				System.out.println("Duración (segundos): " + ((Reproducible) contenido1).duracionSegundos());
			} else if (contenido1 == null) {
				System.out.println("El hueco se encuentra vacío");
			} else {
				System.out.println("El contenido no es reproducible");
			}
		}
		if (hueco == 3) {
			if (contenido2 instanceof Reproducible) {
				((Reproducible) contenido2).reproducir();
				System.out.println("Duración (segundos): " + ((Reproducible) contenido2).duracionSegundos());
			} else if (contenido2 == null) {
				System.out.println("El hueco se encuentra vacío");
			} else {
				System.out.println("El contenido no es reproducible");
			}
		}
	}

	private static void descargable() {
		// TODO Auto-generated method stub
		System.out.println("Hueco (1-3)");
		hueco = scInt.nextInt();
		if (hueco == 1) {
			if (contenido0 instanceof Descargable) {
				((Descargable) contenido0).descargar();
				System.out.println("(" + ((Descargable) contenido0).tamanioMB() + " MB)");

			} else if (contenido0 == null) {
				System.out.println("El hueco se encuentra vacío");
			} else {
				System.out.println("El contenido no es descargable");
			}
		}
		if (hueco == 2) {
			if (contenido1 instanceof Descargable) {
				((Descargable) contenido1).descargar();
				System.out.println("(" + ((Descargable) contenido1).tamanioMB() + " MB)");

			} else if (contenido1 == null) {
				System.out.println("El hueco se encuentra vacío");
			} else {
				System.out.println("El contenido no es descargable");
			}
		}
		if (hueco == 3) {
			if (contenido2 instanceof Descargable) {
				((Descargable) contenido2).descargar();
				System.out.println("(" + ((Descargable) contenido2).tamanioMB() + " MB)");

			} else if (contenido2 == null) {
				System.out.println("El hueco se encuentra vacío");
			} else {
				System.out.println("El contenido no es descargable");
			}
		}
	}

	private static void costeMensual() {
		// TODO Auto-generated method stub
		System.out.println("Hueco (1-3)");
		hueco = scInt.nextInt();
		if (hueco == 1) {
			if (contenido0 != null) {
				System.out.println("Coste mensual: " + contenido0.costeMensual() + "€");
			} else {
				System.out.println("No se han guardado datos en este hueco");
			}
		}
		if (hueco == 2) {
			if (contenido1 != null) {
				System.out.println("Coste mensual: " + contenido1.costeMensual() + "€");
			} else {
				System.out.println("No se han guardado datos en este hueco");
			}
		}
		if (hueco == 3) {
			if (contenido2 != null) {
				System.out.println("Coste mensual: " + contenido2.costeMensual() + "€");
			} else {
				System.out.println("No se han guardado datos en este hueco");
			}
		}
	}

	private static void vaciarHueco() {
		// TODO Auto-generated method stub
		System.out.println("Hueco (1-3)");
		hueco = scInt.nextInt();
		if (hueco == 1) {
			if (contenido0 != null) {
				contenido0 = null;
				System.out.println("El hueco 1 ha sido vaciado");
			}
		}
		if (hueco == 2) {
			if (contenido1 != null) {
				contenido1 = null;
				System.out.println("El hueco 1 ha sido vaciado");
			}
		}
		if (hueco == 3) {
			if (contenido2 != null) {
				contenido0 = null;
				System.out.println("El hueco 1 ha sido vaciado");
			}

		}
	}

}
