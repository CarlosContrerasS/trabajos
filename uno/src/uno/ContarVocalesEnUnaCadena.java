package uno;
import java.util.Scanner;

public class ContarVocalesEnUnaCadena {

	public static void main(String[] args) {
		Scanner entrada = new Scanner (System.in);
        //String texto = entrada.nextLine(); //leemos la cadena
        int vocales = 0;
        
        //Pedimos que Ingrese el Texto
        System.out.println("Escribe una Frase");
		String texto = entrada.nextLine();
		
        //iteramos mientras el indice sea menor al tamaño total de la cadena
        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.toLowerCase().charAt(i); //obtenemos el caracter 
            //en la posicion i
            
            //si el caracter es igual a "a", "e", "i", "o", ó "u" entonces es vocal
            if (caracter == 'a' || caracter == 'e' || caracter ==  'i' ||
                caracter == 'o' || caracter == 'u')
            {
                vocales = vocales + 1; //contamos cantidad vocales +1
            }
        }
        //mostramos por pantalla la cantidad de vocales
        System.out.println("La Frase tiene " + vocales + " Vocales");
        entrada.close();
    }
	
}
