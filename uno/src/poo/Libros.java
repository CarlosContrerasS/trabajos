package poo;


public class Libros{
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		int contador_2=0;
		
		documentos[] Texto = new documentos[4];
		
		Texto[0] = new documentos("Libro", "Principito", 1986, "Prestado");
		Texto[1] = new documentos("Libro", "Papelucho", 1983, "Disponible");
		Texto[2] = new documentos("Revista", "Caras", 1994, "Disponible");
		Texto[3] = new documentos("Revista", "Vea", 2011, "Disponible");
		
	
		for (int i=0; i<Texto.length; i++) { //Con este for imprimo lo que contiene cada arreglo del objeto
			Texto[i].Imprimir();
		}
		
		for (int i=0; i<Texto.length; i++) {// con este for mando al metodo cuentaPrestados para contar
			//los textos que se encuentran Prestados
			contador = documentos.cuentaPrestados(Texto[i], contador);
		}
		
		
		//Imprimo la cantidad de textos Prestados.
		
		System.out.println("la cantidad de textos Prestados es de : " + contador);
		
		
		for (int i=0; i<Texto.length; i++) { // Con este for cuento la cantidad de textos Anteriores de 1990
			
			contador_2 = documentos.publicacionesAnterioresA(Texto[i], contador_2);
			
		}
		
		//Ahora muestro cuantos son los texto anteriores a 1990
		
		
		System.out.println("la cantidad de textos anteriores o iguales a 1990 son :" 
		+ contador_2);
		
	}
	
}
