package interfaces_practica;
import java.util.Scanner;


public class Ejecutoria {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		Scanner teclado = new Scanner(System.in);
		System.out.println("Ingrese el primer valor :  ");
		int val = teclado.nextInt();
		
		Acumulador ingresado = new Acumulador(val);
		
		
		System.out.println("Ingrese el segundo valor :  ");
		int val_2 = teclado.nextInt();
		
		ingresado.incremento(val_2);
		
		System.out.println("El valor acumulado es:  "+ ingresado.getValor());
		
		
		teclado.close();
	}

}
