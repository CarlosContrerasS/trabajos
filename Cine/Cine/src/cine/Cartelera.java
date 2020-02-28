package cine;
import java.util.Scanner;

public class Cartelera {
	
	public Cartelera() {
		
	}

	public static String[] cartelera(String[] Peliculas) {
		String pelicula ="";
		String horario ="";
		Boolean test= true;
		int opcion = 0;
		String [] vector_seleccion = new String[3];
		Scanner entrada = new Scanner(System.in);
	
		
		while(test != false) {
				System.out.println("************************************"
					+"\n"+" Bienvedidos, el d�a de hoy tenemos las siguientes peliculas:"
					+"\n"+"1 : "+Peliculas[0] + "\n"+"2 : "+Peliculas[1]
					+"\n" + "3 : "+Peliculas[2]+"\n" + "4 : "+Peliculas[3]
					+"\n" + "5 : "+Peliculas[4]+"\n" + "6 : "+Peliculas[5]
					+"\n" +"Escoga una opci�n por favor: " );
		
			int Opcion_1 = entrada.nextInt();
			opcion = Opcion_1;
			
		
			switch (Opcion_1) {
				case 1:
					test = false;
					horario = "1";
					pelicula =Peliculas[0];
					System.out.println("seleccionaste pelicula: " +Peliculas[0]);
					break;
				case 2:
					test = false;
					horario = "2";
					System.out.println("seleccionaste pelicula: " +Peliculas[1]);
					pelicula =Peliculas[1];
					break;
					
				case 3:
					test = false;
					horario = "3";
					System.out.println("seleccionaste pelicula: " +Peliculas[2]);
					pelicula =Peliculas[2];
					break;
					
				case 4:
					test = false;
					horario = "4";
					System.out.println("seleccionaste pelicula: " +Peliculas[3]);
					pelicula =Peliculas[3];
					break;
					
				case 5:
					test = false;
					horario = "5";
					System.out.println("seleccionaste pelicula: " +Peliculas[4]);
					pelicula =Peliculas[4];
					break;
					
				case 6:
					test = false;
					horario = "6";
					System.out.println("seleccionaste pelicula: " +Peliculas[5]);
					pelicula =Peliculas[5];
					break;
			
				default:
					System.out.println("seleccionaste una pelicula que no existe. Elige nuevamente");
					test = true;
					break;
				}
			}
		
		vector_seleccion[0] = pelicula;
		vector_seleccion[1] = horario;
		vector_seleccion[2] = Integer.toString(opcion);
		
		return vector_seleccion;

		}
	
	public static String[] horario(String Peliculas) {
		String[] seleccion = new String[2];
		Boolean test= true;	
		Scanner entrada = new Scanner(System.in);
		
		while(test != false) {
			
			int peli = Integer.parseInt(Peliculas);
	
		switch (peli) {
			case 1:
				test = false;
				String Horarios_1[]= {"12:00 horas en Sala 2D", "15:00 horas en Sala 3D", 
						"18:00 horas en Sala 4DX", "23:00 horas en Sala Imax"};
				
				System.out.println("************************************"
						+"\n"+" Bienvedidos, la pelicula selecionada se encuentra en los siguientes horarios:"
						+"\n"+"1 : "+Horarios_1[0] + "\n"+"2 : "+Horarios_1[1]
						+"\n" + "3 : "+Horarios_1[2]+"\n" + "4 : "+Horarios_1[3]
						+"\n" +"Escoga una opci�n por favor: " );
				
				int Opcion = entrada.nextInt();
				switch (Opcion) {
				
				case 1:
					System.out.println("ha selecionado a las " +Horarios_1[0]);
					seleccion[0] = Horarios_1[0];
					seleccion[1] =  Integer.toString(Opcion);
					break;
				case 2:
					System.out.println("ha selecionado a las " +Horarios_1[1]);
					seleccion[0] = Horarios_1[1];
					seleccion[1] =  Integer.toString(Opcion);
					break;
					
				case 3:
					System.out.println("ha selecionado a las " +Horarios_1[2]);
					seleccion[0] = Horarios_1[2];
					seleccion[1] =  Integer.toString(Opcion);
					break;
					
				case 4:
					System.out.println("ha selecionado a las " +Horarios_1[3]);
					seleccion[0] = Horarios_1[3];
					seleccion[1] =  Integer.toString(Opcion);
					break;
			
				default:
					System.out.println("seleccionaste una Horario que no existe. Elige nuevamente");
					test = true;
					break;
				}
				
				break;
				
			case 2:
				test = false;
				String Horarios_2[]= { "15:30 horas en Sala 4DX", "18:30 horas en Sala 3D",
						"21:30 horas en Sala Imax"};
				
				System.out.println("************************************"
						+"\n"+" Bienvedidos, la pelicula selecionada se encuentra en los siguientes horarios:"
						+"\n"+"1 : "+Horarios_2[0] + "\n"+"2 : "+Horarios_2[1]
						+"\n" + "3 : "+Horarios_2[2]+"\n" 
						+"\n" +"Escoga una opci�n por favor: " );
				
				int Opcion_2 = entrada.nextInt();
				switch (Opcion_2) {
				
				case 1:
					System.out.println("ha selecionado a las " +Horarios_2[0]);
					seleccion[0] = Horarios_2[0];
					seleccion[1] =  Integer.toString(Opcion_2);
					
					break;
				case 2:
					System.out.println("ha selecionado a las " +Horarios_2[1]);
					seleccion[0] = Horarios_2[1];
					seleccion[1] =  Integer.toString(Opcion_2);
					break;
					
				case 3:
					System.out.println("ha selecionado a las " +Horarios_2[2]);
					seleccion[0] = Horarios_2[2];
					seleccion[1] =  Integer.toString(Opcion_2);
					break;
					
					
				default:
					System.out.println("seleccionaste una Horario que no existe. Elige nuevamente");
					test = true;
					break;
				}
				
				break;
				
			case 3:
				test = false;
				String Horarios_3[]= {"13:00 horas en Sala 2D", "15:00 horas en Sala Imax", 
						"19:00 horas en Sala 2D", "22:00 horas en Sala 3D"};
				
				System.out.println("************************************"
						+"\n"+" Bienvedidos, la pelicula selecionada se encuentra en los siguientes horarios:"
						+"\n"+"1 : "+Horarios_3[0] + "\n"+"2 : "+Horarios_3[1]
						+"\n" + "3 : "+Horarios_3[2]+"\n" + "4 : "+Horarios_3[3]
						+"\n" +"Escoga una opci�n por favor: " );
				
				int Opcion_3 = entrada.nextInt();
				switch (Opcion_3) {
				
				case 1:
					System.out.println("ha selecionado a las " +Horarios_3[0]);
					seleccion[0] = Horarios_3[0];
					seleccion[1] =  Integer.toString(Opcion_3);
					break;
				case 2:
					System.out.println("ha selecionado a las " +Horarios_3[1]);
					seleccion[0] = Horarios_3[1];
					seleccion[1] =  Integer.toString(Opcion_3);
					break;
					
				case 3:
					System.out.println("ha selecionado a las " +Horarios_3[2]);
					seleccion[0] = Horarios_3[2];
					seleccion[1] =  Integer.toString(Opcion_3);
					break;
					
				case 4:
					System.out.println("ha selecionado a las " +Horarios_3[3]);
					seleccion[0] = Horarios_3[3];
					seleccion[1] =  Integer.toString(Opcion_3);
					break;
			
				default:
					System.out.println("seleccionaste una Horario que no existe. Elige nuevamente");
					test = true;
					break;
				}
				
				break;
				
			case 4:
				test = false;
				String Horarios_4[]= {"17:00 horas en Sala Imax", "20:00 horas en Sala Imax", 
						"23:00 horas en Sala 2D"};
				
				System.out.println("************************************"
						+"\n"+" Bienvedidos, la pelicula selecionada se encuentra en los siguientes horarios:"
						+"\n"+"1 : "+Horarios_4[0] + "\n"+"2 : "+Horarios_4[1]
						+"\n" + "3 : "+Horarios_4[2]+"\n" 
						+"\n" +"Escoga una opci�n por favor: " );
				
				int Opcion_4 = entrada.nextInt();
				switch (Opcion_4) {
				
				case 1:
					System.out.println("ha selecionado a las " +Horarios_4[0]);
					seleccion[0] = Horarios_4[0];
					seleccion[1] =  Integer.toString(Opcion_4);
					break;
				case 2:
					System.out.println("ha selecionado a las " +Horarios_4[1]);
					seleccion[0] = Horarios_4[1];
					seleccion[1] =  Integer.toString(Opcion_4);
					break;
					
				case 3:
					System.out.println("ha selecionado a las " +Horarios_4[2]);
					seleccion[0] = Horarios_4[2];
					seleccion[1] =  Integer.toString(Opcion_4);
					break;
					
				default:
					System.out.println("seleccionaste una Horario que no existe. Elige nuevamente");
					test = true;
					break;
				}
				
				break;
				
			case 5:
				test = false;
				String Horarios_5[]= {"14:30 horas en Sala 2D", "17:30 horas en Sala Imax", 
						"23:30 horas en Sala 4DX"};
				
				System.out.println("************************************"
						+"\n"+" Bienvedidos, la pelicula selecionada se encuentra en los siguientes horarios:"
						+"\n"+"1 : "+Horarios_5[0] + "\n"+"2 : "+Horarios_5[1]
						+"\n" + "3 : "+Horarios_5[2]+"\n" 
						+"\n" +"Escoga una opci�n por favor: " );
				
				int Opcion_5 = entrada.nextInt();
				switch (Opcion_5) {
				
				case 1:
					System.out.println("ha selecionado a las " +Horarios_5[0]);
					seleccion[0] = Horarios_5[0];
					seleccion[1] =  Integer.toString(Opcion_5);
					break;
				case 2:
					System.out.println("ha selecionado a las " +Horarios_5[1]);
					seleccion[0] = Horarios_5[1];
					seleccion[1] =  Integer.toString(Opcion_5);
					break;
					
				case 3:
					System.out.println("ha selecionado a las " +Horarios_5[2]);
					seleccion[0] = Horarios_5[2];
					seleccion[1] =  Integer.toString(Opcion_5);
					break;
					
				default:
					System.out.println("seleccionaste una Horario que no existe. Elige nuevamente");
					test = true;
					break;
				}
				
				break;
				
				
			case 6:
				test = false;
				String Horarios_6[]= {"16:00 horas en Sala 2D", "17:45 horas en Sala 2D", 
						"21:45 horas en Sala 2D"};
				
				System.out.println("************************************"
						+"\n"+" Bienvedidos, la pelicula selecionada se encuentra en los siguientes horarios:"
						+"\n"+"1 : "+Horarios_6[0] + "\n"+"2 : "+Horarios_6[1]
						+"\n" + "3 : "+Horarios_6[2]+"\n" 
						+"\n" +"Escoga una opci�n por favor: " );
				
				int Opcion_6 = entrada.nextInt();
				switch (Opcion_6) {
				
				case 1:
					System.out.println("ha selecionado a las " +Horarios_6[0]);
					seleccion[0] = Horarios_6[0];
					seleccion[1] =  Integer.toString(Opcion_6);
					break;
				case 2:
					System.out.println("ha selecionado a las " +Horarios_6[1]);
					seleccion[0] = Horarios_6[1];
					seleccion[1] =  Integer.toString(Opcion_6);
					break;
					
				case 3:
					System.out.println("ha selecionado a las " +Horarios_6[2]);
					seleccion[0] = Horarios_6[2];
					seleccion[1] =  Integer.toString(Opcion_6);
					break;
					
				default:
					System.out.println("seleccionaste una Horario que no existe. Elige nuevamente");
					test = true;
					break;
				}
				
				break;
				
			}
		}
		
	return seleccion;
	}
	
	public static int asignacion_sala(String Pelicula, String horario) {
		int seleccion=0;
		Boolean test=true;
		
		int peli = Integer.parseInt(Pelicula);
		int hora = Integer.parseInt(horario);
		
		while(test != false) {
		switch (peli) {
			case 1:
				test = false;
				switch (hora) {
					case 1:
						test = false;
						seleccion=1;				
						break;
					case 2:
						test = false;
						seleccion=3;	
						break;
				
					case 3:
						test = false;
						seleccion=4;
						break;
				
					case 4:
						test = false;
						seleccion=6;
						break;
					}	
				break;
			case 2:
				test = false;
				switch (hora) {
				case 1:
					test = false;
					seleccion=4;				
					break;
				case 2:
					test = false;
					seleccion=3;	
					break;
			
				case 3:
					test = false;
					seleccion=5;
					break;
			
				}
			
			
				break;
			
			case 3:
				test = false;
				switch (hora) {
				case 1:
					test = false;
					seleccion=2;				
					break;
				case 2:
					test = false;
					seleccion=5;	
					break;
			
				case 3:
					test = false;
					seleccion=2;
					break;
			
				case 4:
					test = false;
					seleccion=3;
					break;
				}	
			
				break;
			
		case 4:
				test = false;
				switch (hora) {
				case 1:
					test = false;
					seleccion=6;				
					break;
				case 2:
					test = false;
					seleccion=6;	
					break;
			
				case 3:
					test = false;
					seleccion=2;
					break;
			
					}	
				break;
			
		case 5:
				test = false;
				switch (hora) {
				case 1:
					test = false;
					seleccion=1;				
					break;
				case 2:
					test = false;
					seleccion=5;	
					break;
			
				case 3:
					test = false;
					seleccion=4;
					break;
			
				}	
			
				break;
			
		case 6:
				test = false;
				switch (hora) {
				case 1:
					test = false;
					seleccion=2;				
					break;
				case 2:
					test = false;
					seleccion=1;	
					break;
			
				case 3:
					test = false;
					seleccion=1;
					break;
				}
				break;
		}
	  }
		
		return seleccion;
	}
}
