package Prueba;
import javax.swing.JOptionPane;

public final class Show {
	int opcion1;

	public static void lanzarMensaje(){

		String nl = System.getProperty("line.separator");

		
		boolean continua = true;             //  para saber si cumple con la opcion de elección
     
        do {
    		//Lanzamos el selector con JoptionPane:
    		int opcion1 = Integer.parseInt( JOptionPane.showInputDialog(null, "Cual es la próxima acción. Marque la alternativa"
    				   + nl + "1. Crear Carro"
    				   + nl + "2. Lanzar Huevo"
    				   + nl + "3. Mostrar Matriz"
    				   + nl + "4. Calcular Puntaje",
    		        JOptionPane.QUESTION_MESSAGE) );
        	
                if (opcion1==1 || opcion1==2 || opcion1==3 || opcion1==4 ) {   // restringido a opciones 1,2,3,4
				
                JOptionPane.showMessageDialog(null,"la opcion elegida es "+opcion1 );
                continua = true;
                break;
                
                }else {
                	  JOptionPane.showMessageDialog(null, ("Error Debes ingresar un número válido")
                      		+ nl + "Elegiste opcion " +opcion1 , nl, JOptionPane.INFORMATION_MESSAGE, null);
                    continua = false;
                }
 
        } while(continua==false);
     
	}
	/*
	switch (opcion1) {
		case 1:
			System.out.println(" =======================CREAR CARRO==========================");
			System.out.println("¿ Cual carro quieres crear?");
			System.out.println("");
			System.out.println("1. Kromi");
			System.out.println("2. Caguano");
			System.out.println("3. Trupalla");
			
			
			
			break;
		case 2:
			System.out.println(" =======================LANZAR HUEVO==========================");
			System.out.println("indica la fila que quieras A hasta la O");
			System.out.println("indica la Columna que quieras 1 hasta la 15");
			break;
		case 3:
			System.out.println(" =======================MOSTRAR MATRIZ==========================");
			
			break;
		case 4:
			System.out.println(" =======================CALCULAR PUNTAJE==========================");
			break;

		default:
			System.out.println(" Elige una opción correcta");
			}
		
		}

*/
	public static void main(String[] args){
		lanzarMensaje();
	}
}
  
