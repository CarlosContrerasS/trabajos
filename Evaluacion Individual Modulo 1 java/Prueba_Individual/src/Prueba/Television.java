package Prueba;

public class Television extends Electrodomesticos{
	//CONSTANTE
	private final int RESOLUCION_REF =20;
	private final Boolean SINTONIZADOR_REF=false;
	
	private int resolucion;
	private Boolean sintonizador;
	

	public Television(int resolucion, Boolean sintonizador, 
			double precio, String color, char ConsumoEnergetico,int peso) {
		//Estas CONSTANTES Provienen de la clase padre
		super(precio, color, ConsumoEnergetico, peso);
		
		//varible que se ingresa solo en esta clase.
		this.resolucion=resolucion;
		this.sintonizador=sintonizador;
		
	}
	
	public Television (int RES, Boolean SIN, 
			 String COLOR_REF, char CONSUMO_REF,int PESO_REF, double PRECIO_BASE) {
		//Estas CONSTANTES Provienen de la clase padre
		super(PRECIO_BASE, COLOR_REF, CONSUMO_REF, PESO_REF);
		
		//varible que se ingresa solo en esta clase.
		this.resolucion=RESOLUCION_REF;
		this.sintonizador=SINTONIZADOR_REF;
	}
	
	public Television(double precio, String COLOR_REF, char CONSUMO_REF, int peso,  
			int RES, Boolean SIN ) {
		
		//Estas CONSTANTES Provienen de la clase padre
		super(precio, COLOR_REF, CONSUMO_REF, peso);
		
		//varible que se ingresa solo en esta clase.
		this.resolucion=RESOLUCION_REF;
		this.sintonizador=SINTONIZADOR_REF;
	}
	

	
	public void precioFinal() {
		
		//Agregamos los valores y las condiciones de Electrodomesticos
		
		super.precioFinal();
			
		//Agregamos las nuevas condiciones de Resolucion y sintonizador
		//verificamos su resolucion
		
		if (getResolucion()>40) {
			setPrecio(getPrecio()*1.3);
		}
		
		//verificamos si tiene sintonizador
	
		if(getSintonizador()==true) {
			setPrecio(getPrecio()+50);
		}
			
	
	}

	public int getResolucion() {
		return resolucion;
	}

	public void setResolucion(int resolucion) {
		this.resolucion = resolucion;
	}

	public Boolean getSintonizador() {
		return sintonizador;
	}

	public void setSintonizador(Boolean sintonizador) {
		this.sintonizador = sintonizador;
	}
	
	

}

