package uno;

import java.util.Scanner;
public class ProblemaCuatro05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase_02 ="";
		String frase_03 ="";
		String frase_06 ="";
		
		
		//Número 1 del ejercicio//
		Scanner teclado = new Scanner(System.in); //se crea el objeto Scanner
		
		Scanner teclado_2 = new Scanner(System.in); //se crea el objeto Scanner
		
		System.out.println("ingrese una frase, por favor"); //le pido que ingrese
		
		String frase = teclado.nextLine(); //Para guardare el ingreso de consola una frase tipo string//
		
		int largo = frase.length();
		
		System.out.println("1.- la cantidad de caracteres ingresado es de :  " + largo); //muestra el largo de la frase
		
		//Numero 2 del ejercicio//
		System.out.println("ingrese un indice desde 0 hasta " + (largo-1)); //le pido el indice
		
		int indice_01 = teclado.nextInt();
		
		char caracter = frase.charAt(indice_01);
		
		System.out.println("2.- el caracter que se ubica en el indice " + indice_01 + "  es  :   " + caracter);
		
		//Numero 3 del ejercicio//
		System.out.println("ingrese un indice para cortar la frase, desde 0 hasta " + (largo-1)); //le pido el indice
		
		int indice_02 = teclado.nextInt();
	
		//este es para recorrer la frase original caracter por caracter//
		for (int i = indice_02; i<largo; i++) {
			char caracter_02 = frase.charAt(i);
			frase_02 += caracter_02;
		}
		
		System.out.println("3.- la nueva frase queda:  " + frase_02); //imprimo la nueva frase
		
		//Numero 4 del ejercicio//
		System.out.println("ingrese un indice desde 0 hasta " + (largo-1)); //le pido el indice
		
		int indice_03 = teclado.nextInt();
		
		System.out.println("ingrese un indice desde  " + indice_03+ "  hasta " + (largo-1)); //le pido el indice
		
		int indice_04 = teclado.nextInt();
		
		String sSubCadena = frase.substring(indice_03,indice_04+1); //segunda forma
		
		System.out.println("4.- la nueva frase queda:  " + sSubCadena); //imprimo la nueva frase
		
		//Numero 5 del ejercicio//
		System.out.println("5.- concatenando la dos frase que han sido cortadas previamente queda  :\n " + frase_02+ " "+ frase_03); //imprimo la nueva frase
		
		//Numero 6 del ejercicio//
		
		char caracter_04 = frase_02.charAt(indice_03);
			
		System.out.println("6.- la frase inicialmente ingresada es:  " + frase+ "\n   la frase cortada por el indice "+ indice_02+ 
				"  queda  : \n" + frase_02+ "  el caracter de esta frase en el indice "+ indice_03 +"  es:  " + caracter_04 );
		
		//Numero 7 del ejercicio//
		
		
		//Numero 8 del ejercicio//
		
		
		String frase_04 = frase.toLowerCase(); // lo convierto en minuscula y lo guardo
		
		System.out.println("8.- la frase inicial en minuscula es:  " + frase_04); //imprimo la nueva frase
		
		//Numero 9 del ejercicio//
		String frase_05 = frase.toUpperCase(); // lo convierto en mayuscula y lo guardo
		
		System.out.println("9.- la frase inicial en Mayusculas es:  " + frase_05); //imprimo la nueva frase
		
		//Numero 10 del ejercicio//
		
		System.out.println("la frase inicial es:   " + frase + "\n ingrese la letra que desee remplazar");
		String letra = teclado_2.nextLine();
		
		System.out.println("ingrese la nueva letra a reemplazar");
		String letra_nueva = teclado_2.nextLine();
			
		frase_06 = frase.replace(letra, letra_nueva);
		System.out.println("la nueva frase modificada queda: " + frase_06);
			
		teclado.close();
		teclado_2.close();
	}
	
}
