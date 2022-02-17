package ExtraTask;

import java.util.Scanner;

public class OOPSumCalcutator {

	public static void main(String[] args) {
		int bucle ;
		SimpleCalculator  calculator = new SimpleCalculator();
		Scanner opciones = new Scanner(System.in);
		
		do {		
			System.out.println("Seleccionar la operacion que desea ejecutar del listado" );
			System.out.println("1.  Suma" );
			System.out.println("2.  Resta" );
			System.out.println("3.  Multiplicaci�n" );
			System.out.println("4.  Divisi�n" );
			System.out.println("0.  Salir" );
			System.out.println("");
			System.out.print("Opcion: ");
			bucle=opciones.nextInt();
			System.out.println("");
			
			System.out.print("N� 1: ");
			calculator.setFirstNumber(opciones.nextDouble());
			System.out.print("N� 2: ");
			calculator.setSecondNumber(opciones.nextDouble());

//			System.out.println("N� 1: "+calculator.getFirstNumber());
//			System.out.println("N� 2: "+calculator.getSecondNumber());
			switch (bucle){
				case 0:
					break;
				case 1:
					System.out.println("Suma: "+calculator.getAdditionResult());
					break;
				case 2:
					System.out.println("Resta: "+calculator.getSubtractionResult());
					break;
				case 3:
					System.out.println("Multiplicaci�n: "+calculator.getMultiplicationResult());
					break;
				case 4: 
					System.out.println("Divisi�n: "+calculator.getDivisionResult());
					break;
				default:
					System.out.println("Su opci�n no es v�lida");
					break;
			}
			System.out.println("");
			
		}while (bucle !=0);

	}

}
