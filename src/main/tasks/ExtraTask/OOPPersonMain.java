package ExtraTask;
import java.util.Scanner;

public class OOPPersonMain {
	public static void main(String[] args) {
		int bucle ;
		Person person = new Person();
		Scanner opciones = new Scanner(System.in);
		
		do {
			System.out.print("Ingrese su Nombre: ");
		    person.setFirstName(opciones.nextLine());
		    
			System.out.print("Ingrese su Apellido: ");
			person.setLastName(opciones.nextLine());
	
			System.out.print("Ingrese su Edad: ");
			person.setAge(opciones.nextInt());


			System.out.println("");
			System.out.println("Nombre y Apellido ingresado: "+person.getFullName());
			System.out.println("Edad ingresada:  "+person.getAge()+ ". Esta persona es adolescente?: "+ person.isTeen());
			System.out.println("");
			System.out.print("Continuamos? 1(Si) 0(No) ");
			System.out.println("");

			bucle=opciones.nextInt();
			
			person.firstName =opciones.nextLine();
			System.out.println("");
			
		}while (bucle !=0);

	}

}