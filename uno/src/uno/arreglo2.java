package uno;

import java.util.Scanner;

public class arreglo2 {
	public static void main(String[] args) {  

	Scanner teclado = new Scanner(System.in);
    int numeros[] = new int[14]; //array que contendrá los números leídos por teclado
  
    //lectura de datos y llenar el array
    System.out.println("Lectura de los elementos del array: ");
   
    for (int i = 0; i < 14; i++) {
        System.out.print("ingree el numero "+(i+1) + ":    ");
        numeros[i]=teclado.nextInt();
        }
   teclado.close();
    //para mostrar en pantalla los números ingresados
    for (int i = 0; i < 14; i++) {
        System.out.println("en indice  " +i + " se encuentra guaradado el numero    " +numeros[i] );
        }
	
	}
}