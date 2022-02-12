package com.java.herencia;

public class Main {

	public static void main(String[] args) {
		Padre padre1 = new Padre ("Jose", 1.80);
		System.out.println("José tiene los ojos "+ padre1.colorOjos());
		System.out.println("");
		
		Hijo hijo1 =  new Hijo("Juan", 1.75);
		System.out.println("Juan tiene los ojos "+ hijo1.colorOjos()); 
		System.out.println("Juan tiene el cabello "+ hijo1.colorCabellos());
		System.out.println("");
		
		Nieto nieto1 = new Nieto("Juanito",1.20);
		System.out.println("Juanito tiene los ojos "+ nieto1.colorOjos());
		System.out.println("Juanito tiene el cabello "+ nieto1.colorCabellos());
		System.out.println("Juanito Profesion "+ nieto1.profesion());
		
	}

}
