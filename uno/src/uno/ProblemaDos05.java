package uno;

public class ProblemaDos05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String frase = "Casa Blanca";
		String invertida = "";

		System.out.println("la frase ingresada es:  "+ frase);
		int largo =  frase.length(); 
		
		for (int i = (largo-1); i>= 0; i--) {
			char caracter = frase.charAt(i);
			
			invertida += caracter;
			}
		
		System.out.println("la frase invertida es:  "+ invertida);

	}

}
