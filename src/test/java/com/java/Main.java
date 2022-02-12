package com.java;

public class Main {

	public static void main(String[] args) {
		
		// Perro
		Perro chihuahua = new Perro();
		chihuahua.raza = "Cabeza de venado";
		chihuahua.color = "cafe";
		chihuahua.tamano = "chico";
		chihuahua.nombre = "Mero Macho";
		chihuahua.numeroPatas = 4;

//		Perro 1
		Perro perro1 = new  Perro("Schanuzer", "Cafe", "Chico", "Macho");
		
//		Perro 2
		Perro perro2 = new Perro("San Bernado", "Blanco", "Grande","Cool", 3);
		

	}

}
