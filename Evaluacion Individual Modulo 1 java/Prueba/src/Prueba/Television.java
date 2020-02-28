package Prueba;

public class Television extends Electrodomesticos{
	
	private int resolucion=20;
	private Boolean sintonizador=false;
	

	public Television(int resolucion, Boolean sintonizador, 
			double precio, String color, char ConsumoEnergetico,int peso) {
		
		super(precio, color, ConsumoEnergetico, peso);
		this.resolucion=resolucion;
		this.sintonizador=sintonizador;
		
	}
	
	public Television() {
	
	}
	
	public Television(int precio, int peso) {
		super(precio, peso);
		
	}
	
	public void precioFinal() {
		//verificamos su resolucion
		
		if (getResolucion()>40) {
			setPrecio(getPrecio()*1.3);
		}
		
		//verificamos si tiene sintonizador
	
		if(getSintonizador()==true) {
			setPrecio(getPrecio()+50);
		}
		
		//verifivcamos su Consumo Energetico.
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

