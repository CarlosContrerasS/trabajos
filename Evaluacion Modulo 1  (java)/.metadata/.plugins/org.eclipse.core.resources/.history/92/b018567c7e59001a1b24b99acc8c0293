package Prueba;

public class Kromi extends Carro {
	private int anoFabricacion;
	private String marca;
	
	
	public Kromi(int cantOcupantes, int fechaIng, int fila, int posicion, int anoFabricacion, String marca) {
		super(cantOcupantes, fechaIng, fila, posicion);
		this.anoFabricacion = anoFabricacion;
		this.marca = marca;
	}
		
	public Kromi() {
		
	}
	
	public String[][] Posicion_Kromi() {//entrega el punto final de un Caguano
		String [][] Matriz_Kromi = new String[3][3];
		Matriz_Kromi[0][0]=Integer.toString(getFila());
		Matriz_Kromi[0][1]=Integer.toString(getColumna());
		Matriz_Kromi[0][2]="[ K ]";
		Matriz_Kromi[1][0]=Integer.toString(getFila()+1);
		Matriz_Kromi[1][1]=Integer.toString(getColumna());
		Matriz_Kromi[1][2]="[ K ]";
		Matriz_Kromi[2][0]=Integer.toString(getFila()+2);
		Matriz_Kromi[2][1]=Integer.toString(getColumna());
		Matriz_Kromi[2][2]="[ K ]";
		return Matriz_Kromi;
	}
	
	public int[] Vectorfinal_Kromi(int fila, int columna) {//entrega el punto final de un Kromi
		int [] Vectorfinal_Kromi = new int[2];
		Vectorfinal_Kromi[0]=fila+2;
		Vectorfinal_Kromi[1]=columna;
		
		return Vectorfinal_Kromi;
	}
	
	public int getAnoFabricacion() {
		return anoFabricacion;
	}
	public void setAnoFabricacion(int anoFabricacion) {
		this.anoFabricacion = anoFabricacion;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	
	}




