package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IClientService;
import tn.esprit.autoloc.entities.Client;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Client")
public class ClientController {
    private IClientService clientService;
    @PostMapping("/add-client")
    public Client AddClient(@RequestBody Client client){return clientService.AddClient(client);}
    @GetMapping("/Get-all")
    public List<Client> FindAll(){
        List<Client> listClients = clientService.FindAll(); return listClients;}
    @GetMapping("/Get-client/{client-id}")
    public Client FindByid(@PathVariable("client-id") Long clientId){Client client = clientService.FindByid(clientId); return client;}
    @DeleteMapping("/delete-client/{client-id}")
    public void deleteClient(@PathVariable("client-id") Long clientId) {
        clientService.deleteClient(clientId);
    }


}
