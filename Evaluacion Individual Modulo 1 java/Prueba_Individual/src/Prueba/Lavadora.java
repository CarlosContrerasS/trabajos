package Prueba;

public class Lavadora extends Electrodomesticos {
	//CONSTANTE
	private final int CARGA_REF =5;
	
	//VARIABLES
	private int carga;

	public Lavadora(double precio, String color, char ConsumoEnergetico,int peso, int carga) {
		super(precio, color, ConsumoEnergetico, peso);
		this.carga = carga;
		
	}

		//Constructor por defecto con los valores de las constantes.
	public Lavadora(int PESO_REF, String COLOR_REF, char CONSUMO_REF, int CARGA_REF, double PRECIO_BASE) {
		
		//Estas CONSTANTES Provienen de la clase padre
		super(PRECIO_BASE, CONSUMO_REF, PESO_REF, COLOR_REF);
		
		//varible que se ingresa solo en esta clase.
		this.carga = this.CARGA_REF;
		
		
	}
	
	//Constructor con ingreso de peso y precio y el resto de los valores son 
	//por defecto con los valores de las constantes.
	
	public Lavadora(int precio,  String COLOR_REF, char CONSUMO_REF, 
			int peso, int CARGA_REF ) {
		//Estas CONSTANTES Provienen de la clase padre
		super(precio, COLOR_REF, CONSUMO_REF, peso);
		
		//varible que se ingresa solo en esta clase.
		this.carga=CARGA_REF;
		
		
	}

	public void precioFinal() {
		
		//Agregamos los valores y las condiciones de Electrodomesticos
		super.precioFinal();
		
		//Agregamos la condicion de peso mayor a 30 kg
		
		if (getCarga() > 30) {
			setPrecio(getPrecio()+50);
		}
		

	}

	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
}
