package com.ThiagoSantos.PDV.domain.services;

import com.ThiagoSantos.PDV.core.entities.Client;
import com.ThiagoSantos.PDV.domain.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public List<Client> findAll(){
        return clientRepository.findAll();
    }

    public Client findById(Long id){
        return clientRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Client not found with id: " + id));
    }

    public Client save(Client client){
        return clientRepository.save(client);
    }

    public Client update (Long id, Client updateClient){
        Client existingClient = findById(id);
        existingClient.updateFields(updateClient);
        return clientRepository.save(existingClient);
    }

    public Client delete(Long id){
        Client clientToDeleted = findById(id);
        clientRepository.deleteById(id);
        return clientToDeleted;
    }
}
