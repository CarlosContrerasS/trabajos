package Prueba;

import javax.swing.JOptionPane;

public class Tablero {
	
	public static void main(String[] args) {
			
	
		String [][]Matriz = CrearMatriz(); //Creamos la Matriz.
		
		Matriz=CrearCarro(Matriz); //creamos los objetos de Carro.
		
		MostrarMatriz(Matriz);//
		
	
		
		
		
		Matriz = LanzarHuevo( Matriz);
		
		MostrarMatriz(Matriz);
		
	
		
		
				
				
	}
public  static String [][] LanzarHuevo (String[][] Matriz) {
	
	int acum=0;
	Boolean test = true;
	Huevo Lanzamiento_Huevo = new Huevo();

	
	
	
	while(test != false) {
		String opcion = JOptionPane.showInputDialog("�Desea lanzar un huevo?, indique Si o No");
		
		
		
		if ( opcion.equalsIgnoreCase("si")) {
			
			test = true;
		
			String colum = JOptionPane.showInputDialog("\"Indique la Columna en la que quieras "
					+ "lanzar el huevo (escoge un numero de 1 hasta la 15\"");
			int columna = Integer.parseInt(colum);
			
			String fil = JOptionPane.showInputDialog("\"Indique la fila en la que quieras "
					+ "lanzar el huevo (escoge un numero de 1 hasta la 15\"");
			int fila = Integer.parseInt(fil);
			
			Lanzamiento_Huevo.setFila(fila);
			Lanzamiento_Huevo.setColumna(columna);
			
			
			if (Matriz[columna][fila]=="[   ]"){
				Matriz[columna][fila]="[ H ]";
				System.out.println("Oh!!!, no habia Nada all�!!!!!");
				MostrarMatriz(Matriz);
				}
			if (Matriz[columna][fila]=="[ K ]") {
				Matriz[columna][fila]="[ Hk ]";
				Lanzamiento_Huevo.setPuntajeK(3);
				System.out.println("Excelente!!!, bien hecho!!!");
				MostrarMatriz(Matriz);
			}
			if (Matriz[columna][fila]=="[ C ]") {
				Matriz[columna][fila]="[ Hc ]";
				Lanzamiento_Huevo.setPuntajeC(2);
				System.out.println("Excelente!!!, bien hecho!!!");
				MostrarMatriz(Matriz);
			}
			if (Matriz[columna][fila]=="[ T ]") {
				Matriz[columna][fila]="[ Ht ]";
				System.out.println("Excelente!!!, bien hecho!!!");
				MostrarMatriz(Matriz);
			}
			
			if (Matriz[columna][fila]=="[ Hk ]" && Matriz[columna][fila+1]=="[ Hk ]" && Matriz[columna][fila+2]=="[ Hk ]"
					|| Matriz[columna][fila]=="[ Hk ]" && Matriz[columna][fila-1]=="[ Hk ]" && Matriz[columna][fila-2]=="[ Hk ]"
					|| Matriz[columna][fila+1]=="[ Hk ]" && Matriz[columna][fila]=="[ Hk ]" && Matriz[columna][fila-1]=="[ Hk ]") {
					
				System.out.println("Excelente!!!, bien hecho!!!, una Kromi completamente destruida!!");
				
				Lanzamiento_Huevo.setPuntajeAdicional(10);
				MostrarMatriz(Matriz);
			}
			
			if (Matriz[columna][fila]=="[ Hc ]" &&  Matriz[columna+1][fila]=="[ Hc ]" 
					|| Matriz[columna][fila]=="[ Hc ]" &&  Matriz[columna-1][fila]=="[ Hc ]") {
				
				System.out.println("Excelente!!!, bien hecho!!!, un Caguano completamente destruido!!");
				
				Lanzamiento_Huevo.setPuntajeAdicional(7);
				MostrarMatriz(Matriz);
			}
			
			int Total = Lanzamiento_Huevo.getPuntajeK()+Lanzamiento_Huevo.getPuntajeC()
			+Lanzamiento_Huevo.getPuntajeAdicional();
			acum+=Total;
	
			Lanzamiento_Huevo.setPuntajeTotal(Total);
		}
		else {
			test = false;
			System.out.println("Muchas Gracias por realizar esta prueba");
			System.out.println("su puntaje obtenido es : "+ acum);
		}
			
		}
		
	return Matriz;
	}
	
			
	public static void MostrarMatriz(String [][] Matriz) {
		//Para mostrar la matriz
		for(int i = 0; i<16; i++) {
			for(int j = 0; j<15; j++) {
				System.out.print(Matriz[j][i]+" \t");
			}
			System.out.println(" "+Matriz[15][i]+" \t  ");
		}
		
	}
	
	public int CalcularPuntaje() {
		int puntaje=0;
		
		return puntaje;
	}
	
	public static String [][] CrearMatriz(){
		int contador =0;
		int Cont=0;
		String[][] Matriz = new String [16][16];	
		
		//Para llenar la Matriz inicial.
				
		for(int j = 0; j<16; j++) {//eje y (vertical)
			for(int i = 0; i<16; i++) {//eje x (horizontal)
				
				if (i==0 && j==0) { //posicion (0,0) se da un espacio
					Matriz[0][0]=("  ");
					}
				else if(j==0 && i>0 ) { //Para el eje horizontal, colocamos letras de A hasta la O
					Cont++;
					Matriz[i][0]=("  "+Integer.toString(Cont)); //transformamos el caracter en String
					
					}
				else if(i==0 && j>0 ) {//Para el eje vertical, colocamos numeros de 1 a 15.
						if (contador <9) {//esta parte es para que tenga el mismo ancho los 
										 // numeros menores que 10.(recuerde que se incrementa
										// que se imprime.
							contador++;
							Matriz[0][j]=("  "+Integer.toString(contador));					
							}
						else {// los numeros mayores de 10.
						contador++;
						Matriz[0][j]=(" "+Integer.toString(contador));
						}
				}
				else //Esta parte rellena lo que no esta en los ejes.
				
					Matriz[j][i]=("[   ]");
				}
			}
		
		return Matriz;
		
	}
	
	
	public static String[][] CrearCarro(String [][] Matriz) {
		
		//creaci�n de Objetos
			
		Kromi krom_1 = new Kromi(); //creamos 3 Objetos del tipo Kromi
		Kromi krom_2 = new Kromi();
		Kromi krom_3 = new Kromi();
				
		Caguano cag_1 = new Caguano();//Creamos 5 objtos del tipo Caguano
		Caguano cag_2 = new Caguano();
		Caguano cag_3 = new Caguano();
		Caguano cag_4 = new Caguano();
		Caguano cag_5 = new Caguano();
		
		Trupalla tru_1 = new Trupalla(); //Creamos 10 objetos del tipo Trupalla.
		Trupalla tru_2 = new Trupalla();
		Trupalla tru_3 = new Trupalla();
		Trupalla tru_4 = new Trupalla();
		Trupalla tru_5 = new Trupalla();
		Trupalla tru_6 = new Trupalla();
		Trupalla tru_7 = new Trupalla();
		Trupalla tru_8 = new Trupalla();
		Trupalla tru_9 = new Trupalla();
		Trupalla tru_10 = new Trupalla();
		

		int indice=0;
		
				do {
					if(indice ==0) {

						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
							if(Matriz[columna][fila]=="[   ]"&& Matriz[columna][fila+1]=="[   ]" 
									&& Matriz[columna][fila+2]=="[   ]") {
								indice=1;
								krom_1.setFila(fila);
								krom_1.setColumna(columna);
								Matriz[columna][fila]="[ K ]";
								Matriz[columna][fila+1]="[ K ]";
								Matriz[columna][fila+2]="[ K ]";
								}
					} 
						if(indice==1) {
						
						int columna =(int) (Math.random()*13+1);
						int fila = (int) (Math.random()*13+1);
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							indice=2;
							krom_2.setFila(fila);
							krom_2.setColumna(columna);
							Matriz[columna][fila]="[ K ]";
							Matriz[columna][fila+1]="[ K ]";
							Matriz[columna][fila+2]="[ K ]";
						}
						
					} 
						if (indice==2) {
						int columna =(int) (Math.random()*13+1);
						int fila = (int) (Math.random()*13+1);
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
								indice=3;
								krom_3.setFila(fila);
								krom_3.setColumna(columna);
								Matriz[columna][fila]="[ K ]";
								Matriz[columna][fila+1]="[ K ]";
								Matriz[columna][fila+2]="[ K ]";
								}
					}
				}while(indice<3);
				
				int indice_2=0;
				
				//Para ingresar los Caguanos
				
				do {
				
				if(indice_2 ==0) {

					int columna =(int) (Math.random()*13+1);
					int  fila = (int) (Math.random()*13+1);
					
					if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
							&& Matriz[columna-1][fila]=="[   ]") {
						indice_2=1;
						cag_1.setFila(fila);
						cag_1.setColumna(columna);
						Matriz[columna][fila]= "[ C ]";
						Matriz[columna+1][fila]= "[ C ]";
					}
				}
				
				if(indice_2 ==1) {
				int columna =(int) (Math.random()*13+1);
				int  fila = (int) (Math.random()*13+1);
				
				if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
						&& Matriz[columna-1][fila]=="[   ]") {
					indice_2=2;
					cag_2.setFila(fila);
					cag_2.setColumna(columna);
					Matriz[columna][fila]= "[ C ]";
					Matriz[columna+1][fila]= "[ C ]";
					}
				
				}
				if(indice_2 ==2) {
					int columna =(int) (Math.random()*13+1);
					int  fila = (int) (Math.random()*13+1);
					
					if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
							&& Matriz[columna-1][fila]=="[   ]") {
						indice_2=3;
						cag_3.setFila(fila);
						cag_3.setColumna(columna);
						Matriz[columna][fila]= "[ C ]";
						Matriz[columna+1][fila]= "[ C ]";
					}
				}
				
				if(indice_2 ==3) {
					int columna =(int) (Math.random()*13+1);
					int  fila = (int) (Math.random()*13+1);
					
					if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
							&& Matriz[columna-1][fila]=="[   ]") {
						indice_2=4;
						cag_4.setFila(fila);
						cag_4.setColumna(columna);
						Matriz[columna][fila]= "[ C ]";
						Matriz[columna+1][fila]= "[ C ]";
					}
				}
				
				if(indice_2 == 4) {
					int columna =(int) (Math.random()*13+1);
					int  fila = (int) (Math.random()*13+1);
					
					if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
							&& Matriz[columna-1][fila]=="[   ]") {
						indice_2= 5;
						cag_5.setFila(fila);
						cag_5.setColumna(columna);
						Matriz[columna][fila]= "[ C ]";
						Matriz[columna+1][fila]= "[ C ]";
					}
				}
				
			}while(indice_2<5);
				
				int indice_3=0;
				
				do {
					
					if(indice_3 ==0) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 1;
							tru_1.setFila(fila);
							tru_1.setColumna(columna);
							Matriz[columna][fila]="[ T ]";
							}
						}
					
					if(indice_3 ==1) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 2;
							tru_2.setFila(fila);
							tru_2.setColumna(columna);
							Matriz[columna][fila]="[ T ]";
						}
					}
					
					if(indice_3 ==2) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 3;
							tru_3.setFila(fila);
							tru_3.setColumna(columna);
							Matriz[columna][fila]="[ T ]";
						}
					}
					
					if(indice_3 ==3) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 4;
							tru_4.setFila(fila);
							tru_4.setColumna(columna);
							Matriz[columna][fila]="[ T ]";
							}
					}
					
					if(indice_3 ==4) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 5;
							tru_5.setFila(fila);
							tru_5.setColumna(columna);
							Matriz[columna][fila]="[ T ]";

							}
					}
					
					if(indice_3 ==5) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 6;
							tru_6.setFila(fila);
							tru_6.setColumna(columna);
							Matriz[columna][fila]="[ T ]";
							}
					}
					
					if(indice_3 ==6) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 7;
							tru_7.setFila(fila);
							tru_7.setColumna(columna);
							Matriz[columna][fila]="[ T ]";
							}
					}
					
					if(indice_3 ==7) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 8;
							tru_8.setFila(fila);
							tru_8.setColumna(columna);
							Matriz[columna][fila]="[ T ]";
							}
					}
					if(indice_3 ==8) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 9;
							tru_9.setFila(fila);
							tru_9.setColumna(columna);
							Matriz[columna][fila]="[ T ]";
						
							}
					}
					
					if(indice_3 ==9) {
						int columna =(int) (Math.random()*13+1);
						int  fila = (int) (Math.random()*13+1);
						
						if(Matriz[columna][fila]=="[   ]"&& Matriz[columna+1][fila]=="[   ]" 
								&& Matriz[columna-1][fila]=="[   ]" && Matriz[columna][fila+1]=="[   ]" 
								&& Matriz[columna][fila+2]=="[   ]") {
							
							indice_3= 10;
							tru_10.setFila(fila);
							tru_10.setColumna(columna);
							Matriz[columna][fila]="[ T ]";
						}
					}
					
					
					
					
					}while(indice_3<10);
					
		return Matriz;
	}
	
	

}
