package Clases2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//EJERCICIO: implementar la clase libro, que tetndrá un ISBN(Alfanumerico), titulo, autor, numero de páginas
		// y tapara dura o blanda(se hará con booleano)
		//También haremos un método que nos dé el peso del libro que se calculará como 2.5 gr por página + 35 gr si es
		//tapa blanda o 140 gr si es de tapa dura
		//Crear 2 libros, uno de tapa blanda y otro de tapa dura y obtener el peso de ellos
		
		Libro libro0= new Libro();
		//Establezco el valor para lo atributos
		libro0.setAutor("Cristian Devolx");
		libro0.setIsbn("23487234T123A");
		libro0.setTitulo("EL huésped del abismo");
		libro0.setNumPaginas(180);
		libro0.setTapa(true);
		
		
		Libro libro1= new Libro();
		libro1.setAutor("Cristian Devolx");
		libro1.setIsbn("2287R234T123A");
		libro1.setTitulo("Arcadian");
		libro1.setNumPaginas(300);
		libro1.setTapa(false);		
		
		
		//Llamo al método y se ejecuta lo que haya dentro
		//Este está hecho con un método void
		libro0.pesoLibro(libro0.isTapa(), libro0.getNumPaginas());
		libro1.pesoLibro(libro1.isTapa(), libro1.getNumPaginas());
		
		//Este está hecho sin void
		System.out.println("El peso de "+libro0.getTitulo()+" es "+libro0.calcularPeso()+" gr");
		System.out.println("El peso de "+libro1.getTitulo()+" es "+libro1.calcularPeso()+" gr");
		
		
//EJERCICIO: Crear otro método que calcule el peso teniendo en cuenta que hemos arrancado X páginas (pasarlo como parámetro) 
		//y si le he puesto forro o no. El forro pesa 25 gr.
		
		System.out.println("El peso de "+libro0.getTitulo()+" es "+libro0.calcularPeso(20, true)+" gr");
		System.out.println("El peso de "+libro1.getTitulo()+" es "+libro1.calcularPeso(40, false)+" gr");
		
		
		
		
	}

}
