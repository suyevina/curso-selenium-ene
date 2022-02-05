package Asignaciones_1;

public class Ej_4 {

	public static void main(String[] args) {
		//Ejercicio #4
				/*
				Declara 2 variables numéricas enteras (con el valor que desees), he indica cual es mayor de los dos. Si son iguales indicarlo también. Ves cambiando los valores para comprobar 
				que funciona.*/
				
				int edad1= 20, edad = 20, mayorEdad = 45;
				
				if (edad < mayorEdad) {
					System.out.println("La mayor edad es la variable 'mayorEdad': " + mayorEdad);
				} else if (edad == edad1) {
					System.out.println("La edad que es igual a 'edad' es 'edad2': " + edad1);
				} else {
					System.out.println("La mayor edad es variable 'edad': " + edad);
				}
	}

}
