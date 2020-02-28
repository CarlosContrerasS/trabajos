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




