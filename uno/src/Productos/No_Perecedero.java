package Productos;

public class No_Perecedero  extends Productos {
	private String Tipo;
		
	public No_Perecedero (String Nombre, int precio, int cantidad) {
		super(Nombre, precio, cantidad);
		
	}
	public double calcular (int precio, int cantidad) {
		double calculo;
		calculo = precio*cantidad;	
		return calculo;
	}
	public String getTipo() {
		return Tipo;
	}

	public void setTipo(String tipo) {
		Tipo = tipo;
	}
	
	
}