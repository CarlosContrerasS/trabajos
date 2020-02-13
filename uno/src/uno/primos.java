package uno;

public class primos {
	public static void main(String args[]) {
		int cont;
		int y;
		System.out.println ("los números primos menores que 100 son: ");
		for (int x = 2; x <= 100; x++) {
			cont = 0;
			for (y = 2; y <= 100; y++) {
				if (x % y == 0){
					cont = cont +1;
					}
			}
			if (cont == 1) {
				System.out.print ("    " +x );
			}
		}
	}
}