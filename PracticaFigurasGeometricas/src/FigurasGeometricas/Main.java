package FigurasGeometricas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// CILINDRO

		Cilindro cilindro1 = new Cilindro();
		Cilindro cilindro2 = new Cilindro();
		Cilindro cilindro3 = new Cilindro();

		cilindro1.setTamanio("pequeño");
		cilindro1.setAltura(1);
		cilindro1.setRadio(1);

		cilindro1.asignarColor();

		System.out.println("La superficie del cilindro " + cilindro1.getTamanio() + " y color " + cilindro1.getColor()
				+ " es de " + cilindro1.Superficie());
		System.out.println("El volumen del cilindro " + cilindro1.getTamanio() + " y color " + cilindro1.getColor()
				+ " es de " + cilindro1.Volumen() + "\n");

		cilindro2.setTamanio("mediano");
		cilindro2.setAltura(2);
		cilindro2.setRadio(2);

		cilindro2.asignarColor();

		System.out.println("La superficie del cilindro " + cilindro2.getTamanio() + " y color " + cilindro2.getColor()
				+ " es de " + cilindro2.Superficie());
		System.out.println("El volumen del cilindro " + cilindro2.getTamanio() + " y color " + cilindro2.getColor()
				+ " es de " + cilindro2.Volumen() + "\n");

		cilindro3.setTamanio("grande");
		cilindro3.setAltura(3);
		cilindro3.setRadio(3);

		cilindro3.asignarColor();

		System.out.println("La superficie del cilindro " + cilindro3.getTamanio() + " y color " + cilindro3.getColor()
				+ " es de " + cilindro3.Superficie());
		System.out.println("El volumen del cilindro " + cilindro3.getTamanio() + " y color " + cilindro3.getColor()
				+ " es de " + cilindro3.Volumen() + "\n");

		// ESFERA

		Esfera esfera1 = new Esfera();
		Esfera esfera2 = new Esfera();
		Esfera esfera3 = new Esfera();

		esfera1.setTamanio("pequeña");
		esfera1.setRadio(1);

		esfera1.asignarColor();

		System.out.println("La superficie de la esfera " + esfera1.getTamanio() + " y color " + esfera1.getColor()
				+ " es de " + esfera1.Superficie());
		System.out.println("El volumen de la esfera " + esfera1.getTamanio() + " y color " + esfera1.getColor()
				+ " es de " + esfera1.Volumen() + "\n");

		esfera2.setTamanio("mediana");
		esfera2.setRadio(2);

		esfera2.asignarColor();

		System.out.println("La superficie de la esfera " + esfera2.getTamanio() + " y color " + esfera2.getColor()
				+ " es de " + esfera2.Superficie());
		System.out.println("El volumen de la esfera " + esfera2.getTamanio() + " y color " + esfera2.getColor()
				+ " es de " + esfera2.Volumen() + "\n");

		esfera3.setTamanio("grande");
		esfera3.setRadio(3);

		esfera3.asignarColor();

		System.out.println("La superficie de la esfera " + esfera3.getTamanio() + " y color " + esfera3.getColor()
				+ " es de " + esfera3.Superficie());
		System.out.println("El volumen de la esfera " + esfera3.getTamanio() + " y color " + esfera3.getColor()
				+ " es de " + esfera3.Volumen() + "\n");

		// ORTOEDRO

		Ortoedro ortoedro1 = new Ortoedro("pequeño", 1, 1, 1);
		Ortoedro ortoedro2 = new Ortoedro("mediano", 2, 2, 2);
		Ortoedro ortoedro3 = new Ortoedro("grande", 3, 3, 3);

		ortoedro1.asignarColor();
		ortoedro2.asignarColor();
		ortoedro3.asignarColor();

		System.out.println("La superficie del ortoedro " + ortoedro1.getTamanio() + " y color " + ortoedro1.getColor()
				+ " es de " + ortoedro1.Superficie());
		System.out.println("El volumen del ortoedro " + ortoedro1.getTamanio() + " y color " + ortoedro1.getColor()
				+ " es de " + ortoedro1.Volumen() + "\n");

		System.out.println("La superficie del ortoedro " + ortoedro2.getTamanio() + " y color " + ortoedro2.getColor()
				+ " es de " + ortoedro2.Superficie());
		System.out.println("El volumen del ortoedro " + ortoedro2.getTamanio() + " y color " + ortoedro2.getColor()
				+ " es de " + ortoedro2.Volumen() + "\n");

		System.out.println("La superficie del ortoedro " + ortoedro3.getTamanio() + " y color " + ortoedro3.getColor()
				+ " es de " + ortoedro3.Superficie());
		System.out.println("El volumen del ortoedro " + ortoedro3.getTamanio() + " y color " + ortoedro3.getColor()
				+ " es de " + ortoedro3.Volumen() + "\n");

	}

}
