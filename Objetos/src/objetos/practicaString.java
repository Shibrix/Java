package objetos;

public class practicaString{

	public static void main(String[] args) {
	//dada una frase, sacar el caracter que esté en medio
		String frase= "Me llamo Ruth";
		int longitud= frase.length();
		int mitad= longitud/2;
		char medio= frase.charAt(mitad);
		//System.out.println(medio);
		
	//dada una frase, de al menos 2 palabras, decir cuál es el primer caracter que aparece después del primer espacio
		char esp= ' ';
		int espacio= frase.indexOf(esp);
		//System.out.println(espacio);
		char c= frase.charAt(espacio+1);
		//System.out.println(c);
		
	//dado un string que es una frase de al menos 3 palabras, obtener la segunda palabra
		String frase1= "Hoy estamos a martes";
		int primerEspacio= frase1.indexOf(esp);//obtengo el primer espacio
		int segundoEspacio= frase1.indexOf(esp, primerEspacio+1);//obtengo el segundo espacio
		String palabra= frase1.substring(primerEspacio, segundoEspacio);//obtengo la palabra
		palabra= palabra.trim();//Elimino el espacio que aparece, ya que por el substring estaba contado el
		//primer espacio
		System.out.println(palabra);
		
	//
		
		
		
	}
}