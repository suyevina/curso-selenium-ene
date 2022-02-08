package Asignaciones_2;

import java.util.Scanner;

public class MegaBytes {

	public static void main(String[] args) {
		int opcion ;
		Scanner opciones = new Scanner(System.in);
		
		do {
			System.out.println("Escoja una de las siguientes opciones: ");
			System.out.println("1. printMegaBytesAndKiloBytes(2500); ? should print the following text: '2500 KB = 2 MB and 452 KB'");
			System.out.println("2. printMegaBytesAndKiloBytes(-1024); ? should print the following text: 'Invalid Value' because parameter is less than 0");
			System.out.println("3. printMegaBytesAndKiloBytes(5000); ? should print the following text:'5000 KB = 4 MB and 904 KB'");
			System.out.println("4. printMegaBytesAndKiloBytes(2048); ? should print the following text:'2048 KB = 2 MB'");
			System.out.println("0. Salir");
			
			System.out.println("Opción: ");
			opcion = opciones.nextInt();
		     
			switch (opcion) {
			case 0:
				System.out.println("Bye");
				System.out.println("");
				break;
			case 1:
				printMegaBytesAndKiloBytes(2500);
				System.out.println("");
				break;
				
			case 2:
				printMegaBytesAndKiloBytes(-1024);
				System.out.println("");
				break;
				
			case 3:
				printMegaBytesAndKiloBytes(5000);
				System.out.println("");
				break;
				
			case 4:
				printMegaBytesAndKiloBytes(2048);
				System.out.println("");
				break;
				
			default:
				System.out.println("Debe escoger una opción valida");
				System.out.println("");
				break;
			}
			
		}while (opcion !=0);

	}
	
	public static void  printMegaBytesAndKiloBytes(int kiloBytes) {
		int megabytes=0;
		int mb = 1024;
		int kb=0;
		if(kiloBytes>0) {
			if (kiloBytes%mb == 0) {
				megabytes= kiloBytes/mb;
				System.out.println(kiloBytes + "KB = "+ megabytes + "MB ");
			}else {
				megabytes= kiloBytes/mb;
				kb= kiloBytes-(megabytes*mb); 
				System.out.println(kiloBytes + "KB = "+ megabytes + "MB " + "and " +kb +"KB");
			}
		}else {
			System.out.println("Invalid Value");
		}
		
		
	}
	
}
