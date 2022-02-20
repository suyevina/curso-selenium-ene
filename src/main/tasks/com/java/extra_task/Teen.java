package com.java.extra_task;

import java.util.Scanner;

public class Teen {

	public static void main(String[] args) {
		int opcion ;
		Scanner opciones = new Scanner(System.in);
		
		do {
			System.out.println("Escoja una de las siguientes opciones: ");
			System.out.println("1. hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19");
			System.out.println("2. hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19");
			System.out.println("3. hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19 ");
			System.out.println("4. isTeen(9);  should return false since 9 is in not range 13 - 19");
			System.out.println("5. isTeen(13);  should return true since 13 is in range 13 - 19");
			System.out.println("0. Salir");
			System.out.print("Opción: ");
	
			opcion = opciones.nextInt();
	     
			switch (opcion) {
			case 0:
				System.out.println("Bye");
				System.out.println("");
				break;
			case 1:
				System.out.println(hasTeen(9,99,19));
				System.out.println("");
				break;
			case 2:
				System.out.println(hasTeen(23,15,42));
				System.out.println("");
				break;
			case 3:
				System.out.println(hasTeen(22,23,34));
				System.out.println("");
				break;
			case 4:
				System.out.println(isTeen(9));
				System.out.println("");
				break;
			case 5:
				System.out.println(isTeen(13));
				System.out.println("");
				break;
			default:
				System.out.println("No escogiste opciones validas");
				System.out.println("");
				break;
			}
      } while (opcion !=0);
		

	}
	
	public static boolean hasTeen (int param1, int param2, int param3) {

		if( (param1 >= 13 && param1<=19)  || (param2 >= 13 && param2<=19)  || (param3 >=13 && param3<=19)){
			return true;
		}	
		return false;
	}

	public static boolean isTeen(int param1) {
		if (param1 >= 13 && param1<=19) {
			return true;
		}
		return false;
	}
}
