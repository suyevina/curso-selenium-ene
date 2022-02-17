package ExtraTask;
import java.util.Scanner;

public class OOPPersonMain {
	public static void main(String[] args) {
		int bucle ;
		Person person = new Person();
		Scanner opciones = new Scanner(System.in);
		person.firstName = null;
		person.lastName = null;
		
		do {
			System.out.print("Ingrese su Nombre: ");
		    person.firstName = opciones.nextLine();

		    
			System.out.print("Ingrese su Apellido: ");
			person.lastName= opciones.nextLine();

			
			System.out.print("Ingrese su Edad: ");
			person.age= opciones.nextInt();


			System.out.println("");
			System.out.println("Nombre ingresado:"+person.firstName);
			System.out.println("Apellido ingresado:"+person.lastName);
			System.out.println("Edad ingresada:  "+person.age + ". Esta persona es adolescente?: "+ person.isTeen());
			System.out.println("");
			System.out.print("Continuamos? 1(Si) 0(No) ");
			System.out.println("");

			bucle=opciones.nextInt();
			
			person.firstName =opciones.nextLine();
			System.out.println("");
			
		}while (bucle !=0);

	}

}