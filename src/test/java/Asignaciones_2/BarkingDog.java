package Asignaciones_2;

import java.util.Scanner;

public class BarkingDog {

	public static void main(String[] args) {
		// Wake-up while my dog barking

		boolean bark;
		int opcion ;
		Scanner opciones = new Scanner(System.in);
		
		do {
			System.out.println("Escoja una de las siguientes opciones: ");
			System.out.println("1.- shouldWakeUp (true, 1); ? should return true");
			System.out.println("2.- shouldWakeUp (false, 2); ? should return false since the dog is not barking.");
			System.out.println("3.- shouldWakeUp (true, 8); ? should return false, since it's not before 8. ");
			System.out.println("4.- shouldWakeUp (true, -1); ? should return false since the hourOfDay parameter needs to be in a range 0-23. ");
			System.out.println("0.- Salir");
			System.out.print("Opción: ");
	
			opcion = opciones.nextInt();
	     
			switch (opcion) {
			case 0:
				System.out.println("Bye");
				System.out.println("");
				break;
			case 1:
				bark = shouldWakeUp(true, 1);
				System.out.println("");
				break;
			case 2:
				bark = shouldWakeUp(false, 2);
				System.out.println("");
				break;
			case 3:
				bark = shouldWakeUp(true, 8);
				System.out.println("");
				break;
			case 4:
				bark = shouldWakeUp(true, -1);
				System.out.println("");
				break;
			default:
				System.out.println("No escogiste opciones validas");
				System.out.println("");
				break;
			}
      } while (opcion !=0);

	}

	public static boolean  shouldWakeUp(boolean barking, int hourOfDay) {
		if (hourOfDay >=0  &&  hourOfDay <= 23) {
			if (hourOfDay <8 || hourOfDay>22) {
				if (barking) {
					System.out.println("The dog barking is " + barking + " We need wake up");
				} else {
					System.out.println("The dog barking is " +barking+ " Since "+ hourOfDay);
				}
			}else if (barking) {
				barking=false;
				System.out.println("The dog barking is " + barking + " Since it's not before 8");
			}
		}else {
			barking = false;
			 System.out.println("The hourOfDay parameter needs to be in a range 0-23 and the dog barking is " + barking);
		}
		
		return true ;
	}

}
