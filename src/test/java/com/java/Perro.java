package com.java;

public class Perro {
	
	String raza;
	String color;
	String tamano;
	String nombre;
	int numeroPatas;
	
	public Perro(String raza, String color, String tamano, String nombre, int numeroPatas) {
		this.raza= raza;
		this.color=color;
		this.tamano=tamano;
		this.nombre=nombre;
		this.numeroPatas=numeroPatas;
	}
	
	//Constructor overloaded
	public Perro(String raza, String color, String tamano, String nombre) {
		this.raza= raza;
		this.color=color;
		this.tamano=tamano;
		this.nombre=nombre;
		this.numeroPatas=4;
	}

//	Constructor Vacio
	public Perro() {
		
	}

	

}
