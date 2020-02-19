package compañeros.Ejemplo03;

public class Repartidor extends Personal{

	private String zona;

	public Repartidor() {
	}

	public Repartidor(String nombre, int edad, int salario, String zona) {
		super(nombre, edad, salario);
		this.zona = zona;
	}
	
	public String getZona() {
		return zona;
	}

	public void setZona(String zona) {
		this.zona = zona;
	}

	@Override
	public int plus() {
		
		if (super.getEdad()<25 & zona=="3") {			
			
			return super.getSalario()+super.PLUS;
			
		} else {
			
			return super.getSalario();
			
		}
	}
	
}
