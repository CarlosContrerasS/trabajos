import java.util.Scanner;

public class Ejercicio1 {
	
	 public static void main(String[] args) {
		 
	        int num[]=rellenarArray(13);
	        imprimirArray(num);
	    }
	    public static void imprimirArray (int num[]){
	        for(int i=0;i<num.length;i++){
	        	System.out.println ("[" + i +"] = " + num[i]);
	        }
	    }
	    public static int[] rellenarArray(int a){
	    	Scanner numero = new Scanner(System.in);
	        int num[]=new int [13];
	        for(int i=0;i<num.length;i++){
	        	 System.out.println("Introduzca el elemento [" + i + "]");
	        	 num[i] = numero.nextInt();
	        }
	        return num;
	    }
}
