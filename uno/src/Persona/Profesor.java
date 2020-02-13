package Persona;

public class Profesor extends Persona{
		
	private String IdProfesor;
		
	public Profesor (String nombre, int edad) {
		super(nombre, edad);
			
		}
		
	public void stIdProfesor (String IdProfesor) {
		this.IdProfesor = IdProfesor;
			
		}
		
	public String getIdProfesor() {
		return IdProfesor;
		}
		
	public void mostrarNombre() {
		System.out.println("Nombre profesor: "+getnombre());
		}
	}

