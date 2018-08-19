package start;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import controllers.ClientController;
import domain.Address;
import domain.Client;
import domain.Validator;
import repositories.ClientRepository;

public class UI {
	
	private static ClientController clientController;
	
	public static void addClient() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("First Name : ");
		String firstName = scanner.nextLine();
		System.out.print("Last Name : ");
		String lastName = scanner.nextLine();
		System.out.print("Phone Number : ");
		String phoneNumber = scanner.nextLine();
		
		System.out.println("~~~~Address~~~~");
		System.out.print("City : ");
		String city = scanner.nextLine();
		System.out.print("Street : ");
		String street = scanner.nextLine();
		System.out.print("Number : ");
		int number = scanner.nextInt();
		System.out.print("Apartment : ");
		int apartment = scanner.nextInt();
		
		Address address = new Address(city, street, number, apartment);
		
		Client client = new Client(firstName, lastName, phoneNumber, address);
		
		clientController.addClient(client);

	}
	
	public static void printClients() {
		
		clientController.printClients();
		
	}
	
	public static void deleteClient() {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Position : ");
		int pos = scanner.nextInt();
		
		clientController.deleteClient(pos);
		
	}

	public static void main(String[] args) throws IOException {
		
		ClientRepository clientRepository = new ClientRepository();
		Validator validator = new Validator();
		
		clientController = new ClientController(clientRepository, validator);
		
		int cmd;
		
		while(true) {
			
			InputStreamReader isr = new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			System.out.println("1 - Add client \n2 - Print clients \n3 - Delete client \nx - Exit program");
			System.out.print("Give command : ");
				
			cmd = br.read();
			
			switch(cmd) {
			
				case '1': addClient();
						  break;
				case '2': printClients();
						  break;
				case '3': deleteClient();
						  break;
						  
			}
			
			if(cmd == 'x') break;
			
		}
	}

}
