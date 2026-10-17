package tn.esprit.autoloc.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloc.Services.IVehiculeService;
import tn.esprit.autoloc.entities.Vehicule;

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
}