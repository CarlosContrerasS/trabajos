package vehiculo; //No es obligatorio que el paquete tenga el mismo nombre

/** ejemplo de metodo constructor para un vehiculo
 * @author Carlos Contreras
 *
 */

public class vehiculo { //Esta es la clase. las variables son 
	//private para que no puedan ser modificadas en otra clase.
	private int largo;
	private int peso_total;
	private String color;

	public vehiculo(){ //Aquí inicializo las variables 
		//(debe estar adentro de la clase y con el mismo nombre.
		largo=200;
		color = "azul";
		peso_total = 2000;
	}//Método para obtener el largo 
	public int getlargo() { 
		return largo; 
	} //Cierre del método

	//Método para obtener el color
	public String getcolor() { 
		return color; 
	} //Cierre del método

	//Método para obtener el peso total 
	public int getpeso_total() { 
		return peso_total; 
	} //Cierre del método

	//Método para ingresar el valor del largo
	public void setlargo(int largo_pedido) {
		largo = largo_pedido; //le asignamos el valor de la entrada
	} //cierre del método.

	//Método para ingresar el valor del largo
	public void setpeso_total(int peso_ingresado) {
		peso_total = peso_ingresado; //le asignamos el valor de la entrada
	} //cierre del método.

	//Método para ingresar el valor del largo
	public void setcolor(String color_asignado) {
		color = color_asignado; //le asignamos el valor de la entrada
	} //cierre del método.
	
}