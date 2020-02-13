package uno;

import java.util.Scanner;
import java.util.ArrayList;


public class ejercicio2 {
	

	public static void main(String[] args) {  
				 				 
		 String letras[] = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","Ñ","O","P",
				 "Q","R","S","T","U","V","W","X","Y","Z"};
		 
		 int cantidad = 0;
		
		 Scanner arreglo = new Scanner(System.in);
		 
		 System.out.println("¿Cuantos números desea ingresar?");
		 cantidad = arreglo.nextInt();
		
		
		 int numero = 0;
		  
		 ArrayList <String> nuevas = new  ArrayList<String>();
	
		 for (int x = 0; x <= cantidad; x++) {
			 System.out.println("ingrese un numero de 0 a 26, para finalizar ingrese el -1");
			 numero = arreglo.nextInt();
			 if (numero == -1){
				 x = cantidad;
				}
			 else {
				 
				 nuevas.add(x, letras[numero]);
				 }
		 }
		 
		 int largo = nuevas.size();
		
		 for (int y = 0; y< largo; y++) {
				System.out.print(nuevas.get(y));
				}
		 arreglo.close();
	}
	
	
}