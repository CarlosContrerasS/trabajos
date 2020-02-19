package compañeros.Ejemplo03;

import java.util.Scanner;

public class Ejecutable {

	static Scanner scan= new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//Creamos un array de objetos de la clase empleados
        Personal arrayObjetos[]=new Personal[6];
 
        //Creamos objetos en cada posicion
        arrayObjetos[0]=new Repartidor("pepe", 24, 350000, "3");
        arrayObjetos[1]=new Repartidor("Epi", 30, 300000, "3");
        arrayObjetos[2]=new Repartidor("Leo", 23, 250000, "2");
        
        arrayObjetos[3]=new Comercial("pepes", 32, 350000, 190000);
        arrayObjetos[4]=new Comercial("Epis", 35, 300000, 200000);
        arrayObjetos[5]=new Comercial("Leos", 29, 250000, 250000);
        
        //Imprimir Objetos Array
        for(int i=0;i<6;i++) {

			
				System.out.println("=======================================");
				
				if (i<=2) {
					System.out.println("Personal Repartidor N° "+(i+1)+" :");
					System.out.println("Zona: "+((Repartidor)arrayObjetos[i]).getZona());
				}
				
				if (i>2) {
					System.out.println("Personal comercial N° "+(i+1)+" :");
					System.out.println("Comisión: "+((Comercial)arrayObjetos[i]).getComision());
				}
				
				System.out.println("Nombre: "+arrayObjetos[i].getNombre());
				System.out.println("Edad: "+arrayObjetos[i].getEdad());
				System.out.println("Salario: "+arrayObjetos[i].getSalario());
				System.out.println("Total A Pagar: "+arrayObjetos[i].plus());
			
				
        }

	}

}
