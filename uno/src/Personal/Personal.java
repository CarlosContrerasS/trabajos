package Personal;

public class Personal {
	private String Nombre;
	private int edad;
	private double Salario;
	final  double PLUSS = 50000;
	
	public Personal (String Nombre, int edad, double Salario) {
		this.Nombre = Nombre;
		this.edad = edad;
		this.Salario = Salario;
		}
	public Personal () {
		}
	
	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSalario() {
		return Salario;
	}

	public void setSalario(double salario) {
		Salario = salario;
	}
	
}
