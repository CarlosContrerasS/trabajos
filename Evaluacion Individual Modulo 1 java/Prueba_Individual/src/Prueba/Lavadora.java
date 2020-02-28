package Prueba;

public class Lavadora extends Electrodomesticos {
	private int carga = 5;

	public Lavadora(double precio, String color, char ConsumoEnergetico,int peso) {
		super(precio, color, ConsumoEnergetico, peso);
		
	}
	
	public Lavadora() {
		
	}
	
	public Lavadora(int peso, int precio) {
		
	}

	public void precioFinal() {
		
		//verificamos por el consumo.
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
		
		//verificamos por el peso o carga
		if(getPeso()>=80) {
			setPrecio(getPrecio()+100);
		}else 
			if(getPeso()>=50) {
			setPrecio(getPrecio()+80);
		} else
			if(getPeso()>=30) {
			setPrecio(getPrecio()+80);
			} if(getPeso()>=20) {
				setPrecio(getPrecio()+50);
				} else
					if(getPeso()<=19) {
				setPrecio(getPrecio()+10);
			}
	}
	
	public int getCarga() {
		return carga;
	}

	public void setCarga(int carga) {
		this.carga = carga;
	}
	
	

}
