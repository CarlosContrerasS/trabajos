package polimorfismo;

public class PolimorfismoMain {
	
	public static void main(String []Args) {
		
		Animal Scooby; Animal Tom;
		
		Scooby = new Perro("Perro", "Scooby");
		
		Tom = new Gato ("Gato", "Tom");
		
		Scooby.imprimir();
		Tom.imprimir();
	}
}
