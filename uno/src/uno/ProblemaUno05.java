package uno;

import java.util.Scanner;

public class ProblemaUno05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char vocales[] = {'a', 'e',  'i',  'o', 'u'};
		int contador = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("ingrese una frase, por favor");
		
		String frase = teclado.nextLine(); //Para el ingreso de consola una frase tipo string//
		
		int largo = frase.length();
		
		for ( int i = 0; i< largo; i++) {
			
			char caracter = frase.toLowerCase().charAt(i);
			
			for (int j = 0; j< 5; j++) {
				if (vocales[j] == caracter) {
					contador++;
				}
			}
		
		}
		
		System.out.println("la cantidad de vocales es la frase es de  "+ contador);
		teclado.close();
	}

}
