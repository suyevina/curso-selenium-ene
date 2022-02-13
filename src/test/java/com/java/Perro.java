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
//Encapsulamiento

	public String getRaza() {
		return raza;
	}

	public void setRaza(String raza) {
		this.raza = raza;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTamano() {
		return tamano;
	}

	public void setTamano(String tamano) {
		this.tamano = tamano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getNumeroPatas() {
		return numeroPatas;
	}

	public void setNumeroPatas(int numeroPatas) {
		if (numeroPatas>10) {
			this.numeroPatas = -1;
		}else {
			this.numeroPatas = numeroPatas;
	}
	
	}

}
