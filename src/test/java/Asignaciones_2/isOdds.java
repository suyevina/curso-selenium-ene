package Asignaciones_2;

import java.util.Scanner;

public class isOdds {

	public static void main(String[] args) {
		Scanner entrada =  new Scanner(System.in);
		int inicio;
		int fin;
		int  suma=0;
		int opcion = 0;
		do {
			System.out.println("Escoja una de las siguientes opciones: ");
			System.out.println("1. sumOdd(1, 100); → should return 2500");
			System.out.println("2.  sumOdd(-1, 100); →  should return -1.");
			System.out.println("3.  sumOdd(100, 100); → should return 0");
			System.out.println("4.  sumOdd(13, 13); → should return 13 (This set contains one number, 13, and it is odd. ");
			System.out.println("5. sumOdd(100, -100); → should return -1" );
			System.out.println("6. sumOdd(100, 1000); → should return 247500" );
			System.out.println("0.  Salir");

			System.out.print("Opción: ");
			opcion = entrada.nextInt();
		
			switch (opcion) {
			case 0: 
				System.out.println("Bye");
				System.out.println("");
				break;
				
			case 1:			
				suma= sumOdd(1,100);
				System.out.println(suma);
				break;
				
			case 2:
				suma= sumOdd(-1,100);
				System.out.println(suma);
				break;
			
			case 3:
				suma= sumOdd(100,100);
				System.out.println(suma);
				break;
			
			case 4:
				suma= sumOdd(13,13);
				System.out.println(suma);
				break;
				
			case 5:
				suma= sumOdd(100,-100);
				System.out.println(suma);
				break;
			
			case 6:
				suma= sumOdd(100,1000);
				System.out.println(suma);
				break;
					
			default:
				System.out.println("No escogiste ninguna opción válida");
				System.out.println("");
				break;
			}
		} while (opcion !=0);
	}
	
	public static  boolean isOdd (int number) {
		boolean retorno=false;
		int  contador=0;
		
		if (number >1) {
			//primo
			int i=1;
			do {
				if (number % i == 0) {
					contador++;
				}
				
				if (contador<=2) {
					retorno=true;
				} else  {
					retorno = false;
				}
				i++;
			} while ( i <=number);		
			
		}else {
			retorno = false;
		}
		return retorno;
	}
	
	public static int sumOdd(int start, int end) {
		boolean reto=false;
		int sum=0;
		int j=start;
		
		do {
			reto = isOdd(j);
			
			if (reto) {
				sum = sum + j;
			}
			
			j++;	
		} while (j <= end);
		
		if(start == end && !reto) {
			return 0;
			
		}else if (start<=0 || end <=0 && !reto) {
			return -1;
			
		}else if (start == end && !reto){
			return 0;	
		}
		
		return sum;	
	}	
}
