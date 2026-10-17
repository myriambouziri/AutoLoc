package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IEquipementService;
import tn.esprit.autoloc.entities.Equipement;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Equipement")
public class EquipementController {
    private IEquipementService equipementService;

    @PostMapping("/add-equipement")
    public Equipement AddEquipement(@RequestBody Equipement equipement) { return equipementService.AddEquipement(equipement); }

    @GetMapping("/Get-all")
    public List<Equipement> FindAll() { return equipementService.FindAll(); }

    @GetMapping("/Get-equipement/{equipement-id}")
    public Equipement FindByid(@PathVariable("equipement-id") Long equipementId) { return equipementService.FindByid(equipementId); }

    @DeleteMapping("/delete-equipement/{equipement-id}")
    public void deleteEquipement(@PathVariable("equipement-id") Long equipementId) { equipementService.deleteEquipement(equipementId); }
}