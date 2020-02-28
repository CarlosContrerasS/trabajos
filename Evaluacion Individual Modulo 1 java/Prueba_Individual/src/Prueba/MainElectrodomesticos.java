package Prueba;

/**
 * @author Carlos Contreras
 *
 */
public class MainElectrodomesticos {

	
	public static void main(String[] args) {
		
		Electrodomesticos[] ArrayElec = new Electrodomesticos[10];
		
		//Debemos Recordar como fueron creados los constructores.
		
		// Las posibilidades de color son: blanco, negro, rojo, azul y gris.
		// Las posibilidades de Consumo Energetico Son: "A", "B", "C", "D", "E" y"F"
		
		//Electrodomesticos precio, color, ConsumoEnergetico y peso
		ArrayElec [0] = new Electrodomesticos(50, "rojo",'A', 30);
		ArrayElec [1] = new Electrodomesticos(250, "negro",'B', 80);
		ArrayElec [2] = new Electrodomesticos(150, "blanco",'D', 100);
		
		
		//Television resolucion, sintonizador, precio, color, consumoEnergetico y  peso
		
		//creamos 3 Televisores.
		
		ArrayElec [3] = new Television(10, true, 30, "negro",'C', 10);
		ArrayElec [4] = new Television(20, false, 50, "azul",'A', 20);
		ArrayElec [5] = new Television(40, true, 80, "negro",'B', 30);
				
		//Lavadora precio, color, ConsumoEnergetico, peso y carga
		
		//Creamos 4 Lavadoras.
		
		ArrayElec [6] = new Lavadora (100, "blanco",'A', 40, 10);
		ArrayElec [7] = new Lavadora(50, "negro",'A', 35, 5);
		ArrayElec [8] = new Lavadora(80, "blanco",'A', 60, 30);
		ArrayElec [9] = new Lavadora(200, "gris",'A', 100, 40);
		
		System.out.println("*****************************");	
		System.out.println(" A continuacion se mostrar� de que clase pertence el Objeto");
		System.out.println("  ");
		
		//Mostramos las Instancias de los Objetos
		
		for(int i=0;i<ArrayElec.length;i++){
            if(ArrayElec[i] instanceof Electrodomesticos){
                System.out.println("El objeto en el indice "+i+" es de la clase Electrodomesticos");
            }
            if(ArrayElec[i] instanceof Lavadora){
                System.out.println("El objeto en el indice "+i+" es de la clase Lavadora");
            }
            if(ArrayElec[i] instanceof Television){
                System.out.println("El objeto en el indice "+i+" es de la clase Television");
            }
 
        }
		
		// Explicacion de los que ocurre
		System.out.println("*****************************");	
		System.out.println(" Como la clase Lavadora y Televis�n son hijas de la Clase Electrodomesticos"
				+ "\n"+ "  es natural que por un Objeto salga que pertenece a dos clases");
		System.out.println("  ");
		
		//Mirando las Instancias de los objetos creados entre Television y Lavadora.
		
		System.out.println("*****************************");	
		System.out.println(" A continuacion se mostrar� a que clase pertenece los objetos, "
				+ "\n"+ " solo tomando en cuenta la clase Lavadora y Television");
		System.out.println("  ");
		
			
		for(int i=0;i<ArrayElec.length;i++){
            if(ArrayElec[i] instanceof Lavadora){
                System.out.println("El objeto en el indice "+i+" es de la clase Lavadora");
            }
            if(ArrayElec[i] instanceof Television){
                System.out.println("El objeto en el indice "+i+" es de la clase Television");
            }
 
        }
		
		//Para mostrar los precios, solo lo ingresado
		
		System.out.println("*****************************");	
		System.out.println(" A continuacion se mostrar� el valor del precio de"
				+ " los Electrodomesticos (solo los ingresados, si confirmar sus atributos)");
		System.out.println("  ");
		
		
		for(int i = 0; i<10; i++) {
			System.out.println("El precio inicial del objeto   "+(i+1)+ " es   : "
					+ArrayElec[i].getPrecio());
		}
		
		
		/*Ahora realizamos los cambios de Precio de los Electrodomesticos, Televisores y Lavadoras
		*Segun su peso, consumo energetico. Adem�s si es un Televisores por
		*Resolucion y sintetizador*/
		for (int i=0; i<10; i++) { //Actualizamos los precios.
			ArrayElec[i].precioFinal(); 
		}
		
		
		
		System.out.println("*****************************");	
		System.out.println(" A continuacion se mostrar el valor del precio de los "
				+ "Electrodomesticos confirmando las condiciones de: "
				+"\n" + " peso, consumo energetico. Adem�s si es un Televisores por la "
						+ "Resolucion y si tiene sintetizador");
		System.out.println("  ");
		
		//Imprimimos los nuevos precios.//
		for(int i = 0; i<10; i++) {
			System.out.println("El precio final del objeto   "+(i+1)+ " es    : "
					+ArrayElec[i].getPrecio());
		}
		
		//Ahora Sumamos los precios por item
		
		//precio de los Televisores
		double PrecioTelevisoras = 0;
		
		for(int i=0;i<ArrayElec.length;i++){
            if(ArrayElec[i] instanceof Television){
            	PrecioTelevisoras= ArrayElec[i].getPrecio();
            }
		}
		
		//precio de las Lavadoras
		double PrecioLavadoras =0;
		
		for(int i=0;i<ArrayElec.length;i++){
            if(ArrayElec[i] instanceof Lavadora){
            	PrecioLavadoras+= ArrayElec[i].getPrecio();
            }
		}
		
		//Precio de Todos los Electrodomesticos
		double PrecioTotal=0;
		

		for(int i=0;i<ArrayElec.length;i++){
            if(ArrayElec[i] instanceof Electrodomesticos){
            	PrecioTotal+= ArrayElec[i].getPrecio();
            }
		}
            	
		//El precio de los electrodomesticos que no son lavadoras o televisores.
		
        double PrecioElec = PrecioTotal -PrecioLavadoras - PrecioTelevisoras;
		
		//imprimimos los resultados
		
		System.out.println("*****************************");	
		System.out.println("El precio de  los Electrodomesticos "+"\n"+" "
				+ "(que no son televisores o Lavadoras) es  : " +PrecioElec +"\n"  
				+"\n" + "El valor de todos los Televisores es : "
				+ PrecioTelevisoras +"\n"+ "\n" + "El valor de todas las lavadoras es : " 
				+PrecioLavadoras+ "\n" +"\n" +"El valor de los 10 elementos es : "+ PrecioTotal);
		System.out.println("  ");
	}
}
