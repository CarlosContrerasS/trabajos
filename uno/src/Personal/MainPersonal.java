package Personal;
import java.util.Scanner;

public class MainPersonal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		Comercial[] TipoPersonal_1 = new Comercial[2];
		Repartidor[] TipoPersonal_2 = new Repartidor[2];
		
		
		
		System.out.println("Ingrese la Cantidad del Personal que es del Area Comercial");
		int N = entrada.nextInt();
		
		for (int i=0; i<N; i++) {
		//Recordar el constructor de Comercial es:  Nombre, edad,  Salario y comision
			
			System.out.println("Ingrese el Nombre de la persona : "+ (i+1));
			String a = entrada.next();
			System.out.println("Ingrese la edad de la persona : "+ (i+1));
			int b = entrada.nextInt();
			System.out.println("Ingrese el Salario de la persona : "+ (i+1));
			double c = entrada.nextDouble();
			System.out.println("Ingrese la Comision de la persona : "+ (i+1));
			double d = entrada.nextDouble();
			
			TipoPersonal_1[i] = new Comercial (a, b, c, d);
			TipoPersonal_1[i].Plus();
			entrada.nextLine();
		}
		
		
		
		System.out.println("Ingrese la Cantidad del Personal que es Repartidor(a)");
		int M = entrada.nextInt();
		
		//Recordar el constructor de Repartidor es  Nombre, edad, Salario y Zona
		
		for (int i=0; i<M; i++) {
					
			System.out.println("Ingrese el Nombre de la persona : "+ (i+1));
			String e = entrada.next();
			System.out.println("Ingrese la edad de la persona : "+ (i+1));
			int f = entrada.nextInt();
			System.out.println("Ingrese el Salario de la persona : "+ (i+1));
			double g = entrada.nextDouble();
			System.out.println("Ingrese el numero de la Zona en que reparte la persona : "+ (i+1));
			int h = entrada.nextInt();
			
			TipoPersonal_2[i] = new Repartidor (e, f, g, h);
			TipoPersonal_2[i].Plus();
			entrada.nextLine();
		}
		
		
	
		for (int i = 0; i<2; i++) {
			System.out.println("El trabajor del area comercial "+TipoPersonal_1[i].getNombre()
					+ " tiene un sueldo de  " + TipoPersonal_1[i].getSalario()
					+ " con la edad de " + TipoPersonal_1[i].getEdad()
					+ " y le corresponde una comision de " + TipoPersonal_1[i].getComision());
		}
		
		
		for (int i = 0; i<2; i++) {
			System.out.println("El Repartidor  "+TipoPersonal_2[i].getNombre()
					+ " tiene un sueldo de  " + TipoPersonal_2[i].getSalario()
					+ " con la edad de " + TipoPersonal_2[i].getEdad() 
					+ " y ¿le corresponde un Plus en su salario? " + TipoPersonal_2[i].getplus());
		}
		
		entrada.close();
	}

}
