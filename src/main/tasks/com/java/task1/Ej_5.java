package com.java.task1;

import java.util.Scanner;

public class Ej_5 {

	private static Scanner entrada;

	public static void main(String[] args) {
		//Ejercicio #5
				/*
				 * Crea un programa donde te pida un número y muestra si es positivo o negativo y si es par o impar
				 */
				int numero1, numero2;
				entrada = new Scanner(System.in);
				
				System.out.println("Ingrese el primer número entero: ");	
				numero1 = entrada.nextInt();
						
				System.out.println("Ingrese el segundo número entero: ");
				numero2 = entrada.nextInt();
				
				System.out.println("Valor del primer valor es: "+ numero1 + " y del segundo valor es: " + numero2);
				
								
				if (numero1 == 0 ) {
					if (numero2 == 0) {
					System.out.println("Ambos números son neutro");
					}else {
						System.out.println("El primer número es neutro pero el segundo no");
					}
					
				} else if (numero1 >0){
					if (numero2 > 0) {
					System.out.println("Ambos números son positivo");
					} else {
						System.out.println("El primer número ingresado es positivo pero el segundo es negativo");
					}
				} else if (numero1 < 0){ 
					if (numero2 < 0) {
					System.out.println("Ambos números son negativo");}
					else {
						System.out.println("El primer número ingresado es negativo pero el segundo es positivo");
					}
				}
				
				//Primo o no primo
				int contado=0,I;
				if (numero1>1) {
					for(I = 1; I <= numero1; I++)
			        {
			            if((numero1 % I) == 0)
			            {
			                contado++;
			            }
			        }
					 if(contado <= 2){
						 System.out.println("El primer número es impar ");
					 }else {
						 System.out.println("El primer número es par ");
					 }
				}else {
					System.out.println("El primer número no es un entero positivo ");
				}
				
				int contados=0;
				if (numero2 >1) {
		        for(I = 1; I <= numero2; I++)
		        {
		            if((numero2 % I) == 0)
		            {
		                contados++;
		            }
		        }   
		        	if (contados <=2) {
		        		 System.out.println("El segundo número es impar ");
		        	}else {
		        		
		        		System.out.println("El segundo número es par ");
		        	}
				}else {
					System.out.println("El segundo número no es un entero positivo ");
				}
	}

}
