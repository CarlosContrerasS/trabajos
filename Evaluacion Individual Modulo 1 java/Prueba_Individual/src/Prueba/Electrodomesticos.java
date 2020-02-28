package Prueba;

public class Electrodomesticos {
	//Constantes
	protected  final double PRECIO_BASE=100;
	protected   final String COLOR_REF="blanco";
	protected   char CONSUMO_REF = 'F';
	protected  int PESO_REF = 5;
	
	//Variables
	private double precio;
	private String color; 
	private char ConsumoEnergetico; 
	private int peso;
	
	//constructor con todas las variables disponibles.
	public Electrodomesticos(double precio, String color, char ConsumoEnergetico,int peso) {
		this.precio=precio;
		this.color=color;
		comprobarColor(color);
		this.ConsumoEnergetico=Character.toUpperCase(ConsumoEnergetico);
		comprobarConsumoEnergetico(ConsumoEnergetico);
		this.peso=peso;
		
	}
	
	//CONSTRUCTOR POR DEFECTO.
	public Electrodomesticos(double PRECIO, char CONSUMO, int PESO, 
			String COLOR) {
		//esto es para que considere que los valores en el metodo corresponde a las
		//constantes.
		CONSUMO=CONSUMO_REF;
		PESO = PESO_REF;
		COLOR = COLOR_REF;
		PRECIO=PRECIO_BASE;
		
		
	}
	
	//COnstriuctor con precio y peso. Y todas las otras variables 
	//por defecto con las constantes
	public Electrodomesticos(int precio, int peso, char CONSUMO, String COLOR) {
		
		CONSUMO=CONSUMO_REF;
		COLOR = COLOR_REF;
	}
	
	private void comprobarConsumoEnergetico(char letra) {
		
	
	switch (letra) {
		case 'A': 
			setConsumoEnergetico(letra);
			break;
		case 'B':
			setConsumoEnergetico(letra);
			break;
		case 'C':
			setConsumoEnergetico(letra);
			break;
		case 'D':
			setConsumoEnergetico(letra);
			break;
		case 'E':
			setConsumoEnergetico(letra);
			break;
		case 'F':
			setConsumoEnergetico(letra);
			break;
		default :
			setConsumoEnergetico('F');
			break;
		}
	}
	
	private void comprobarColor(String color) {
		
		switch (color) {
			case "blanco": 
				setColor(color);
				break;
			case "negro":
				setColor(color);
				break;
			case "rojo":
				setColor(color);
				break;
			case "azul":
				setColor(color);
				break;
			case "gris":
				setColor(color);
				break;
			default :
				setColor("blanco");
				break;
			}
	}
	
	public void precioFinal() {
		
		//guardamos la variable momentaneamente 
		char letra = getConsumoEnergetico();
		
		//verificamos la letra
		switch (letra) {
		case 'A': 
			setPrecio(getPrecio()+100);
			break;
		case 'B':
			setPrecio(getPrecio()+80);
			break;
		case 'C':
			setPrecio(getPrecio()+60);
			break;
		case 'D':
			setPrecio(getPrecio()+50);
			break;
		case 'E':
			setPrecio(getPrecio()+30);
			break;
		case 'F':
			setPrecio(getPrecio()+10);
			break;
		}
	
		//verificamos el Peso o Carga.
		
		if(getPeso()>=80) { 
			setPrecio(getPrecio()+100);
		}else 
			if(getPeso()>=50) {
			setPrecio(getPrecio()+80);
		} else
			if(getPeso()>=20) {
			setPrecio(getPrecio()+50);
			} else {
			setPrecio(getPrecio()+10);
		}
	}


	public double getPrecio() {
		return precio;
	}


	public void setPrecio(double precio) {
		this.precio = precio;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public char getConsumoEnergetico() {
		return ConsumoEnergetico;
	}


	public void setConsumoEnergetico(char consumoEnergetico) {
		ConsumoEnergetico = consumoEnergetico;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}
	
	
}
