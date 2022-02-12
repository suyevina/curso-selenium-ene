package com.java.herencia;

public class Padre{
	String nombre;
	double estatura;
	
	//Constructor Superclase
	public Padre(String nombre, double estatura) {
		this.nombre = nombre;
		this.estatura = estatura;
	}

	//Metodo
	public String colorOjos(){
		return "Cafe";
	}
	
	public String colorCabellos(){
		return "Negro";
	}
}

