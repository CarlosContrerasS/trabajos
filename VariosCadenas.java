package ColeccionesDatos;
import java.util.Scanner;

public class VariosCadenas {
	static String texto;
	static int largo = 0;
	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		
		System.out.println("Ingresa una Palabra ");
		texto = entrada.nextLine();
		DevolverLargo();
		DevolverCaracter();
		CortarCadena();
		CortarCadena2();
		CadenaCadena();
		CompararCadenas();
		ConvertirMinusculas();
		ConvertirMayusculas();
		CambiarCaracter();
	}
	//Funcion que Devuelve el Largo de un String
	public static void DevolverLargo() {
		System.out.println("***** Devuelve el Largo de la Cadena *****");
		largo = texto.length()+1;
		System.out.println("La Cadene tiene " + largo + " Elementos");
	}
	//Funcion que Devuelve un Caracter, dado un Indice
	public static void DevolverCaracter() {
		System.out.println("***** Devuelve un Caracter *****");
		String numero ;
		System.out.println("Ingresa un Indice ");
		numero = entrada.next();
		int indice = Integer.parseInt(numero);
		char letra = texto.charAt(indice+1);
		System.out.println("El Caracter es "  +  letra );
	}
	//Funcion que Compara las Cadenas
	public static void CompararCadenas() {
		String cadena1="Talentos";
		String cadena2="talentos";
		String cadena3="talenTOS";
		
		if (cadena1.equals(cadena2)){
			System.out.println("Talentos y talentos Son Iguales");
		}else{
			System.out.println("Talentos y talentos Son Diferentes");
		}
		if (cadena3.equals(cadena2)){
			System.out.println("talenTOS y talentos Son Iguales");
		}else{
			System.out.println("talenTOS y talentos Son Diferentes");
		}
		if (cadena3.equals(cadena3)){
			System.out.println("talentos y talentos Son Iguales");
		}else{
			System.out.println("talentos y talentos Son Diferentes");
		}
	}
	//Funcion que Trunca una Cadena a partir de un Indice dado
	public static void CortarCadena() {
		String numero;
		System.out.println("***** Truncar una Cadena a Partir de 1 Indice dado *****");
		System.out.println("Donde la Vas a Cortar ");
		numero = entrada.next();
		int posicion = Integer.parseInt(numero);
		String cortada = texto.substring(posicion);
		System.out.println("La Cadena Resultante es " + cortada);
	}
	//Funcion que Trunca una Cadena a partir de un Indice dado, hasta otro Indice Dado
	public static void CortarCadena2() {
		String numero;
		String numero2;
		System.out.println("***** Truncar una Cadena a Partir de 2 Indices dados *****");
		System.out.println("Donde la Vas a Cortar ");
		numero = entrada.next();
		System.out.println("Donde la Vas a Terminar ");
		numero2 = entrada.next();
		int posicion = Integer.parseInt(numero);
		int posicion2 = Integer.parseInt(numero2);
		String cortada2 = texto.substring(posicion,posicion2);
		System.out.println("La Cadena Resultante es " + cortada2);
		
	}
	//Funcion que Concatena las dos Sub Cadena Anteriores
	public static void UnirCadenas(String cortada, String cortada2) {
		System.out.println("***** Concatena las Dos Cadenas Anteriores *****");
		System.out.println("***** Concatenar dos String *****");
		String unida = cortada.concat(cortada2);
		System.out.println("La Cadena Resultante es " + unida);
	}
	//Funcion que a partir de un Indice dado, devuelve el caractér
	//Trunca la Cadena a partir de un Indice dado, toma esa Cadena
	//como una Nueva
	public static void CadenaCadena() {
		System.out.println("***** a partir de un Indice dado, devuelve el caractér *****");
		System.out.println("***** Trunca la Cadena a partir del Indice dado *****");
		String numero;
		System.out.println("Ingresa un Indice ");
		numero = entrada.next();
		int indice = Integer.parseInt(numero);
		char letra = texto.charAt(indice+1);
		System.out.println("El Caracter es "  +  letra + " en el Indice "+ indice+1 );
		int posicion = Integer.parseInt(numero);
		String textoNuevo = texto.substring(posicion+1);
		System.out.println("La Cadena Resultante es " + textoNuevo);
		letra = textoNuevo.charAt(indice+1);
		System.out.println("El Caracter es "  +  letra + " en el Indice "+ indice+1 );
	}
	//Funcion que Convierte un String en Minusculas
	public static void ConvertirMinusculas() {
		System.out.println("***** Convierte la Cadena a Minusculas *****");
		String minusculas = texto.toLowerCase();
		System.out.println("La Cadena en Mayusculas es: " + minusculas);
	}
	//Funcion que Convierte un String en Mayusculas
	public static void ConvertirMayusculas() {
		System.out.println("***** Convierte la Cadena a Mayusculas *****");
		String mayusculas = texto.toUpperCase();
		System.out.println("La Cadena en Mayusculas es: " + mayusculas);
	}
	//Funcion que Cambia un Caractér Dado por Otro
	public static void CambiarCaracter() {
		System.out.println("***** Cambiar un Caracter dado por Otro *****");
		String letra;
		String cambio;
		System.out.println("Ingresa la Letra a Cambiar ");
		letra = entrada.next();
		System.out.println("Por Cual Letra ");
		cambio = entrada.next();
		String textoCambiado = texto.replace(letra, cambio);
		System.out.println(textoCambiado);
	}
}
