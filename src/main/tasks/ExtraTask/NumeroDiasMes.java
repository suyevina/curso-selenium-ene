package ExtraTask;

import java.util.Scanner;

public class NumeroDiasMes {

	public static void main(String[] args) {
		int namedYear;	
		int mes;
		int bucle ;
		Scanner opciones = new Scanner(System.in);
		
		do {
			
			System.out.println("Seleccione una de las opciones:");
			System.out.println("1. Determinar si un año es Bisiesto");
			System.out.println("2. Cantidad días por mes");
			System.out.println("0. Salir");
			System.out.println("");
			System.out.print("Opcion: ");
			bucle = opciones.nextInt();			
			System.out.println("");
			
			switch(bucle) {
			case 0:
				break;
			case 1:
				System.out.println("Ingrese el año: ");
				namedYear = opciones.nextInt();
				System.out.println("");
				if (isLeapYear(namedYear)==1) {
					System.out.println("El año "+namedYear+ ", es bisiesto ");
				}else if (isLeapYear(namedYear)==2){
					System.out.println("El año "+namedYear+ ", no es bisiesto ");
				}else {
					System.out.println("El año "+namedYear+ " no esta en el rango (1-9999).");	
					
				}
				
				System.out.println("");
				break;
			case 2:
				System.out.println("Ingrese el año: ");
				namedYear = opciones.nextInt();
				System.out.println("Ingrese el mes: ");
				mes = opciones.nextInt();
				System.out.println("");
				if (getDaysInMonth(namedYear, mes) == -1 && ( namedYear <1 || mes >12)) {
					System.out.println("El año "+namedYear+ " no esta en el rango (1-9999).");	
					System.out.println("");
				} else {
				System.out.println("El mes "+mes+ " tiene "+getDaysInMonth(namedYear,mes) +" dias" );
				System.out.println("");
				}
				break;
			default:
				System.out.println("No es una opción válida");
				System.out.println("");
				break;
			}		
		}while (bucle !=0);

	}
	
	public static int isLeapYear(int year) {
		if (year >=1 && year <= 9999) {
			if(year%4 == 0 && year%400 ==0) {
				return 1;
			}else {
				return 2;
			}
		}else {
		return 0;
		}		
	}
	
	public static int  getDaysInMonth (int year, int month) {
		if ((year >=1 && year <=9999) && (month >=1 && month <=12)) {
			if (month == 4 || month == 6  || month ==9  || month ==11) {
				return 30;
			} else if ( isLeapYear(year) ==1 && month ==2) {
				return 29;
				
			} else if(month ==2) {
				return 28; 
				
			} else {
					return 31;	
		}
	}
		return -1;
	}
	
}
