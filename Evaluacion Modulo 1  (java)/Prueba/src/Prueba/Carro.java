package Prueba;

public abstract class Carro {
	
	private int cantOcupantes;
	private int fechaIng;
	private int fila;
	private int columna;
	
	
	public Carro(int cantOcupantes, int fechaIng, int fila, int columna) {
		this.cantOcupantes = cantOcupantes;
		this.fechaIng = fechaIng;
		this.fila=fila;
		this.columna=columna;
		
		
	}
	
	public Carro() {
		
	}

	public int getCantOcupantes() {
		return cantOcupantes;
	}

	public void setCantOcupantes(int cantOcupantes) {
		this.cantOcupantes = cantOcupantes;
	}

	public int getFechaIng() {
		return fechaIng;
	}

	public void setFechaIng(int fechaIng) {
		this.fechaIng = fechaIng;
	}

	public int getFila() {
		return fila;
	}

	public void setFila(int valor) {
		this.fila=valor;
	}

	public int getColumna() {
		return columna;
	}

	public void setColumna(int valor) {
		this.columna=valor;
	}

	
}
