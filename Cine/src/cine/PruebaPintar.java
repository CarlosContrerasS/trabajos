package cine;

import java.util.Scanner;


public class PruebaPintar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int cantidad_1=0, cantidad_2=0, cantidad=0;
		int Asientos[] = new int[40];
		
		Sala2D sala2d_A = new Sala2D();
		Sala2D sala2d_B = new Sala2D();
		Sala3D sala3d = new Sala3D();
		Sala4Dx sala4dx = new Sala4Dx();
		SalaImax salaimax_A = new SalaImax();
		SalaImax salaimax_B = new SalaImax();
		
		cliente clientes = new cliente();
		
		clientes.adultos();
		clientes.ninos();
		
		int cantidad_entradas = clientes.getAdulto() + clientes.getNino();
		System.out.println("la cantidad de entrada de niños es: "+ clientes.getNino()
							+"\n" +" la cantidad de Adultos es :" + clientes.getAdulto()
							+"\n" + " la cantidad total es  : "+ cantidad_entradas);
		
		int horario = funciones.Funciones();
		
		for (int i=0; i<40; i++) {
			Asientos[i]=1;
		}
		
				
		cantidad_1 =ContarVentas(Asientos, 40);
		
		System.out.println("*************************");
		//debo enviarle la cantidad de filas, columnas para la sala
		// y el arreglo de asientos para que vea si estan 
		//desocupados o no.
		Pintar(40, Asientos);
		
		
		//debo enviarle la cantidad de filas, columnas para mostrar
		// la sala y el arreglo de asientos para que guarde los cambios
		//que se realizaran por la reservas.
		
		Asientos=Reservar(40,cantidad_entradas, Asientos);
		
		System.out.println("*************************");
		
		cantidad_2 =ContarVentas(Asientos, 40);
		
		cantidad = cantidad_1 -cantidad_2;
		
		System.out.println("la cantidad de ventas realizadas fue de : " +cantidad);
		
		for(int i= 0; i<40; i++) {
			System.out.print(Asientos[i]);
		}
	}
	
	public static void Pintar(int cantidad_sala, int[] asiento) {
		int fila = 0;
		switch (cantidad_sala){
        
    	case 40:
    		fila = 8;
    		break;
    	case 35:
    		fila = 7;
    		break;
    	case 30:
    		fila = 6;
    		}
		
		int contador =0; //este sera el numero que la persona
		//vera en la pantalla para ver los asientos disponibles
		
				for(int i = 0; i<fila; i++) {//para ver las filas
					for(int j = 0; j<4; j++) {
						//segundo for para las columnas 
						//excapto para la ultima, que ya la ultima debe
						//cortar mas a la fila que sigue.
						if (contador <10) {
							//Esta condicion es solo para que
							//se pueda ver mas cuadrado el conjunto
							//completo en pantalla
							contador++; 
							if (asiento[(contador-1)]==0) {
								//verifico si este asiento ya se encuentra 
								//reservado y si lo esta coloco una R.
								System.out.print("R"+"   ");
								}
								else { 
								//Si no esta reservado coloco el contador
							System.out.print(contador+"   ");		
							}
							//ahora procedo a realizar lo mismo
							//para cuando el contador es mayor 
							//o igual a 10.
						} else {
							contador++;
							if (asiento[(contador-1)]==0) {
								//como solo coloco un caracter (R) le doy mas 
								//espacios, tal como arriba.
								System.out.print("R"+"   ");
								} 
							else {
								//fijese que solo tiene menos espacio.
							System.out.print(contador +"  ");
								}
						}
					}
					//esta parte es depues del primer for y se realiza para
					//completar la ultima columna, asi los numeros siguientes 
					//apareceran en la fila que sigue.
					contador++;
					if (asiento[(contador-1)]==0) {
						System.out.println("R"+" ");
						
					} 	else {
						System.out.println(contador+"  ");
						
						}
						
				}
				
		}
	
	public static int[] Reservar(int cantidad_sala, int entradas, int asiento[]) {
		Scanner entrada = new Scanner(System.in);
		int contador;
		int fila=0;
		int contador_2=0;
		int acumulador=0;
		
		switch (cantidad_sala){
        
        	case 40:
        		fila = 8;
        		break;
        	case 35:
        		fila = 7;
        		break;
        	case 30:
        		fila = 6;
        		}
		
		for (int i=0; i<(fila*5); i++) {
			acumulador+=asiento[i];
		}
		
		System.out.println("*************************");
		System.out.println("bienvendos en esta sala se encuentran disponibles  "
				+ acumulador+ " entradas");
		
		
		System.out.println("¿Desea realizar una reserva? (si/no) :");
		String respuesta = entrada.next();
		
		
		while (respuesta.equalsIgnoreCase("si")) {
						
			do {
				contador=0;
			
			System.out.println("Ingrese el asiento que desea reservar :");
			int reserva = entrada.nextInt();
			
			for(int i = 0; i<fila; i++) {
				for(int j = 0; j<4; j++) {
					if (contador <10) {
						contador++;
							if (contador == reserva || asiento[(contador-1)]==0) {
								System.out.print("R"+"    ");
								asiento[(contador-1)]=0;
								}
							else {
								System.out.print(contador+"   ");		
								}
					}
					if (contador >=10) {
						contador++;
							if (contador == reserva || asiento[(contador-1)]==0) {
								System.out.print("R"+"   ");
								asiento[(contador-1)]=0;
																} 
							else {
								System.out.print(contador +"  ");
								}
							}
					}
				contador++;
				if (contador == reserva || asiento[(contador-1)]==0) {
					System.out.println("R"+" ");
					asiento[(contador-1)]=0;
										
				} 	else {
					System.out.println(contador+"  ");
					
					}
			}
			contador_2++;		
		}while(contador_2 <entradas);
			respuesta = "no";
		}
		
		entrada.nextLine(); 
		return asiento;
						
	}
	
	public static int ContarVentas(int arreglo[], int cantidad) {
		int acumulador = 0;
		for (int i=0; i<cantidad; i++) {
			acumulador =arreglo[i]+acumulador;
		}
		
		return acumulador;
	}
	
}

