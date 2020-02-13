package uno;

import java.util.Scanner;

public class Ejercicio3 {
	
	static Scanner entrada = new Scanner(System.in);
	public static void main(String args[]){
		int numero = 0;
		
		System.out.println("Ingresa un Numero del 00 al 255 ");
		numero = entrada.nextInt();
        char c = (char)numero;  
        System.out.println("Valor ASCII: "+ c);
 
    }
}