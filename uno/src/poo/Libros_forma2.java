package poo;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Libros_forma2 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		int contador_2=0;
		
		
		String Cantidad = JOptionPane.showInputDialog("¿Cuantos libros va a ingresar?");
	
		int N = Integer.parseInt(Cantidad);
	
		documentos_forma2[] Documento = new documentos_forma2[N];
	
		Scanner entrada = new Scanner(System.in);
		
		for (int i=0; i<Documento.length; i++) {
			
			System.out.println("Ingrese el Tipo del Texto " +(i+1)+ " : ");
			String a = entrada.next();
			
			System.out.println("Ingrese el Título del Texto  " +(i+1)+ " : ");
			String b = entrada.next();
			
			System.out.println("Ingrese el año del Texto  "+ (i+1)+" ; ");
			int c = entrada.nextInt();
			
			System.out.println("Ingrese el Estado del Texto  "+(i+1)+ ":  ");
			String d = entrada.next();
			
			Documento[i] = new documentos_forma2(a, b, c, d);
			
			
			}
		entrada.close();
		
			for (int i=0; i<N; i++) { //Con este for imprimo lo que contiene cada arreglo del objeto
				Documento[i].Imprimir();
			}
			
			for (int i=0; i<N; i++) {// con este for mando al metodo cuentaPrestados para contar
				//los textos que se encuentran Prestados
				contador = documentos_forma2.cuentaPrestados(Documento[i], contador);
			}
			
			
			//Imprimo la cantidad de textos Prestados.
			
			System.out.println("la cantidad de textos Prestados es de : " + contador);
			
			
			for (int i=0; i<N; i++) { // Con este for cuento la cantidad de textos Anteriores de 1990
				
				contador_2 = documentos_forma2.publicacionesAnterioresA(Documento[i], contador_2);
				
			}
			
			//Ahora muestro cuantos son los texto anteriores a 1990
			
			
			System.out.println("la cantidad de textos anteriores a 1990 son :" 
			+ contador_2);
			
		}
		
	}
