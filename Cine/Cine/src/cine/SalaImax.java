package cine;

import java.util.Scanner;

public class SalaImax extends Sala {
	private int numSala=5;
	private int valorAsiento=5000;
	private int cantAsiento=40;
	private int[] Asientos = new int[getCantAsiento()];
	
	public SalaImax(int numSala, int valorAsiento, int cantAsiento) {
		
		this.numSala=numSala;
		this.valorAsiento = valorAsiento;
		this.cantAsiento=cantAsiento;
		
	}
	
	public SalaImax() {
		
	}
	
	public int[] Asientos() {
		
		for (int i =0;i<getCantAsiento(); i++) {
			setAsientos(i, 1);
		}
	
		return Asientos;
	}
	
	public void Pintar() {
		int fila = 0;
		int cantidad_sala= getCantAsiento();
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
							if (getAsientos((contador-1))==0) {
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
							if (getAsientos((contador-1))==0) {
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
					if (getAsientos((contador-1))==0) {
						System.out.println("R"+" ");
						
					} 	else {
						System.out.println(contador+"  ");
						
						}
						
				}
				
		}

	public int[] Reservar( int entradas) {
		Scanner entrada = new Scanner(System.in);
		int contador;
		int fila=0;
		int contador_2=0;
		int acumulador=0;
		
		int cantidad_sala=getCantAsiento();
		
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
			acumulador+=getAsientos(i);
		}
		
		System.out.println("*************************");
		System.out.println("bienvendos en esta sala se encuentran disponibles  "
				+ acumulador+ " entradas");
		
								
			do {
				contador=0;
			
			System.out.println("Ingrese el asiento que desea reservar :");
			int reserva = entrada.nextInt();
			
			for(int i = 0; i<fila; i++) {
				for(int j = 0; j<4; j++) {
					if (contador <10) {
						contador++;
							if (contador == reserva || getAsientos((contador-1))==0) {
								System.out.print("R"+"   ");
								setAsientos((contador-1), 0);
								}
							else {
								System.out.print(contador+"   ");		
								}
					}
					if (contador >=10) {
						contador++;
							if (contador == reserva || getAsientos((contador-1))==0) {
								System.out.print("R"+"   ");
								setAsientos((contador-1), 0);
																} 
							else {
								System.out.print(contador +"  ");
								}
							}
					}
				contador++;
				if (contador == reserva || getAsientos((contador-1))==0) {
					System.out.println("R"+" ");
					setAsientos((contador-1), 0);
										
				} 	else {
					System.out.println(contador+"  ");
					
					}
			}
			contador_2++;		
		}while(contador_2 <entradas);
			
			entrada.nextLine(); 
			return Asientos;
								
	}
	
	public int getNumSala() {
		return numSala;
	}

	public void setNumSala(int numSala) {
		this.numSala = numSala;
	}

	public int getValorAsiento() {
		return valorAsiento;
	}

	public void setValorAsiento(int valorAsiento) {
		this.valorAsiento = valorAsiento;
	}

	public int getCantAsiento() {
		return cantAsiento;
	}

	public void setCantAsiento(int cantAsiento) {
		this.cantAsiento = cantAsiento;
	}
	
	public int getAsientos(int i) {
		return Asientos[i];
	}

	public void setAsientos(int indice, int valor) {
		Asientos[indice] = valor;
	}
	
	
	
}
