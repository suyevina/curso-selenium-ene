package Asignaciones_2;

import java.util.Scanner;

public class VerificadorSumaNumero {

	public static void main(String[] args) {
		int opcion;
		boolean reto;
		Scanner entrada = new Scanner(System.in);
		//El metodo debe regresar un valor booleano verdadero si la suma de los dos primeros parametros es igual a la suma del tercer parametro, en otro caso devolver false.
		
		do {
			System.out.println("Escoja una de las siguientes opciones: ");
			System.out.println("1. hasEqualSum(1, 1, 1);  deberia regresar FALSE porque la suma de 1+1 no es 1.");
			System.out.println("2. hasEqualSum(1, 1, 2);  deberia regresar TRUE porque la suma de 1+1 si es 2");
			System.out.println("0.  Salir");
	
			System.out.print("Opción: ");
			opcion = entrada.nextInt();
			System.out.println("");
			
			switch (opcion) {
			case 0: 
				System.out.println("Bye");
				System.out.println("");
				break;
				
			case 1:	
				reto=hasEqualSum(1,1,1);
				System.out.println(reto);
				System.out.println("");
				break;
			
			case 2:	
				reto=hasEqualSum(1,1,2);
				System.out.println(reto);
				System.out.println("");
				break;
				
			default:
				System.out.println("No escogiste ninguna opción válida");
				System.out.println("");
				break;
			}
		}while (opcion !=0);

	}
	
	public static boolean hasEqualSum(int x,int y,int z ) {
		int suma=0;
		suma = x + y;
		if (suma == z) {
			return true;
		}
		return false;
	}

}
