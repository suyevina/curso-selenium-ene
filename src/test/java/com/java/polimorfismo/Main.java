package com.java.polimorfismo;

public class Main {
	public static void main(String [] args) {
//		Clase Abstracta - Nombre de Objeto  -  Constructor
		Animal puppy = new Perro();
		puppy.speak();
		
		Animal garfield = new Gato();
		garfield.speak();
		
		Animal Susan = new Humano();
		Susan.speak();

		///Polimorfismo
		Susan = new Gato();
		Susan.speak();
		
		Susan = new Perro();
		Susan.speak();
	}

}
