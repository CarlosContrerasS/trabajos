package Personal;

public class Repartidor extends Personal {
	private int Zona;
	private String plus = "No";
	
	public Repartidor(String Nombre, int edad, double Salario, int Zona) {
		super(Nombre, edad, Salario);
		this.Zona = Zona;
		
	}
	
	public String  Plus() {
		if (getZona() == 3) {
			if (getEdad() <25) {
				setSalario(super.PLUSS+getSalario());
				return plus = "Si";
				}
				
			}
		return plus;
		}
	
	public int getZona() {
		return Zona;
	}
	
	public void setZona(int Zona) {
		this.Zona = Zona;
	}
		
	public String getplus() {
		return plus;
	}
	
}
