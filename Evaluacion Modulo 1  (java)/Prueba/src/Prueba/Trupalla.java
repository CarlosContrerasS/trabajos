package Prueba;

public class Trupalla extends Carro{

	private int nivelArmadura;
	private String Nombre;
	public Trupalla(int cantOcupantes, int fechaIng, int fila, int columna, int nivelArmadura, String nombre) {
		super(cantOcupantes, fechaIng, fila, columna);
		this.nivelArmadura = nivelArmadura;
		Nombre = nombre;
	}
	
	public Trupalla() {
		
	}
	
	public int getNivelArmadura() {
		return nivelArmadura;
	}
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	} 
	
}
