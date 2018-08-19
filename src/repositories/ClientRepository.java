package repositories;

import java.util.ArrayList;
import java.util.List;

import domain.Client;

public class ClientRepository {
	
	private List<Client> clients;
	
	public ClientRepository() {
		this.clients = new ArrayList<Client>();
	}
	
	public void addClient(Client client) {
		clients.add(client);
	}
	
	public List<Client> getClients() {
		return this.clients;
	}
	
	public void deleteClient(int pos) {
		clients.remove(pos);
	}

}
