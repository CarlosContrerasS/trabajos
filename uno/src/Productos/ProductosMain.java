package Productos;

import java.util.Scanner;

public class ProductosMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double acum_1 = 0;
		double calculo_1 = 0;
		double acum_2 = 0;
		double calculo_2 = 0;
		
		Scanner entrada = new Scanner(System.in);
		Perecedero[] nuevo_1 = new Perecedero[5];
		No_Perecedero[] nuevo_2 = new No_Perecedero[5];
		
		//Acontinuaxción ingresare los datos de Perecedero.
		
		System.out.println("Primero debemos ingresar 5 Productos Perecederos");
			
		for (int i= 0; i<5; i++) { 
			System.out.println("Ingrese el Nombre del producto: " +(i+1));
			String nombre = entrada.next();
			System.out.println("Ingrese el Precio : ");
			int precio = entrada.nextInt();
			System.out.println("Ingrese la cantidad : ");
			int cantidad = entrada.nextInt();
			System.out.println("Ingrese los dias a caducar : ");
			int dias = entrada.nextInt();
			nuevo_1[i]= new Perecedero(nombre, precio, cantidad, dias);
			calculo_1 = nuevo_1[i].calcular(precio, cantidad);
			acum_1 = acum_1 + calculo_1;
			}
		
		System.out.println("Ahora debemos ingresar 5 Productos NO Perecederos");
		
		//Acontinuaxción ingresare los datos de No Perecedero.
		for (int i= 0; i<5; i++) {
			System.out.println("\"Ingrese el Nombre del producto: " +(i+1));
			String nombre = entrada.next();
			System.out.println("Ingrese el Precio : ");
			int precio = entrada.nextInt();
			System.out.println("Ingrese la cantidad : ");
			int cantidad = entrada.nextInt();
			nuevo_2[i]= new No_Perecedero(nombre, precio, cantidad);
			calculo_2 = nuevo_2[i].calcular(precio, cantidad);
			acum_2 = acum_2 + calculo_2;
			}
		
		for (int i = 0; i<5; i++) {
			nuevo_1[i].Imprimir(i);
		}
		
		System.out.println("El costo de los productos de Perecedero es: "
							+ acum_1);
		
		for (int i = 0; i<5; i++) {
			nuevo_2[i].Imprimir(i);
		}
		System.out.println("El costo de los productos de No Perecedero es: "
							+ acum_2);

		
	entrada.close();	
	}
	

}
