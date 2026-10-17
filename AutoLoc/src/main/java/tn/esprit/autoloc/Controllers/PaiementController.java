package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IPaiementService;
import tn.esprit.autoloc.entities.Paiement;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Paiement")
public class PaiementController {
    private IPaiementService paiementService;

    @PostMapping("/add-paiement")
    public Paiement AddPaiement(@RequestBody Paiement paiement) { return paiementService.AddPaiement(paiement); }

    @GetMapping("/Get-all")
    public List<Paiement> FindAll() { return paiementService.FindAll(); }

    @GetMapping("/Get-paiement/{paiement-id}")
    public Paiement FindByid(@PathVariable("paiement-id") Long paiementId) { return paiementService.FindByid(paiementId); }

    @DeleteMapping("/delete-paiement/{paiement-id}")
    public void deletePaiement(@PathVariable("paiement-id") Long paiementId) { paiementService.deletePaiement(paiementId); }
}