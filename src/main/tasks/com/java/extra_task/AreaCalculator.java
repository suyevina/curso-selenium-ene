package com.java.extra_task;

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		int bucle ;
		Calculus calcula= new  Calculus();
		Scanner opciones = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese el tipo de �rea a calcular: ");
			System.out.println("1. Circulo ");
			System.out.println("2. Rectangulo ");
			System.out.println("0. Salir");
			System.out.print("Opci�n: ");
			bucle=opciones.nextInt();
			System.out.println("");
			
			switch (bucle) {
				case 1:
					System.out.print("Ingrese el valor del radio del circulo:");
					 calcula.setRadius(opciones.nextDouble());
					System.out.println("�rea del Circulo= "+ calcula.circle());   
					break;
				case 2:
					System.out.println("Ingrese los valores X y Y para calcular su �rea ");
					System.out.print("X: ");
					 calcula.setX(opciones.nextDouble());
					 System.out.print("Y: ");
					 calcula.setY(opciones.nextDouble());
					System.out.println("�rea del Rect�ngulo= "+ calcula.rectangule());   
					break;
				case 0:
					break;
				default:
					System.out.println("Opci�n invalida intente de nuevo");
					break;
			}
		 
		    

			
			

			System.out.println("");
			
		}while (bucle !=0);

	}

}
