package Asignaciones_2;

import java.util.Scanner;

public class Gato {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean cat;
		Scanner entrada =  new Scanner(System.in);
		int opcion=0;
		
		do {
			System.out.println("Escoja una de las siguientes opciones: ");
			System.out.println("1. isCatPlaying (true, 10); debe devolver falso ya que la temperatura no está en el rango de 25 a 45");
			System.out.println("2. isCatPlaying (falso, 36); debe devolver falso ya que la temperatura no está en el rango de 25 a 35 ");
			System.out.println("3. isCatPlaying (falso, 35); deberá volver al verdadero ya que la temperatura está en el rango de 25 a 35");
			System.out.println("4. isCatPlaying (true, 45); deberá volver al true ya que la temperatura no está en el rango de 25 a 45");
			System.out.println("5. isCatPlaying (true, 46); deberá volver al falso ya que la temperatura no está en el rango de 25 a 45");
			System.out.println("0.  Salir");

			System.out.print("Opción: ");
			opcion = entrada.nextInt();
			System.out.println("");
			
			switch (opcion) {
			case 0: 
				System.out.println("Bye");
				System.out.println("");
				break;
				
			case 1:	
				cat = isCatPlaying (true, 10);
				System.out.println("The cat playing is " + cat);
				System.out.println("");
				break;
			
			case 2:
				cat = isCatPlaying (false, 36);
				System.out.println("The cat playing is " + cat);
				System.out.println("");
				break;
				
			case 3:
				cat = isCatPlaying (false, 35);
				System.out.println("The cat playing is " + cat);
				System.out.println("");
				break;
				
			case 4:
				cat = isCatPlaying (true, 45);
				System.out.println("The cat playing is " + cat);
				System.out.println("");
				break;
				
			case 5:
				cat = isCatPlaying (true, 46);
				System.out.println("The cat playing is " + cat);
				System.out.println("");
				break;
				
			default:
				System.out.println("No escogiste ninguna opción válida");
				System.out.println("");
				break;
			}
	
		}while (opcion != 0);
	}
	
    public static  boolean isCatPlaying(boolean verano, int temperatura) {
    	if (verano) {
    		if (temperatura >=25 && temperatura <= 45) {
    			return true;		
    		}
    	}else {
			if (temperatura >=25 && temperatura <= 35) {
			    	return true;		
			 }
    	}
    	return false;
    }
}
