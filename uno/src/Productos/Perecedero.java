package Productos;

public class Perecedero extends Productos {
	private int dias_caduca;
	
	public Perecedero (String Nombre, int precio, int cantidad, int dias_caduca) {
		super(Nombre, precio, cantidad);
		this.dias_caduca = dias_caduca;
		}
	
	public double calcular (int precio, int cantidad) {
		double calculo;
		calculo = super.getPrecio()*super.getCantidad();	
		if (dias_caduca == 1){
			calculo = calculo/4;
		}
		if (dias_caduca == 2) {
			calculo = calculo/3;
		}
		if (dias_caduca == 3) {
			calculo = calculo/2;
		}
		return calculo;
	}

	public int getDias_caduca() {
		return dias_caduca;
	}

	public void setDias_caduca(int dias_caduca) {
		this.dias_caduca = dias_caduca;
	}
}