package compañeros.Ejemplo03;

public class Comercial extends Personal{
	
	private double comision;

	public Comercial() {
	}

	public Comercial(String nombre, int edad, int salario, double comision) {
		super(nombre, edad, salario);
		this.comision = comision;
	}

	public double getComision() {
		return comision;
	}

	public void setComision(double comision) {
		this.comision = comision;
	}

	@Override
	public int plus() {
		
		if (super.getEdad()>=30 & comision>=200000) {		
			
			return super.getSalario() + super.PLUS;
			
		} else {
			
			return super.getSalario();
			
		}
		
	}

}
