package Constructores2;

public class Persona {

	//EJERCICIO: HACER LA CLASE PERSONA CON NOMBRE, APELLIDO, DNI Y SEXO Y hacer to String que imprima todo eso. CREAR 2 OBJETOS
	
	private String nombre;
	private String apellido;
	private String dni;
	private boolean sexo; //false: mujer -- true: hombre
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public boolean isSexo() {
		return sexo;
	}
	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}
	
	
	
	public Persona(String nombre, String apellido, String dni, boolean sexo) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.sexo = sexo;
	}
	
	
	
	@Override
	public String toString() {

		String devolucion;
		
		devolucion = this.nombre + " " + this.apellido+" tiene el dni " + this.dni;
	
		if (this.sexo == true) {
			devolucion += " y es un hombre";
		} else {
			devolucion += " y es una mujer \n";
		}
		return devolucion;
	}
	

	
	
	
	
	
}
