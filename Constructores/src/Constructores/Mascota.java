package Constructores;

public class Mascota {
	
	private String especie;	
	private String color;
	private int edad;
	private boolean sexo; // false: macho - true: hembra
	private String chip;
	private Persona duenio;
	
	//NORMALMENTE LOS CONSTRUCTORES VAN ENTRE LOS ATRIBUTOS Y LOS GETTER/SETTER. LE DAMOS A SOURCE>GENERATE CONSTRUCT USING FIELDS
	//LUEGO EN EL MAIN LE PASAMOS LOS PARÁMETROS EN EL ORDEN EN EL QUE HEMOS CREADO EL CONSTRUCTOR
	
	//EL CONSTRUCTOR NO TIENE POR QUÉ TENER TODOS LOS ATRIBUTOS QUE HEMOS CREADO
	
	//AUNQUE TENGA 2 MÉTODOS CON EL MISMO NOMBRE, NO PASA NADA SIEMPRE Y CUANDO LE PASE UN NÚMERO DE ATRIBUTOS DIFERENTE. ASÍ LA MÁQUINA
	//ES CAPAZ DE DIFERENCIAR ENTRE UN METODO U OTRO Y USA EL QUE NECESITA
	
	//SI QUEREMOS QUITAR UN ATRIBUTO DEL CONSTRUCTOR, MEJOR CREAR UN NUEVO CONSTRUCTOR EN VEZ DE BORRARLO DIRECTAMENTE
	
	//SI CREO UN CONSTRUCTOR QUE TENGA TODOS LOS ATRIBUTOS MENOS EL COLOR (CON EL ORDEN ESPECIE, CHIP, EDAD Y SEXO), LOS CONSTRUCTORES
	//NO SABEN DIFERENCIAR SI METES EL STRING DE COLOR O EL DE CHIP. VALDRÍA CON CAMBIAR EL ORDEN DE LOS ATRIBUTOS
	
	
	public Mascota(String especie, String color, int edad, boolean sexo) {
		super();//Esto hace referencia a la clase superior (padre). Existe herencia dentro de los objetos
		this.especie = especie;
		this.color = color;
		this.edad = edad;
		this.sexo = sexo;
	}
	
	
	public Mascota(String especie, int edad, boolean sexo, String chip) {
		super();
		this.especie = especie;
		this.edad = edad;
		this.sexo = sexo;
		this.chip = chip;
	}


	public Mascota(String especie, String color, int edad) {
		super();
		this.especie = especie;
		this.color = color;
		this.edad = edad;
	}	
	
	//AL PASAR PARÁMETROS AL CONSTRUCTOR, YA NO PODEMOS FIJAR LOS ATRIBUTOS NOSOTROS MISMOS CON SET. PARA PODER HACERLO HAY QUE CREAR
	//UN CONSTRUCTOR QUE NO TENGA PARÁMETROS
	
	public Mascota() {
		super();
	}	
	
	
	public Mascota(String especie, int edad, Persona duenio) {
		super();
		this.especie = especie;
		this.edad = edad;
		this.duenio = duenio;
	}


	public String getEspecie() {
		return especie;
	}		
	public void setEspecie(String especie) {
		this.especie = especie;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public String getChip() {
		return chip;
	}

	public void setChip(String chip) {
		this.chip = chip;
	}


	public Persona getDuenio() {
		return duenio;
	}


	public void setDuenio(Persona duenio) {
		this.duenio = duenio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
