package Asignaciones_2;

import java.util.Scanner;

public class imprimirVerificadorNumeros {

	public static void main(String[] args) {
		int opcion ;
		Scanner opciones = new Scanner(System.in);
		
		do {
			System.out.println("Escoja una de las siguientes opciones: ");
			System.out.println("1. printEqual (1, 1, 1); debe imprimir texto'Todos los números son iguales'");
			System.out.println("2.printEqual (1, 1, 2); deben imprimir texto 'No todos son iguales o diferentes'");
			System.out.println("3. printEqual (-1, -1, -1); debe imprimir el texto 'Valor no válido'");
			System.out.println("4. printEqual (1, 2, 3); debe imprimir texto 'Todos los números son diferentes'");
			System.out.println("0. Salir");
			
			System.out.println("Opción: ");
			opcion = opciones.nextInt();
		     
			switch (opcion) {
			case 0:
				System.out.println("Bye");
				System.out.println("");
				break;
			case 1:
				printEqual (1, 1, 1);
				System.out.println("");
				break;
				
			case 2:
				printEqual (1,1, 2);
				System.out.println("");
				break;
				
			case 3:
				printEqual (-1, -1, -1);
				System.out.println("");
				break;
				
			case 4:
				printEqual (1, 2, 3); 
				System.out.println("");
				break;
				
			default:
				System.out.println("Debe escoger una opción valida");
				System.out.println("");
				break;
			}
			
		}while (opcion !=0);

	}
	
	public static void printEqual (int a, int b, int c) {
		if (a>0 && b>0 && c>0) {
			if(a !=0 && b !=0 && c!=0) {
				if (a==b && b== c && c==a) {
					System.out.println("Todos los números son iguales");
				}else if (a!=b && b!= c && c!=a) {
					System.out.println("Todos los números son diferentes");
				}else {
					System.out.println("No todos son iguales ni diferentes");
				}
				
			}
		}else {
			System.out.println("Valor no válido");
		}
		
	}

}
