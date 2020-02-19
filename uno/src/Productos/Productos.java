package Productos;

public abstract class  Productos {
	
	private String Nombre;
	private int precio;
	private int cantidad;

	public Productos(String Nombre, int precio, int cantidad) {
		// TODO Auto-generated constructor stub
		this.Nombre = Nombre;
		this.precio = precio;
		this.cantidad = cantidad;		
	}
	
	public double calcular (int precio, int cantidad) {
		double calculo;
		calculo = precio*cantidad;	
		return calculo;
	}
	
	public void Imprimir(int i) {
		System.out.println("El precio del producto "+ (i+1)+" es: "+ getPrecio());
	}

	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public int getPrecio() {
		return precio;
	}
	public void setPrecio(int precio) {
		this.precio = precio;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
}
