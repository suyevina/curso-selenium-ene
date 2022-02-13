package com.java.modificadores;

public class Modificador {
//	public static void sayHello() {
//		System.out.println("Hello");				
//	}
	
	protected void sayHello() {
		System.out.println("Hello - Protected");		
	}
	
	public void invokeSayHello() {
		sayHello();		
	}
}
