package Asignaciones_2;

import java.util.Scanner;

import org.apache.poi.util.SystemOutLogger;

public class sumOdds {

	public static void main(String[] args) {
		
		Scanner entrada =  new Scanner(System.in);
		int inicio;
		int fin;
		int  suma=0;
		int opcion = 0;
		do {
			System.out.println("Escoja una de las siguientes opciones: ");
			System.out.println("1. sumOdd(1, 100);  should return 2500");
			System.out.println("2.  sumOdd(-1, 100);  should return -1.");
			System.out.println("3.  sumOdd(100, 100); should return 0");
			System.out.println("4.  sumOdd(13, 13); should return 13 (This set contains one number, 13, and it is odd. ");
			System.out.println("5. sumOdd(100, -100); should return -1" );
			System.out.println("6. sumOdd(100, 1000);  should return 247500" );
			System.out.println("0.  Salir");

			System.out.print("Opción: ");
			opcion = entrada.nextInt();
		
			switch (opcion) {
			case 0:
				System.out.println("Bye");
				break;
				
			case 1:
				suma= sumOdd(1,100);
				System.out.println(suma);
				System.out.println("");
				break;
				
			case 2:
				suma= sumOdd(-1,100);
				System.out.println(suma);
				System.out.println("");
				break;
			
			case 3:
				suma= sumOdd(100,100);
				System.out.println(suma);
				System.out.println("");
				break;
			
			case 4:
				suma= sumOdd(13,13);
				System.out.println(suma);
				System.out.println("");
				break;
				
			case 5:
				suma= sumOdd(100,-100);
				System.out.println(suma);
				System.out.println("");
				break;
			
			case 6:
				suma= sumOdd(100,1000);
				System.out.println(suma);	
				System.out.println("");
				break;
				
			default: 
				System.out.println("No escogiste una opción válida");
				break;
			
			}
		}while (opcion !=0);
			

	}
	
	public static boolean isOdd(int number) {
		double num=0;
		num=(number-1)%2;
		if (num ==0) {
			return true;
		}
		return false;
	}
	
	public static int sumOdd(int start, int end) {
		int sum=0;
		boolean reto;
		if (start >0 && end>0) {
			for(int i=start; i<=end; i++) {
				reto=isOdd(i);
				if(reto) {
					sum=sum+i;
				}
			}
		}else {
			return -1;
		}
		return sum;
	}

}
