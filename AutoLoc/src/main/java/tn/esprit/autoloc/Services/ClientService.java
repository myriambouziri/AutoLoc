package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Repositories.ClientRepository;
import tn.esprit.autoloc.entities.Client;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientService implements IClientService{
    ClientRepository clientRepository;
    @Override
    public Client AddClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public Client UpdateClient(Client client) {
        return clientRepository.save(client);
    }

    @Override
    public void deleteClient(Long idClient) {
        clientRepository.deleteById(idClient);

    }

    @Override
    public List<Client> FindAll() {
        return clientRepository.findAll();
    }
}
