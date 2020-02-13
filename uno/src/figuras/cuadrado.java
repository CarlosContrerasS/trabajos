package figuras;

public class cuadrado extends Figura{
	private double lado;
	
	public cuadrado (double x, double y, double lado) {
		super(x, y);
		this.lado = lado;
		
	}
	public double area(){
		return lado*lado;
	}
}
