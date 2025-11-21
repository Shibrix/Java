package Constructores2;

public class Atraccion {

	private String nombre;
	private double precio;
	private boolean publico; // true: niños -- false: adultos
	private double tiempo;

	public Atraccion(String nombre, double precio, boolean publico, double tiempo) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.publico = publico;
		this.tiempo = tiempo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isPublico() {
		return publico;
	}

	public void setPublico(boolean publico) {
		this.publico = publico;
	}

	public double getTiempo() {
		return tiempo;
	}

	public void setTiempo(double tiempo) {
		this.tiempo = tiempo;
	}

	public double gananciasPorVuelta(int pasajeros) {
		double ganancia = 0;

		ganancia = pasajeros * this.precio;

		return ganancia;
	}

//ESTO LO HEMOS CREADO CON SOURCE GENERATE TO STRING
	@Override // ESTO SIGNIFICA SOBREESCRIBE
	public String toString() {// IMPRIME EL OBJETO COMO STRING
		// VAMOS A HACERLO A NUESTRO GUSTO

		String devolucion;
		//TODO ESTE BLOQUE SE PUEDE SUSTITUIR POR UN SYSO NORMAL
		devolucion = "La atracción " + this.nombre;
		devolucion += " cuesta " + this.precio + " €";
		if(this.publico==true) {
			devolucion+= " es para niños";
		}else {
			devolucion += " es para adultos";
		}
		
		devolucion+= " y dura "+this.tiempo+" minutos \n";
		
		return devolucion;

	}
	
	//AHORA QUEREMOS QUE NO NOS SALGA EL PÚBLICO AL QUE VA DIRIGIDO EN EL MÉTODO TO STRING
	public void formatoSinPublico() {
		
		System.out.println("La atracción " + this.nombre);
		System.out.println(" cuesta " + this.precio + " €");
		System.out.println(" y dura "+this.tiempo+" minutos \n");	
		
	}
	
	//OTRA MANERA DE HACER LO MISMO QUE LO ANTERIOR
	
	public String toStringSinPrecio() {// IMPRIME EL OBJETO COMO STRING
		// VAMOS A HACERLO A NUESTRO GUSTO

		String devolucion;
		//TODO ESTE BLOQUE SE PUEDE SUSTITUIR POR UN SYSO NORMAL
		devolucion = "La atracción " + this.nombre;
		if(this.publico==true) {
			devolucion+= " es para niños";
		}else {
			devolucion += " es para adultos";
		}
		
		devolucion+= " y dura "+this.tiempo+" minutos \n";
		
		return devolucion;

	}
	
	
	public void formatoSoloRiesgo() {

		String devolucion;

		devolucion = "La atracción " + this.nombre;
		if (this.publico == true) {
			devolucion += " es para niños";
		} else {
			devolucion += " es para adultos";
		}

		System.out.println(devolucion);

	}
	
	
	
	
	
	
	
	
	
	
	
}
