package interfaces_practica;
public class Acumulador implements Actualizacion{
	
	private int valor;
	
	public Acumulador (int i) {//Setter, para ingresar valores.
		this.valor = i;
		
	}
	
	
	public void incremento (int a) {// Metodo obligatorio para implementar 
									//la interface
		this.valor += a;
	}
	
	public int getValor() {//Get, para entregar el valor
		return valor;
	}
	
}