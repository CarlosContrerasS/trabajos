package Prueba;

public class Electrodomesticos {
	private double precio=100;
	private String color; // las posibilidades son: blanco, negro, rojo, azul y gris. 
	private char ConsumoEnergetico; // {"A", "B", "C", "D", "E", "F"} estas son sus posibilidadces
	private int peso=5;
	
	
	public Electrodomesticos(double precio, String color, char ConsumoEnergetico,int peso) {
		this.precio=precio;
		this.color=color;
		this.ConsumoEnergetico=ConsumoEnergetico;
		this.peso=peso;
	}
	
	public Electrodomesticos() {
		
	}
	
	public Electrodomesticos(int precioBase, int precio) {
		
	}
	
	public void comprobarConsumoEnergetico(char letra) {
	
		char[] LetrasPosibles = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		for(int i=0; i<6; i++) {
			if (LetrasPosibles[i]==letra ) {
				setConsumoEnergetico(letra);
			}
			else
				setConsumoEnergetico('F');
		}
		
	
	}
	
	public void comprobarColor(String color) {
		
		String[] VerificarColor = {"blanco", "negro", "rojo", "azul",  "gris"}; 
		
		for(int i=0; i<6; i++) {
			if ( VerificarColor[i]==color ) {
				setColor(color);
			}
			else
				setColor("blanco");
		}
		
	}
	
	public void precioFinal() {
	
		//verificamos la letra
		if(getConsumoEnergetico()=='A') {
			setPrecio(getPrecio()+100);
		}
		if(getConsumoEnergetico()=='B') {
			setPrecio(getPrecio()+80);
		}
		if(getConsumoEnergetico()=='C') {
			setPrecio(getPrecio()+60);
		}
		if(getConsumoEnergetico()=='D') {
			setPrecio(getPrecio()+50);
		}
		if(getConsumoEnergetico()=='E') {
			setPrecio(getPrecio()+30);
		}
		if(getConsumoEnergetico()=='F') {
			setPrecio(getPrecio()+10);
		}
		
		if(getPeso()>=80) { //verificamos el Peso o Carga.
			setPrecio(getPrecio()+100);
		}else 
			if(getPeso()>=50) {
			setPrecio(getPrecio()+80);
		} else
			if(getPeso()>=20) {
			setPrecio(getPrecio()+50);
			} else
				if(getPeso()<=19) {
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
