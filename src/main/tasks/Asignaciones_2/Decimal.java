package Asignaciones_2;

import java.util.Scanner;

public class Decimal {

	public static void main(String[] args) {
		int opcion;
		boolean deci;
		Scanner entrada = new Scanner(System.in);
		
		do {
			System.out.println("Escoja una de las siguientes opciones: ");
			System.out.println("1. areEqualByThreeDecimalPlaces(-3.1756, -3.175); ? should return true since numbers are equal up to 3 decimal places.");
			System.out.println("2. areEqualByThreeDecimalPlaces(3.175, 3.176); ? should return false since numbers are not equal up to 3 decimal places.");
			System.out.println("3. areEqualByThreeDecimalPlaces(3.0, 3.0); ? should return true since numbers are equal up to 3 decimal places.");
			System.out.println("4. areEqualByThreeDecimalPlaces(-3.123, 3.123); ? should return false since numbers are not equal up to 3 decimal places.");
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
				deci=areEqualByThreeDecimalPlaces( 3.1756, 3.175);
				System.out.println(deci);
				System.out.println("");
				break;
				
			case 2:	
				deci=areEqualByThreeDecimalPlaces( 3.1756, 3.176);
				System.out.println(deci);
				System.out.println("");
				break;
				
			case 3:	
				deci=areEqualByThreeDecimalPlaces( 3.0, 3.0);
				System.out.println(deci);
				System.out.println("");
				break;
				
			case 4:	
				deci=areEqualByThreeDecimalPlaces( -3.123, 3.123);
				System.out.println(deci);
				System.out.println("");
				break;
				
			default:
				System.out.println("No escogiste ninguna opción válida");
				System.out.println("");
				break;
			}
		}while (opcion !=0);
	}

	public static boolean  areEqualByThreeDecimalPlaces( double x, double y) {
		double num2=0,num=0;
	    double a=0, b=0,c=0,d=0, e=0;
	    boolean  reto=true;
	    int contador=0;
//	    Aplicando modulo de un numero
//	    num=x%1;
//		 d=x-num; 
//		 a=num;
//		 
//		 num2= y%1;
//		 e= y-num2;
//		 b=num2;
//		 
//		 if (d==e) {
//		  for (int i=1; i<=contador;i++) {
//				num=num*10;
//				num2=num2*10;
//				}
//			 c=num-num2 ;
//			 if(c < 1 && c>=0) {
//				 return !reto;
//			 }
//		 }
//		 return reto;			
	    
//	    Aplicando Casting
	    num=(int)x;
	    num2=(int)y;	    
	    for(int i=0; i<4;i++) {
		     if( num==num2) {
		    	a= x-num;
		 	    b=y-num2;		 	    
		    	x=a*10;
		    	y=b*10;
		    	num=(int)x;
		    	num2=(int)y;	
		    	contador++;	
		    }   
	    }
	    if (contador==3) {
	    	return reto;
	    }else {
	    	return !reto;
	    }
	}
}
//los decimales con double en la tercera los aproxima y completa con 9 hasta llegar al total de numero permitidos por el tipo de variable preguntar si tiene mas 3 decimales y al llegar al tercero sumar 1

