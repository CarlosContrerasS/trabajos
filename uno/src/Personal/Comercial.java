package Personal;

public class Comercial extends Personal{
	private double Comision;
	
	public Comercial (String Nombre, int edad, double Salario, double Comision) {
		super(Nombre, edad, Salario);
		this.Comision=Comision;
		
	}
	
	public void Plus() {
		if (getEdad() >30) {
			if (getComision()==200000)
			setSalario(getSalario()+getComision());
		}
	
	}

	public double getComision() {
		return Comision;
	}

	public void setComision(double Comision) {
		this.Comision = Comision;
	}
	
}
