package com.dharbor.carstore.service;

import com.dharbor.carstore.domain.Client;
import com.dharbor.carstore.repository.ClientRepository;
import com.dharbor.carstore.web.ClientController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Martin on 27/6/17.
 */
@Service
public class ClientService {
    @Autowired
    private ClientRepository clientRepository;

    public Client addClient(ClientController.ClientRequestDTO client){
        Client newClient = new Client();

        newClient.setName(client.getName());
        newClient.setCi(client.getCi());
        newClient.setProfession(client.getProfession());
        newClient.setPhone(client.getPhone());

        return clientRepository.save(newClient);
    }

    public List<Client> getAll(){
        return clientRepository.findAll();
    }

    public Client updateClient(String id, ClientController.ClientRequestDTO clientOld){
        Client client = clientRepository.findOne(id);

        client.setName(clientOld.getName());
        client.setCi(clientOld.getCi());
        client.setProfession(clientOld.getProfession());
        client.setPhone(clientOld.getPhone());

        return clientRepository.save(client);
    }

    public Client deleteClient(String id){
        Client client = clientRepository.findOne(id);
        clientRepository.delete(client);
        return client;
    }
}
