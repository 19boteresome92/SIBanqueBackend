package org.sid.sibanque.Service;

import java.util.List;
import java.util.Optional;

import org.sid.sibanque.Entity.Client;
import org.sid.sibanque.Repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
	public class ClientService {
	    private final ClientRepository clientRepository;

	    @Autowired
	    public ClientService(ClientRepository clientRepository) {
	        this.clientRepository = clientRepository;
	    }

	    public List<Client> getAllClients() {
	        return clientRepository.findAll();
	    }

	    public Client getClientById(Long id) {
	    	Optional<Client> clt = Optional.of(clientRepository.findById(id));
	    	if(clt.isPresent()) {
	    		Client foundClt = clt.get();
	    		return foundClt;
	    	}
	    	else
	    		return null;
	     }

	    public Client addClient(Client client) {
	        return clientRepository.save(client);
	    }

	    public void updateClient(Long id, Client updatedClient) {
	        if (clientRepository.existsById(id)) {
	            updatedClient.setCodeCli(id);
	            clientRepository.save(updatedClient);
	        }
	    }

	    public void deleteClient(Long id) {
	        clientRepository.deleteById(id);
	    }
	        
}
