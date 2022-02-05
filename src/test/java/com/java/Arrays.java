package com.java;

public class Arrays {

	public static void main(String[] args) {
		// ARRAYS (ARREGLOS)
		//Arreglo Unidimensional
		
		String [] dias= {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};
		int [] numero = {1, 2, 3, 4, 6, 7, 100};
		boolean [] algo = {true, true, true, false};
		dias[2]=null;
		
		System.out.println("El dia de hoy es: " + dias[5]);
		
		for (int i=0; i < dias.length; i++) {
			System.out.println(dias[i]);
		}
		
		//Arreglo Bidimensional
		String[][] nombres = new String[2][2];
		nombres[0][0]= "Susan";
		nombres[0][1]= "Kira";
		nombres[1][0]= "Dalton";
		nombres[1][1]= "Nilda";
		//System.out.println(nombres[0][0]);
		
		//Actividad imprimir arreglo bidimensional
		
		for (int i=0; i < nombres.length; i++){
			for (int j=0; j < nombres.length; j++) {
				System.out.println(nombres[i][j]);
			}
		}
		
		
		
	}

}
