package com.java;

import com.java.modificadores.Modificador;

public class Loops extends Modificador {

	public static void main(String[] args) {
		// WHILE
		int minNumero = 3;
		int maxNumero = 100;
		
		while(minNumero <= maxNumero) {
			System.out.println("El numero es: "+ minNumero);
			minNumero++;
		}
		
		// DO WHILE
		int numero = 2;
		int sumTotal = 0;
		int count = 0;
		
		do {
			sumTotal  =sumTotal + numero;
			count++;
		} while (sumTotal < 100);
		
		System.out.println("El numero se sumo a si mismo: " + count);
		
		// FOR
		int numeroLimite = 8;
		
		for(int i=5; i <= numeroLimite; i++) {
			System.out.println("El numero FOR es: "+ i);
		}
		
		Modificador modificador =  new Modificador();
//		modificador.sayHello();
		
		modificador.invokeSayHello();
		
		
	}

}
