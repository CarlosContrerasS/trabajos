package cine;

import java.util.Scanner;


public class PruebaPintar {

	public static void main(String[] args) {
		
		
		double 	Total=0;
		
		
		Sala2D Sala_2D_A = new Sala2D();
		int[] Asientos_S1_F1 = Sala_2D_A.Asientos();
		int[] Asientos_S1_F5 = Sala_2D_A.Asientos();
		int[] Asientos_S1_F6 = Sala_2D_A.Asientos();
		int[] Asientos_S1_F6_2 = Sala_2D_A.Asientos();
		
		Sala2D Sala_2D_B = new Sala2D();
		int[] Asientos_S2_F3 = Sala_2D_B.Asientos();
		int[] Asientos_S2_F3_2 = Sala_2D_B.Asientos();
		int[] Asientos_S2_F4 = Sala_2D_B.Asientos();
		int[] Asientos_S2_F6 = Sala_2D_B.Asientos();
		
		Sala3D Sala_3D = new Sala3D();
		int[] Asientos_S3_F1 = Sala_3D.Asientos();
		int[] Asientos_S3_F2 = Sala_3D.Asientos();
		int[] Asientos_S3_F3 = Sala_3D.Asientos();
		
		Sala4DX Sala_4DX = new Sala4DX();
		int[] Asientos_S4_F1 = Sala_4DX.Asientos();
		int[] Asientos_S4_F2 = Sala_4DX.Asientos();
		int[] Asientos_S4_F5 = Sala_4DX.Asientos();
	
		SalaImax Sala_Imax_A = new SalaImax();
		int[] Asientos_S5_F2 =Sala_Imax_A.Asientos();
		int[] Asientos_S5_F3 =Sala_Imax_A.Asientos();
		int[] Asientos_S5_F5 =Sala_Imax_A.Asientos();
		
		SalaImax Sala_Imax_B = new SalaImax();
		int[] Asientos_S6_F1 = Sala_Imax_B.Asientos();
		int[] Asientos_S6_F4 = Sala_Imax_B.Asientos();
		int[] Asientos_S6_F4_2 = Sala_Imax_B.Asientos();
		
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("¿Desea realizar una venta? (si/no) :");
		String respuesta = entrada.next();
		
		
		
		while (respuesta.equalsIgnoreCase("si")) {
		
					
			String Peliculas[]= {"El Exorcista", "La mano que aprieta",
					"Como perder a un awaker en 10 días", "Muy Rapido y Sin Furia 10", 
					"Martes 13 todos los martes", "Armagedon capitulo final"};
		
			String[] Seleccion = Cartelera.cartelera(Peliculas);
		
			String[] horario = Cartelera.horario(Seleccion[1]);
		
			int sala=Cartelera.asignacion_sala(Seleccion[2], horario[1]);
			int hora= Integer.parseInt(horario[0].substring(0, 2));
			
			System.out.println("************************************");
			System.out.println("La pelicula selescionada es: "+Seleccion[0]
					+ "\n"+"A las : "+horario[0]
							+ "\n"+"La Función se realizara en la Sala : "+sala);
		
			cliente clientes = new cliente();
			
			System.out.println("************************************");
			clientes.adultos();
			clientes.ninos();
			
			System.out.println("************************************");
			int cantidad_entradas = clientes.getAdulto() + clientes.getNino();
			System.out.println("la cantidad de entrada de niños es: "+ clientes.getNino()
							+"\n" +" la cantidad de Adultos es :" + clientes.getAdulto()
							+"\n" + " la cantidad total es  : "+ cantidad_entradas);
	
			int peli = Integer.parseInt(Seleccion[2]);
			
			int horas = Integer.parseInt(horario[1]);
			
			switch (peli) {
			case 1:
				
				switch (horas) {
					case 1:
						Sala_2D_A.Pintar();
						System.out.println("*************************");
						Asientos_S1_F1=Sala_2D_A.Reservar(cantidad_entradas);
						System.out.println("************************************");
						break;
					case 2:
						Sala_3D.Pintar();
						System.out.println("*************************");
						Asientos_S3_F1=Sala_3D.Reservar(cantidad_entradas);
						break;
				
					case 3:
						Sala_4DX.Pintar();
						System.out.println("*************************");
						Asientos_S4_F1=Sala_4DX.Reservar(cantidad_entradas);
						break;
				
					case 4:
						Sala_Imax_B.Pintar();
						System.out.println("*************************");
						Asientos_S6_F1=Sala_Imax_B.Reservar(cantidad_entradas);
						break;
					}	
				break;
			case 2:
				
				switch (horas) {
				case 1:
					Sala_4DX.Pintar();
					System.out.println("*************************");
					Asientos_S4_F2=Sala_4DX.Reservar(cantidad_entradas);
					break;
				case 2:
					Sala_3D.Pintar();
					System.out.println("*************************");
					Asientos_S3_F2=Sala_3D.Reservar(cantidad_entradas);	
					break;
			
				case 3:
					Sala_Imax_A.Pintar();
					System.out.println("*************************");
					Asientos_S5_F2=Sala_Imax_A.Reservar(cantidad_entradas);
					break;
					}
				break;
			
			case 3:
				
				switch (horas) {
				case 1:
					Sala_2D_B.Pintar();
					System.out.println("*************************");
					Asientos_S5_F3=Sala_Imax_A.Reservar(cantidad_entradas);			
					break;
				case 2:
					Sala_Imax_A.Pintar();
					System.out.println("*************************");
					Asientos_S5_F3=Sala_Imax_A.Reservar(cantidad_entradas);		
					break;
			
				case 3:
					Sala_2D_B.Pintar();
					System.out.println("*************************");
					Asientos_S2_F3_2=Sala_Imax_A.Reservar(cantidad_entradas);	
					break;
			
				case 4:
					Sala_3D.Pintar();
					System.out.println("*************************");
					Asientos_S3_F3=Sala_Imax_A.Reservar(cantidad_entradas);	
					break;
				}	
				break;
			
		case 4:
				switch (horas) {
				case 1:
					Sala_Imax_B.Pintar();
					System.out.println("*************************");
					Asientos_S6_F4=Sala_Imax_A.Reservar(cantidad_entradas);					
					break;
				case 2:
					Sala_Imax_B.Pintar();
					System.out.println("*************************");
					Asientos_S6_F4_2=Sala_Imax_A.Reservar(cantidad_entradas);	
					break;
			
				case 3:
					Sala_2D_B.Pintar();
					System.out.println("*************************");
					Asientos_S2_F4=Sala_2D_B.Reservar(cantidad_entradas);
					break;
					}	
				break;
			
		case 5:
				
				switch (horas) {
				case 1:
					Sala_2D_A.Pintar();
					System.out.println("*************************");
					Asientos_S1_F5=Sala_2D_A.Reservar(cantidad_entradas);				
					break;
				case 2:
					Sala_Imax_A.Pintar();
					System.out.println("*************************");
					Asientos_S5_F5=Sala_Imax_A.Reservar(cantidad_entradas);	
					break;
			
				case 3:
					Sala_4DX.Pintar();
					System.out.println("*************************");
					Asientos_S4_F5=Sala_4DX.Reservar(cantidad_entradas);	
					break;
				}	
				break;
			
		case 6:
				switch (horas) {
				case 1:
					Sala_2D_B.Pintar();
					System.out.println("*************************");
					Asientos_S2_F6=Sala_2D_B.Reservar(cantidad_entradas);					
					break;
				case 2:
					Sala_2D_A.Pintar();
					System.out.println("*************************");
					Asientos_S1_F6=Sala_2D_A.Reservar(cantidad_entradas);	
					break;
			
				case 3:
					Sala_2D_A.Pintar();
					System.out.println("*************************");
					Asientos_S1_F6_2=Sala_2D_A.Reservar(cantidad_entradas);
					break;
				}
				break;
		}
			
			
			hora = Integer.parseInt(horario[0].substring(0, 2));
			clientes.tipoSala(sala); 
			clientes.MontoAdulto(hora);
			clientes.MontoNino(hora);
			Total = clientes.Total() + Total;
			System.out.println("************************************");
					
				
			System.out.println("¿Desea realizar una venta? (si/no) :");
			respuesta = entrada.next();
        	}
		System.out.println(" la cantidad de ventas durante la jornada fue de: "+ Total);
		entrada.close();
	}
		
	
	
}

