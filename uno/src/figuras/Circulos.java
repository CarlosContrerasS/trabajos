package figuras;

public class Circulos implements figura_interface {
	
	private double radio;
	
	public Circulos (double radio) {
		this.radio = radio;
	}
	
	public double area() {
		return Math.PI*radio*radio;
	}

}
