package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IAgenceService;
import tn.esprit.autoloc.entities.Agence;

import java.util.List;
@RestController
@AllArgsConstructor
@RequestMapping("/Agence")
public class AgenceController {
    private IAgenceService agenceService;
    @PostMapping("/add-agence")
    public Agence AddAgence(@RequestBody Agence agence){return agenceService.AddAgence(agence);}
    @GetMapping("/Get-all")
    public List<Agence> FindAll(){
        List<Agence> listAgences = agenceService.FindAll(); return listAgences;}
    @GetMapping("/Get-agence/{agence-id}")
    public Agence FindByid(@PathVariable("agence-id") Long agenceId){Agence agence = agenceService.FindByid(agenceId); return agence;}
    @DeleteMapping("/delete-agence/{agence-id}")
    public void deleteAgence(@PathVariable Long agenceId) {
        agenceService.deleteAgence(agenceId);
    }

}
