import java.util.Scanner;

public class Prueba {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		
		 ManipulacionDelArchivo ma=new ManipulacionDelArchivo();
 
		System.out.println("Reglas del Juego------------------------------");
		System.out.println("1) Solo se puede intentar 10 veces");
		System.out.println("2) Solo se puede ingresar una letra a la vez (A-Z)");
		System.out.println("3) Perderas una oportunidad por cada letra no adivinada");
		System.out.println("5) El juego termina cuando se adivine la palabra completa ");
		System.out.println();
		System.out.println(" =========== Menu de operaciones =============");
		
		System.out.println("1) Verificar archivo");
		System.out.println("2) Llenar archivo con palabras");
		System.out.println("3) Borrar Archivo");
		System.out.println("4) Jugar ");
		System.out.println("5) Salir");
		System.out.println("Elige una opcion: ");
		int opcion=	sc.nextInt();
		
		
		
		switch(opcion) {
		case 1:
			
			ma.verificarArchivo();	
			
		break;
		case 2:
			
			ma.llenarArchivoConPalabras();
			
		break;
		case 3:
			
			ma.borrarArchivo();
			
		break;
		case 4:
			
			
		break;
		case 5:
			
			System.out.println("Saliendo ...");
			
		break;
		default:
			
		
		
		
		
		}
		
	}
}
