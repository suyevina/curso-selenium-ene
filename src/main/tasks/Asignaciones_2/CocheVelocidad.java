package Asignaciones_2;

import java.util.Scanner;

public class CocheVelocidad {

	public static void main(String[] args) {
		//Crear un programa que valide el limite de velocidad de un coche cuando vaya en una carretera, zona escolar o calle normal utilizando estructuras condicionales con IF
		//Solicitar velocidad y zona donde manejar
		
		int velocidad=0;
		int zona=0;

		Scanner entrada = new Scanner(System.in);
		
		do {
				System.out.println("Introduzca la zona por donde va manejar de la opciones disponibles: ");
				System.out.println("1. Estacionamiento");
				System.out.println("2. Zona Escolar");
				System.out.println("3. Zona Urbana");
				System.out.println("4. Carretera o Autopista");
				System.out.println("0. Salir");
		
				System.out.print("Zona: ");
				zona = entrada.nextInt();
				
				if (zona != 0 ) {
					System.out.print("Introduzca la velocidad que va a conducir: ");
					velocidad = entrada.nextInt();
					System.out.println("");
				   
					zonaControl(zona, velocidad);
					
				}
				
			}while (zona !=0);		
		System.out.println("Adios");
		System.out.println("");
//		System.out.println("");
				
	}
	
	public static void zonaControl( int  zona, int velocidad){

		String zonas[]= {"No","Estacionamiento", "Zona Escolar", " Zona Urbana","Carretera o Autopista"};
		boolean reto=false;
		int limCar= 110; 
		int limZonEsc= 20;
		int limUrb = 60;

		
		for (int i=1; i<=zonas.length;i++) {
			if (velocidad<=0 && zona==i ) {
				System.out.println("Estas en  "+ zonas[i]+" a " + velocidad);
				System.out.println("");
				
			}else if (velocidad>0 && velocidad <=limZonEsc && zona==i  ) {
				System.out.println("Estas en "+ zonas[i]+" a " + velocidad);
				System.out.println("");
			}else  if (velocidad>limZonEsc && velocidad<=limUrb  && zona==i ) {
				System.out.println("Estas en "+ zonas[i]+" a " + velocidad);
				System.out.println("");
			}else if (velocidad >limUrb && velocidad <= limCar && zona==i ) {
				System.out.println("Estas en  "+ zonas[i]+" a " + velocidad);
				System.out.println("");
			}

		}
//		System.out.println("Estas en una "+ zonas[zona]+"  manejando  a " + velocidad + " con una velocidad no recomendada");
//		 System.out.println("");
	}	
}