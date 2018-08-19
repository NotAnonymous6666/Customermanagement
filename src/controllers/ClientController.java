package controllers;

import java.util.List;

import domain.Client;
import domain.Validator;
import repositories.ClientRepository;

public class ClientController {
	
	private ClientRepository clientRepository;
	private Validator validator;
	
	public ClientController(ClientRepository clientRepository,Validator validator) {
		this.clientRepository = clientRepository;
		this.validator = validator;
	}
	
	public void addClient(Client client) {
		try {
			validator.validate(client);
			clientRepository.addClient(client);
		} catch (Throwable e) {
			System.out.println(e.getMessage());
		}		
	}
	
	public void printClients() {
		List<Client> clients = clientRepository.getClients();
		for(int i = 0; i < clients.size(); i++) {
			int nr = i + 1;
			System.out.println("Client " + nr);
			System.out.println(clients.get(i).toString());
		}
	}
	
	public void deleteClient(int pos) {
		if(0 < pos && pos <= clientRepository.getClients().size()) {
			clientRepository.deleteClient(pos-1);
		} else {
			System.out.println("Invalid position in list!");
		}
	}

}
