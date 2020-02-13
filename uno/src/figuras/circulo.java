package figuras;

public class circulo extends Figura{
	private double radio;
	
	public circulo (double x, double y, double radio){
		super(x,y);
		this.radio = radio;
		
	}
	
	public double area(){
		return Math.PI*radio*radio;
	}
}
	
	
