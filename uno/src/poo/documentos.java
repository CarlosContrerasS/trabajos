package poo;

public class documentos {
	private String Nombre;
	private String tipo;
	private int agno;
	private String Estado;
	

	public documentos(String tipo, String Nombre, int agno, String Estado) {
		// TODO Auto-generated constructor stub
		
		
		this.Nombre = Nombre;
		this.tipo = tipo;
		this.agno = agno;
		this.Estado = Estado;
		
	}
	
	public void Imprimir() {
		System.out.println("El texto  es  "+ getTipo()+ ",  "
				+ "su Título es  " + getNombre() + " , " + "El Año es "+ getAgno()
				+" y "+ "se encuentra " + getEstado());
		
	}
	
	public static int cuentaPrestados(documentos a, int contador){
		// Aqui indico que a sera un arreglo del tipo de documentos, por ende no 
		//es necesario indicar el tipo de variable
		
		if ((a.getEstado()).equalsIgnoreCase("Prestado")) {
			contador ++;
		}
		
		return contador;
		
	}
	
	 public static int publicacionesAnterioresA(documentos b, int contador_2) {
		 
		 if(b.getAgno() <= 1990) {
			 contador_2++;
			 
		 }
		 return contador_2;
	 }
	
	/**
	 * @return the estado
	 */
	public String getEstado() {
		return Estado;
	}

	/**
	 * @param estado the estado to set
	 */
	public void setEstado(String estado) {
		Estado = estado;
	}


	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return Nombre;
	}


	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		Nombre = nombre;
	}


	/**
	 * @return the tipo
	 */
	public String getTipo() {
		return tipo;
	}


	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	/**
	 * @return the agno
	 */
	public int getAgno() {
		return agno;
	}


	/**
	 * @param agno the agno to set
	 */
	public void setAgno(int agno) {
		this.agno = agno;
	}


}
  