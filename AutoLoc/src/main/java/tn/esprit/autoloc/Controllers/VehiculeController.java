package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IVehiculeService;
import tn.esprit.autoloc.entities.Vehicule;
import tn.esprit.autoloc.entities.enumerations.CategorieVehicule;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Vehicule")
public class VehiculeController {
    private IVehiculeService vehiculeService;

    @PostMapping("/add-vehicule")
    public Vehicule AddVehicule(@RequestBody Vehicule vehicule) { return vehiculeService.AddVehicule(vehicule); }

    @GetMapping("/Get-all")
    public List<Vehicule> FindAll() { return vehiculeService.FindAll(); }

    @GetMapping("/Get-vehicule/{vehicule-id}")
    public Vehicule FindByid(@PathVariable("vehicule-id") Long vehiculeId) { return vehiculeService.FindByid(vehiculeId); }

    @DeleteMapping("/delete-vehicule/{vehicule-id}")
    public void deleteVehicule(@PathVariable("vehicule-id") Long vehiculeId) { vehiculeService.deleteVehicule(vehiculeId); }

    @PutMapping("/affecterEquipement/{idEquipement}/{idVehicule}")
    public Vehicule affecterEquipementAVehicule(@PathVariable Long idEquipement,@PathVariable Long idVehicule) { return vehiculeService.affecterEquipementAVehicule(idEquipement, idVehicule); }

    @PutMapping("/desaffecterEquipement/{idEquipement}/{idVehicule}")
    public void desaffecterEquipementDeVehicule(@PathVariable Long idEquipement,@PathVariable Long idVehicule) {vehiculeService.desaffecterEquipementDeVehicule(idEquipement, idVehicule);}

    @GetMapping("/get-by-marque/{marque}")
    public List<Vehicule> findByMarqueLike(@PathVariable("marque") String marque) {return vehiculeService.findByMarqueLike(marque);}


    @GetMapping("/get-by-categorie/{categorie}")
    public List<Vehicule> findByCategorie(@PathVariable("categorie") CategorieVehicule categorie) {return vehiculeService.findByCategorie(categorie);}

    @GetMapping("/get-by-agence/{idAgence}")
    public List<Vehicule> getVehiculesByAgence(@PathVariable("idAgence") Long idAgence) {return vehiculeService.getVehiculesByAgence(idAgence);}



    }








