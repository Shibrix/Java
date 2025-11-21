package OpcionalFigurasGeometricas;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	//CILINDRO
		
		Cilindro cilindro1= new Cilindro();
		Cilindro cilindro2= new Cilindro();
		Cilindro cilindro3= new Cilindro();
		
		cilindro1.setTamanio("pequeño");
		cilindro1.setAltura(10);
		cilindro1.setRadio(5);
		cilindro1.setMaterial("hierro");
		
		cilindro1.asignarColor();
		
		System.out.println("El cilindro pequeño pesa "+cilindro1.Peso()+ " gr y cuesta pintarla de "+cilindro1.getColor()+" "+cilindro1.Pintura()+" € \n");
		
		
		
		cilindro2.setTamanio("mediano");
		cilindro2.setAltura(15);
		cilindro2.setRadio(10);
		cilindro2.setMaterial("madera");
		
		cilindro2.asignarColor();
		
		System.out.println("El cilindro mediano pesa "+cilindro2.Peso()+ " gr y cuesta pintarla de "+cilindro2.getColor()+" "+cilindro2.Pintura()+" € \n");
		
		
		
		
		cilindro3.setTamanio("grande");
		cilindro3.setAltura(20);
		cilindro3.setRadio(15);
		cilindro3.setMaterial("corcho");
		
		cilindro3.asignarColor();
		
		System.out.println("El cilindro grande pesa "+cilindro3.Peso()+ " gr y cuesta pintarla de "+cilindro3.getColor()+" "+cilindro3.Pintura()+" € \n");
		
	//ESFERA
		
		Esfera esfera1= new Esfera();
		Esfera esfera2= new Esfera();
		Esfera esfera3= new Esfera();
		
		
		esfera1.setTamanio("pequeño");
		esfera1.setRadio(5);
		esfera1.setMaterial("hierro");
		
		esfera1.asignarColor();
		
		System.out.println("La esfera pequeña pesa "+esfera1.Peso()+" gr y cuesta pintarla de "+esfera1.getColor()+" "+esfera1.Pintura()+" € \n");
		
		
		
		esfera2.setTamanio("mediano");
		esfera2.setRadio(10);
		esfera2.setMaterial("madera");
		
		esfera2.asignarColor();
		
		System.out.println("La esfera mediana pesa "+esfera2.Peso()+" gr y cuesta pintarla de "+esfera2.getColor()+" "+esfera2.Pintura()+" € \n");
		
		
		
		esfera3.setTamanio("grande");
		esfera3.setRadio(15);
		esfera1.setMaterial("corcho");
		
		esfera3.asignarColor();
		
		System.out.println("La esfera grande pesa "+esfera3.Peso()+" gr y cuesta pintarla de "+esfera3.getColor()+" "+esfera3.Pintura()+" € \n");
		
		
	//ORTOEDRO
		
		Ortoedro ortoedro1= new Ortoedro("pequeño",5,6,7, "hierro");
		Ortoedro ortoedro2= new Ortoedro("mediano",7,8,9, "madera");
		Ortoedro ortoedro3= new Ortoedro("grande",10,11,12, "corcho");
		
		ortoedro1.asignarColor();
		ortoedro2.asignarColor();
		ortoedro3.asignarColor();
	
		
		System.out.println("El ortoedro pequeño pesa "+ortoedro1.Peso()+" gr y cuesta pintarla de "+ortoedro1.getColor()+" "+ortoedro1.Pintura()+" € \n");
		System.out.println("El ortoedro mediano pesa "+ortoedro2.Peso()+" gr y cuesta pintarla de "+ortoedro2.getColor()+" "+ortoedro2.Pintura()+" € \n");		
		System.out.println("El ortoedro grande pesa "+ortoedro3.Peso()+" gr y cuesta pintarla de "+ortoedro3.getColor()+" "+ortoedro3.Pintura()+" € \n");
		
		
		
		
		
		
		
		
	}

}
