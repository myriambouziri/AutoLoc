package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IContratService;
import tn.esprit.autoloc.entities.Contrat;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Contrat")
public class ContratController {
    private IContratService contratService;

    @PostMapping("/add-contrat")
    public Contrat AddContrat(@RequestBody Contrat contrat) { return contratService.AddContrat(contrat); }

    @GetMapping("/Get-all")
    public List<Contrat> FindAll() { return contratService.FindAll(); }

    @GetMapping("/Get-contrat/{contrat-id}")
    public Contrat FindByid(@PathVariable("contrat-id") Long contratId) { return contratService.FindByid(contratId); }

    @DeleteMapping("/delete-contrat/{contrat-id}")
    public void deleteContrat(@PathVariable("contrat-id") Long contratId) { contratService.deleteContrat(contratId); }
}