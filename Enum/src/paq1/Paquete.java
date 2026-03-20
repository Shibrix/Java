package paq1;

public class Paquete {

	//ATRIBUTOS
	private String codigo;
	private String remitente;
	private String destino;
	private Tamanyo tamanio;
	
	//CONSTRUCTOR
	public Paquete(String codigo, String remitente, String destino, Tamanyo tamanio) {
		super();
		this.codigo = codigo;
		this.remitente = remitente;
		this.destino = destino;
		this.tamanio = tamanio;
	}
	
	public Paquete(String codigo, String remitente, String destino) {
		super();
		this.codigo = codigo;
		this.remitente = remitente;
		this.destino = destino;
	}
	
	//GETTER Y SETTER
	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getRemitente() {
		return remitente;
	}

	public void setRemitente(String remitente) {
		this.remitente = remitente;
	}

	public String getDestino() {
		return destino;
	}

	public void setDestino(String destino) {
		this.destino = destino;
	}

	public Tamanyo getTamanio() {
		return tamanio;
	}

	public void setTamanio(Tamanyo tamanio) {
		this.tamanio = tamanio;
	}

	
}
