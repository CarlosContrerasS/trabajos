package prueba;

import java.util.ArrayList;

public class PruebaPila {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 ArrayList <String> coleccion = new ArrayList <String> ();
		 ArrayList <String> pila = new ArrayList <String> ();
		
		coleccion = rellenar (coleccion);
		
		imprimirYvaciar(coleccion, pila);
		
		System.out.println("El tamaño del ArryList despues de la eliminación  "
				+coleccion.size());
		
		System.out.println("El tamaño del ArryList pila que recibe a los datos eliminado de coleccion es  "
				+pila.size());
		
		Imprimir(pila);
		
	}

	
	public static  ArrayList<String> rellenar( ArrayList<String> coleccion) {
		 for (int i=1; i<11; i++) {
				
			 String num = Integer.toString((i));
				
			 coleccion.add(num);
			}
		 
		
		return coleccion; 
	
	
	}
	
	public static ArrayList<String> imprimirYvaciar(ArrayList<String> coleccion, ArrayList<String> pila) {
		
		 for (int i = 10; i>=1; i--) {
			 
				System.out.println("El elemento en el indice "+i+" es:  "
									+ coleccion.get(i-1));
				
				pila.add(coleccion.get(i-1)); 
				coleccion.remove(i-1);
				}
			return pila;
		}
	
	public static void Imprimir (ArrayList<String> pila) {
		 
		for (int i = 1; i<=10; i++) {
			 
			System.out.println("El elemento en el indice "+i+" es:  "
								+ pila.get(i-1));
			
		}
			
	}
		
	}