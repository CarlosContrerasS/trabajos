package cine;
//envia horario a cliente
import java.util.Scanner;

public class  funciones {
	
	public static int Funciones() {
	
		Scanner entrada= new Scanner(System.in);
		int horario;
		Boolean test=true;
	
		String[] arrayHorario = new String [4];
		arrayHorario[0]="12:00";
		arrayHorario[1]="15:00";
		arrayHorario[2]="18:00";
		arrayHorario[3]="21:00";
		
		do {
	
			System.out.println("Selecciona los horarios disponibles para esta Sala");
			System.out.println("");
			System.out.println("Horario 1: " + arrayHorario[0]);
			System.out.println("Horario 2: " + arrayHorario[1]);
			System.out.println("Horario 3: " + arrayHorario[2]);
			System.out.println("Horario 4: " + arrayHorario[3]);
			System.out.println("");
			System.out.println("Selecciona tu horario: de 1 a 4");
			horario=entrada.nextInt();
			entrada.nextLine();
			
			switch (horario) {
			case 1:
				System.out.println("seleccionaste horario " +arrayHorario[0]);
				test = false;
				break;
			case 2:
				System.out.println("seleccionaste horario " +arrayHorario[1]);
				test = false;
				break;
			case 3:
				System.out.println("seleccionaste horario " +arrayHorario[2]);
				test = false;
				break;
			case 4:
				System.out.println("seleccionaste horario " +arrayHorario[3]);
				test = false;
				break;
			default:
				System.out.println("seleccionaste un horario que no existe. Elige nuevamente");
				test = true;
				break;
				
				
			}
		}while(test==true);
		
		return horario;
	}
		
}
