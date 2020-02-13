package uno;

import java.util.Scanner;

public class arreglo2_segundaforma {
	public static void main(String[] args) {  
		
		
		int numeros[] = llenado(13);
		mostrado(numeros); 
		
	}
   
	public static int[] llenado(int cantidad) {
		Scanner teclado = new Scanner(System.in);
		int arreglo[] = new int[14];
	  
	    //lectura de datos y llenar el array
	    System.out.println("Lectura de los elementos del array: ");
	   
	    for (int i = 0; i <= cantidad; i++) {
	        System.out.print("ingree el numero "+(i+1) + ":    ");
	        arreglo[i]=teclado.nextInt();
	        }
	    teclado.close();
	    return arreglo;
	}
	public static void mostrado(int numeros[]) {
		
		 //para mostrar en pantalla los números ingresados
	    for (int i = 0; i <= 13; i++) {
	        System.out.println("en indice  " +i + " se encuentra guaradado el numero    " +numeros[i] );
	        }
		
		}


	
}