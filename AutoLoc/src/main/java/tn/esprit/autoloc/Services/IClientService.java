package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.entities.Client;

import java.util.List;

public interface IClientService {
    Client AddClient (Client client);
    Client UpdateClient (Client client);
    void deleteClient(Long idClient);
    List<Client> FindAll();
}
