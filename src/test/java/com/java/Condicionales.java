package com.java;

public class Condicionales {

	public static void main(String[] args) {
		//Automovil conduciendo a exceso de velocidad
		int limiteVelocidad = 80; //Km*h
		int velocidadActual = 100; //Km*h
		boolean carretera = true; 
		
		//IF
		if (velocidadActual > limiteVelocidad) {
			System.out.println("MULTA!!!!");
		}
				
		//IF ELSE
		
		if (velocidadActual > limiteVelocidad) {
			System.out.println("MULTA!!!!");
		}else {
			System.out.println("DESCUENTO!!!!");
		}
		
		//IF ANIDADO
		if (carretera) {
			limiteVelocidad=100;
		
			if (velocidadActual > limiteVelocidad) {
				System.out.println("MULTA!!!!");
			}else {
				System.out.println("DESCUENTO!!!!");
			}
		}
		
		//IF ELSE IF
		
		if (velocidadActual > limiteVelocidad) {
			System.out.println("MULTA!!!!");
		}else {
			System.out.println("DESCUENTO!!!!");
		}
		
		//IF ANIDADO
		if (carretera) {
			limiteVelocidad=100;
		
			if (velocidadActual > limiteVelocidad) {
				System.out.println("MULTA!!!! - Vas en carretera");
			}else {
				System.out.println("DESCUENTO!!!! - Vas en carretera");
			}
		}else if (velocidadActual > limiteVelocidad) {
			System.out.println("MULTA!!!! - Vas en calle");
		}else {
			System.out.println("DESCUENTO!!!! - Vas en calle");
		}
		
		//SWITCH CASE
		int temperatura = 36; //°C
		
		switch(temperatura) {
		case 2:
			System.out.println("Temperatura Santiago, Chile");
			break;
			
		case 19:
			System.out.println("Temperatura Monterrey, México");
			break;
			
		case 17: 
			System.out.println("Temperatura Buenos Aires, Argentina");
			break;
		default:
			System.out.println("Temperatura otro lugar");
			break;
		}

	}

}
