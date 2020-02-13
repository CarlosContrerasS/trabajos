package vehiculo;
/**
 * @author Carlos Contreras
 * Ejemplo de ejecución de un metodo constructor.
 */
public class Un_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		vehiculo auto = new vehiculo(); //debe ser ingresado el nombre de la clase
		// creada como construtor en ambos lugares
		
		
		System.out.println("los valores iniciales son: ");
		
		System.out.println("el color del auto es   "+ auto.getcolor());
		
		System.out.println("el largo del auto es   "+ auto.getlargo());
		
		System.out.println("el Peso Total del auto es   "+ auto.getpeso_total());
		
		
		System.out.println("los valores modificados para nuestro nuevo auto es:  ");
		auto.setcolor("Amarillo");
		
		auto.setpeso_total(2500);
		
		System.out.println("el color del auto es   "+ auto.getcolor());
		
		System.out.println("el largo del auto es   "+ auto.getlargo());
		
		System.out.println("el Peso Total del auto es   "+ auto.getpeso_total());
		
	
	}

}
