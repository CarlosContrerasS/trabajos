package Persona;

import java.util.Scanner;

public class Ejecutadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner teclado = new Scanner(System.in);
	
		
		System.out.println("Ingrese el Nombre de la persona:  ");
		
		String frase = teclado.next();
		
		System.out.println("Ingrese la edad de la Persona:  ");
		int agnos = teclado.nextInt();
		
		Persona persona = new Persona(frase, agnos);
		
		
		
		System.out.println("Ingrese el Nombre del profesor:  ");
		String frase_02 = teclado.next();
				
		System.out.println("Ingrese la edad del profesor:  ");
		int agnos_02 = teclado.nextInt();
		
		Profesor profesor = new Profesor(frase_02, agnos_02);
		
		System.out.println("Ingrese el codigo del profesor:  ");
		String frase_03 = teclado.next();
		
		profesor.stIdProfesor(frase_03);
		
		System.out.println("El nombre y la edad de la persona es:  "+ persona.getnombre()+ " " + persona.edad());
		
		System.out.println("El nombre y la edad del profesor es:  "+ profesor.getnombre()+ " " + profesor.edad());
		
		System.out.println("El codigo del profesor es:  " + profesor.getIdProfesor());
		
		profesor.mostrarNombre();
		
		teclado.close();
	
	}


}
