package com.java;

public class Metodos {

	public static void main(String[] args) {
		printHello();
		int sumar = suma(2,4);
		System.out.println(sumar);
		
		algo();
		int suma3num = suma(2, 5, 6);
		int suma2num = suma(6, 3);
		
		System.out.println("Dos numeros "+suma2num + " Tres numeros: "+suma3num);

	}
	public static void printHello() {
		System.out.println("Hello");
	}
	
	public static int suma(int x, int y) {
		return x+y;
	}
	//overload
	public static int suma(int x, int y, int z) {
		int suma = x+y+z;
		return suma;
	}
	public static boolean isHuman() {
		return true;
	}
	
	public static void algo() {
		printHello();
	}
  
}
